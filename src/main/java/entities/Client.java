package entities;

import java.util.Date;

public class Client {

    private String clientId;
    private String firstName;
    private String lastName;
    private Integer age;
    private Double sold;
    private String typeAccount;
    private Integer paiementLimit;
    private Integer withdrawalLimit;
    private Date dateInscription;
    private String idBank;
    private String typeCarte;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSold() {
        return sold;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Integer getPaiementLimit() {
        return paiementLimit;
    }

    public void setPaiementLimit(Integer paiementLimit) {
        this.paiementLimit = paiementLimit;
    }

    public Integer getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Integer withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public Client(String clientId, String firstName, String lastName, Integer age, Double sold, String typeAccount,
                  Integer paiementLimit, Integer withdrawalLimit, Date dateInscription, String idBank, String typeCarte) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sold = sold;
        this.typeAccount = typeAccount;
        this.paiementLimit = paiementLimit;
        this.withdrawalLimit = withdrawalLimit;
        this.dateInscription = dateInscription;
        this.idBank = idBank;
        this.typeCarte = typeCarte;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sold=" + sold +
                ", typeAccount='" + typeAccount + '\'' +
                ", paiementLimit=" + paiementLimit +
                ", withdrawalLimit=" + withdrawalLimit +
                ", dateInscription=" + dateInscription +
                ", idBank='" + idBank + '\'' +
                ", typeCarte='" + typeCarte + '\'' +
                '}';
    }

}
