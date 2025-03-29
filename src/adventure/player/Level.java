package adventure.player;

public enum Level {
    LEVEL1(100), LEVEL2(200), LEVEL3(300), LEVEL4(400), LEVEL5(500);

    private final int experience;

    Level(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
