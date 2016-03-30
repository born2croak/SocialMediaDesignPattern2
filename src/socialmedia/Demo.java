package socialmedia;


/**
 * This is the main driver for the program.
 * 
 * @author sburton
 */
public class Demo implements Runnable {

    @Override
    public void run() {
        // TODO: Add code here to run all three experiements
        try {
        Experimenter experimenter = new RandomExperimenter();
        experimenter.runTest();
        Experimenter experimenter2 = new TrueExperimenter();
        experimenter2.runTest();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Demo().run();
    }
    
}
