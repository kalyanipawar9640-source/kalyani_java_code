//7. Hotel Room Booking A hotel system stores booking details. 
//Create a class HotelBooking with private variables: guestName roomPricePerNight numberOfNights
//Using getters calculate total bill.
//If nights ≥ 7 give 15% discount. 
//display the final amount.

class HotelBooking {
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    // Setter
    public void setData(String name, double price, int nights) {
        guestName = name;
        roomPricePerNight = price;
        numberOfNights = nights;
    }

    // Getter
    public double getFinalAmount() {
        double totalBill = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7) {
            totalBill = totalBill - (totalBill * 15 / 100);
        }

        return totalBill;
    }

    public void display() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Final Amount : " + getFinalAmount());
    }
    public static void main(String[] args) {
        HotelBooking h = new HotelBooking();

        h.setData("Kalyani", 2000, 7);

        h.display();
    }
}