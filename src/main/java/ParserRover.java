public class ParserRover {

    private int y;
    private int x;



    boolean isNSWE(Character cardinalPoint) {
        return (cardinalPoint == 'N' || cardinalPoint == 'S' || cardinalPoint == 'W' || cardinalPoint == 'E');
    }


    boolean isLRM(Character character) {
        return (character == 'L' || character == 'R' || character == 'M');
    }


    boolean isCoordinatesPointerTooBig(int xCoordinate, int yCoordinate, int width, int height) {
        return (width >= xCoordinate && height >= yCoordinate);
    }

}


