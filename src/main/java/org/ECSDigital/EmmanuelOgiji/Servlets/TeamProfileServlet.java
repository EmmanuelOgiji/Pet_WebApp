package org.ECSDigital.EmmanuelOgiji.Servlets;

import org.ECSDigital.EmmanuelOgiji.Resources;
import org.ECSDigital.EmmanuelOgiji.ReusableMethods;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class TeamProfileServlet extends HttpServlet {
    Properties prop = new Properties();
    {
        try {
            FileInputStream fis = new FileInputStream("src/Files/env.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("env.properties not found");
        } catch (IOException e){
            System.out.println("Properties file IO Exception");
        }
    }

    public void doGet (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String IncomingData="";
        URL url = ReusableMethods.constructURL(prop.getProperty("API_HOST"), Resources.getTeamProfile(httpServletRequest.getParameter("TeamID")));
        HttpURLConnection connect = ReusableMethods.setupConnection("GET",url);
        connect.setRequestProperty("X-Auth-Token",prop.getProperty("API_KEY"));
        List<JSONObject> TeamList= new ArrayList<>();
        if (connect.getResponseCode() != 200) {
            System.out.println("HTTP GET Request Failed with Error code : "
                    + connect.getResponseCode());
        }
        else{
            IncomingData = ReusableMethods.readIncomingData(url);
        }

        JSONObject TeamProfile = ReusableMethods.parseJSONStringtoJSONObject(IncomingData);
        //JSONObject TeamProfile = ReusableMethods.parseJSONStringtoJSONObject(Resources.TeamProfileBackup());
        JSONArray Squad = TeamProfile.getJSONArray("squad");
        for (int i=0; i<Squad.length(); i++) {
            TeamList.add((JSONObject) Squad.get(i));
        }
        httpServletRequest.setAttribute("TeamProfile",TeamProfile);
        httpServletRequest.setAttribute("Squad",TeamList);
        RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/teamprofile.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }
}