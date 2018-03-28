package com.zl.service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App

{
    public void lianxi(){
        try {
            URL url=new URL("http://localhost:8080/student/stu/88");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setUseCaches(false);
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            if (connection.getResponseCode()==200){
                InputStream is=connection.getInputStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(is));
                String temp=null;
                while((temp=br.readLine())!=null){
                    System.out.println(temp);
                }
                br.close();
                is.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main( String[] args )
    {

    }
}
