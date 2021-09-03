package Alarm;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayOfTheWeek = calendar.get(Calendar.DAY_OF_WEEK);
        boolean isHoliday = false;
        boolean alarmState = false;


//        prints “Wake up at 5:00AM”  and sets the alarm to true on weekdays that are not holidays, and prints “Sleep!”  and sets the alarm to false on weekends and holidays.
//        On Friday the program should remind the user that they  have a “Java Class @11:PM” but without changing the alarm’s state.

        if(!isHoliday && dayOfTheWeek < 6){
            System.out.println("Wake up at 5:00AM");
            alarmState = true;
        }
        else {
            System.out.println("SLEEP");
            alarmState = false;
        }

        if(dayOfTheWeek == 6){
            System.out.println("JAVA CLASS @2:00");
            alarmState = !alarmState; // TOGGLES THE ALARM STATE
        }






    }

}
