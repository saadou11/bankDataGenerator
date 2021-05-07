package entities;

import java.util.Date;

public class Transaction {

    private String clientId;
    private String bankId;
    private Double amount;
    private Date date;

    public Transaction(String clientId, String bankId, Double amount, Date date) {
        this.clientId = clientId;
        this.bankId = bankId;
        this.amount = amount;
        this.date = date;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "clientId='" + clientId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
