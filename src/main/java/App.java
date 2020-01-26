import java.io.Console;

public class App {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Input String");
        String newString = console.readLine();

        System.out.println("Encrypted String:");
    }
}
