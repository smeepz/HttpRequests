import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {

   @Test
    void shouldGetSuccessfulResponseCode() {
            HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo");
            assertEquals(200, client.getStatusCode());
    }
    @Test
    void shouldGetSuccessfulResponseCode1() {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo");
        assertEquals(200, client.getStatusCode());
    }

}


