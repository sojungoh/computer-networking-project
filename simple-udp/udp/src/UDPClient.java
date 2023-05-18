import java.net.*;

public class UDPClient {
    static final String serverName = "localhost";
    static final int serverPort = 12000;
    private DatagramSocket clientSocket;
    private byte[] sendData = new byte[1024];
    private byte[] receiveData = new byte[1024];

    public void sendDataToServer(String sentence) throws Exception {

        clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName(serverName); // 4KiB
        
        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, serverPort);
        clientSocket.send(sendPacket);
    }

    public String receiveDataFromServer() throws Exception {

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData());

        clientSocket.close();

        return modifiedSentence;
    }
}
