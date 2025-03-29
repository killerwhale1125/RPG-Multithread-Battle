package adventure.hero.skill.wizard;

import adventure.hero.skill.SkillType;

public enum WizardSkillType implements SkillType {
    /* 마법사 */
    THUNDER_BOLT("썬더볼트", 8, 5, true),
    SEAL("씰", 0, 10, true);

    private final String name;  // 스킬 이름
    private final int power;    // 스킬 파워
    private final int manaCost; // 마나 소모량
    private final boolean isBasic;  // 기본 스킬 여부

    WizardSkillType(String name, int power, int manaCost, boolean isBasic) {
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
