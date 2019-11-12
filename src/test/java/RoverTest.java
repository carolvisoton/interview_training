import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTest {

    Rover rover;

    @Test
    public void testRoverInPositionOneTwoNorth(){

        rover = new Rover(5,5, 1,2,'N', "LMLMLMLMM");

        assertThat(rover.moveRover(), equalTo("1 3 N"));
    }

    @Test
    public void testRoverInPositionThreeThreeEast(){

        rover = new Rover(5,5, 3,3,'E', "MMRMMRMRRM");

        assertThat(rover.moveRover(), equalTo("5 1 E"));
    }

    @Test
    public void shouldReturnEmptyGivenPositionOneTwoLetterA(){

        rover = new Rover(5,5, 1,2,'A', "MMRMMRMRRM");

        assertThat(rover.moveRover(), equalTo(""));
    }

    @Test
    public void shouldReturnEmptyGivenCoordinatesBiggerThanRectangle(){

        rover = new Rover(5,5, 6,7,'S', "MMRMMRMRRM");

        assertThat(rover.moveRover(), equalTo(""));
    }

    @Test
    public void shouldReturnEmptyNotGivenMRLLetters(){

        rover = new Rover(5,5, 3,3,'S', "CCCCCCCCCC");

        assertThat(rover.moveRover(), equalTo(""));
    }
}
