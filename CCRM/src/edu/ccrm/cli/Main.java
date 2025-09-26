package edu.ccrm.cli;

// import edu.ccrm.io.FileIOService; // Keep this one
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
// 8 import org.apache.logging.log4j.LogManager; // Comment out
// 9 import org.apache.logging.log4j.Logger;   // Comment out

// ... Javadoc ...

public class Main {
// 15 private static final Logger logger = LogManager.getLogger(Main.class); // Comment out

    public static void main(String[] args) {
// 17 System.out.println("Starting Campus Course & Records Manager..."); // Change this
        System.out.println("Starting Campus Course & Records Manager..."); // Simple print

        CliManager cliManager = new CliManager();
        cliManager.start();
    }
}