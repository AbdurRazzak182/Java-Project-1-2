package com.app.routinemanagementsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        System.out.println("Client 2 is started");
        try{
            Socket soc2=new Socket("10.18.120.80",12345);
            if(soc2!=null){

                BufferedReader in=new BufferedReader(new InputStreamReader(soc2.getInputStream()));
                String s1=in.readLine();
                System.out.println("Server sends message to client2 : "+s1);
                BufferedReader user2=new BufferedReader(new InputStreamReader(System.in));
                String s2=user2.readLine();
                PrintWriter out=new PrintWriter(soc2.getOutputStream(),true);
                System.out.print("Clinet2 replies Server: "+s2);
                out.println(s2);
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
