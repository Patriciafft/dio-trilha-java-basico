import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Please enter your first name: ");
            String firstName = scanner.next();

            System.out.println("Please enter your last name: ");
            String lastName = scanner.next();

            System.out.println("Please enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Please enter your height (in meters):");
            double height = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Hello, I'm" + firstName.toUpperCase() + " " + lastName.toUpperCase());
            System.out.println("I'm" + age + " years ol ");
            System.out.println("My heitgh is" + height + "meters ");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("The fields of age and height need to be numeric. Please try again.");
        }
    }
}