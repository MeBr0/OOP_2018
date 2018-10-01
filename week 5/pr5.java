import java.util.Scanner;

class Position {
    private int x;
    private int y;

    public Position(){

    }

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public int getX() { return this.x; }

    public void setY(int y) { this.y = y; }
    public int getY() { return this.y; }

    public boolean isLegalPos(){
        return (this.x > 0 && this.x < 9 && this.y > 0 && this.y < 9);
    }
}

abstract class Piece {
    public abstract static boolean isLegalMove(Position a, Position b);
}

class Pawn extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        if (a.getY() == 8){
            return false;
        }

        return true;
    }
}

class Rook extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        if (a.getY() == b.getY() || a.getX() == b.getX()){
            return true;
        }

        return false;
    }
}

class Knight extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }
        p1 = Math.abs(a.getX() - b.getX());
        p2 = Math.abs(a.getY() - b.getY());

        if ((p1 == 1 && p2 == 2) || (p2 == 1 && p1 == 2)){
            return true;
        }

        return false;
    }
}

class Bishop extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        if ((a.getX() + a.getY() == b.getX() + b.getY()) || (a.getY() - a.getX() == b.getY() - b.getX()) {
            return true;
        }

        return false;
    }
}

class Queen extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        if ((a.getX() + a.getY() == b.getX() + b.getY()) || (a.getY() - a.getX() == b.getY() - b.getX() || a.getY() == b.getY() || a.getX() == b.getX()) {
            return true;
        }

        return false;
    }
}

class King extends Piece {
    public static boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        boolean b1 = (Math.abs(a.getX() - b.getX()) == 1 || a.getX() == b.getX();
        boolean b2 = (Math.abs(a.getY() - b.getY()) == 1 || a.getY() == b.getY();

        if (b1 && b2) {
            return true;
        }

        return false;
    }
}

public class pr5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (True) {
            String line = scan.nextLine();

        }
    }
}