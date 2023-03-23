package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int pow = 1;
//increment the value of i after each iteration until the condition becomes false
        for (int i = 1; i <= power; i++)
//calculates power
            pow = pow * numberToPrint;
        System.out.println(pow);
//returns power
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
