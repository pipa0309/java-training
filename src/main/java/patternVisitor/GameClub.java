package patternVisitor;

public class GameClub implements Place {
    private final String name;

    public GameClub(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void interconnected(Participant participant) {
        participant.play(this);
    }
}
