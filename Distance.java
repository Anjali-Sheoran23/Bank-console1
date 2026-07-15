class Distance 
 {
    double kilometers;

    Distance(double kilometers) 
    {
        this.kilometers = kilometers;
    }

    double convertToMiles() 
    {
       return  kilometers * 0.621;
    }

    public static void main(String[] args) 
    {
        Distance d = new Distance(10);
        System.out.println("Miles: " + d.convertToMiles());
}
}