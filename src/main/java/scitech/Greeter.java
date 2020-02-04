package scitech;

/**
 *
 * @author joemctee
 *
 * Simple class to demonstrate TDD
 */
public class Greeter {
    private DataSource dataSource;

    public Greeter(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String sayHello() {
        return "Hello";
    }
    
    //Test

    String sayHelloTo(String name) {
        return "Hello " + name;
    }

    String sayGreetingTo(String greeting, String name){
        return greeting + ", " + name;
    }

    public String sayHappyBirthday() {
        String name = dataSource.getName();
        int age = dataSource.getAge();

        return String.format("Happy Birthday, %s! You are %d years old!", name, age);
    }

    public static void main(String[] args) {
        DataSource dataSource = new ScannerSource();
        Greeter greeter = new Greeter(dataSource);

        System.out.println(greeter.sayHappyBirthday());
    }
}
