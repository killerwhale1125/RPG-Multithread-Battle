package adventure.boss;

public enum BossType {
    MUSH_MOM(1, "머쉬맘", 300, 10),
    JUNIOR_BALROG(2, "주니어 발록", 500, 15);

    private final long id;
    private final String name;
    private final int hp;
    private final int power;

    BossType(long id, String name, int hp, int power) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
