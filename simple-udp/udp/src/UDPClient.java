import java.util.*;
import java.net.*;

public class UDPClient {
    static String serverName = "hostname";
    static int serverPort = 12000;

    public static void main(String[] args) throws Exception {

        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(serverName);

        Scanner scan = new Scanner(System.in);
        System.out.print("Input lowercase sentence: ");
        String message = scan.next();
        System.out.println(message);

        scan.close();
    }
}
