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
    private TestDataSource dataSource;

    @Before
    public void setup() {
        dataSource = new TestDataSource();
        greeter = new Greeter(dataSource);
    }

    @Test
    public void testSayHello() throws Exception {
        String result = greeter.sayHello();
        
        assertEquals("Did not receive expected greeting: " + result, "Hello", result);
    }
    
    @Test
    public void testSayHelloTo() throws Exception {
        String result = greeter.sayHelloTo("Tiffany");
        
        assertEquals("Did not receive expected greeting: " + result, "Hello Tiffany", result);
    }

    @Test
    public void testSayGreetingTo() throws Exception {
        String result = greeter.sayGreetingTo("Hola", "Joe");

        //Note the comma in the greeting...

        assertEquals("Did not receive expected greeting: " + result, "Hola, Joe", result);
    }

    @Test
    public void testSayHappyBirthday() throws Exception {
        dataSource.setName("Iggy");
        dataSource.setAge(25);

        String result = greeter.sayHappyBirthday();

        assertEquals("Did not receive expected greeting: " + result, "Happy Birthday, Iggy! You are 25 years old!", result);
    }

    private class TestDataSource implements DataSource {

        private String name = "";
        private int age = 0;
        private Double weight = 0.0;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public Double getWeight() {
            return weight;
        }
    }
}
