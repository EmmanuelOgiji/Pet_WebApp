package org.ECSDigital.EmmanuelOgiji;

import org.json.JSONArray;
import org.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;


public class Competitions extends HttpServlet {
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

        URL url = ReusableMethods.constructURL(prop.getProperty("API_HOST"),Resources.getCompetitions());
        HttpURLConnection connect = ReusableMethods.setupConnection("GET",url);
        connect.setRequestProperty("X-Auth-Token",prop.getProperty("API_KEY"));
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter output = httpServletResponse.getWriter();
        if (connect.getResponseCode() != 200) {
            System.out.println("HTTP GET Request Failed with Error code : "
                    + connect.getResponseCode());
        }
        else{
            IncomingData = ReusableMethods.readIncomingData(url);
        }
        JSONArray CompetitionList = ReusableMethods.parseJSONStringtoJSONArray(IncomingData,"competitions");
        output.println("<html>");
        output.println("<head>");
        output.println("<title>Competitions Available</title>");
        output.println("</head>");
        output.println("<body>");
        for (int i=0; i<CompetitionList.length(); i++) {
            output.println(CompetitionList.getJSONObject(i).getString("name"));
            output.println("<br>");
        }
        output.println("</body>");
        output.println("</html>");
    }
}
