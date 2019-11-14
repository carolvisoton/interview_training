import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTest {


    @Test
    public void shouldTurnLeftN(){
        Rover rover = new Rover(5,5,'N');
        rover.turnLeft();
        assertThat(rover.finalPosition(), equalTo("5 5 W"));
    }


    @Test
    public void shouldTurnLeftS(){
        Rover rover = new Rover(5,5,'S');
        rover.turnLeft();
        assertThat(rover.finalPosition(), equalTo("5 5 E"));
    }

    @Test
    public void shouldTurnLeftW(){
        Rover rover = new Rover(5,5,'W');
        rover.turnLeft();
        assertThat(rover.finalPosition(), equalTo("5 5 S"));
    }

    @Test
    public void shouldTurnLeftE(){
        Rover rover = new Rover(5,5,'E');
        rover.turnLeft();
        assertThat(rover.finalPosition(), equalTo("5 5 N"));
    }


    @Test
    public void shouldTurnRightN(){
        Rover rover = new Rover(5,5,'N');
        rover.turnRight();
        assertThat(rover.finalPosition(), equalTo("5 5 E"));
    }


    @Test
    public void shouldTurnRightS(){
        Rover rover = new Rover(5,5,'S');
        rover.turnRight();
        assertThat(rover.finalPosition(), equalTo("5 5 W"));
    }

    @Test
    public void shouldTurnRightW(){
        Rover rover = new Rover(5,5,'W');
        rover.turnRight();
        assertThat(rover.finalPosition(), equalTo("5 5 N"));
    }

    @Test
    public void shouldTurnRightE(){
        Rover rover = new Rover(5,5,'E');
        rover.turnRight();
        assertThat(rover.finalPosition(), equalTo("5 5 S"));
    }


}