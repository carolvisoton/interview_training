import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {

    ParserRover parserRover;


    @Test
    public void testCardinalN(){
        parserRover = new ParserRover();
        assertThat(parserRover.isNSWE('N'), is(true) );
    }

    @Test
    public void testCardinalS(){
        parserRover = new ParserRover();
        assertThat(parserRover.isNSWE('S'), is(true) );
    }

    @Test
    public void testCardinalW(){
        parserRover = new ParserRover();
        assertThat(parserRover.isNSWE('W'), is(true) );
    }

    @Test
    public void testCardinalE(){
        parserRover = new ParserRover();
        assertThat(parserRover.isNSWE('E'), is(true) );
    }

    @Test
    public void testCharacterL(){
        parserRover = new ParserRover();
        assertThat(parserRover.isLRM('L'), is(true) );
    }

    @Test
    public void testCharacterR(){
        parserRover = new ParserRover();
        assertThat(parserRover.isLRM('R'), is(true) );
    }

    @Test
    public void testCharacterM(){
        parserRover = new ParserRover();
        assertThat(parserRover.isLRM('M'), is(true) );
    }

    @Test
    public void testCoordinateXYSmaller(){
        parserRover = new ParserRover();
        assertThat(parserRover.isCoordinatesPointerTooBig(1,3,5,5), is(true) );
    }

    @Test
    public void testCoordinateXYBigger(){
        parserRover = new ParserRover();
        assertThat(parserRover.isCoordinatesPointerTooBig(6,6,5,5), is(false) );
    }
}
