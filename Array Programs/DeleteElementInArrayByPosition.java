        import java.util.Scanner;
        public class DeleteElementInArrayByPosition {
            public static void main(String[] args) {
                
            Scanner  sc = new Scanner(System.in); 
            int size , pos ; 
            
            System.out.print("Enter Size of an Array : "); 
            
            size = sc.nextInt();
            
            int[] arr = new int[size];
            System.out.println();

            for(int i = 0 ; i < arr.length ; i++)
            {
                System.out.print("Input Array Element at Index arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }

            System.out.print("\nEnter Position of Element You Want to Delete : ");
            pos = sc.nextInt();

            if(pos < 0 || pos > arr.length - 1)
            {
                System.out.println("\nInvalid Position");
            }
            else 
            {
                System.out.print("\nOriginal Array   : ");
                for(int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print(arr[i] + "  ");
                }
                    
                for(int i = pos ; i < arr.length - 1; i++)
                {
                        
                    arr[i] = arr[i+1];
                }
                    
                System.out.print("\n\nNew/Update Array : ");
                for(int i = 0 ; i < arr.length - 1 ; i++)
                {
                    System.out.print(arr[i] + " "); 
                }
                System.out.println("\n\n\n\n");
            }
                sc.close();   
            }
        }
