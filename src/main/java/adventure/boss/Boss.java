package adventure.boss;

public abstract class Boss {
    protected long id;
    protected String name;
    protected int hp;
    protected int power;

    public Boss(BossType bossType) {
        this.id = bossType.getId();
        this.name = bossType.getName();
        this.hp = bossType.getHp();
        this.power = bossType.getPower();
    }

    public long getId() {
        return id;
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

    public abstract void attack();
}
