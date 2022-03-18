package creational;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

//use this instead of "factory"
public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws Exception {
        BookMetadataFormatter formatter = createFormatter();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());

        try (FileWriter file = new FileWriter("./export.txt")) {
            file.write(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract BookMetadataFormatter createFormatter() throws Exception;// use any Exception for OCP
}
