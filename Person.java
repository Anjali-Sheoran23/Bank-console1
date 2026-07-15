class Person 
 {
    String name;
    int age;
    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    void checkEligibility() 
    {
        if (age >= 18)
            System.out.println(name + " is eligible to vote.");
        else
            System.out.println(name + " is NOT eligible to vote.");
    }
    public static void main(String[] args) 
    {
        Person p1 = new Person("Atul", 16);
        Person p2 = new Person("Mahak", 20);
        Person p3 = new Person("Aman", 18);

        p1.checkEligibility();
        p2.checkEligibility();
        p3.checkEligibility();
}
}