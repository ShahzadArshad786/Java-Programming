/* 
            Write a JAVA Program that inputs N Numbers and find SUM and AVERAGE of Array 
            N numbers of Elements. 
        */

        import java.util.Scanner;
        public class SumAndAverageOfArray {

            public static void main(String[] args) {
             
                Scanner sc = new Scanner(System.in); 
    
                int n ; 
                double sum = 0 , avg; 
                System.out.print("Enter Size of Array : ");
                n = sc.nextInt();
                
                int[] arr = new int [n]; 
                
                System.out.println("\nEnter "+ n +" Array of Elements : \n");
                for (int i = 0 ; i < arr.length ; i++)
                {
                    System.out.print("Enter Element at Index Arr["+i+"] : ");
                    arr[i] = sc.nextInt(); 
                }
            
                System.out.print("\nArray Elements Are           : " );
                for(int i = 0 ; i < arr.length ; i ++)
                {
                    System.out.print(arr[i] + " ");
                    sum = sum + arr[i]; 
                }
                
                avg = sum / n ; 
                System.out.print("\nSum of Array Elements is     : " + String.format("%.0f" , sum)); 
                System.out.print("\nAverage of Array Elements is : " + String.format("%.4f" , avg)); 
                sc.close();    
            }  
        }
