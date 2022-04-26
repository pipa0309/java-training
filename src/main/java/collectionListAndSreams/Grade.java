package collectionListAndSreams;

public enum Grade {
    TRAINEE(0),
    JUNIOR(1),
    MIDDLE(2),
    SENIOR(3);

    private final int level;

    Grade(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
