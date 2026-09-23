public class PercentDiscountItem extends Item {

    // Minimum quantity needed to get the discount
    private int threshold;

    // Percentage discount
    private double percentOff;


    // Constructor
    public PercentDiscountItem(
        String name,
        double price,
        int threshold,
        double percentOff
    ) {

        // Send name and price to the parent Item class
        super(name, price);

        // Store the discount information
        this.threshold = threshold;
        this.percentOff = percentOff;
    }


    // We are changing the calculateTotal method
    // that was inherited from Item
    @Override
    public double calculateTotal(int quantity) {

        // First calculate the normal total
        // using the parent Item class
        double subtotal = super.calculateTotal(quantity);


        // Apply percentage discount if quantity qualifies
        if (quantity >= threshold) {

            subtotal = subtotal * (1 - percentOff / 100.0);
        }


        // Return the final subtotal
        return subtotal;
    }
}
