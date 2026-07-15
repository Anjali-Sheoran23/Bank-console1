class Book 
 {
    int bookId;
    String title, author;
    double price;
    Book(int bookId, String title, String author, double price) 
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayIfExpensive() 
    {
        if (price > 500) 
        {
            System.out.println(bookId + " - " + title + " by " + author + " - rs" + price);
        }
    }
    public static void main(String[] args) 
    {
        Book b1 = new Book(1, "Java ", "Jay", 450);
        Book b2 = new Book(2, "Advanced Java", "Piyush", 700);
        Book b3 = new Book(3, "OOPS", "Aman", 550);
        b1.displayIfExpensive();
        b2.displayIfExpensive();
        b3.displayIfExpensive();
}
}