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
        String CompetitionURL = prop.getProperty("API_HOST")+Resources.getCompetitions();
        HttpURLConnection connect;
        URL url = new URL(CompetitionURL);
        connect = (HttpURLConnection)url.openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("X-Auth-Token",prop.getProperty("API_KEY"));
        String inline="";

        if (connect.getResponseCode() != 200) {
            System.out.println("HTTP GET Request Failed with Error code : "
                    + connect.getResponseCode());
        }
        else{
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext())
            {
                inline+=sc.nextLine();
            }
            System.out.println("JSON data in string format");
            System.out.println(inline);
            sc.close();
        }
        JSONObject obj = new JSONObject(inline);
        JSONArray CompetitionList = obj.getJSONArray("competitions");
        httpServletResponse.getWriter().println("<html>");
        httpServletResponse.getWriter().println("<head>");
        httpServletResponse.getWriter().println("<title>Competitions Available</title>");
        httpServletResponse.getWriter().println("</head>");
        httpServletResponse.getWriter().println("<body>");
        for (int i=0; i<CompetitionList.length(); i++) {
            httpServletResponse.getWriter().println(CompetitionList.getJSONObject(i).getString("name"));
            httpServletResponse.getWriter().println("<br>");
        }
        httpServletResponse.getWriter().println("</body>");
        httpServletResponse.getWriter().println("</html>");

    }
}
