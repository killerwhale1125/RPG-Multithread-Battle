package adventure.hero;

public interface SkillType {
    SkillType get();

    String getName();

    int getPower();

    int getManaCost();

    boolean isBasic();
}
