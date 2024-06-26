        /*
            Write a Java Program that inputs 3-Digits number from the user and displays it 
            in reverse order. For example if the user enters 123, it displays 321. 
        */

        import java.util.*;
        public class Reverse3DigitNumber {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                int num , a , a1, b , c , rev ; 
        
                System.out.print("Enter any 3-Digit Number : ");
                num = sc.nextInt();
        
                // check number is 3-digit or not 
                if(num  < 100 || num > 999)
                {
                    System.out.print(num + " is a Invalid Number");
                } 
                else 
                {
                    a = num / 100 ; 
                    a1 = num % 100 ; 
                    b = a1 / 10 ; 
                    c = a1 % 10 ; 
                
                    // 1st Method calculate and print reverse number 
                
                    rev = (c*100) + (b*10) + a ; 
                
                    System.out.print("Original Number is : " + num);
                    System.out.print("\n\nReverse Number is  : " + rev);
                
                    // Print Reverse Number using Direct Method
                    System.out.print("\nReverse Number is  : " + c + b + a);
                }
                sc.close();
            }  
        }
        