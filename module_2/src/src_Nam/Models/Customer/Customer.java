package Models.Customer;

import javafx.concurrent.Service;

public class Customer implements Comparable<Customer> {
    private String nameOfCustomer;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Service useService;

    public static int dem = 0;
    public Customer(){
        dem++;
    }

    public Customer(String nameOfCustomer, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOfCustomer, String address, Service useService) {
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.useService = useService;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getUseService() {
        return useService;
    }

    public void setUseService(Service useService) {
        this.useService = useService;
    }

    @Override
    //String nameOfCustomer, String dateOfBirth, String gender, String cmnd, String phoneNumber,
    // String typeOfCustomer, String address, Service useService
    public String toString(){
        return getNameOfCustomer() + "," + getDateOfBirth() + "," + getGender() + "," + getIdCard() + ","
        + getPhoneNumber() + "," + getEmail() +  "," + getTypeOfCustomer() + "," + getAddress() + "," + getUseService();
    }

    public String showInfo() {
        return "Customer{" +
                "nameOfCustomer='" + nameOfCustomer + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", useService=" + useService +
                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return this.getNameOfCustomer().compareTo(customer.getNameOfCustomer());
    }
}
