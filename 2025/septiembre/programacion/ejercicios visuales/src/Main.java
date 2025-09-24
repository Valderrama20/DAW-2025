import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con quien quieres jugar");
        String ip = sc.nextLine();
        try{
            System.out.println(consumeAPI(ip, "/"));
            System.out.println("¿Quieres comenzar? si/no");
            String userResponse = sc.nextLine();

            if("si".equals(userResponse.toLowerCase())) {
                System.out.println("Excelente...");
                play(ip);
            } else {
                System.out.println("Buuuuuuuuuu aburridooooooo");
            }

        }catch (Exception e){
            System.out.println("Api no disponible");
            System.out.println("Error" + e);
        }
    }

    public static void play(String ip) throws URISyntaxException, IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int pistaIndex = 1;
        do {
            if(pistaIndex == 3) System.out.println("Ultima Pista....");

            System.out.println("Pista " + pistaIndex);
            try {
                System.out.println(consumeAPI(ip, "/pista" + pistaIndex));

                if(pistaIndex != 3)  {
                    System.out.println("¿Quieres otra pista? si/no");
                    String quiereNuevaPista = sc.nextLine().toLowerCase();
                    if("no".equals(quiereNuevaPista)) break;
                }

                pistaIndex++;
            }catch (Exception e){
                System.out.println("Pista " + pistaIndex + ", no esta disponible");
            }
        }
        while(pistaIndex < 4);

        try{
            System.out.println("Cual es mi nombre:");
            String nombrePersonaje = sc.nextLine().toLowerCase();

            String verificationResponse = consumeAPI(ip, "/resolver/" + nombrePersonaje);

            if("true".equals(verificationResponse)) {
                System.out.println("Ganasteeeeeeeeeeeeeee");
            }
        }catch (Exception e){
            System.out.println("Error al verificar la respuesta");
        }
    }

    public static String consumeAPI(String ip, String path) throws URISyntaxException, IOException, InterruptedException {
        URI targetURI = new URI("http://" + ip + ":8080" + path);
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(targetURI).GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}