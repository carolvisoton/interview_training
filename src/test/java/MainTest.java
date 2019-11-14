import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    Main main;

    @Test
    public void testRoverInPositionOneTwoNorth(){

        main = new Main(5,5, 1,2,'N', "LMLMLMLMM");

        assertThat(main.moveRover(), equalTo("1 3 N"));
    }

    @Test
    public void testRoverInPositionThreeThreeEast(){

        main = new Main(5,5, 3,3,'E', "MMRMMRMRRM");

        assertThat(main.moveRover(), equalTo("5 1 E"));
    }

    @Test
    public void shouldReturnEmptyGivenPositionOneTwoLetterA(){

        main = new Main(5,5, 1,2,'A', "MMRMMRMRRM");

        assertThat(main.moveRover(), equalTo(""));
    }

    @Test
    public void shouldReturnEmptyGivenCoordinatesBiggerThanRectangle(){

        main = new Main(5,5, 6,7,'S', "MMRMMRMRRM");

        assertThat(main.moveRover(), equalTo(""));
    }

    @Test
    public void shouldReturnEmptyNotGivenMRLLetters(){

        main = new Main(5,5, 3,3,'S', "CCCCCCCCCC");
        assertThrows(RuntimeException.class, () -> { main.moveRover(); }, "Invalid coordinates letters");
    }
    
    @Test
    public void testJustMCoordinates(){

        main = new Main(5,5, 3,3,'E', "MMMM");
        assertThrows(RuntimeException.class, () -> { main.moveRover(); }, "X and/or Y coordinates exceeded the the initial size of the rectangle");
    }
}
