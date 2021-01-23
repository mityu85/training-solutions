package ioconvert.products;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Product> productList) {

        PrintStream ps = new PrintStream(new BufferedOutputStream(os));
        for (Product product: productList) {
            ps.print(product.getName());
            ps.print(";");
            ps.print(product.getPrice());
            ps.println();
        }
    }
}
