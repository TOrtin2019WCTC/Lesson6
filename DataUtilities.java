package Lab2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtilities {
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
        return sdf.format(date);
    }
}
