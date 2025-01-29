package Core_Java;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMapExample {

    public static void main(String[] args) {
        // Create a list of products
        List<Map<String, Object>> products = new ArrayList<>();
      
        // Add products to the list
        products.add(createProduct("Laptop", 999.99));
        products.add(createProduct("Smartphone", 499.99));
        products.add(createProduct("Tablet", 299.99));
        products.add(createProduct("Headphones", 149.99));
        products.add(createProduct("Smartwatch", 199.99));
        System.out.println(products.get(0).get("price"));
        System.out.println(products.stream().map(product -> product.get("price")));
        System.out.println( products.stream()
        .mapToDouble(product ->(double) product.get("price")) // Extract the price
        .reduce(0,Double::sum)); 
        // Print the JSON representation of the product list
        // System.out.println(toJson(products));
    }

    // Helper method to create a product map
    private static Map<String, Object> createProduct(String name, double price) {
        Map<String, Object> product = new HashMap<>();
        product.put("name", name);
        product.put("price", price);
        return product;
    }

    // Helper method to convert the list of products to a JSON string
    private static String toJson(List<Map<String, Object>> products) {
        StringBuilder json = new StringBuilder();
        json.append("[\n");

        for (int i = 0; i < products.size(); i++) {
            Map<String, Object> product = products.get(i);
            json.append("  {\n");
            json.append("    \"name\": \"").append(product.get("name")).append("\",\n");
            json.append("    \"price\": ").append(product.get("price")).append("\n");
            json.append("  }");

            if (i < products.size() - 1) {
                json.append(",");
            }
            json.append("\n");
        }

        json.append("]");
        return json.toString();
    }
}