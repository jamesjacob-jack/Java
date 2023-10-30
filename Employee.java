import java.util.Scanner;

public class Employee {
    public static int findIndex(String[] employeeName, String name) { // Method for identify the index of the given name
        for (int i = 0; i < employeeName.length; i++) {
            if (employeeName[i].equals(name)) {
                return i; // Return the index where the element was found
            }
        }
        return -1; // Return -1 if the element is not found 
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter an Employee Name: ");
        String inputName = Sc.nextLine();

        String Name = inputName.substring(0, 1).toUpperCase() + inputName.substring(1);
        String no = inputName.substring(0);
        System.out.println(no);
        String employeeNames[] = {"James", "Akash", "Krishna", "Pubaraj", "Josua"};// Employee Names

        int employeeSalary[] = {25000,45000,30000,35000,28000}; //Employee salary Details

        int index = findIndex(employeeNames, Name); // identify index of given name in Array

        if (index != -1) {
            int salary = employeeSalary[index];
            System.out.println("Employee " + inputName + " salary is : " + salary);
        } else {
            System.out.println("Employee" +inputName+ " is not found ! or check your spell");
        }
    }
}
