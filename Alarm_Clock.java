/**
 *
 * @author danz
 */
import java.time.*;
import java.io.IOException;
import java.util.*;
import java.io.IOException;
import java.util.*;

interface Alarm {
    public String showAlarm();
    public String setAlarm();
    public void promptEnterKey();
}


abstract class Weekday {
    
}


class Set extends Weekday implements Alarm{
    String time;
    @Override
    public String setAlarm(){
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        Scanner sc = new Scanner(System.in);
        time = sc.next();
        return time;
    }
    
    @Override
    public String showAlarm(){
        System.out.println("Alarm set at " + time);
        System.out.println();
        return time;
    }
    
    public void Quit(){
        System.exit(0);
    }

    @Override
    public void promptEnterKey() {
       
    try {
        System.in.read();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }//To change body of generated methods, choose Tools | Templates.
    
    public void Time(){
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();
        if (alarm.isAfter(now)){
            System.out.println("I'll wake you up later!");
            System.out.println();
        }
        else if(alarm.isBefore(now)){
            System.out.println("Alarm is set for tomorrow");
            System.out.println();
        }
    }
    }


public class Alarm_Clock {
    public static void main(String[]args){
        Set set = new Set();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Command> ?");
        System.out.println("Available Commands are <SET> <SHOW> <QUIT>");
        set.promptEnterKey();
        
        while(true){    System.out.print("Enter Command> ");
        String choice = "";
        choice = sc.next();
        
        switch(choice){
                case "set":
                case "SET":
                    set.setAlarm();
                    set.Time();
                    break;
                    
                case "show":
                case "SHOW":
                    set.showAlarm();
                    break;
                    
                case "quit":
                case "QUIT":
                    set.Quit();
                    break;
                    
                default:
                    System.out.println("no match, re-enter choice");
   
            }
    }
        
}
}
