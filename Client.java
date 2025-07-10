package com.app.routinemanagementsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("Client started");
            Socket soc=new Socket("103.94.134.120",12345);
            if(soc!=null){
                System.out.println("Server found and connection is now safe");
                BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
                String str=userInput.readLine();
                System.out.println("Client sends to Server: "+str);
                PrintWriter out =new PrintWriter(soc.getOutputStream(),true);
                out.println(str);
                BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String replied=in.readLine();
                System.out.println("Client recieved: "+replied);

            }
            else{
                System.out.println("Server not found");

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
