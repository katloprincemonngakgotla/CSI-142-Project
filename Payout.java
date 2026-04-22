package motshelo.model;

public class Payout {
    private String memberId;
    private double amount;
    private String month;

    public Payout(String memberId, double amount, String month) {
        this.memberId = memberId;
        this.amount = amount;
        this.month = month;
    }

    public String getMemberId() { return memberId; }
    public double getAmount()   { return amount; }
    public String getMonth()    { return month; }

    @Override
    public String toString() {
        return String.format("Payout to %s | Amount: P%.2f | Month: %s", memberId, amount, month);
    }
}
