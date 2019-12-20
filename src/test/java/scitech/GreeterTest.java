package scitech;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
 
/**
 *
 * @author joemctee
 *
 * Tests for Greeter class
 */
public class GreeterTest {
    private Greeter greeter;

    @Before
    public void setup() {
        greeter = new Greeter();
    }

    @Test
    public void testSayHello() throws Exception {
        String result = greeter.sayHello();
        
        assertEquals("Did not receive expected greeting: " + result, "Hello", result);
    }
    
    @Test
    public void testSayHelloTo() throws Exception{
        String result = greeter.sayHelloTo("Tiffany");
        
        assertEquals("Did not receive expected greeting: " + result, "Hello Tiffany", result);
    }
    
    @Test
    public void testSayGreetingTo() throws Exception{
        String result = greeter.sayGreetingTo("Hola", "Joe");
        
        //Note the comma in the greeting...
        
        assertEquals("Did not receive expected greeting: " + result, "Hola, Joe", result);
    }
}
