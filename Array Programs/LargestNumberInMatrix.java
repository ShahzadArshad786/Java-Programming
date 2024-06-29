        import java.util.Scanner;
        public class LargestNumberInMatrix {
            public static void main(String[] args) {
                    
                Scanner  sc = new Scanner(System.in);
                    
                System.out.print("Enter No. of Rows    : ");
                int r = sc.nextInt();
                
                System.out.print("Enter No. of Columns : ");
                int c = sc.nextInt();
                
                int[][] arr = new int[r][c] ;
            
                System.out.print("\nInput " + (r * c) + " Elements in the Matrix : \n"); 
                
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print("Input Element at Index arr1["+i+"]["+j+"] : ");
                        arr[i][j] = sc.nextInt(); 
                    }
                }

                System.out.print("\nInput Matrix is : \n\n");
                    
                    for(int i = 0 ; i < r ; i++)
                    {
                        for(int j = 0 ; j < c ; j++)
                        {
                            System.out.print(" ");
                            
                            System.out.print(arr[i][j] + "\t"); 
                        }
                        System.out.println(); 
                    }

                int max = arr[0][0] ; 

                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        if( arr[i][j] > max )
                        {
                            max = arr[i][j] ; 
                        }
                    }
                }

                System.out.println("\nLargest Number : " + max);
                sc.close();
            }	
        }
