package LambdaMain;

public class Footballer implements Run, Kick, CardPlayers {

    private String name;
    private int age;
    private String team;
    private boolean carded;

//    Constructor

    public Footballer(String name, int age, String team, boolean carded) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.carded = false;
    }

//    Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public boolean isCarded() {
        return carded;
    }

    public void setCarded(boolean carded) {
        this.carded = carded;
    }

//    Methods


    @Override
    public void run() {
//        System.out.println("Runs with ball at feet...");
    }

    @Override
    public void kick() {

    }

    @Override
    public void cardAPlayer() {

    }
}
