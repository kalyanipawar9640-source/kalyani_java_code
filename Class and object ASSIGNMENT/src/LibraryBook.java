//9. Library Fine System A library charges fine for late book return.
//Create a class LibraryBook with private variables: bookName daysLate finePerDay
//Using getters calculate: totalFine = daysLate × finePerDay
//If daysLate > 10 add extra ₹100 penalty.

class LibraryBook {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    // Setter
    public void setData(String name, int days, double fine) {
        bookName = name;
        daysLate = days;
        finePerDay = fine;
    }

    // Getter
    public double getTotalFine() {
        double totalFine = daysLate * finePerDay;

        if (daysLate > 10) {
            totalFine = totalFine + 100;
        }

        return totalFine;
    }

    public void display() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Total Fine : " + getTotalFine());
    }
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook();

        b.setData("Java Basics", 12, 10);

        b.display();
    }
}