package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try{

            ServerSocket serverSocket = new ServerSocket(12345);// server socket created using port 12345
            Socket socket = serverSocket.accept();// server socket is now waiting for a connection request to accept it,
                                                // once the connection is established it returns a socket object which is assigned to the variable socketSS

            InputStream is = socket.getInputStream();// InputStream object is created to read binary or character data from the socket
            OutputStream os = socket.getOutputStream();// OutputStream object is created to receive binary or character data from the socket

            int a = is.read();


            os.write(a*5);

            socket.close();
            serverSocket.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
