import java.util.Scanner;

class Data{
    private double sum;
    private double max;
    private int amount;

    Data(){
        this.sum = 0;
        this.max = 0;
        this.amount = 0;
    }

    public void addValue(double num){
        this.sum += num;
        this.amount++;

        if (this.amount == 1){
            this.max = num;
        }
        else{
            if (num > this.max){
                this.max = num;
            }
        }
    }

    public double getAverage(){
        return this.sum / this.amount;
    }

    public double getMax(){
        return this.max;
    }
}

class Analyzer{
    private Data data;
    private boolean isAlive;

    private final String PHRASE = "Enter number (Q to quit): ";
    private final Scanner SCANNER = new Scanner(System.in);

    Analyzer(){
        this.data = new Data();
        this.isAlive = true;
    }

    public void test(){
        while (this.isAlive == true){
            System.out.print(this.PHRASE);

            String line = SCANNER.nextLine();

//            System.out.println(line);

            if (line.charAt(0) == 'Q'){
                this.isAlive = false;
            }
            else{
//                System.out.println("here");

                double num = Double.parseDouble(line);

                data.addValue(num);
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());

    }
}

public class pr3{

    public static void main(String[] args){
        Analyzer analyzer = new Analyzer();

        analyzer.test();
    }
}