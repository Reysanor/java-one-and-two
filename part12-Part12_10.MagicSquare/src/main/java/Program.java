
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));

        MagicSquare ms = new MagicSquare(2);
        ms.sumsOfDiagonals();
    }
}