package adventure.player;

public class PlayerService {

    public void showInfo(Player player) {
        System.out.println("전직 : " + player.getHero().getName());
        System.out.println("레벨 : " + player.getLevel().name());
        System.out.println("경험치 : " + player.getExperience());
        System.out.println("STR : " + player.getHero().getStrong());
        System.out.println("INT : " + player.getHero().getIntelligence());
        System.out.println("DEX : " + player.getHero().getDexterity());
        System.out.println("LUK : " + player.getHero().getLucky());
    }
}
