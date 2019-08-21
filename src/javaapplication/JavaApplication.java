package javaapplication;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JavaApplication {

    public static void main(String[] args) throws IOException {

        String json = FileReader.loadFileIntoString(
                "Json/catalog.json", "UTF-8");

        //System.out.println(json);
        JSONArray mainarray = JSONArray.fromObject(json);
        // Convert String or data in Json ARRAY

        JSONObject singleItem;
// declare object outside (to solve memory leackage problem)

        String id, title, author;
        boolean available;
        double price;
        int year;

        for (int i = 0; i < mainarray.size(); i++) {
            singleItem = mainarray.getJSONObject(i);
            // Return all the Object inside the Array with all data (of object)

            price = singleItem.getDouble("price");
            available = singleItem.getBoolean("available");

            // Print the data B
            if (price > 30 && available) {

                id = singleItem.getString("id");

                title = singleItem.getString("title");

                author = singleItem.getString("author");

                available = singleItem.getBoolean("available");

                price = singleItem.getDouble("price");
                year = singleItem.getInt("year");

                System.out.println(id + " - " + title + " - " + author + " - " + available + " - " + price + " - " + year);

            }

        }

    }

}
