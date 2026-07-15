class EmployeeCons 
 {
    String name;
    int id;
    double basicSalary;
     EmployeeCons(String name, int id, double basicSalary) 
    {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    double calculateNetSalary() 
    {
        double hra = basicSalary * 0.2;
        double da = basicSalary * 0.1;
        return basicSalary + hra + da;
    }
    void displayNetSalary() 
    {
        System.out.println("Net Salary: " + calculateNetSalary());
    }
    public static void main(String[] args) 
    {
        EmployeeCons employee = new EmployeeCons("Aman", 101, 50000);
        employee.displayNetSalary();
}
}