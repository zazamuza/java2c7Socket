package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

    private ServerSocket serverSocket;

    public void start(int port) throws IOException {
        serverSocket=new ServerSocket(port);

        while (true){
            new MultiServerThread(serverSocket.accept()).start();
        }
    }

    public void stop() throws IOException {
        serverSocket.close();
    }


    private class MultiServerThread extends Thread{
        private Socket socket;
        private PrintWriter printWriter;
        private BufferedReader br;
        public MultiServerThread(Socket accept) throws IOException {
            this.socket=accept;

        }

        public void run(){
            try {
                printWriter=new PrintWriter(socket.getOutputStream(),true);
                br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line=br.readLine();


                    printWriter.println("Hello" + line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void setClose() throws IOException {
            socket.close();
            br.close();
            printWriter.close();
        }
    }
}
