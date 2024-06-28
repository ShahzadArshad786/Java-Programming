        import java.util.Scanner; 
        class DeleteElementInArrayByValue{
            public static void main(String[] args) {
                
            Scanner  sc = new Scanner(System.in); 

            int size , item , count = 0  ; 
            
            System.out.print("Enter Size of an Array : "); 
            
            size = sc.nextInt();
            
            int[] arr = new int[size];
            
            System.out.println();
            for(int i = 0 ; i < arr.length ; i++)
            {
                System.out.print("Input Array Element at Index arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }
            
            System.out.print("\nOriginal Array : ");
            for(int i = 0 ; i < arr.length ; i++)
            {
                    System.out.print(arr[i] + "  ");
            }
            System.out.print("\n\nEnter Array Element You Want to Delete : ");
            item = sc.nextInt();
            
                for(int i = 0 ; i < arr.length ; i++)
                {
                    if( item == arr[i] )
                    {
                        for(int j = i ; j < arr.length - 1 ; j++)
                        {
                            arr[j] = arr[j+ 1];
                        }
                        count++;
                        break ; 
                    }
                }
                
                if(count == 0)
                {
                    System.out.print("\nElement not found in the Array"); 
                }
                else 
                {
                    System.out.print("\nUpdated Array  : ");
                for(int i = 0 ; i < arr.length - 1 ; i++)
                {
                    System.out.print(arr[i] + " "); 
                }
                }

                sc.close();
            }
        }
