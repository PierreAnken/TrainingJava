package Practice.FootballClub.JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Practice.FootballClub.FootballPlayer;
import Practice.FootballClub.Gender;
import org.junit.jupiter.api.Test;

public class FootballPlayerTests {
    private final FootballPlayer fp = new FootballPlayer("Test",Gender.MALE);

    @Test
    void name(){
        assertEquals("Test", fp.getName());
    }

    @Test
    void gender(){
        assertEquals(Gender.MALE, fp.getGender());
    }

}
