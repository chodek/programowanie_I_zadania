package zadania.sredniowiecze;

public class King extends Citizen {

    public King(String name) {
        super(name);
    }

    public boolean canVote() {
        return false;
    }
}
