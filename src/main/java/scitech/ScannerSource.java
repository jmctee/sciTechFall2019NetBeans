package scitech;

import java.util.Scanner;

public class ScannerSource implements DataSource {
    public static String NAME_PROMPT = "Enter your name: ";
    public static String AGE_PROMPT = "Enter your age: ";
    public static String WEIGHT_PROMPT = "Enter your weight: ";

    Scanner scanner = new Scanner(System.in);

    @Override
    public String getName() {
        System.out.println(NAME_PROMPT);
        return scanner.next();
    }

    @Override
    public int getAge() {
        System.out.println(AGE_PROMPT);
        return scanner.nextInt();
    }

    @Override
    public Double getWeight() {
        System.out.println(WEIGHT_PROMPT);
        return scanner.nextDouble();
    }
}
