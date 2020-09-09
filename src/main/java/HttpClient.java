import java.io.IOException;
import java.net.Socket;

public class HttpClient {

    private final String host;
    private final int port;
    private final String requestTarget;

    public static void main(String[] args) throws IOException {
        new HttpClient("urlecho.appspot.com", 80, "/echo").executeRequest();
    }

    public HttpClient(String host, int port, String requestTarget) {
        this.host = host;
        this.port = port;
        this.requestTarget = requestTarget;
    }

    private void executeRequest() throws IOException {
        // new Socket opens a connection to the server
        Socket socket = new Socket(host, port);
        //  The outputstream of the client is connected to the input stream of the server
        socket.getOutputStream().write(("GET " + requestTarget + " HTTP/1.1\r\n" +
                "Host: " + host + "\r\n" +
                "\r\n").getBytes());
        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char)c);
        }
    }
}