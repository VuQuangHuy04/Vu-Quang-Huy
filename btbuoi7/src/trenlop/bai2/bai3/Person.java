package trenlop.bai2.bai3;

public class Person {
    public Address address;

    public Person(Address address) {
        this.address = address;
    }
    public Person(String street, String city){
        this.address = new Address(street,city);
    }
    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "street: " + address.getStreet()+ "\ncity: " + address.getCity();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
