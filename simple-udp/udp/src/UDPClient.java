import java.net.*;
import java.io.*;

public class UDPClient {
    static final String serverName = "hostname";
    static final int serverPort = 12000;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static byte[] sendData = new byte[1024];
    static byte[] receiveData = new byte[1024];

    public static void main(String[] args) throws Exception {

        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(serverName); // 4KiB
        
        System.out.print("Input lowercase sentence: ");
        String sentence = reader.readLine();
        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, serverPort);
        clientSocket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close();
    }
}
