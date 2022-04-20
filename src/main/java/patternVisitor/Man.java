package patternVisitor;

public class Man implements Participant {
    private final String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void dance(DanceFloor danceFloor) {
        System.out.printf("%s dance with %s\n", this.getName(), danceFloor.getName());
    }

    @Override
    public void play(GameClub gameClub) {
        System.out.printf("%s play with %s\n", this.getName(), gameClub.getName());
    }
}
