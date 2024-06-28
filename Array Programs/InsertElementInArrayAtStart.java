        /*
         *  Write a JAVA Program that inputs N number of Array Elements and Print the Original Array
         *  and add an element in the Start of Array and Prints the New/Updated Array. 
         */
        import java.util.Scanner; 
        public class InsertElementInArrayAtStart {
            public static void main(String[] args) {
                
            Scanner sc = new Scanner(System.in);
            
            int size , element; 
            System.out.print("Enter Size of Array : ");
            size = sc.nextInt();
            
            int[] arr = new int [size]; 
            
            System.out.println("\nEnter"+ size +" Elements in the Array \n");

            for (int i = 0 ; i < size ; i++)
            {
                System.out.print("Input Array Element at Index Arr["+i+"] : ");
                arr[i] = sc.nextInt(); 
            }

            System.out.print("\nOriginal Array : " );
            for(int i = 0 ; i < size ; i++)
            {
                System.out.print(arr[i] + " ");
            }

            System.out.print("\n\nEnter the New Element in the Array : ");
            element = sc.nextInt();
            size++;

            int [] arr2 = new int[size];
            for(int i = size - 1 ; i >= 1 ; i--)
            {
                arr2[i] = arr[i-1];
            }
            arr2[0] = element; 

            System.out.println("\nArray After Adding " + element + " at the Start of Array : ");

            System.out.print("\nNew Array      : " );
            for(int i = 0 ; i < size ; i++)
            {
                System.out.print(arr2[i]+ " ");
            }

            sc.close();
            }
        }
