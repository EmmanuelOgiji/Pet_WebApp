package org.ECSDigital.EmmanuelOgiji.Servlets;

import org.ECSDigital.EmmanuelOgiji.Resources;
import org.ECSDigital.EmmanuelOgiji.ReusableMethods;
import org.json.JSONArray;

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


public class TeamServlet extends HttpServlet {
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
        URL url = ReusableMethods.constructURL(prop.getProperty("API_HOST"), Resources.getTeams(httpServletRequest.getParameter("CompID")));
        HttpURLConnection connect = ReusableMethods.setupConnection("GET",url);
        connect.setRequestProperty("X-Auth-Token",prop.getProperty("API_KEY"));
        List<String> Teams = new ArrayList<>();
        if (connect.getResponseCode() != 200) {
            System.out.println("HTTP GET Request Failed with Error code : "
                    + connect.getResponseCode());
        }
        else{
            IncomingData = ReusableMethods.readIncomingData(url);
        }
        JSONArray TeamList = ReusableMethods.parseJSONStringtoJSONArray(IncomingData,"teams");
        for (int i=0; i<TeamList.length(); i++) {
                Teams.add(TeamList.getJSONObject(i).getString("name"));
        }
//        List<String> Teams = new ArrayList<>();
//        Teams.add("Dundee");
//        Teams.add("Warri Wolves");
//        Teams.add(url.toString());
        httpServletRequest.setAttribute("TeamList",Teams);
        RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/teams.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }
}