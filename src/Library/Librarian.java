package Library;

public class Librarian {
    private int ID, contact;
    private String name, password, email, address, city;

    public Librarian(int ID,  String name, String password, String email, String address, String city, int contact) {
        this.ID = ID;
        this.contact = contact;
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.city = city;
    }

    public int getID() {
        return ID;
    }

    public int getContact() {
        return contact;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
