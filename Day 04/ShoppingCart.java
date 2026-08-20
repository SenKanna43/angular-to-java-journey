import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // ==========================================
        // 1. LIST - Shopping Cart Items
        // ==========================================

//        List<String> cart = new ArrayList<>();
//
//        // add()
//        cart.add("iPhone");
//        cart.add("AirPods");
//        cart.add("Charger");
//        cart.add("Power Bank");
//
//        System.out.println("Cart: " + cart);
//
//        // get()
//        System.out.println("First item: " + cart.get(0));
//
//        // set()
//        cart.set(3, "Apple Watch");
//
//        System.out.println("After update: " + cart);
//
//        // contains()
//        System.out.println(
//                "Contains iPhone? " + cart.contains("iPhone")
//        );
//
//        // indexOf()
//        System.out.println(
//                "iPhone index: " + cart.indexOf("iPhone")
//        );
//
//        // size()
//        System.out.println(
//                "Cart size: " + cart.size()
//        );
//
//        // remove()
//        cart.remove("Charger");
//
//        System.out.println(
//                "After removing Charger: " + cart
//        );
//
//        // isEmpty()
//        System.out.println(
//                "Is cart empty? " + cart.isEmpty()
//        );
//
//        // Loop
//        System.out.println("\nCart Items:");
//
//        for (String item : cart) {
//            System.out.println(item);
//        }


        // ==========================================
        // 2. SET - Unique Product Categories
        // ==========================================

//        Set<String> categories = new HashSet<>();
//
//        categories.add("Mobile");
//        categories.add("Audio");
//        categories.add("Accessories");
//        categories.add("Mobile"); // duplicate
//
//        System.out.println("\nCategories: " + categories);
//
//        // contains()
//        System.out.println(
//                "Has Mobile category? "
//                        + categories.contains("Mobile")
//        );
//
//        // remove()
//        categories.remove("Audio");
//
//        System.out.println(
//                "After removing Audio: " + categories
//        );
//
//        // size()
//        System.out.println(
//                "Number of categories: "
//                        + categories.size()
//        );
//
//        // isEmpty()
//        System.out.println(
//                "Are categories empty? "
//                        + categories.isEmpty()
//        );
//
//        // Loop
//        System.out.println("\nCategories:");
//
//        for (String category : categories) {
//            System.out.println(category);
//        }


        // ==========================================
        // 3. MAP - Product Price
        // ==========================================

//        Map<String, Double> prices = new HashMap<>();
//
//        // put()
//        prices.put("iPhone", 79999.0);
//        prices.put("AirPods", 14999.0);
//        prices.put("Charger", 1999.0);
//        prices.put("Apple Watch", 39999.0);
//
//        System.out.println("\nPrices: " + prices);
//
//        // get()
//        System.out.println(
//                "iPhone price: "
//                        + prices.get("iPhone")
//        );
//
//        // containsKey()
//        System.out.println(
//                "Does price exist for iPhone? "
//                        + prices.containsKey("iPhone")
//        );
//
//        // containsValue()
//        System.out.println(
//                "Does price 14999 exist? "
//                        + prices.containsValue(14999.0)
//        );
//
//        // Update using put()
//        prices.put("iPhone", 74999.0);
//
//        System.out.println(
//                "Updated iPhone price: "
//                        + prices.get("iPhone")
//        );
//
//        // getOrDefault()
//        double laptopPrice =
//                prices.getOrDefault("Laptop", 0.0);
//
//        System.out.println(
//                "Laptop price: " + laptopPrice
//        );
//
//        // remove()
//        prices.remove("Charger");
//
//        System.out.println(
//                "After removing Charger: " + prices
//        );
//
//        // size()
//        System.out.println(
//                "Number of products: " + prices.size()
//        );
//
//        // isEmpty()
//        System.out.println(
//                "Is price map empty? " + prices.isEmpty()
//        );


        // ==========================================
        // 4. MAP LOOPING
        // ==========================================

//        System.out.println("\nProduct Prices:");
//
//        for (Map.Entry<String, Double> entry
//                : prices.entrySet()) {
//
//            System.out.println(
//                    entry.getKey()
//                            + " -> ₹"
//                            + entry.getValue()
//            );
//        }


        // ==========================================
        // 5. COLLECTION UTILITY METHODS
        // ==========================================

        List<Integer> productPrices =
                new ArrayList<>();

        productPrices.add(79999);
        productPrices.add(14999);
        productPrices.add(1999);
        productPrices.add(39999);

        System.out.println(
                "\nOriginal prices: "
                        + productPrices
        );

        // sort()
        Collections.sort(productPrices);

        System.out.println(
                "Sorted prices: "
                        + productPrices
        );

        // reverse()
        Collections.reverse(productPrices);

        System.out.println(
                "Reversed prices: "
                        + productPrices
        );

        // min()
        System.out.println(
                "Minimum price: "
                        + Collections.min(productPrices)
        );

        // max()
        System.out.println(
                "Maximum price: "
                        + Collections.max(productPrices)
        );
    }
}