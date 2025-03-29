package adventure.hero;

/**
 * 기본 능력치 리스트
 */
public enum DefaultHeroType {
    DEFAULT(0, "모험가", 50, 3),
    WARRIOR(1, "전사", 100,10),
    THIEF(2, "도적", 80, 6),
    WIZARD(3, "마법사", 60, 9),
    ARCHER(4, "궁수", 80, 6);

    private final int number;
    private final String name;
    private final int hp;
    private final int power;

    DefaultHeroType(int number, String name, int hp, int power) {
        this.number = number;
        this.name = name;
        this.hp = hp;
        this.power = power;
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

    public int getPower() {
        return power;
    }
}
