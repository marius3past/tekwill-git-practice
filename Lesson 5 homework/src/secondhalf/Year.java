package secondhalf;
import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a year : ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
            System.out.println("Leap Year ");
        }
        else {
            System.out.println(" Not a leap year");
        }
        scanner.close();
    }
}