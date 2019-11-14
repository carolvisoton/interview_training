import java.util.HashMap;
import java.util.Map;

public class Rover {

    private final Map<Character, Character> mapL;
    private final Map<Character, Character> mapR;
    private int x;
    private int y;
    private Character cardinalValue;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    ParserRover rover = new ParserRover();

    public Rover(int x, int y, Character cardinalValue) {
        this.x = x;
        this.y = y;
        this.cardinalValue = cardinalValue;

        mapL = new HashMap<Character,Character>();
        mapL.put('N', 'W');
        mapL.put('S', 'E');
        mapL.put('W', 'S');
        mapL.put('E', 'N');

        mapR = new HashMap<Character,Character>();
        mapR.put('N', 'E');
        mapR.put('S', 'W');
        mapR.put('W', 'N');
        mapR.put('E', 'S');
    }

    public void turnLeft() {
        cardinalValue = mapL.get(cardinalValue);
    }

    public void turnRight() {
        cardinalValue = mapR.get(cardinalValue);
    }

    public void move() {
        if (cardinalValue == 'N') {
            y++;
        } else if (cardinalValue == 'S') {
            y--;
        } else if (cardinalValue == 'E') {
            x++;
        } else if (cardinalValue == 'W') {
            x--;
        }
    }

    public String finalPosition() {
        return x + " " + y + " " + cardinalValue;
    }
}
