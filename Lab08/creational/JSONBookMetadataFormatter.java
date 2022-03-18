package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

//Builder Pattern (look at CSVBookMetadataFormatter and XMLBookMetadataFormatter for help)
public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private StringWriter writer;
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        writer = new StringWriter();
        jsonArray = new JSONArray();

        try (FileWriter fileWriter = new FileWriter("./BooksData.json")) {
            fileWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        try (FileWriter fileWriter = new FileWriter("./BooksData.json")) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ISBN", b.getISBN());
            jsonObject.put("title", b.getTitle());
            jsonObject.put("publisher", b.getPublisher());
            jsonObject.put("authors", Arrays.toString(b.getAuthors()));
            jsonArray.add(jsonObject);

            fileWriter.write(jsonArray.toJSONString());
            writer.write(jsonArray.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}
