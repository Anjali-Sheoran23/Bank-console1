class MovieTicket 
 {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) 
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket() 
    {
        System.out.println("Booking confirmed for " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) 
    {
        MovieTicket ticket = new MovieTicket("Avengers", 15, 250);
        ticket.bookTicket();
}
}