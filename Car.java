class Car 
 {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showCarInfo() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) 
    {
        Car car = new Car("Toyota", "Camry", 25000);
        car.showCarInfo();
}
}