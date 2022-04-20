package patternVisitor;

public class App {
    public static void main(String[] args) {
        Participant[] participants = {
                new Man("man"),
                new Woman("woman")
        };

        Place[] places = {
                new GameClub("game club"),
                new DanceFloor("dance floor"),
        };

        for (Place place : places) {
            for (Participant participant : participants) {
                place.interconnected(participant);
            }
        }
    }
}
