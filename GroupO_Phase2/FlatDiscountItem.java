public class FlatDiscountItem extends Item {

    // Minimum quantity needed to get the discount
    private int threshold;

    // Fixed amount to subtract
    private double flatAmount;


    // Constructor
    public FlatDiscountItem(
        String name,
        double price,
        int threshold,
        double flatAmount
    ) {

        // Send name and price to the parent Item class
        super(name, price);

        // Store the discount information
        this.threshold = threshold;
        this.flatAmount = flatAmount;
    }


    // Replace the parent's calculateTotal method
    // with a version that can apply a flat discount
    @Override
    public double calculateTotal(int quantity) {

        // Calculate normal price x quantity first
        double subtotal = super.calculateTotal(quantity);


        // Apply flat discount if the quantity qualifies
        if (quantity >= threshold) {

            subtotal = Math.max(
                0,
                subtotal - flatAmount
            );
        }


        return subtotal;
    }
}
