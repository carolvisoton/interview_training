import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTest {

    String finalPosition = "";

    @Test
    public void shouldTurnLeftN() {
        Rover rover = new Rover(5, 5, 'N');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnLeft();
        assertThat(finalPosition, equalTo("5 5 W"));
    }


    @Test
    public void shouldTurnLeftS() {
        Rover rover = new Rover(5, 5, 'S');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnLeft();
        assertThat(finalPosition, equalTo("5 5 E"));
    }

    @Test
    public void shouldTurnLeftW() {
        Rover rover = new Rover(5, 5, 'W');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnLeft();
        assertThat(finalPosition, equalTo("5 5 S"));
    }

    @Test
    public void shouldTurnLeftE() {
        Rover rover = new Rover(5, 5, 'E');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnLeft();
        assertThat(finalPosition, equalTo("5 5 N"));
    }


    @Test
    public void shouldTurnRightN() {
        Rover rover = new Rover(5, 5, 'N');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnRight();
        assertThat(finalPosition, equalTo("5 5 E"));
    }


    @Test
    public void shouldTurnRightS() {
        Rover rover = new Rover(5, 5, 'S');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnRight();
        assertThat(finalPosition, equalTo("5 5 W"));
    }

    @Test
    public void shouldTurnRightW() {
        Rover rover = new Rover(5, 5, 'W');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnRight();
        assertThat(finalPosition, equalTo("5 5 N"));
    }

    @Test
    public void shouldTurnRightE() {
        Rover rover = new Rover(5, 5, 'E');
        finalPosition  = rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();
        rover.turnRight();
        assertThat(finalPosition, equalTo("5 5 S"));
    }


}