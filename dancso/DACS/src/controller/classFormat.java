package Controller;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class classFormat {

    // Convert a string to a Date object using a specified date format
    public static Date covertStringToDate(String dateString, String format) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(dateString);
    }

    // Convert a Date object to a SQL Date object
    public static java.sql.Date covertDateToDateSql(Date date) {
        return new java.sql.Date(date.getTime());
    }

    // Other utility methods related to date formatting and conversion could be added here
}
