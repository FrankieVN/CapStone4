public class Customer
{
    String name;
    String number;
    String email;
    String address;

    public Customer(String name, String number, String email, String address)
    {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }
    public String toString() {
        String output = "Name: " + name;
        output += "\nCell:" + number;
        output += "\nEmail:" + email;
        output += "\nAddress:" + address;

        return output;
    }
}
