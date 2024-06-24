package SimplePrograms;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int num1 , num2 , sum = 0 ; 

    // Input First Number
    System.out.print("Enter Value For 1st Number : ");
    num1 = sc.nextInt(); 

    // Input Second Number
    System.out.print("Enter Value For 2nd Number : ");
    num2 = sc.nextInt(); 

    // Caluculate Sum Of Two Numbers
    sum = num1 + num2 ; 

    // Display Sum Of Two Numbers
    System.out.println("\nSum of " + num1 + " and " + num2 + " is : " + sum);

    sc.close(); 
    }
}
