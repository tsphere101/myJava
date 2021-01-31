import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalTime {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy H:mm:ss a",Locale.US);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter hoursFormat = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter minutesFormat = DateTimeFormatter.ofPattern("m");
        DateTimeFormatter secondsFormat = DateTimeFormatter.ofPattern("ss");
        DateTimeFormatter hoursMinutesFormat = DateTimeFormatter.ofPattern("H:mm a" , Locale.US); // Format that display H : m AM/PM as US language
        DateTimeFormatter dayOfWeekFormat = DateTimeFormatter.ofPattern("EEEE", Locale.US);

        LocalDateTime localDateTimeNow = LocalDateTime.now();

        ScheduledExecutorService timePrintScheduler = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService datePrintScheduler = Executors.newSingleThreadScheduledExecutor();

        Runnable timePrintingRunnable = new Runnable() {
            public void run() {
                LocalDateTime localDateTimeNow = LocalDateTime.now(); // Update time now
                int hourInt = Integer.parseInt(hoursFormat.format(localDateTimeNow)); // Convert Hours to Integer;

                System.out.println("Hello!, there. It's " + hoursMinutesFormat.format(localDateTimeNow) + " in the " + duringTheDay(hourInt) );
                
            }
        };

        Runnable datePrintingRunnable = new Runnable() {
            public void run() {
                LocalDateTime localDateTimeNow = LocalDateTime.now();
                
                System.out.println( "Today is " +dayOfWeekFormat.format(localDateTimeNow) + " Have a good day :)");
            }
        };

        int delay_time_init = 0;
        int delay_time_date_init = 5;
        int delay_time_time = 60;
        int delay_time_date = 180;

        timePrintScheduler.scheduleAtFixedRate(timePrintingRunnable, delay_time_init, delay_time_time, TimeUnit.SECONDS);
        datePrintScheduler.scheduleAtFixedRate(datePrintingRunnable, delay_time_date_init, delay_time_date, TimeUnit.SECONDS);

        // while (true) {
        // localDateTimeNow = LocalDateTime.now();
        // System.out.println("LocalDateTime.now() = " + localDateTimeNow);
        // System.out.println("dateTimeFormat.format(localDateTimeNow) = " +
        // dateTimeFormat.format(localDateTimeNow));

        // }

    }

    public static String duringTheDay(int hour) //Check if morning afternoon evening or night;
    {
        if(hour >= 5 && hour < 12)
        {
            return "Morning";
        }
        else if(hour >= 12 && hour < 18)
        {
            return "Afternoon";
        }
        else if(hour >= 18 && hour < 21)
        {
            return "Evening";
        }
        else if(hour >= 21 && hour < 24)
        {
            return "Night";
        }
        else if(hour >= 0 && hour < 5)
        {
            return "Night";
        }
        else return "";
    }

    

}
