
import java.util.Calendar;

public class DateUtils {
    //PRE: accepts a string from input file field: hh::mm mm/dd/yyyy
    //POST: returns an integer array that includes month, day, year
    public static int[] parseDateTime(String date) {

        return new int[]{0,0,0};
    }

    //PRE: accepts a string from input file field: mm/dd/yyy
    //POST: returns an integer array that includes month, day, year
    public static int[] parseDate(String date) {
        String[] parts = date.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        return new int[]{month, day, year};
    }

    //PRE:  none - gets current date
    //POST: returns an integer array that includes month, day, year
    public static int[] getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return new int[]{month, day, year};
    }

    //PRE:  accepts 3 integer values representing month day and year
    //POST: returns the number of days since 1/1/4713 BC
    public static int dateToJulian(int month, int day, int year) {
        if (month <= 2) {
            year--;
            month += 12;
        }
        int A = year / 100;
        int B = 2 - A + (A / 4);
        return (int)((365.25 * (year + 4716)) + (30.6001 * (month + 1)) + day + B - 1524.5);
    }
}
