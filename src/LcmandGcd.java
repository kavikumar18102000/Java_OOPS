import java.util.Scanner;

public class LcmandGcd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int gcd = calculateGcd(num1, num2);
            int lcm = calculateLcm(num1, num2, gcd);

            System.out.println("GCD: " + gcd);
            System.out.println("LCM: " + lcm);

            scanner.close();
        }

        public static int calculateGcd(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }

            return num1;
        }

        public static int calculateLcm(int num1, int num2, int gcd) {
            int product = num1 * num2;
            int lcm = product / gcd;

            return lcm;
        }
    }
