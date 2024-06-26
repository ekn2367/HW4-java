package Inheritence;

public class Customer extends User {
    private int phoneNumber;
    private String address;

    public Customer() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer(int phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
