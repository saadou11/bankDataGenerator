package entities;

public class Bank {
    private String bankId;
    private String bankName;
    private String bankType;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Bank(String bankId, String bankName, String bankType) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankType = bankType;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId='" + bankId + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankType='" + bankType + '\'' +
                '}';
    }
}
