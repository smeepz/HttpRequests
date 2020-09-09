import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {

   @Test
    void shouldGetSuccessfulResponseCode() throws IOException {
            HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo");
            assertEquals(200, client.getStatusCode());
    }
    @Test
    void shouldGetSuccessfulResponseCode1() throws IOException {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo");
        assertEquals(200, client.getStatusCode());
    }

}


