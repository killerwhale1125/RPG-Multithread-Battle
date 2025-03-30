package adventure.hero;

/**
 * 기본 능력치 리스트
 */
public enum DefaultAbility {
    DEFAULT(0, "모험가", 50, 4, 4, 4, 4),
    WARRIOR(1, "전사", 100,8, 4, 6, 4),
    THIEF(2, "도적", 70, 4, 4, 7, 7),
    WIZARD(3, "마법사", 50, 9, 4, 4, 6),
    ARCHER(4, "궁수", 70, 7, 4, 7, 4);

    private final int number;
    private final String name;
    private final int hp;
    private final int strong;    // 힘
    private final int intelligence; // 지능
    private final int dexterity;    // 명중률
    private final int lucky;    // 운

    DefaultAbility(int number, String name, int hp, int strong, int intelligence, int dexterity, int lucky) {
        this.number = number;
        this.name = name;
        this.hp = hp;
        this.strong = strong;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.lucky = lucky;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStrong() {
        return strong;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getLucky() {
        return lucky;
    }

    public static DefaultAbility getAbility(HeroType heroType) {
        return switch (heroType) {
            case DEFAULT -> DEFAULT;
            case WARRIOR -> WARRIOR;
            case WIZARD -> WIZARD;
            case ARCHER -> ARCHER;
            case THIEF -> THIEF;
        };
    }
}
