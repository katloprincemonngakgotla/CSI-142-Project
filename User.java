package motshelo.group;

import java.util.ArrayList;
import motshelo.contracts.Summarisable;
import motshelo.model.Member;

public class Users {
    private String MotsheloName;
    private ArrayList<Member> members;

    public Users(String MotsheloName) {
        this.MotsheloName = MotsheloName;
        this.members = new ArrayList();
    }

    public void addMembers(Member member) {
        members.add(member);
    }

    public void displayMembers() {
        for (Member member : members) {
            System.out.println(member.getDetails());
        }
    }

    public void printReport() {
        System.out.println("\n==== MOTSHELO REPORT ====");
        System.out.println("Group: " + MotsheloName);
        System.out.println("Total Members: " + members.size());
        double total = 0;
        for (Member m : members) total += m.getContribution().getAmount();
        System.out.println("Total Pool: P" + total);
        System.out.println("\nSummaries:");
        
        for (Summarisable s : members) {
            System.out.println("  " + s.getSummary());
        }
        System.out.println("=========================");
    }
}