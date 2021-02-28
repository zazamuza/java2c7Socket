package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException {
    MultiServer multiServer=new MultiServer();
     multiServer.start(4545);

    /*    ServerSocket serverSocket=new ServerSocket(4545);
        Socket socket = serverSocket.accept();
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line=in.readLine();

        out.println("Hello" + " " +  line);*/
    }
}
