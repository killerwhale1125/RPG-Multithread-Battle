package adventure.hero.service;

import adventure.hero.DefaultAbility;
import adventure.hero.Hero;
import adventure.hero.archer.Archer;
import adventure.hero.thief.Thief;
import adventure.hero.warrior.Warrior;
import adventure.hero.wizard.Wizard;
import adventure.hero.Skill;
import adventure.player.Player;

import java.util.Scanner;
import java.util.stream.Collectors;

public class HeroService {

    public void changeJob(Player player) throws InterruptedException {

        if(!player.getHero().isDefault()) {
            System.out.println("이미 전직하셨습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("전직할 직업을 선택해주세요.");
        showHeroes(DefaultAbility.values());

        Hero hero = null;
        int input = sc.nextInt();
        switch(input) {
            case 1 -> hero = Warrior.create();
            case 2 -> hero = Thief.create();
            case 3 -> hero = Wizard.create();
            case 4 -> hero = Archer.create();
            default -> {
                System.out.println("잘못 선택하셨습니다. 메인 화면으로 돌아갑니다.");
                return;
            }
        }

        showCompletedJobChangeResult(hero);
        player.changeJob(hero);
    }

    private void showCompletedJobChangeResult(Hero hero) throws InterruptedException {
        System.out.println("전직을 진행 중 입니다...");
        Thread.sleep(2000);
        showJobAbility(hero);
    }

    private void showJobAbility(Hero hero) {
        System.out.println(hero.getName() + "으로 전직하셨습니다.");
        System.out.println("STR : " + hero.getStrong());
        System.out.println("INT : " + hero.getIntelligence());
        System.out.println("DEX : " + hero.getDexterity());
        System.out.println("LUK : " + hero.getLucky());
        String skills = hero.getSkills().stream().map(Skill::getName).collect(Collectors.joining(", "));
        System.out.print("보유 스킬 : " + skills + "\n");
    }

    private void showHeroes(DefaultAbility[] defaultAbilities) {
        for (int i = 1; i < defaultAbilities.length; i++) {
            System.out.println((i) + ". " + defaultAbilities[i].getName());
        }
    }
}
