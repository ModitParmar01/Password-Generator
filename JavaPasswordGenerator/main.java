import java.util.Scanner;

public class main {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length you want for your password: ");
            int length = sc.nextInt();
            System.out.println("Do you want to include uppercase? (ans. in true/false): ");
            boolean bool1 = sc.nextBoolean();
            System.out.println("Do you want to include lowercase? (ans. in true/false): ");
            boolean bool2 = sc.nextBoolean();
            System.out.println("Do you want to include digits? : ");
            boolean bool3 = sc.nextBoolean();
            System.out.println("Do you want to include special characters? : ");
            boolean bool4 =sc.nextBoolean();
            sc.close();

            PasswordGenerator generator = new PasswordGenerator(length, bool1 , bool2, bool3, bool4);
            String password = generator.generatePassword();
            System.out.println("Generated Password: " + password);
        }
    }
}
