        /*
            Write a Java Program that inputs 5-Digits number from the user and calculates 
            the sum of its digits. For example if the user enters 12345, it displays 15. 
        */

        import java.util.*;
        public class SumOf5DigitsNumber {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                int num , a , a1, b, b1 , c, c1 , d , e , sum = 0 ; 
        
                System.out.print("Enter any 5-Digit Number : ");
                num = sc.nextInt();
        
                // check number is 5-digit or not 
                if(num  < 10000 || num > 99999)
                {
                    System.out.print(num + " is a Invalid Number");
                } 
                else 
                {
                    a = num / 10000 ; 
                    a1 = num % 10000 ; 
                    b = a1 / 1000 ; 
                    b1 = a1 % 1000 ;
                    c =  b1 / 100 ; 
                    c1 = b1 % 100 ; 
                    d = c1 / 10 ; 
                    e = c1 % 10 ; 
                    sum = a + b + c + d + e ; 
                    System.out.print("\nOriginal Number is     : " + num);
                    System.out.print("\n\nSum of "+num+" Digits is : " + sum);
                }
                sc.close();
            }
        }
        
