import java.util.Scanner;
public class ReverseElementsOfArray1 {
    
    public static void ReverseArray(int arr[])
    {
        System.out.print("\nOriginal Array Elements Are : " );
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n\nReverse Array Elements Are  : " );
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
                    
        Scanner sc = new Scanner(System.in); 
    
        int size ; 
        
        System.out.print("Enter Size of Array : ");
        size = sc.nextInt();
        
        int[] arr = new int [size]; 
        
        System.out.println("\nEnter "+ size +" Array of Elements : \n");

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Input Array Element at Index arr["+i+"] : ");
            arr[i] = sc.nextInt(); 
        }
    
        ReverseArray(arr);
        sc.close();
    }
}
