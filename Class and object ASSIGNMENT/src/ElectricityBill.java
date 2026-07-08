// 2. Electricity Bill System An electricity company calculates monthly bills.
//Create a class ElectricityBill with
//private variables: customerName unitsConsumed pricePerUnit 
//Using getters calculate total bill: totalBill = unitsConsumed * pricePerUnit If units > 500 add 10% surcharge.
//desply the final bil .


class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setData(String name, int units, double price) {
        customerName = name;
        unitsConsumed = units;
        pricePerUnit = price;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            bill = bill + (bill * 10 / 100);
        }

        return bill;
    }

    public void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Bill : " + getTotalBill());
    }

    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill();

        e.setData("Kalyani", 600, 5);

        e.display();
    }
}
