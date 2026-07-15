import java.util.Scanner;
public class SalarySlipGenerator
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter employee designation(1-Intern, 2-Junior Developer, 3-Senior Developer, 4-Manager):");
  int designation = scanner.nextInt();
  System.out.println("Enter basic salary:");
  double basicSalary = scanner.nextDouble();
  double hra,da,grossSalary;
  switch(designation) 
  {
   case 1: 
          hra = 0.20 * basicSalary;
          da = 0.15 * basicSalary;
          grossSalary = basicSalary + hra + da;
          System.out.println("Designation: Intern");
          System.out.println("Basic Salary: " + basicSalary);
          System.out.println("HRA: " + hra);
          System.out.println("DA: " + da);
          System.out.println("Gross Salary: " + grossSalary);
          break;
   case 2: 
          hra = 0.20 * basicSalary;
          da = 0.15 * basicSalary;
          grossSalary = basicSalary + hra + da;
          System.out.println("Designation: Junior Developer");
          System.out.println("Basic Salary: " + basicSalary);
          System.out.println("HRA: " + hra);
          System.out.println("DA: " + da);
          System.out.println("Gross Salary: " + grossSalary);
          break;
  case 3: 
         hra = 0.20*basicSalary;
         da = 0.15*basicSalary;
         grossSalary = basicSalary+hra+da;
         System.out.println("Designation:Senior Developer");
         System.out.println("Basic Salary:"+basicSalary);
         System.out.println("HRA:"+hra);
         System.out.println("DA:"+da);
         System.out.println("Gross Salary:"+grossSalary);
         break;
  case 4: 
        hra = 0.20*basicSalary;
        da = 0.15*basicSalary;
        grossSalary = basicSalary+hra+da;
        System.out.println("Designation:Manager");
        System.out.println("Basic Salary:"+basicSalary);
        System.out.println("HRA:"+hra);
        System.out.println("DA:"+da);
        System.out.println("Gross Salary:"+grossSalary);
        break;
  default:
       System.out.println("Invalid designation entered.");
    }
}
}
