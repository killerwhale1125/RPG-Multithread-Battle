package adventure.boss;

import lombok.Getter;

@Getter
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

    public abstract void attack();
}
