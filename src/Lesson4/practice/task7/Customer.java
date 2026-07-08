package Lesson4.practice.task7;

public class Customer {
    private String serName;
    private String firstName;
    private String secondName;
    private String address;
    private String cardNumber;
    private String accountNumber;

    public Customer(String serName, String firstName, String secondName, String address, String cardNumber, String accountNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.serName = serName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSerName() {
        return serName;
    }

    public String getAddress() {
        return address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
