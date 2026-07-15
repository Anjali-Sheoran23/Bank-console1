class Product 
 {
    int id;
    String name;
    double price;
    Product(int id, String name, double price) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void applyDiscount(double percent) 
    {
        price -= price * percent / 100;
    }
    void showProduct() 
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Discounted Price: " + price);
    }
    public static void main(String[] args) 
    {
        Product p = new Product(101, "Laptop", 60000);
        p.applyDiscount(10);
        p.showProduct();
}
}