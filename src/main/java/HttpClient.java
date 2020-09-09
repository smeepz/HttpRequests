import java.io.IOException;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String request =
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\n" +
                "\rAccept-Encoding: gzip, deflate\n" +
                "\rAccept-Language: en-GB,en-US;q=0.9,en;q=0.8\n" +
                "\rCache-Control: max-age=0\n" +
                "\rConnection: keep-alive\n" +
                "\rHost: urlecho.appspot.com\n" +
                "\rUpgrade-Insecure-Requests: 1\n" +
                "\rUser-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.83 Safari/537.36";
        socket.getOutputStream().write(request.getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }
    }

    public int getStatusCode() {
        return 0;
    }
}
