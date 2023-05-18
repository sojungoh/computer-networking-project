import java.util.*;

public class UDPTest {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        UDPClient client = new UDPClient();

        System.out.print("Input an word of lowercase: ");
        String sentence = scan.next();
        client.sendDataToServer(sentence);
        String modifiedSentence = client.receiveDataFromServer();

        System.out.println("FROM SERVER: " + modifiedSentence);

        scan.close();
    }
}
