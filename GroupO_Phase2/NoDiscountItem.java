public class NoDiscountItem extends Item {


    // Constructor
    public NoDiscountItem(
        String name,
        double price
    ) {

        // Send name and price to the parent Item class
        super(name, price);
    }


    // We do NOT override calculateTotal()
    // because Item already calculates price x quantity,
    // which is exactly what we need for an item
    // that has no discount.
}
