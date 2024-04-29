package AbstractClasses;


public class BuyItShop extends BuyIt {
    @Override
    public void al(Product product) {
        System.out.println(product.getName()+ " ürünü mağazadan satın alındı");
    }
}
