package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> strings) {
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(os));
        for (String string: strings) {
            pw.println(string);
        }
    }

    public List<String> loadShoppingList(InputStream is) {
        List<String> strings = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(is))) {
            String line;
            while ((line = dis.readUTF()) != null) {
                strings.add(dis.readUTF());
            }
            return strings;
        } catch (IOException e) {
            throw new IllegalStateException("Resource can not read", e);
        }
    }
}
