package zadania.sredniowiecze;

public class Townsman extends Citizen{
    public Townsman(String name) {
        super(name);
    }

    public boolean canVote() {
        return true;
    }
}
