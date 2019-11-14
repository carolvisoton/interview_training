public class Main {


    private int width;
    private int height;
    private int xCoordinate;
    private int yCoordinate;
    private Character cardinalPoint;
    private String commands;


    public Main(int width, int height, int xCoordinate, int yCoordinate, Character cardinalPoint, String commands) {
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.cardinalPoint = cardinalPoint;
        this.commands = commands;
    }

    public String moveRover() throws RuntimeException {

        ParserRover parserRover = new ParserRover();
        boolean biggerCoodinates = parserRover.isCoordinatesPointerTooBig(xCoordinate, yCoordinate, width, height);
        boolean cardinalNSWE = parserRover.isNSWE(cardinalPoint);

        if (!biggerCoodinates || !cardinalNSWE) {
            return "";
        }

        Rover rover = new Rover(xCoordinate, yCoordinate, cardinalPoint);

        for (Character character : commands.toCharArray()) {
            if (parserRover.isLRM(character)) {
                if (character == 'L') {
                    rover.turnLeft();
                } else if (character == 'R') {
                    rover.turnRight();
                } else if (character == 'M') {
                    if (parserRover.isCoordinatesPointerTooBig(rover.getX(), rover.getY(), width, height))
                        rover.move();
                    else
                        throw new RuntimeException("X and/or Y coordinates exceeded the the initial size of the rectangle");
                }
            } else {
                throw  new RuntimeException("Invalid coordinates letters");
            }
        }

        return rover.getX() +" "+ rover.getY()+" "+rover.getCardinalValue();

    }

}
