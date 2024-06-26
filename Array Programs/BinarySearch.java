        import java.util.*;
        public class BinarySearch {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);

                    int size , item , mid , start , end ,  loc = - 1 ; 
                    
                    System.out.print("Enter Size of Array : ");
                    size = sc.nextInt();
                    
                    int[] arr = new int [size]; 
                    
                    System.out.print("\nInput "+ size +" Array of Elements : \n");

                    for (int i = 0 ; i < arr.length ; i++)
                    {
                        System.out.print("Enter Element at Index Arr["+i+"] : ");
                        arr[i] = sc.nextInt(); 
                    }

                    System.out.print("\nEnter Array Element to Search : ");
                    item = sc.nextInt();

                    // Sort the array if array is unsorted 
                    Arrays.sort(arr);
                    // Start Index 
                    start = 0 ;
                    // Last Index  
                    end = arr.length - 1  ;

                    while( start <= end)
                    {
                        // Calculate mid of array
                        mid = (start + end ) / 2 ; 

                        if( arr[mid] == item)
                        {
                            loc = mid  ; 
                            break ; 
                        }

                        else if(item < arr[mid])
                        {
                            end = mid - 1 ;
                        }
                        else 
                        {
                            start = mid + 1 ; 
                        }
                    }

                    if(loc == -1 )
                    {
                        System.out.println(item + " Not found in the Array");
                    }
                    else
                    {
                        System.out.println(item + " is found at index " +loc+" in the Array");
                    }

                sc.close();
            }
        }
