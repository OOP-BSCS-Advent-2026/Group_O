public class Main {

    public static void main(String[] args) {


        // ---------------------------------
        // CREATE THE FOUR POWERFUEL ITEMS
        // ---------------------------------

        Item[] items = {

            // Petrol:
            // Price = 5000
            // Buy 20 or more = 5% discount
            new PercentDiscountItem(
                "Petrol (litre)",
                5000,
                20,
                5
            ),


            // Diesel:
            // Price = 4800
            // No discount
            new NoDiscountItem(
                "Diesel (litre)",
                4800
            ),


            // Engine Oil:
            // Price = 25000
            // Buy 3 or more = UGX 3000 discount
            new FlatDiscountItem(
                "Engine Oil",
                25000,
                3,
                3000
            ),


            // Car Wash:
            // Price = 10000
            // Buy 4 or more = 10% discount
            new PercentDiscountItem(
                "Car Wash",
                10000,
                4,
                10
            )
        };


        // ---------------------------------
        // QUANTITIES FROM PHASE 1
        // ---------------------------------

        int[] quantities = {
            19,  // Petrol
            2,   // Diesel
            2,   // Engine Oil
            4    // Car Wash
        };


        // Variable for the final total
        double grandTotal = 0;


        // ---------------------------------
        // DISPLAY BUSINESS NAME
        // ---------------------------------

        System.out.println(
            "===== POWERFUEL STATION ====="
        );


        // ---------------------------------
        // DISPLAY PRICE LIST
        // ---------------------------------

        System.out.println();
        System.out.println("===== PRICE LIST =====");


        for (int i = 0; i < items.length; i++) {

            System.out.printf(
                "%d. %s - UGX %.2f%n",
                i + 1,
                items[i].getName(),
                items[i].getPrice()
            );
        }


        // ---------------------------------
        // DISPLAY RECEIPT
        // ---------------------------------

        System.out.println();
        System.out.println("===== RECEIPT =====");


        for (int i = 0; i < items.length; i++) {

            // Ask the current object to calculate its total
            double lineTotal =
                items[i].calculateTotal(
                    quantities[i]
                );


            // Print item name, quantity and line total
            System.out.printf(
                "%s x%d = UGX %.2f%n",
                items[i].getName(),
                quantities[i],
                lineTotal
            );


            // Add this item's total to the grand total
            grandTotal =
                grandTotal + lineTotal;
        }


        // ---------------------------------
        // DISPLAY FINAL TOTAL
        // ---------------------------------

        System.out.println(
            "-------------------------------------------"
        );


        System.out.printf(
            "TOTAL = UGX %.2f%n",
            grandTotal
        );
    }
}
