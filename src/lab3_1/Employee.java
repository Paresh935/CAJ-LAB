package lab3_1;

public class Employee {

    private int EmployeeID;
    private String name;
    private String Designation;
    private double Salary;

    Employee(int id, String name, String designation, double salary) {
        this.EmployeeID = id;
        this.name = name;
        this.Designation = designation;
        this.Salary = salary;
    }
    public boolean searchEmployee(int id) {
        if (this.EmployeeID == id)
            return true;
        return false;
    }


    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return Designation;
    }

    public double getSalary() {
        return Salary;
    }
    public void incrementSalary() {
        Salary = Salary * 1.1;
    }


    @Override
    public String toString() {
        return "id: " + getEmployeeID()
                + "name: " + getName()
                + "designation: " + getDesignation()
                + "salary: " + getSalary();
    }

}


