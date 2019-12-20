package scitech;

/**
 *
 * @author joemctee
 *
 * Simple class to demonstrate TDD
 */
public class Greeter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //      comment change for demo doc
    }

    public String sayHello() {
        return "Hello";
    }
    
    //Test

    String sayHelloTo(String name) {
        return "Hello " + name;
    }
    
}
