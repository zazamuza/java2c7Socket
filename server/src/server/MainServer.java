package server;

import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException {
        MultiServer serverSocket=new MultiServer();
        serverSocket.start(4545);
    }
}
