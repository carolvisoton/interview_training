public class Rover {


    private int width;
    private int height;
    private int xCoordinate;
    private int yCoordinate;
    private Character cardinalPoint;
    private String commands;


    public Rover(int width, int height, int xCoordinate, int yCoordinate, Character cardinalPoint, String commands) {
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cardinalPoint = cardinalPoint;
        this.commands = commands;
    }

    public String moveRover() {
        char newCardinalValue = 0;
        String result = "";

        if (isCoordinatesPointerTooBig(xCoordinate, yCoordinate, width, height)
                && isNSWE(cardinalPoint)) {

            int newValueX = xCoordinate;
            int newValueY = yCoordinate;
            newCardinalValue = cardinalPoint;

            for (Character character : commands.toCharArray()) {

                if (isLRM(character)) {
                    if (character == 'M' && newCardinalValue == 'N') {
                        newValueY++;
                    } else if (character == 'M' && newCardinalValue == 'S') {
                        newValueY--;
                    } else if (character == 'M' && newCardinalValue == 'E') {
                        newValueX++;
                    } else if (character == 'M' && newCardinalValue == 'W') {
                        newValueX--;
                    } else if (character == 'L' && newCardinalValue == 'N') {
                        newCardinalValue = 'W';
                    } else if (character == 'R' && newCardinalValue == 'N') {
                        newCardinalValue = 'E';
                    } else if (character == 'L' && newCardinalValue == 'S') {
                        newCardinalValue = 'E';
                    } else if (character == 'R' && newCardinalValue == 'S') {
                        newCardinalValue = 'W';
                    } else if (character == 'L' && newCardinalValue == 'W') {
                        newCardinalValue = 'S';
                    } else if (character == 'R' && newCardinalValue == 'W') {
                        newCardinalValue = 'N';
                    } else if (character == 'L' && newCardinalValue == 'E') {
                        newCardinalValue = 'N';
                    } else if (character == 'R' && newCardinalValue == 'E') {
                        newCardinalValue = 'S';
                    }

                    result = newValueX + " " + newValueY + " " + newCardinalValue;
                }
            }

        }

        return result;

    }

    private boolean isCoordinatesPointerTooBig(int xCoordinate, int yCoordinate, int width, int height) {
        return (width >= xCoordinate && height >= yCoordinate);
    }


    private boolean isNSWE(Character cardinalPoint) {
        return (cardinalPoint == 'N' || cardinalPoint == 'S' || cardinalPoint == 'W' || cardinalPoint == 'E');
    }

    private boolean isLRM(Character character) {
        return (character == 'L' || character == 'R' || character == 'M');
    }
}
