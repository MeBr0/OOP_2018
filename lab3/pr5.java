import java.util.Scanner;

class Position {
    private int x;
    private int y;

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
    public abstract boolean isLegalMove(Position a, Position b);
}

class Pawn extends Piece {
    public boolean isLegalMove(Position a, Position b) {
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
    public boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        boolean case1 = (a.getY() == b.getY());
        boolean case2 = (a.getX() == b.getX());

        if (case1 || case2){
            return true;
        }

        return false;
    }
}

class Knight extends Piece {
    public boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        int  case1 = Math.abs(a.getX() - b.getX());
        int case2 = Math.abs(a.getY() - b.getY());

        if ((case1 == 1 && case2 == 2) || (case2 == 1 && case1 == 2)){
            return true;
        }

        return false;
    }
}

class Bishop extends Piece {
    public boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        boolean case1 = (a.getX() + a.getY() == b.getX() + b.getY());
        boolean case2 = (a.getY() - a.getX() == b.getY() - b.getX());

        if (case1 || case2) {
            return true;
        }

        return false;
    }
}

class Queen extends Piece {
    public boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        boolean case1 = (a.getX() + a.getY() == b.getX() + b.getY());
        boolean case2 = (a.getY() - a.getX() == b.getY() - b.getX());
        boolean case3 = (a.getX() == b.getX());
        boolean case4 = (a.getY() == b.getY());

        if (case1 || case2 || case3 || case4) {
            return true;
        }

        return false;
    }
}

class King extends Piece {
    public boolean isLegalMove(Position a, Position b) {
        if (!a.isLegalPos() || !b.isLegalPos()){
            return false;
        }

        boolean b1 = (Math.abs(a.getX() - b.getX()) == 1 || a.getX() == b.getX());
        boolean b2 = (Math.abs(a.getY() - b.getY()) == 1 || a.getY() == b.getY());

        if (b1 && b2) {
            return true;
        }

        return false;
    }
}

public class pr5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pawn pawn = new Pawn();
        Rook rook = new Rook();
        Bishop bishop = new Bishop();
        Knight knight = new Knight();
        Queen queen = new Queen();
        King king = new King();

        while (true) {
            String line = scan.nextLine();

            String[] lines = line.split(" ");

            String name = lines[0];

            int x1, y1, x2, y2;

            try{
                x1 = Integer.valueOf(lines[1]);
                y1 = Integer.valueOf(lines[2]);
                x2 = Integer.valueOf(lines[3]);
                y2 = Integer.valueOf(lines[4]);
            }
            catch (Exception e){
                break;
            }



            Position p1 = new Position(x1, y1);
            Position p2 = new Position(x2, y2);

            switch (name) {
                case "Pawn":
                    System.out.println(pawn.isLegalMove(p1, p2));
                    break;
                case "Rook":
                    System.out.println(rook.isLegalMove(p1, p2));
                    break;
                case "Bishop":
                    System.out.println(bishop.isLegalMove(p1, p2));
                    break;
                case "Knight":
                    System.out.println(knight.isLegalMove(p1, p2));
                    break;
                case "Queen":
                    System.out.println(queen.isLegalMove(p1, p2));
                    break;
                case "King":
                    System.out.println(king.isLegalMove(p1, p2));
                    break;
            }

        }
    }
}