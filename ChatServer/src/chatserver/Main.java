package chatserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shriroop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String configFile = "config.properties";
        Properties configs = loadProperties(configFile);
        Constants.SERVER_PORT = Integer.parseInt(configs.getProperty("server.port"));
    }

    /**
     * Loads properties from given configuration file
     * @param filename
     * @return prop
     */
    private static Properties loadProperties(String filename) {
        InputStream configs;
        Properties prop = new Properties();
        try {
            configs = new FileInputStream(filename);
            prop.load(configs);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prop;
    }
    
}
