package com.app.routinemanagementsystem;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread implements Runnable{
    Socket socket;
    ServerThread(Socket s){
        socket=s;
        new Thread(this).start();
    }

    public void run(){
        while(true){
            try{
                ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());

                String str=(String)ois.readObject();

                if(str.equalsIgnoreCase("exit")){
                    break;
                }
                String newStr=str.toUpperCase();
                oos.writeObject((Object)newStr);
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}

public class MainServer {
    public static void main(String[] args) {
        System.out.println("waiting for clients....");
        try{
            ServerSocket serverSocket=new ServerSocket(22222);
            System.out.println("Server started");
            while(true) {
                Socket socket = serverSocket.accept();

                if (socket != null) {
                    System.out.println("Connection established");

                }
                else{
                    return;
                }
                new ServerThread(socket);
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
