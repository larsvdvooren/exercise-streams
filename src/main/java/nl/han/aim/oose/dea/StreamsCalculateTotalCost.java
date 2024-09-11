package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;
import nl.han.aim.oose.dea.helpers.ProductCategory;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {

        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        return products.stream()
                .filter(product -> product.getCategory() == ProductCategory.GADGETS)
                .mapToInt(Product::getPrice)
                .sum();
    }
}
