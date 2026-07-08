//5. Online Shopping Cart An e-commerce website stores product purchase details.
//Create a class ShoppingCart with private variables: productName price quantity Using getters calculate total cost.
//If total > 5000 give 10% discount.
//print final payable amount.

class ShoppingCart {
    private String productName;
    private double price;
    private int quantity;

    // Setter
    public void setData(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    // Getter
    public double getFinalAmount() {
        double total = price * quantity;

        if (total > 5000) {
            total = total - (total * 10 / 100);
        }

        return total;
    }

    public void display() {
        System.out.println("Product Name : " + productName);
        System.out.println("Final Payable Amount : " + getFinalAmount());
    }

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();

        s.setData("Laptop Bag", 2000, 3);

        s.display();
    }
}