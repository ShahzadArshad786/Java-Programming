    /*
    *  Write a JAVA program that inputs N numbers of elements in array and find the
    *  how many numbers are Palindrome in the array. 
    */

    import java.util.Scanner;
    public class CountPrimeNumbersInArray {
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter Size of Array : ");
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            System.out.print("Enter "+n+" Elements of Array : \n");
            
            for(int i = 0 ;  i < n ; i++)
            {
            System.out.print("Input Array Element at Index arr["+i+"] : ");
            arr[i] = sc.nextInt();
            }
            
            System.out.print("\nInput Array List is  : ");
            for(int i = 0 ; i < n ; i++ )
            {
            System.out.print(arr[i] + " ");
            }
        
            int factor, k = 0 ; 
            
            int arr1[] = new int[n]; 
            
            for(int i = 0 ; i < n ; i++)
            {
                factor = 0; 
                
                for(int j = 1 ; j <= arr[i] ; j++)
                {
                    if(arr[i] % j == 0)
                    {
                    factor = factor + 1 ; 
                    }
                }
                
            if(factor == 2)
            {
                arr1[k] = arr[i]; 
                k++; 
            }
            }
            if( k > 0 )
            {
                System.out.print("\nPrime Number List is : ");
                for(int i = 0 ; i < k ; i++ )
                {
                System.out.print(arr1[i] + " ");
                }
            }
            else 
            {
                System.out.print("\nNo Prime Number found in the Array\n");
            }

            sc.close();
            }
    }
