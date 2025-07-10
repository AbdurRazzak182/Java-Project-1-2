package com.app.routinemanagementsystem;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {
        System.out.println("Client Started");
        try{
            Socket socket = new Socket("localhost",22222);
            if(socket==null){
                System.out.println("Server not found");
                return ;
            }
            while(true) {
                System.out.println("Server found and connection is safe");
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                oos.writeObject((Object) str);
                if(str.equalsIgnoreCase("exit")){

                    break;
                }
                Object object = ois.readObject();
                System.out.println("From server: " + (String) object);
            }
            socket.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
