//3. Movie Ticket Booking A cinema hall stores ticket booking information.
//Create a class MovieTicket with private variables: movieName ticketPrice numberOfTickets Using getters calculate total cost. 
//If tickets ≥ 5 give 5% discount. Print movie name and total price.



class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setter
    public void setData(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    // Getter
    public double getTotalCost() {
        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total = total - (total * 5 / 100);
        }

        return total;
    }

    public void display() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Total Price : " + getTotalCost());
    }

    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();

        m.setData("Avengers", 200, 5);

        m.display();
    }
}