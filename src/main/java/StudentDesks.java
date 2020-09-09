import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Reads ints from user
        
        int userInt1 = scanner.nextInt();
        
        int userInt2 = scanner.nextInt();
    
        int userInt3 = scanner.nextInt();

        /*
         *  your code goes here
         */
          System.out.print((userInt1/2 + userInt1 % 2) + (userInt2/2 + userInt2 % 2) + (userInt3/2 + userInt3 % 2));

        // closing the scanner object
        scanner.close();
    }
}
