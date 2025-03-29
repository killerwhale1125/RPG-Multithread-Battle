package adventure.boss.mush_mom;

import adventure.boss.Boss;
import adventure.boss.BossType;

import static adventure.boss.BossType.*;

public class MushMom extends Boss {

    private MushMom(BossType bossType) {
        super(bossType);
    }

    public static MushMom create() {
        return new MushMom(MUSH_MOM);
    }

    @Override
    public void attack() {

    }
}
