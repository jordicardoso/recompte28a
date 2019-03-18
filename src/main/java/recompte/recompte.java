package recompte;

import org.apache.camel.spring.Main;

/**
 * A Main class to run our Camel application standalone
 *
 * @version $Revision$
 */
public class recompte {

    public static void main(String[] args) throws Exception {
        // use the Main class from camel-spring
        Main main = new Main();
        // to load Spring XML file
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        // and enable hangup support which means we can stop nicely when ctrl+c is pressed
        main.enableHangupSupport();
        // and start (will wait until you stop with ctrl + c)
        main.start();
        // echo to console how you can stop
        System.out.println("\n\nApplication has now been started. You can press ctrl + c to stop.\n\n");
    }
}