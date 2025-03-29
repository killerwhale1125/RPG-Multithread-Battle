package adventure.boss.junior_balrog;

import adventure.boss.Boss;
import adventure.boss.BossFactory;
import adventure.boss.BossType;
import adventure.exception.BossNotMatchException;

import static adventure.boss.BossType.*;

public class JuniorBalrogFactory implements BossFactory {
    @Override
    public Boss create(BossType bossType) {
        if(bossType != JUNIOR_BALROG) {
            throw new BossNotMatchException("보스 타입이 일치하지 않습니다.");
        }
        return JuniorBalrog.create();
    }

    @Override
    public BossType getBossType() {
        return JUNIOR_BALROG;
    }
}
