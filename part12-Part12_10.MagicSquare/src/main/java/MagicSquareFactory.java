
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size %2 == 0) {
            //Just for the fun :)
            throw new IllegalArgumentException("Not an odd number!");
        }

        MagicSquare square = new MagicSquare(size);
        // implement the creation of a magic square with the Siamese method algorithm here

        int x = size / 2;
        int y = 0;


        for (int count = 1; count <= size * size;count++) {
            square.placeValue(x,y,count);
            int newX = x + 1;
            int newY = y - 1;

            if (newY < 0) {
                newY = square.getWidth() - 1;
            }
            if (newX >= square.getWidth()) {
                newX = 0;
            }

            if (square.readValue(newX,newY) != 0) {
                newX = x;
                newY = y + 1;
            }
            x = newX;
            y = newY;
        }

        return square;
    }
}
