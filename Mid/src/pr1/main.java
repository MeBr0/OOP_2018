package pr1;

import java.util.*;

class Sequence {
    private String field;

    public Sequence(){ }

    public Sequence(String field) { this.field = field; }

    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    public boolean isPalindrom() {
        int size = this.field.length();

        for (int i = 0; i < size / 2; ++i) {
            if (this.field.charAt(i) != this.field.charAt(size - i - 1){
                return false;
            }
        }
        return true;
    }

    public boolean isSubString(Sequence s) {
        if (this.field.equals(s.getField())) {
            return true;
        }

        int size = this.field.length();
        int sub_size = s.getField().length();

        for (int i = 0; i < size - sub_size + 1; ++i) {
            for (int j = 0; j < sub_size; ++j) {
                if (this.field.charAt(i + j) == s.getField().charAt(j)) {
                    if (j == sub_size - 1) {
                        return true;
                    }
                    else {
                        continue;
                    }
                }
                else {
                    break;
                }
            }
        }

        return false;
    }

}

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Sequence seq = new Sequence(s.nextLine());

        if (seq.isPalindrom()){
            System.out.println("Palindrom!");
        }
        else{
            System.out.println("Not Palindrom!");
        }

        Sequence seq2 = new Sequence(s.nextLine());

        System.out.println(seq.isSubString(seq2));
    }
}