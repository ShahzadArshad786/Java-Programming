         /*
            Write a JAVA Program that inputs two Arrays with equal size and find the
            SUM of Both Arrays. 
         */
       
         import java.util.*;
         public class SumOfTwoArrays {
             public static void main(String[] args) {
                 
                 Scanner sc = new Scanner(System.in); 
             
                 int n1 , n2 ; 
                 
                 System.out.print("Enter Size of 1st Array : ");
                 n1 = sc.nextInt();
                 
                 int[] arr1 = new int [n1] ; 
                 
                 System.out.print("\nEnter "+ arr1.length + " Elements in 1st Array\n");
                 for (int i = 0 ; i < arr1.length ; i++)
                 {
                     System.out.print("Enter Element at Index Arr["+i+"] : ");
                     arr1[i] = sc.nextInt(); 
                 }
             
                 System.out.print("\nEnter Size of 2nd Array : ");
                 n2 = sc.nextInt();
                 
                 int[] arr2 = new int [n2] ; 
                 
                 if(arr2.length < arr1.length || arr2.length > arr1.length)
                 {
                     System.out.print("\nSize of Both Arrays Should be Equal\n");
                     
                 }
                 else 
                 {
                     System.out.print("\nEnter "+ arr2.length + " Elements in 2nd Array\n");
             
                     for (int i = 0 ; i < arr2.length ; i++)
                     {
                         System.out.print("Enter Element at Index Arr["+i+"] : ");
                         arr2[i] = sc.nextInt(); 
                     } 

                     System.out.print("\n\n1st Array Elements are : ");
                     for(int i = 0 ; i < arr1.length ; i++)
                     {
                     System.out.print( arr1[i] + "   ");
                     }   
                 
                     System.out.print("\n\n2nd Array Elements are : ");
                     for(int i = 0 ; i < arr2.length ; i++)
                     {
                     System.out.print( arr2[i] + "   ");
                     }   
                 
                     System.out.print("\n\nSum of Two Arrays is   : "); 
                     for(int i = 0 ; i < arr1.length ; i++)
                     {
                     System.out.print((arr1[i] + arr2[i]) + "   ");
                     }     
                 }
                 sc.close();
             }
         }