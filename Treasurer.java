package motshelo.model;

public class Treasurer extends Member {
    private String bankAccount;

    public Treasurer(String id, String name, String phone, double contribution, String bankAccount) {
        super(id, name, phone, contribution);
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() { return bankAccount; }

    @Override public String getRole() { return "Treasurer"; }

    @Override
    public String getPaymentSummary() {
        return super.getPaymentSummary() + " | Bank: " + bankAccount;
    }
}
