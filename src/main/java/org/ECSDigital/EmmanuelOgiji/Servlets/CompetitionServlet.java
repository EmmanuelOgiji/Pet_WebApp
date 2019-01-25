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


public class CompetitionServlet extends HttpServlet {
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

        URL url = ReusableMethods.constructURL(prop.getProperty("API_HOST"), Resources.getCompetitions());
        HttpURLConnection connect = ReusableMethods.setupConnection("GET",url);
        connect.setRequestProperty("X-Auth-Token",prop.getProperty("API_KEY"));
        List<JSONObject> FinalCompetitionList = new ArrayList<>();
        if (connect.getResponseCode() != 200) {
            System.out.println("HTTP GET Request Failed with Error code : "
                    + connect.getResponseCode());
        }
        else{

            IncomingData = ReusableMethods.readIncomingData(url);
        }
        JSONArray CompetitionList = ReusableMethods.parseJSONStringtoJSONArray(IncomingData,"competitions");
        for (int i=0; i<CompetitionList.length(); i++) {
            String tier = CompetitionList.getJSONObject(i).getString("plan");
            if(tier.equals("TIER_ONE")) {
                FinalCompetitionList.add(CompetitionList.getJSONObject(i));
            }
        }
        httpServletRequest.setAttribute("CompetitionList",FinalCompetitionList);
        RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/competitions.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }
}
