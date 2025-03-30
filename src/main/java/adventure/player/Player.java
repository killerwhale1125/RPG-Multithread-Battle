package adventure.player;

import adventure.hero.Hero;
import lombok.Getter;

@Getter
public class Player {

    private Hero hero;
    private int experience;
    private Level level;
    private int strong;    // 힘
    private int intelligence; // 지능
    private int dexterity;    // 명중률
    private int lucky;    // 운

    public Player(int experience, Level level) {
        this.experience = experience;
        this.level = level;
        this.strong = 4;
        this.intelligence = 4;
        this.dexterity = 4;
        this.lucky = 4;
    }

    public void changeJob(Hero hero) {
        this.hero = hero;
        this.strong = hero.getStrong();
        this.intelligence = hero.getIntelligence();
        this.dexterity = hero.getDexterity();
        this.lucky = hero.getLucky();
    }

    //    public void levelUp() {
//        if(experience >= level.getExperience()) {
//            experience = experience - level.getExperience();
//        }
//    }
}
