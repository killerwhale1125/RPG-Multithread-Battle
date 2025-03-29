package adventure.player;

import adventure.hero.Hero;

public class Player {

    private Hero hero;
    private int experience;
    private Level level;

    public Player(int experience, Level level) {
        this.experience = experience;
        this.level = level;
    }

    public void changeJob(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public int getExperience() {
        return experience;
    }

    public Level getLevel() {
        return level;
    }

    //    public void levelUp() {
//        if(experience >= level.getExperience()) {
//            experience = experience - level.getExperience();
//        }
//    }
}
