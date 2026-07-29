import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tcs Assignment 1");
        int i = 1;
        int count = 3;
        while (i <= count) {
            Employee emp = new Employee();
            emp.AddEmployee();
            emp.ComputeDesignation();
            emp.PrintEmployee();
            i++;
        }
    }
}








/*
first change from task 1 to make task 2
while loop k ander to compute the designation
if (emp.experience >= 10) {
                emp.desgination="PM";
            }else if (emp.experience > 7 && emp.experience <= 9) {
                emp.desgination = "PL";
            } else if (emp.experience > 5 && emp.experience <= 7) {
                emp.desgination = "SSE";
            } else if (emp.experience > 1 && emp.experience <= 5) {
                emp.desgination = "SE";
            } else {
                emp.desgination = "TR";
            }

            switch (emp.desgination){
                case "PL": emp.fullForm="Project lead";
                           break;
                case "SSE": emp.fullForm="Senior Software Engineer";
                    break;
                case "SE": emp.fullForm="Software Engineer";
                    break;
                case "TR": emp.fullForm="Trainee";
                    break;
                case "PM": emp.fullForm="Project Manager";
                    break;
                default: emp.fullForm="Invalid Entry";
                         break;

   Second change from task 1 to make it task 2
   printing all the details alltogether

            System.out.println("Finding your designatuion and theri abbreviation");
            System.out.println("designnation : " + emp.desgination);
            System.out.println("abbrevation: "+ emp.fullForm);
            System.out.println(i+"Employee Name:"+emp.empName);
            System.out.println(i+"Employee Id:"+emp.empId);
            //System.out.println(i+"Employee Desgination:"+emp.desgination);
            System.out.println(i+"Employee salary:"+emp.salary);
            System.out.println(i+"Employee experience:"+emp.experience);

 third to addd employee it was just below the while loop

            System.out.print("Enter your Employee id: ");
            emp.empId = input.nextInt();
            input.nextLine();
            System.out.print("Enter the Employee name" + i + ": ");
            emp.empName = input.nextLine();
            System.out.print("Enter your salary: ");
            emp.salary = input.nextDouble();
            input.nextLine();
            System.out.print("Enter your Experience: ");
            emp.experience=input.nextInt();
 */
