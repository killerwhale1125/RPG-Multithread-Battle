package adventure.hero.archer.skill;

import adventure.hero.SkillType;

public enum ArcherSkillType implements SkillType {
    CRITICAL_SHOT("크리티컬 샷", 5, 5, true),
    FOCUS("집중", 0, 10, true);

    private final String name;  // 스킬 이름
    private final int power;    // 스킬 파워
    private final int manaCost; // 마나 소모량
    private final boolean isBasic;  // 기본 스킬 여부

    ArcherSkillType(String name, int power, int manaCost, boolean isBasic) {
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

    public boolean isBasic() {
        return isBasic;
    }
}
