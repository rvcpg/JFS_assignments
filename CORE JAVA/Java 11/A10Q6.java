import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class A10Q6 {

	public static void main(String[] args) throws IOException, InterruptedException {
        String pth = "https://httpbin.org/get";
        HttpRequest l = HttpRequest.newBuilder().uri(URI.create(pth))
                .GET().version(HttpClient.Version.HTTP_2).build();
        HttpClient c = HttpClient.newBuilder().build();
                try{
                    HttpResponse<String> hr =c.send(l, HttpResponse.BodyHandlers.ofString());
                    System.out.println(hr.headers());
                    System.out.println(hr.statusCode());
                    System.out.println(hr.body());

                }
                catch (IOException | InterruptedException ie){
                    ie.printStackTrace();
                }

		

	}

}
