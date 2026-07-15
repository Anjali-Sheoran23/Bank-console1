public class StudentDetails 
{
  String name;
  int rollNo;
  char grade;
  public StudentDetails(String name, int rollNo, char grade) 
 {
   this.name = name;
   this.rollNo = rollNo;
   this.grade = grade;
 }
   public void displayDetails() 
  {
    System.out.println("Student Name: " + name);
    System.out.println("Roll Number: " + rollNo);
    System.out.println("Grade: " + grade);
  }
    public static void main(String[] args)
  {
    StudentDetails student1 = new StudentDetails("Annie", 101, 'A');
    StudentDetails student2 = new StudentDetails("Anjali", 102, 'B');
    System.out.println("Details of Student 1:");
    student1.displayDetails();
    System.out.println("Details of Student 2:");
    student2.displayDetails();
}
}