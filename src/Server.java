import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        final ServerSocket serverSocket;
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc=new Scanner(System.in);

    try {
        serverSocket = new ServerSocket(5000);
        clientSocket =serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        Thread sender= new Thread(new Runnable() {
            String msg; // variable writter by the user
            @Override
            public void run() {
                while (true){
                    msg = sc.nextLine(); // reads data from user's keybord
                    out.println(msg); // clientSocket
                    out.flush(); // sending

                }

            }
        });
        sender.start();

    } catch (IOException e){
        e.printStackTrace();
    }

    }


}
