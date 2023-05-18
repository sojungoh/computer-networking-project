import java.net.*;

public class UDPServer {
    static final String serverName = "hostname";
    static final int serverPort = 12000;

    public static void main(String args[]) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        try {

            while(true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                String modifiedSentence = sentence.toUpperCase();
                sendData = modifiedSentence.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                serverSocket.send(sendPacket);
            }   
        } catch (Exception e) {
            serverSocket.close();
        }
    }

    
}
