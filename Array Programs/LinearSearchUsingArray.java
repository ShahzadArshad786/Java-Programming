        import java.util.Scanner;
        public class LinearSearchUsingArray {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in); 
                    
                int size , item , loc = - 1 ; 
                
                System.out.print("Enter Size of Array : ");
                size = sc.nextInt();
                
                int[] arr = new int [size]; 
                
                System.out.println("\nEnter "+ size +" Array of Elements : \n");

                for (int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print("Input Array Element at Index arr["+i+"] : ");
                    arr[i] = sc.nextInt(); 
                }
            
                System.out.print("\nOriginal Array Elements Are      : " );
                for(int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print(arr[i] + " ");
                }

                System.out.print("\nEnter an Array Element to Search : ");
                item = sc.nextInt();

                for(int i = 0 ; i < arr.length ; i++)
                {
                    if(arr[i] == item)
                    {
                        loc = i ; 
                        break ; 
                    }
                }

                if(loc == - 1)
                {
                    System.out.print("\nSearched Element " + item + " Not Found in the Array");
                    System.out.println("\nSearch is Unsuccessful...");
                }
                else 
                {
                    System.out.print("\n" + item + " is found at index " + loc + " in the Array");
                    System.out.println("\nSearch is Successful...");
                }
                    sc.close();
            }
        }
