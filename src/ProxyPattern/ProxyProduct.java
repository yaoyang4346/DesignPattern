package ProxyPattern;

/**
 * Created by cheny on 2018/4/19.
 */
public class ProxyProduct implements Product{
    private Product product;

    public ProxyProduct(Product product){
        this.product = product;
    }

    @Override
    public void fun() {
        product.fun();
    }
}
