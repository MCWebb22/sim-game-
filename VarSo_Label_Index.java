import java.util.*;
public class VarSo_Label_Index {
    public static void main(String[] args) {
        World world = new World();
        world.runSimulation();
    }
}
class World {
    List<Country> countries = new ArrayList<>();
    int currentDay = 1;
    int currentMonth = 1;
    int currentYear = 2024;
    boolean running = true;
    public void runSimulation() {
        while (running) {
            advanceTime();
            for (Country c : countries) {
                c.update();
            }
            // remove this if you truly want infinite
            running = false;
        }
    }
    private void advanceTime() {
        currentDay++;
        if (currentDay > 30) {
            currentDay = 1;
            currentMonth++;
        }
        if (currentMonth > 12) {
            currentMonth = 1;
            currentYear++;
        }
    }
}
class Country {
    List<Rep> reps = new ArrayList<>();
    List<Pawn> pawns = new ArrayList<>();
    public void update() {
        for (Rep r : reps) {
            r.update();
        }
        for (Pawn p : pawns) {
            p.update();
        }
    }
}
class Rep {
    String id;
    String firstName;
    String middleInitial;
    String lastName;
    String gender;
    int age;
    List<String> race = new ArrayList<>();
    String culture;
    int health;
    int mentalHealth;
    int socialSkills;
    int lifeExpectancy;
    int intellect;
    int personalWealth;
    List<String> personalityTraits = new ArrayList<>();
    List<String> physicalTraits = new ArrayList<>();
    List<String> physicalAilments = new ArrayList<>();
    String job;
    String religion;
    String philosophy;
    String ideology;
    String reputation;
    String loyalty;
    String affiliations;
    List<String> criminalRecordList = new ArrayList<>();
    public void update() {
        // intentionally empty
    }
}
class Pawn {
    int id;
    int health;
    int mood;
    int morale;
    int resistance;
    int loyalty;
    String job;
    String religion;
    String ideology;
    String philosophy;
    String homeCountry;
    List<String> physicalAilments = new ArrayList<>();
    public void update() {
        // intentionally empty
    }
}// next step: database for names, jobs, religions, ideologies, philosophies, personality traits, physical traits, physical ailments, criminal records, and affiliations. 