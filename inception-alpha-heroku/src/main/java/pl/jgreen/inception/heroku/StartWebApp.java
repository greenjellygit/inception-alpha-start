package pl.jgreen.inception.heroku;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartWebApp {
    public static void main(String[] args) throws Exception {
        String portStr = System.getenv("PORT");
        int port = (portStr == null) ? 8085 : Integer.parseInt(portStr);
        Server server = new Server(port);
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        
        webapp.setWar("inception-alpha-web/target/inception-alpha-web-0.0.1-SNAPSHOT.war");
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}