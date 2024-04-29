package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        BuyItOnline buyItOnline = new BuyItOnline();
        BuyItShop buyItShop = new BuyItShop();
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(25000);
        buyItOnline.al(product);
        buyItShop.al(product);
    }
}
