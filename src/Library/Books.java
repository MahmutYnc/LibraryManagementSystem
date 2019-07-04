package Library;

public class Books {
    private int ID, quantity, issued;
    private String callNo, name, author, publisher, addedDate;

    public Books(int ID, String callNo, String name, String author, String publisher, int quantity, int issued, String addedDate) {
        this.ID = ID;
        this.quantity = quantity;
        this.issued = issued;
        this.callNo = callNo;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.addedDate = addedDate;
    }

    public int getID() {
        return ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIssued() {
        return issued;
    }

    public String getCallNo() {
        return callNo;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAddedDate() {
        return addedDate;
    }
}
