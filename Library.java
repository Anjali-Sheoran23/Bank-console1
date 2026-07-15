class Library 
 {
    static int bookCount = 0;

    Library() 
    {
        bookCount++;
        System.out.println("Book added. Total books: " + bookCount);
    }

    public static void main(String[] args) 
    {
        new Library();
        new Library();
        new Library();
}
}