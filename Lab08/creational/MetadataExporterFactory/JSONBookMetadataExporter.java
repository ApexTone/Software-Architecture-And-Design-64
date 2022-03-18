package creational.MetadataExporterFactory;

import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import creational.JSONBookMetadataFormatter;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormatter() {
        return new JSONBookMetadataFormatter();
    }
}
