package serveur;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {
        String url="http://0.0.0.0:8084/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployé sur "+url);
    }
}
