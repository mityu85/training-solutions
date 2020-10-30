package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int store(int num) {
        return this.stock += num;
    }

    public int dispatch(int num) {
        return this.stock -= num;
    }
}
