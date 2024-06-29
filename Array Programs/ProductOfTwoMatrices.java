        import java.util.Scanner; 
        public class ProductOfTwoMatrices {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
            
                System.out.print("Enter No. of Rows    : ");
                int r = sc.nextInt();
                
                System.out.print("Enter No. of Columns : ");
                int c = sc.nextInt();
                
                int[][] arr1 = new int[r][c] ;
                int[][] arr2 = new int[r][c];
                
                System.out.print("\nInput " + (r * c) + " Elements in 1st Matrix : \n"); 
                
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print("Input Element at Index arr1["+i+"]["+j+"] : ");
                        arr1[i][j] = sc.nextInt(); 
                    }
                }
                System.out.print("\nInput " + (r * c ) + " Elements in 2nd Matrix : \n"); 
                
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print("Input Element at Index arr2["+i+"]["+j+"] : ");
                        arr2[i][j] = sc.nextInt(); 
                    }
                }
                
                System.out.print("\n1st Matrix is : \n\n");
                
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print(" ");
                        
                        System.out.print(arr1[i][j] + "\t"); 
                    }
                    System.out.println(); 
                }
                
                System.out.print("\n2nd Matrix is : \n\n");
                
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print(" ");
                        
                        System.out.print(arr2[i][j] + "\t"); 
                    }
                    System.out.println(); 
                }
                
                int[][] arr3 = new int[r][c];
            
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        arr3[i][j] = 0 ; 
                        for(int k = 0 ; k < c ; k++)
                        {
                            arr3[i][j] = arr3[i][j] +  arr1[i][k] *  arr2[k][j] ; 
                        }   
                    }
                }
                System.out.print("\nProduct Of Two Matrices : \n\n"); 
                for(int i = 0 ; i < r ; i++)
                {
                    for(int j = 0 ; j < c ; j++)
                    {
                        System.out.print(" ");
                        
                        System.out.print(arr3[i][j] + "\t"); 
                    }
                    System.out.println(); 
                }
                sc.close();
            }
        }
