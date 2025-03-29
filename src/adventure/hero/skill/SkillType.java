package adventure.hero.skill;

public interface SkillType {
    SkillType get();

    String getName();

    int getPower();

    int getManaCost();

    boolean isBasic();
}
