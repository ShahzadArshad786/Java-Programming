        import java.util.Scanner;
        public class PercentageOfMarks {
            public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);

                int rollno , sub1 , sub2 , sub3 , sub4 , sub5 , sum = 0 ; 
                double avg = 0 ; 

                String name ; 

                System.out.print("Enter Name of Student : ");
                name = sc.nextLine();

                System.out.print("Enter Roll Number     : ");
                rollno = sc.nextInt();

                System.out.print("Enter 1st Subject Marks : ");
                sub1 = sc.nextInt();

                System.out.print("Enter 2nd Subject Marks : ");
                sub2 = sc.nextInt();

                System.out.print("Enter 3rd Subject Marks : ");
                sub3 = sc.nextInt();

                System.out.print("Enter 4th Subject Marks : ");
                sub4 = sc.nextInt();

                System.out.print("Enter 5th Subject Marks : ");
                sub5 = sc.nextInt();

                sum = sub1 + sub2 + sub3 + sub4 + sub5 ; 

                avg = sum / 5.0 ; 

                System.out.println("\n\n--- --- ---- Student Information --- --- ---");
            
                System.out.println("\n\tRoll Number     : " + rollno);
                System.out.println("\tStudent Name    : " + name);
                System.out.println("\n\tSubject 1 Marks : " + sub1);
                System.out.println("\tSubject 2 Marks : " + sub2);
                System.out.println("\tSubject 3 Marks : " + sub3);
                System.out.println("\tSubject 4 Marks : " + sub4);
                System.out.println("\tSubject 5 Marks : " + sub5);

                System.out.println("\n\tSum Of Student Marks     : " + sum);
                System.out.println("\tAverage Of Student Marks : " + avg);
                System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- ---");
                sc.close();

            }
        }
