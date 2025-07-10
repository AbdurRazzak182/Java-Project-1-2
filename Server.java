package com.app.routinemanagementsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Waiting for clients....");
        try{
            ServerSocket ss=new ServerSocket(12345);


//                Socket soc2=ss.accept();
//                System.out.println("Connection established");
//                BufferedReader userServer2=new BufferedReader(new InputStreamReader(System.in));
//                String s1=userServer2.readLine();
//                System.out.println("Server sends to Client2: "+s1);
//                PrintWriter outClient2=new PrintWriter(soc2.getOutputStream(),true);
//                outClient2.println(s1);
                Socket soc1=ss.accept();
                BufferedReader in=new BufferedReader(new InputStreamReader(soc1.getInputStream()));
                String str=in.readLine();
                System.out.println("Server gets the client message: "+str);
                System.out.println("Server now replies the client");
                BufferedReader serverInput=new BufferedReader(new InputStreamReader(System.in));
                String str2=serverInput.readLine();
                PrintWriter out2=new PrintWriter(soc1.getOutputStream(),true);
                out2.println(str2);



        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
