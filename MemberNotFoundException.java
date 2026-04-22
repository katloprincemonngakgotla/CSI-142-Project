package motshelo.exceptions;

public class MemberNotFoundException extends Exception {
    public MemberNotFoundException(String id) {
        super("No member found with ID: " + id);
    }
}
