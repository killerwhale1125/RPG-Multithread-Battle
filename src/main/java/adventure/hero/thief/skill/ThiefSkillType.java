package adventure.hero.thief.skill;

import adventure.hero.SkillType;

public enum ThiefSkillType implements SkillType {
    /* 도적 */
    DARK_SIDE("다크사이드", 0, 5, true),
    TRIPLE_THROW("트리플 스로우", 6, 5, true);

    private final String name;  // 스킬 이름
    private final int power;    // 스킬 파워
    private final int manaCost; // 마나 소모량
    private final boolean isBasic;  // 기본 스킬 여부

    ThiefSkillType(String name, int power, int manaCost, boolean isBasic) {
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
