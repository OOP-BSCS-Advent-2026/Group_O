public class Item {

    // These variables are private because we are using encapsulation
    private String name;
    private double price;


    // Constructor
    // This runs whenever an Item object is created
    public Item(String name, double price) {

        // A price should not be zero or negative
        if (price <= 0) {
            throw new IllegalArgumentException(
                "Price must be greater than zero"
            );
        }

        // Store the values inside the object
        this.name = name;
        this.price = price;
    }


    // Getter for the item name
    public String getName() {
        return name;
    }


    // Getter for the item price
    public double getPrice() {
        return price;
    }


    // Calculates the normal total without any discount
    public double calculateTotal(int quantity) {

        // Quantity should not be negative
        if (quantity < 0) {
            throw new IllegalArgumentException(
                "Quantity cannot be negative"
            );
        }

        // Normal total = price x quantity
        return price * quantity;
    }
}
