import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc = new Scanner(System.in);
        try {
            clientSocket = new Socket("127.0.0.1",5000);
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));



        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
