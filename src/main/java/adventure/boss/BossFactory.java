package adventure.boss;

public interface BossFactory {
    // 보스 생성
    Boss create(BossType bossType);

    // 보스 타입 반환
    BossType getBossType();
}
