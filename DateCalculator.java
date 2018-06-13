
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class DateCalculator {
    public static void main(String[] args) throws ParseException {
        // receives input from console.
        Scanner scanner = new Scanner(System.in);
        
        // prompts user to enter date in format
        System.out.println("Enter a date in the format mm/dd/yyyy");
        
        // receives user input using scanner
        String userDate1 = scanner.next();
        
        System.out.println("Enter another date in the format mm/dd/yyyy");
        String userDate2 = scanner.next();
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
        
        // parse converts string to date
        Date firstDate = dateFormat.parse(userDate1);
        Date secondDate = dateFormat.parse(userDate2);
        
        // get time from date
        long difference = firstDate.getTime() - secondDate.getTime();
        System.out.println("The difference between two dates is: " + TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS));
    }
}
