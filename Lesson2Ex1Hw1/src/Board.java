import java.text.DecimalFormat;

public class Board {
    private Shape[] Board = new Shape[4];

    public Board() {
        super();
    }

    public void added(Shape name, int number) {
        if (Board[number - 1] == null && number - 1 < Board.length && number - 1 >= 0) {
            Board[number - 1] = name;
        } else System.out.println("This position is used");
    }

    public void kill(int number) {
        if (Board[number - 1] != null && number - 1 < Board.length && number - 1 >= 0) {
            Board[number - 1] = null;
        } else System.out.println("This position already null");
    }

    public double boardSqr() {
        double sqrt = 0;
        for (Shape shape : Board) {
            if (shape != null) {
                sqrt += shape.getArea();
            }
        }
        return sqrt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Board.length; i++) {
            if (Board[i] != null) {
                sb.append(((i + 1) + ") " + Board[i]));
            } else sb.append((i + 1) + ") " + "It's empty");
            sb.append(System.lineSeparator());
        }
        DecimalFormat f = new DecimalFormat("##.00");
        sb.append("Total area is " + f.format(boardSqr()));
        return sb.toString();
    }
}
