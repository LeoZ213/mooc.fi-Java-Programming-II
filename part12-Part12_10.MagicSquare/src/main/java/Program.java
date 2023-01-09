
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();

        MagicSquare test = msFactory.createMagicSquare(3);
        System.out.println(test);
        //int[][] arr = {{1, 2}, {3, 4}};
        //MagicSquare ms = new MagicSquare(arr.length);
        //System.out.println(ms);
        //ms.placeValue(0,0,1);
        //ms.placeValue(1,0,1);
        //ms.placeValue(0,1,5);
        //ms.placeValue(1,1,7);
        //System.out.println(ms.sumsOfDiagonals());
        //System.out.println("---------------------------------");
        //System.out.println(ms);
        //System.out.println("---------------------------------");
        //ms.test();
        //System.out.println("---------------------------------");
        //ms.test2();
    }
}
