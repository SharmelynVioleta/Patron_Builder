package builderObjetos;
public class Contact {
    private String name;
    private Phone phone;
    private Address address;

    public Contact() {
    }
    public Contact(String name, Phone phone,Address address) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }
    public Address getAddresss() {
        return address;
    }
    public void setAddress(Address addresss) {
        this.address = addresss;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", phone=" + phone + '}';
    }
}