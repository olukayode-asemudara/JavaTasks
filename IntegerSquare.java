// collect integer input from user and give the squares of the digits on
import java.util.Scanner;
public class IntegerSquare{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter your digits");
        int intSquare = inputCollector.nextInt();

        for (;intSquare != 0;) {
            // 1. extract last digit
            int digit = intSquare % 10;     
            // 2. square it
            int square = digit * digit;     
            // 3. print the square
            System.out.print(square + " "); 
            // 4. remove last digit
            intSquare = intSquare / 10;     
        }
    }
}
