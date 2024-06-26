        import java.util.*;
        public class CountOccurenceOfEveryElementInArray {
            public static void main(String[] args) {
                        
               Scanner sc = new Scanner(System.in);
                            
                int size , count , i , j ; 
                
                System.out.print("Enter Size of Array : ");
                size = sc.nextInt();
                
                int[] arr = new int [size]; 
                
                System.out.println("\nEnter "+ size +" Array of Elements : \n");

                for ( i = 0 ; i < arr.length ; i++)
                {
                    System.out.print("Input Array Element at Index arr["+i+"] : ");
                    arr[i] = sc.nextInt(); 
                }
            
                System.out.print("\nOriginal Array Elements Are     : " );
                for( i = 0 ; i < arr.length ; i++)
                {
                    System.out.print(arr[i] + " ");
                }

                Arrays.sort(arr);
                System.out.println();
                System.out.print("\nOccurence of Every Elements in the Array : \n");

                for( i = 0 ; i < arr.length ; i++)
                {
                    count = 1 ; 
                    if( i != arr.length - 1)
                    {
                        for(j = i + 1 ; j < arr.length; j++)
                        {
                            if(arr[j] == arr[i])
                            {
                                count++;
                            }
                            else 
                            {
                                break;
                            }
                        } 
                    }
                        System.out.println(arr[i] + " --> " + count); 
                        i = i + (count - 1) ;
                }
                    sc.close();
            }
        }
