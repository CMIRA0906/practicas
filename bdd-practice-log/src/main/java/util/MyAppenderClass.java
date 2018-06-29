package util;

import org.apache.log4j.DailyRollingFileAppender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MyAppenderClass extends DailyRollingFileAppender{


    @Override
    public void  setFile(String fileName) {
        if (fileName.indexOf("%date") >= 0) {

            Date today =Calendar.getInstance().getTime();
            SimpleDateFormat df = new SimpleDateFormat("dd-M-yyyy-hh-mm");
            String dateToday=df.format(today);
            fileName = fileName.replaceAll("%date", dateToday);
        }
        super.setFile(fileName);
    }
}
