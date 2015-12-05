 package kata.server;
 
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.util.resource.Resource;
import java.io.File;
/**
 * The goal is to create the simplist possible embedded server. Keep the application very ligthweight
 */
public class SimpleServer
{
    public static void main( String[] args ) throws Exception
    {
        File resources = new File("resources/static");

        if (args.length == 1) {
            resources = new File(args[0], "static");
        } 

        if (!resources.exists()) {
            System.err.println("Can't find resources file or the input directory for resources");
            System.err.println("Usage: <resources directory>");
            System.exit(1);
        }
        
        Server server = new Server(8080);

        // Creating and setting resources base
        ResourceHandler resourceHandler = new ResourceHandler();

        resourceHandler.setBaseResource(Resource.newResource(resources));
        resourceHandler.setWelcomeFiles(new String[] { "index.html" });

        //Enable Directory Listing
        resourceHandler.setDirectoriesListed(true);

        // Setting Context Sources
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");
        contextHandler.addServlet(ConwaySocketServlet.class, "/game");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { contextHandler, resourceHandler});

        server.setHandler(handlers);

        server.start();
        System.out.println("Server started");
        server.join();
    }
}