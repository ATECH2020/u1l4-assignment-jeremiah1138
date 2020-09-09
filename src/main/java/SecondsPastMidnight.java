import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
         int seconds;
         int minutes;
        int hours;

        //Reads int from user

        int number = scanner.nextInt();

        //Your code goes here
        seconds = number;
        minutes = seconds/60;
        hours= minutes/60;

        System.out.print(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
        
    }
}
