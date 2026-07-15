class RectangleCons 
 {
    double length;
    double width;

    RectangleCons(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    double getArea() 
    {
        return length * width;
    }

    public static void main(String[] args) 
    {
        RectangleCons rectangle = new RectangleCons(5, 4);
        System.out.println("Area: " + rectangle.getArea());
}
}