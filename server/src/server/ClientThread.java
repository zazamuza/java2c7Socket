package server;

import dto.Mesaj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientThread extends Thread{

    private Socket socket;

    private ObjectInputStream in;

    private ObjectOutputStream out;

    public ClientThread(Socket socket) throws IOException {
        this.socket=socket;
        this.in=new ObjectInputStream(socket.getInputStream());
        this.out=new ObjectOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        while (true){
            try {
                Mesaj o = (Mesaj) in.readObject();
//                TODO SA TRIMITA MESAJUL L TOTI CLIENTII


            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public  void trimiteMesaj(Mesaj mesaj) throws IOException {
        out.writeObject(mesaj);
        out.flush();
    }
}
