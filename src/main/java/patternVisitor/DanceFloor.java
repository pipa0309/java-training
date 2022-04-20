package patternVisitor;

public class DanceFloor implements Place {
    private final String name;

    public DanceFloor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void interconnected(Participant participant) {
        participant.dance(this);
    }
}
