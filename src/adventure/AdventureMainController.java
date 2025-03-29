package adventure;

import adventure.hero.job.Default;
import adventure.player.Player;
import adventure.service.ChangeJobService;
import adventure.service.PlayerService;

import java.util.Scanner;

import static adventure.player.Level.*;
import static java.lang.Thread.sleep;

/**
 * Controller
 */
public class AdventureMainController {
    public static void main(String[] args) throws InterruptedException {
        ChangeJobService changeJobService = new ChangeJobService();
        PlayerService playerService = new PlayerService();
        Player player = new Player(0, LEVEL1);
        player.changeJob(Default.create());

        Scanner sc = new Scanner(System.in);
        System.out.println("모험의 세계에 오신 것을 환영합니다.");
        sleep(500);

        while(true) {
            System.out.println();
            showSelectList();
            switch(sc.nextInt()) {
                case 1 -> changeJobService.changeJob(player);
                case 5 -> playerService.showInfo(player);
            }
        }
    }

    private static void showSelectList() {
        System.out.println("1. 전직하기");
        System.out.println("2. 아이템 창");
        System.out.println("3. 상점");
        System.out.println("4. 보스 잡기");
        System.out.println("5. 내 정보\n");
    }
}
