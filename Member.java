package motshelo.model;

import motshelo.contracts.Summarisable;
import motshelo.transactions.Contribution;

public class Member extends Person implements Summarisable {
    private Contribution contribution;

    public Member(String name, String id, int cellphonoNo, Contribution contribution) {
        super(name, id, cellphonoNo);
        this.contribution = contribution;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Contribution:" + contribution.getDetails();
    }

    @Override
    public String getSummary() {
        return "Member: " + getDetails();
    }
}