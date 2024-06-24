/*
         *  Write a JAVA Program that inpus n number of elements and finds the Largest 
         *  Number from the Array. 
         */

         import java.util.Scanner; 
         public class LargestNumberInArray {
             public static void main(String[] args) {
              
                 Scanner sc = new Scanner(System.in); 
                 
                 int size , max ; 
                 
                 System.out.print("Enter Size of Array : ");
                 size = sc.nextInt();
                 
                 int[] arr = new int [size]; 
                 
                 System.out.println("\nEnter "+ size +" Array of Elements : \n");
 
                 for (int i = 0 ; i < arr.length ; i++)
                 {
                     System.out.print("Enter Element at Index Arr["+i+"] : ");
                     arr[i] = sc.nextInt(); 
                 }
     
                 max = arr[0] ; 
     
                 System.out.print("\nArray Elements are  : " );
                 for (int i = 0 ; i < arr.length ; i++)
                 {
                     System.out.print(arr[i] + " ");
                     if(arr[i] > max )
                     {
                         max = arr[i];
                     }
                 }
                 System.out.println("\nLargest  Number is  : " + max);
                 sc.close();
             }
         }
 
