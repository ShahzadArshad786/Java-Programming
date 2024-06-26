        /*
            Write a Java Program that inputs two Numbers, swaps the values using 
            without third variable and then display the values before and after swapping. 
        */

        import java.util.Scanner;
        public class SwapTwoNumbers1 {
            public static void main(String[] args) {
            
                int x , y ; 
            
                Scanner sc = new Scanner(System.in);
            
                System.out.print("Enter Value For 1st Number : ");
                x = sc.nextInt();
            
                System.out.print("Enter Value For 2nd Number : ");
                y = sc.nextInt();
            
                System.out.println("\nValues Before Swapping\n");
                
                System.out.println("X : " + x);
                System.out.println("Y : " + y);
            
                x = x + y ;
                y = x - y ; 
                x = x - y ; 
            
                System.out.println("\nValues After Swapping\n");
            
                System.out.println("X : " + x);
                System.out.println("Y : " + y);
            
                sc.close();
                }
        }
