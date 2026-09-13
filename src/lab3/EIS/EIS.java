package lab3.EIS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class EIS {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        List<Employee> emp = new ArrayList<Employee>();

        System.out.println("Enter number of employee");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Designation: ");
            String designation = sc.next();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp.add(new Employee(id, name, designation, salary));
        }

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE INFORMATION SYSTEM =====");
            System.out.println("1. Display");
            System.out.println("2. Increment Salary");
            System.out.println("3. Add employee");
            System.out.println("4. Remove employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // Display all employees
                case 1:
                    System.out.println("Enter employee detail");
                    int id=sc.nextInt();
                    for (Employee e : emp) {
                        System.out.println(e);
                    }

                    break;
                case 2:
                    System.out.println("enter the employee id to search");
                    int id1=sc.nextInt();
                    for(Employee e:emp){        //e is object   emp is collection of object
                        e.incrementSalary();
                        System.out.println(e);
                        break;
                    }

                case 3:
                    int id2 = sc.nextInt();
                    String name = sc.next();
                    String designation = sc.next();
                    double salary = sc.nextDouble();
                    emp.add(new Employee(id2,name,designation,salary));

                    break;

                case 4:
                    System.out.println("enter employee id");
                    int id3 =sc.nextInt();
                    for(Employee e:emp){
                        if(e.searchEmployee(id3)){
                            emp.remove(e);
                            break;
                        }
                    }


            }

        } while (choice != 5);

        sc.close();
    }
}