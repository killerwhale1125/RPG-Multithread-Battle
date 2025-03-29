package adventure.hero.skill.warrior;

import adventure.hero.skill.SkillType;

public enum WarriorSkillType implements SkillType {

    POWER_STRIKE("파워 스트라이크", 10, 5, true),
    IRON_WALL("아이언 월", 0, 10, true);

    private final String name;  // 스킬 이름
    private final int power;    // 스킬 파워
    private final int manaCost; // 마나 소모량
    private final boolean isBasic;  // 기본 스킬 여부

    WarriorSkillType(String name, int power, int manaCost, boolean isBasic) {
        this.name = name;
        this.power = power;
        this.manaCost = manaCost;
        this.isBasic = isBasic;
    }

    @Override
    public SkillType get() {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getManaCost() {
        return manaCost;
    }

    @Override
    public boolean isBasic() {
        return isBasic;
    }


}
