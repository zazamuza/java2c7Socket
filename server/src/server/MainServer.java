package server;


import dto.Mesaj;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MainServer {
  private static   List<ClientThread> clienti=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4545);
        while (true) {
            Socket clientSocket = ss.accept();
            ClientThread client=new ClientThread(clientSocket);
            client.start();
            clienti.add(client);
        }
    }

    private static void trimiteMesajTuturor(Mesaj mesaj){
        clienti.forEach(client-> {
            try {
                client.trimiteMesaj(mesaj);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
