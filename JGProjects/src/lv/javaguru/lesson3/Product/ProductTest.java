package lv.javaguru.lesson3.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();

        product.greeting();

        product.setName("Numark MixTrack Pro 3");
        product.setRegularPrice(229.70);
        product.setDiscount(10);

        product.calculateActualPrice();
        product.printInformation();

    }
}
