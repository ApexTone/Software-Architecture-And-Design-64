package creational;

//DON'T MODIFY
public interface BookMetadataFormatter {
    BookMetadataFormatter reset();
    BookMetadataFormatter append(Book b);
    String getMetadataString();
}
