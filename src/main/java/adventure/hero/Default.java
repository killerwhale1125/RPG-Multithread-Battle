package adventure.hero;

import java.util.List;

import static adventure.hero.HeroType.DEFAULT;

/**
 * 모험가
 */
public class Default extends Hero {

    private Default(List<Skill> skills) {
        super(DEFAULT, skills);
    }

    public static Hero create() {
        return new Default(List.of());
    }

    @Override
    protected void useSkill() {

    }
}
