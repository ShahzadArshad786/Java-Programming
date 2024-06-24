        /*
         *  Write a JAVA Program that inpus n number of elements and find the smallest 
         *  Number from the Array. 
         */

         import java.util.Scanner;
         public class SmallestNumberInArray {
         public static void main(String[] args) {
             
             Scanner sc = new Scanner(System.in); 
                 
             int size , min ; 
             
             System.out.print("Enter Size of Array : ");
             size = sc.nextInt();
             
             int[] arr = new int [size]; 
             
             System.out.println("\nEnter "+ size +" Array of Elements : \n");
             for (int i = 0 ; i < arr.length ; i++)
             {
                 System.out.print("Enter Element at Index Arr["+i+"] : ");
                 arr[i] = sc.nextInt(); 
             }
 
             min = arr[0] ; 
 
             System.out.print("\nArray Elements are  : " );
             for (int i = 0 ; i < arr.length ; i++)
             {
                 System.out.print(arr[i] + " ");
                 if(arr[i] < min )
                 {
                     min = arr[i];
                 }
             }
             System.out.println("\nSmallest Number is  : " + min);
             sc.close();
         }       
     }
 
 
