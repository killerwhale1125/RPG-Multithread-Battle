package adventure.boss.mush_mom;

import adventure.boss.Boss;
import adventure.boss.BossFactory;
import adventure.boss.BossType;
import adventure.exception.BossNotMatchException;

import static adventure.boss.BossType.*;

public class MushMomFactory implements BossFactory {
    @Override
    public Boss create(BossType bossType) {
        if (bossType != MUSH_MOM) {
            throw new BossNotMatchException("보스 타입이 일치하지 않습니다.");
        }
        return MushMom.create();
    }

    @Override
    public BossType getBossType() {
        return MUSH_MOM;
    }
}
