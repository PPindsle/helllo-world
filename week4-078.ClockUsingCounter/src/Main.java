
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /*throws Exception //FOR ETERNAL CLOCK  */ {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("Seconds:");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("Minutes:");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("Hours:");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i = 0;
        while ( i < 121) {
            System.out.println("Value: " + hours + ":" + minutes + ":" + seconds );
            seconds.next();
            i++;
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
        
        }
        /* ETERNAL CLOCK
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
        } */

    }
}
