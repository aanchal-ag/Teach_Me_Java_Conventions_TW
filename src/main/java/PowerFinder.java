public class PowerFinder {
    private final int number1;
    private final int number2;

    public PowerFinder(int number1, int number2) {


        this.number1 = number1;
        this.number2 = number2;
    }

    public int power() {
        int power=1;
        for (int i = 0; i <number2 ; i++) {
            power=power*number1;

        }
        return power;
    }
}
