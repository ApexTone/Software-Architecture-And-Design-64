package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.StringWriter;
import java.util.Arrays;

//Builder Pattern (look at CSVBookMetadataFormatter and XMLBookMetadataFormatter for help)
public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private StringWriter writer;
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        writer = new StringWriter();
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ISBN", b.getISBN());
        jsonObject.put("title", b.getTitle());
        jsonObject.put("publisher", b.getPublisher());
        jsonObject.put("authors", Arrays.toString(b.getAuthors()));
        jsonArray.add(jsonObject);

        writer.write(jsonArray.toJSONString());
        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}
