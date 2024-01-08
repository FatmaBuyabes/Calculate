import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int year = myScanner.nextInt();

        System.out.println("Enter your birth month:");
        int month = myScanner.nextInt();

        System.out.println("Enter your birth day:");
        int day = myScanner.nextInt();

        Calendar currentDate = Calendar.getInstance();

        Calendar userBirthDate = Calendar.getInstance();
        userBirthDate.set(year, month - 1, day);

        int age = currentDate.get(Calendar.YEAR) - userBirthDate.get(Calendar.YEAR);

        if (currentDate.get(Calendar.DAY_OF_YEAR) < userBirthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("Your age is " + age);

        myScanner.close();
    }
}
