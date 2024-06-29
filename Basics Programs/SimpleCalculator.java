import java.util.Scanner;
public class SimpleCalculator {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            int num1 , num2 ; 

            // Input First Number
            System.out.print("Enter Value For 1st Number : ");
            num1 = sc.nextInt(); 

            // Input Second Number
            System.out.print("Enter Value For 2nd Number : ");
            num2 = sc.nextInt(); 

            System.out.print("\nSum is         :  " + (num1 + num2));
            System.out.print("\nProduct is     :  " + (num1 * num2));
            System.out.print("\nSubtraction is :  " + (num1 - num2));
            System.out.print("\nDivision is    :  " + (num1 / num2));
            System.out.print("\nRemainder is   :  " + (num1 % num2));
            sc.close(); 
        }
}
