import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;
import com.sparkpost.transport.IRestConnection;

public class Main {
    public static void main(String[] args) throws SparkPostException {
        String API_KEY = Key.getKey();

        Client client = new Client(API_KEY, IRestConnection.SPC_EU_ENDPOINT);

        client.sendMessage(
                "hola@test.valts.me",
                "valtsvilcans.dev@gmail.com",
                "The subject of the message",
                "Woooo",
                "<b>The HTML part of the email</b>");

    }
}
