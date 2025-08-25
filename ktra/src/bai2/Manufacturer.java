package bai2;

public class Manufacturer {
    private String id_m;
    private String name_m;
    private String address;
    private String email;
    public Manufacturer(){

    };
    public Manufacturer(String id_m, String name_m, String address, String email) {
        this.id_m = id_m;
        this.name_m = name_m;
        this.address = address;
        this.email = email;
    }

    public String getId_m() {
        return id_m;
    }

    public void setId_m(String id_m) {
        this.id_m = id_m;
    }

    public String getName_m() {
        return name_m;
    }

    public void setName_m(String name_m) {
        this.name_m = name_m;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
