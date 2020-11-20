
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int length = size - 1;
        if (size % 2 == 1) {
            int positionX = square.getWidth() / 2;
            int positionY = 0;
            int placedCount = 1;
            square.placeValue(positionX, positionY, placedCount);
            placedCount++;
            int lastX=0;
            int lastY=0;
            while (placedCount - 1 < size * size) {
                lastX= positionX;
                lastY = positionY;
                positionX++;
                positionY--;
                if (positionX > length || positionX < 0) {
                    positionX = 0;
                }
                if (positionY > length || positionY < 0) {
                    positionY = length;
                }
                if (square.readValue(positionX, positionY) != 0) {
                    positionX=lastX;
                    positionY=lastY;
                    positionY++;
                }
                if (square.readValue(positionX, positionY) == 0) {
                    square.placeValue(positionX, positionY, placedCount);
                    placedCount++;
                }
            }

            // implement the creation of a magic square with the Siamese method algorithm here

        }
        return square;
    }
}
