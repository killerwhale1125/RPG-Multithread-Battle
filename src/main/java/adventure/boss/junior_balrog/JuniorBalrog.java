package adventure.boss.junior_balrog;

import adventure.boss.Boss;
import adventure.boss.BossType;

import static adventure.boss.BossType.*;

public class JuniorBalrog extends Boss {

    private JuniorBalrog(BossType bossType) {
        super(bossType);
    }

    public static Boss create() {
        return new JuniorBalrog(JUNIOR_BALROG);
    }

    @Override
    public void attack() {

    }
}
