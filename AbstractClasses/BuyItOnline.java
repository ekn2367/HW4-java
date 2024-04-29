package AbstractClasses;

public class BuyItOnline extends BuyIt {
    @Override
    public void al(Product product) {

        System.out.println(product.getName()+" ürünü online Satın Alındı");

    }
}