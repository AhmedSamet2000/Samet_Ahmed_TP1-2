package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {

            System.out.println("client waiting to connect");

            Socket socket=new Socket("localhost",12345);//a socket object is created that connects to localhost of the port 12345

            InputStream is = socket.getInputStream();// InputStream object is created to read binary or character data from the socket
            OutputStream os = socket.getOutputStream();// OutputStream object is created to receive binary or character data from the socket

            Scanner scanner = new Scanner(System.in);//creating a scanner object that reads input form system input

            System.out.println("enter an integer");
            int a = scanner.nextInt();//reading input and assigning it to the variable a
            os.write(a);//sending using outputstream's method write() the variable a to the server

            int result =is.read();//receiving using inputstream's method read() the result and assigning it to the variable result
            System.out.println("the result is"+result);

            socket.close();

        }
        catch (Exception e){

            System.out.println(e);

        }
    }
}
