        /*
            Write a Java Program that inputs two Numbers, swaps the values using 
            third variable and then display the values before and after swapping. 
        */

        import java.util.Scanner;
        public class SwapTwoNumbers {
            public static void main(String[] args) {
            
            int x , y , temp = 0 ; 
        
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter Value For 1st Number : ");
            x = sc.nextInt();
        
            System.out.print("Enter Value For 2nd Number : ");
            y = sc.nextInt();
        
            System.out.println("\nValues Before Swapping\n");
        
            System.out.println("X : " + x);
            System.out.println("Y : " + y);
        
            temp = x ;
            x = y ; 
            y = temp ; 
        
            System.out.println("\nValues After Swapping\n");
            
            System.out.println("X : " + x);
            System.out.println("Y : " + y);
        
            sc.close();   
            }
        }
