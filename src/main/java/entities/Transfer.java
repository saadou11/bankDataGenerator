package entities;

import java.util.Date;

public class Transfer {

    private String firstClientId;
    private String firstBankId;
    private String secondClientId;
    private String secondBankId;
    private Double Ammount;
    private Date date;

    public Transfer(String firstClientId, String firstBankId, String secondClientId, String secondBankId,
                    Double ammount, Date date) {
        this.firstClientId = firstClientId;
        this.firstBankId = firstBankId;
        this.secondClientId = secondClientId;
        this.secondBankId = secondBankId;
        Ammount = ammount;
        this.date = date;
    }

    public String getFirstClientId() {
        return firstClientId;
    }

    public void setFirstClientId(String firstClientId) {
        this.firstClientId = firstClientId;
    }

    public String getFirstBankId() {
        return firstBankId;
    }

    public void setFirstBankId(String firstBankId) {
        this.firstBankId = firstBankId;
    }

    public String getSecondClientId() {
        return secondClientId;
    }

    public void setSecondClientId(String secondClientId) {
        this.secondClientId = secondClientId;
    }

    public String getSecondBankId() {
        return secondBankId;
    }

    public void setSecondBankId(String secondBankId) {
        this.secondBankId = secondBankId;
    }

    public Double getAmmount() {
        return Ammount;
    }

    public void setAmmount(Double ammount) {
        Ammount = ammount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "firstClientId='" + firstClientId + '\'' +
                ", firstBankId='" + firstBankId + '\'' +
                ", secondClientId='" + secondClientId + '\'' +
                ", secondBankId='" + secondBankId + '\'' +
                ", Ammount=" + Ammount +
                ", date=" + date +
                '}';
    }
}
