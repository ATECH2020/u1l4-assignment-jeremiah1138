import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {
        int hour;
        double minuteNumber;
        double minute;

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        double userDouble = scanner.nextDouble();
        //Reads ints from user


        /*
         *  your code goes here
         */
         hour = (int)userDouble/30;
         minuteNumber = ((userDouble/30)-hour);
         minute = minuteNumber*60;

         if(minute - (int)minute >= .5)
         {
           minute = (int)minute + 1;
         }
         else
         {
           minute = (int)minute;
         }
         
        
         System.out.print((int)minute*6);

        // closing the scanner object
        scanner.close();
    }
}
