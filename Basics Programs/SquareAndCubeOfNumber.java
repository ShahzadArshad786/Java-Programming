        /*
        *  Write a JAVA Program that Inputs a Number from user and displays its Square and 
        *  Cube. 
        */
        import java.util.Scanner;
        public class SquareAndCubeOfNumber {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                int num ; 
                System.out.print("Enter Value For 1st Number : ");
                num = sc.nextInt();

                System.out.println("Input Number is : " + num);
                System.out.println("Square is "+num+ " ^ 2 : " + (num * num));
                System.out.println("Cube is   "+num+ " ^ 3 : " + (num * num * num));
                sc.close();
            }
        }
