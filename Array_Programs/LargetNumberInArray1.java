        /*
         *  Write a JAVA Program that inputs N Number of elements in Array and Passes 
         *  the Array to a function, the function find the largest number and return the
         *  largest number. 
         */

        package Array_Programs;
        import java.util.Scanner;

        public class LargetNumberInArray1 {

            static int LargestNumber(int arr[])
            {
                int max ; 
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
                return max ; 
            }  
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
                max = LargestNumber(arr);
                System.out.println("\nLargest Number is   : " + max);
                sc.close();
            } 
        }
