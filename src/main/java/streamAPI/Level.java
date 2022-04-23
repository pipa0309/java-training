package streamAPI;

public enum Level {
    JUNIOR(0, "beginner"),
    MIDDLE(1, "medium"),
    SENIOR(2, "professional");

    private final int grade;
    private final String skill;

    Level(int grade, String skill) {
        this.grade = grade;
        this.skill = skill;
    }

    public int getGrade() {
        return grade;
    }

    public String getSkill() {
        return skill;
    }

}
