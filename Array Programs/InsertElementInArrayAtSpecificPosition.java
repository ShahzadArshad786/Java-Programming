        import java.util.Scanner ; 
        public class InsertElementInArrayAtSpecificPosition {
            public static void main(String[] args) {
            
                Scanner sc = new Scanner(System.in);
            
                int size , element , pos ; 
                
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

                System.out.print("\nEnter the Position where to insert an Element : ");
                pos = sc.nextInt();
                size++;
    
                int [] arr2 = new int[size] ; 
    
                // Copy arr to arr2 
                System.arraycopy(arr, 0, arr2, 0, arr.length);
                
                for(int i = size - 1 ; i > pos ; i--)
                {
                    arr2[i] = arr2[i-1];
                }
                arr2[pos] = element; 
    
                System.out.println("\nElement " + element + " inserting at the Position "+pos+" of the Array");
    
                System.out.print("\nNew Array      : " );

                for(int i = 0 ; i < size ; i++)
                {
                    System.out.print(arr2[i]+ " ");
                }
    
                sc.close(); 
            }  
        }
