        /*
            Write a JAVA Program that inputs two Arrays with equal size and find the
            SUM of Both Arrays. 
         */
        package Array_Programs;
        import java.util.*;

        public class SumOfTwoArrays {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in); 
            
                int n1 , n2 ; 
                
                System.out.print("Enter Size of 1st Array : ");
                n1 = sc.nextInt();
                
                int[] arr1 = new int [n1] ; 
                
                int size1 = arr1.length; 
                
                System.out.print("\nEnter "+ size1 + " Elements in 1st Array\n");
                for (int i = 0 ; i < size1 ; i++)
                {
                    System.out.print("Enter Element at Index Arr["+i+"] : ");
                    arr1[i] = sc.nextInt(); 
                }
            
                System.out.print("\nEnter Size of 2nd Array : ");
                n2 = sc.nextInt();
                
                int[] arr2 = new int [n2] ; 
                
                int size2 = arr2.length; 
                
                if(size2 < size1 || size2 > size1)
                {
                    System.out.print("\nSize of Both Arrays Should be Equal\n");
                }
                else 
                {
                    System.out.print("\nEnter "+ size2 + " Elements in 2nd Array\n");
            
                    for (int i = 0 ; i < size2 ; i++)
                    {
                        System.out.print("Enter Element at Index Arr["+i+"] : ");
                        arr2[i] = sc.nextInt(); 
                    } 
                }
            
                System.out.print("\n\n1st Array is       : ");
                for(int i = 0 ; i < size1 ; i++)
                {
                System.out.print( arr1[i] + "  ");
                }   
            
                System.out.print("\n\n2nd Array is       : ");
                for(int i = 0 ; i < size2 ; i++)
                {
                System.out.print( arr2[i] + "  ");
                }   
            
                System.out.print("\n\nResultant Array is : "); 
                for(int i = 0 ; i < size2 ; i++)
                {
                System.out.print((arr1[i] + arr2[i]) + "  ");
                }   
                sc.close();
            }
        }
