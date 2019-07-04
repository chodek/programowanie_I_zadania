package zadania.sredniowiecze;

public class Soldier extends Citizen {
    public Soldier(String name) {
        super(name);
    }

    public boolean canVote() {
        return true;
    }
}
