package activities.dao;

public class Customers {

    private int customerNumber;
    private String cName;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String country;

    public Customers() {
        customerNumber=0;
        firstName="";
        lastName="";
        cName="";
        phone="";
        address="";
        city="";
        country="";
    }

    public Customers(int customerNumber, String cName, String firstName,
                     String lastName, String phone, String address, String city,
                     String country) {
        super();
        this.customerNumber = customerNumber;
        this.cName = cName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customers [customerNumber=" + customerNumber + ", cName="
                + cName + ", firstName=" + firstName + ", lastName=" + lastName
                + ", phone=" + phone + ", address=" + address + ", city=" + city
                + ", country=" + country + "]";
    }
}