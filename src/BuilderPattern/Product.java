package BuilderPattern;

/**
 * Created by cheny on 2018/4/14.
 */
public class Product {
    private String name;
    private String tag;
    private String category;
    private int price;

    public static class Builder{
        private String name;
        private String tag;
        private String category;
        private int price = 0;

        public Builder(String name,String category){
            this.name = name;
            this.category = category;
        }
        public Builder setTag(String tag){
            this.tag = tag;
            return this;
        }
        public Builder setPrice(int price){
            this.price = price;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }

    private Product(Builder builder){
        name = builder.name;
        tag = builder.tag;
        category = builder.category;
        price = builder.price;
    }

    @Override
    public String toString() {
        return "name: " + name + " ,tag: " + tag + " ,category: " + category + " ,price: " + price;
    }
}
