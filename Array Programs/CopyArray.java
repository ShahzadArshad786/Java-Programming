    /*
     *  Write a JAVA program that inputs an Array from user and copy the Input Array
     *  into another array and print the Both Arrays. 
     */
    import java.util.Scanner;
    public class CopyArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            
                int size ; 
                
                System.out.print("Enter Size of Array : ");
                size = sc.nextInt();
                
                int[] arr = new int [size]; 

                System.out.println("\nEnter "+ size +" Array of Elements : \n");

                for (int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print("Enter Element at Index Arr["+i+"] : ");
                    arr[i] = sc.nextInt(); 
                }
            
                System.out.print("\nOriginal Array : " );
                for(int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print(arr[i] + " ");
                }

                int[] arrcopy = new int[size] ;

                for(int i = 0 ; i < arr.length ; i++)
                {
                    arrcopy[i] = arr[i];
                }

                System.out.print("\n\nCopied Array   : " );
                for(int i = 0 ; i < arrcopy.length ; i++)
                {
                    System.out.print(arrcopy[i] + " ");
                }
                sc.close();
            }
    }
