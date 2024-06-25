        /*
         *  Write a JAVA Program that inputs N number of elements in the array 
         *  and find how many even and odd numbers in the array. 
         */
        
        import java.util.Scanner;
        public class CountEvenOddNumbersInArray {
            public static void evenOddCount(int arr[])
            {
            int evencount = 0 , oddcount = 0;
            
            for(int i = 0 ; i < arr.length ; i++)
            {
                if( arr[i] % 2 == 0 )
                {
                evencount++ ; 
                }
                else
                {
                oddcount++ ;
                }
            }
            System.out.println("\nTotal Even Numbers in Array : " + evencount);
            System.out.println("\nTotal Odd  Numbers in Array : " + oddcount);
            }
            public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the size of Array : ");
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            System.out.println("Enter "+n+" Elements in Array : ");
            
            for(int i = 0 ; i < n ; i++)
            {
                System.out.print("Input Array Element at Index arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }
            evenOddCount(arr);
            sc.close();
            }
        }
