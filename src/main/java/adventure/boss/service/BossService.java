package adventure.boss.service;

import adventure.boss.Boss;
import adventure.boss.BossFactory;
import adventure.boss.BossType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ServiceLoader;

public class BossService {

    private final Map<Long, Boss> bossMap;
    private final Map<BossType, BossFactory> bossFactoryMap;
    private static BossService instance;

    // private 생성자로 외부에서 객체를 생성하지 못하게 제한
    private BossService(Map<Long, Boss> bossMap, Map<BossType, BossFactory> bossFactoryMap) {
        this.bossMap = bossMap;
        this.bossFactoryMap = bossFactoryMap;
    }

    /* getInstance() 메서드에서 자동으로 팩토리 클래스 등록 */
    public static BossService getInstance() {
        if (instance == null) {  // 처음 호출 시에만 인스턴스를 생성
            Map<Long, Boss> bossMap = new HashMap<>();
            Map<BossType, BossFactory> bossFactoryMap = new HashMap<>();

            // META-INF/services 내부 파일 정보로 Boss 생성 팩토리 클래스 조회
            ServiceLoader<BossFactory> factories = ServiceLoader.load(BossFactory.class);

            // BossType(Enum) 은 내부적으로 hashcode & equals 재정의로 Map 해시 충돌에 안전
            for (BossFactory factory : factories) {
                bossFactoryMap.put(factory.getBossType(), factory);
            }

            instance = new BossService(bossMap, bossFactoryMap);
            instance.init();  // 보스 정보 초기화
        }
        return instance;
    }

    private void init() {
        for (BossType bossType : BossType.values()) {
            BossFactory factory = bossFactoryMap.get(bossType);
            if (factory != null) {
                Boss boss = factory.create(bossType);
                bossMap.put(boss.getId(), boss);
            }
        }
    }

    public Boss selectBoss() {
        showBossInfo();
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        Boss boss = bossMap.get(input);
        System.out.println(boss.getName() + "를 선택하셨습니다.");
        return boss;
    }

    private void showBossInfo() {
        System.out.println("처치할 보스를 선택해주세요.");
        for (Map.Entry<Long, Boss> bossEntry : bossMap.entrySet()) {
            System.out.println(bossEntry.getKey() + ". " + bossEntry.getValue().getName());
        }
    }

}
