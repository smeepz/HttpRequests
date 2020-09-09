import java.io.IOException;
import java.net.Socket;

public class HttpClient {

    private final String host;
    private final int port;
    private final String requestTarget;
    public static int statusCode;

    public HttpClient(String host, int port, String requestTarget) {
        this.host = host;
        this.port = port;
        this.requestTarget = requestTarget;
    }

    public static void main(String[] args) throws IOException {
        new HttpClient("urlecho.appspot.com", 80, "/echo").executeRequest();
    }

    private void executeRequest() throws IOException {
        Socket socket = new Socket(host, port);
        socket.getOutputStream().write(("GET " + requestTarget + " HTTP/1.1\r\n" +
                "Host: " + host + "\r\n" +
                "\r\n").getBytes());
        int c;
        StringBuilder res = new StringBuilder();
        while ((c = socket.getInputStream().read()) != '\r') {
            res.append((char) c);
        }
        String[] stringArray = res.toString().split(" ");
        statusCode = Integer.parseInt(stringArray[1]);
        //System.out.println(out);

    }
    public int getStatusCode() throws IOException{
        executeRequest();
        return statusCode;
    }
}