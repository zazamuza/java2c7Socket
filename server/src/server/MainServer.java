package server;

import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException {
      MultiServer multiServer=new MultiServer();
      multiServer.start(4545);
    }
}
