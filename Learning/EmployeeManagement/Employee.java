import java.util.Scanner;

public class Employee {

        //these are the variable going to be used
        int empId;
        String empName;
        double salary;
        int experience;
        String desgination;
        String fullForm;
        Scanner input = new Scanner(System.in);
        void AddEmployee(){
            System.out.print("Enter your Employee id: ");
            empId = input.nextInt();
            input.nextLine();
            System.out.print("Enter the Employee name: ");
            empName = input.nextLine();
            System.out.print("Enter your salary: ");
            salary = input.nextDouble();
            input.nextLine();
            System.out.print("Enter your Experience: ");
            experience=input.nextInt();
        }
        void ComputeDesignation(){
            if (experience >= 10) {
                desgination="PM";
            }else if (experience > 7 && experience <= 9) {
                desgination = "PL";
            } else if (experience > 5 && experience <= 7) {
                desgination = "SSE";
            } else if (experience > 1 && experience <= 5) {
                desgination = "SE";
            } else {
                desgination = "TR";
            }

            switch (desgination){
                case "PL": fullForm="Project lead";
                    break;
                case "SSE": fullForm="Senior Software Engineer";
                    break;
                case "SE": fullForm="Software Engineer";
                    break;
                case "TR": fullForm="Trainee";
                    break;
                case "PM": fullForm="Project Manager";
                    break;
                default: fullForm="Invalid Entry";
                    break;
            }
        }
        void PrintEmployee(){
            System.out.println("Finding your designatuion and theri abbreviation");
            System.out.println("designnation : " + desgination);
            System.out.println("abbrevation: "+ fullForm);
            System.out.println("Employee Name:"+empName);
            System.out.println("Employee Id:"+empId);
            //System.out.println(i+"Employee Desgination:"+emp.desgination);
            System.out.println("Employee salary:"+salary);
            System.out.println("Employee experience:"+experience);
        }
}
