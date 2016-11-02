package chatserver;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author shriroop
 */
public class MessagingServer {
    private ServerSocket server;

    public MessagingServer() throws IOException {
        server = new ServerSocket(Constants.SERVER_PORT);
    }
    
    public void start() {
        
    }
}
