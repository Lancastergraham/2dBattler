package test.com.graham;

import com.graham.CharacterClasses;
import com.graham.CharacterSheet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterSheetTest {
    CharacterSheet cs;

    @BeforeEach
    public void setUp() {
        cs = new CharacterSheet();
    }

    //Name Tests
    @Test
    public void namingACharacter() {
        String expected = "Steve";

        cs.setName("Steve");
        String name = cs.getName();

        assertEquals(expected, name);
    }

    @Test
    public void defaultCharacter() {
        String expected = "Donovan";

        CharacterSheet cs = new CharacterSheet();

        String name = cs.getName();

        assertEquals(expected, name);
    }

    @Test
    public void noNameForCharacter() {
        String expected = "...";

        CharacterSheet cs = new CharacterSheet();
        cs.setName("");
        String name = cs.getName();

        assertEquals(expected, name);
    }

    //Level Tests
    @Test
    public void defaultLevelOneForCharacter() {
        int expected = 1;

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void characterLevelsUpTwice() {
        int expected = 3;

        cs.levelUp();
        cs.levelUp();

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void setLevelThreeForCharacter() {
        int expected = 3;

        cs.setLevel(3);

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void setCharacterLevelToThreeAndLevelsUp() {
        int expected = 4;

        cs.setLevel(3);
        cs.levelUp();

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    //Character "Class" tests

    @Test
    public void characterClassDefault() {
        String expected = "Soldier";

        String result = cs.getCharacterClass();

        assertEquals(expected, result);
    }

    @Test
    public void setCharacterClassBoxer() {
        String expected = "Boxer";

        cs.setCharacterClass(CharacterClasses.BOXER);

        String result = cs.getCharacterClass();

        assertEquals(expected, result);
    }

    //Experience Point Tests

    @Test
    public void experiencePointsDefault() {
        int expected = 0;

        int result = cs.getExperience();

        assertEquals(expected, result);
    }

    @Test
    public void experiencePoints100() {
        int expected = 100;

        cs.setExperience(100);

        int result = cs.getExperience();

        assertEquals(expected, result);
    }

    //Leveling Tests

    @Test
    public void killShouldLevelUp() {
        int expected = 2;

        cs.killExperience(250);

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void killShouldLevelUpToFour() {
        int expected = 4;

        cs.killExperience(1500);

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void killShouldNotLevelUp() {
        int expected = 1;

        cs.killExperience(100);

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    @Test
    public void killShouldNotLevelUpThenShould() {
        int expected = 2;

        cs.killExperience(100);
        cs.killExperience(150);

        int result = cs.getLevel();

        assertEquals(expected, result);
    }

    //Setting Up Stats

    @Test
    public void getDefaultStats() {
        int[] expected = {2, 2, 2, 2, 2};

        int[] result = quickStats();

        assertArrayEquals(expected, result);

    }

    @Test void differentStats() {
        int[] expected = {4, 5, 6, 3, 1};

        cs.setStats(4, 5, 6, 3, 1);

        int[] result = quickStats();

        assertArrayEquals(expected, result);
    }

    @Test void seeSoldierHitPoints() {
        int expected = 25;

        cs.setStats(5, 5, 6, 3, 1);

        int result = cs.getHitPoints();

        assertEquals(expected, result);
    }

    @Test void seeBoxerHitPoints() {
        int expected = 20;

        cs.setStats(5, 5, 6, 3, 1);
        cs.setCharacterClass(CharacterClasses.MONK);

        int result = cs.getHitPoints();

        assertEquals(expected, result);
    }

    private int[] quickStats() {
        return new int[]{cs.getAttributes().getVitality(),
                    cs.getAttributes().getStrength(),
                    cs.getAttributes().getEndurance(),
                    cs.getAttributes().getDexterity(),
                    cs.getAttributes().getSpeed()};
    }
}
