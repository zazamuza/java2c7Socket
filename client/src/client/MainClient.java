package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",4545);
        PrintWriter out=new PrintWriter(socket.getOutputStream());
        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Va rog introduceti numele");
        String next = scanner.next();
        out.println(next);


        String s = in.readLine();

        System.out.println(s);
    }
}
