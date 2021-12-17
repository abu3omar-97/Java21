package Calculator;

public class SimpleCalculator {
    // VAR
    private double firstNumber, secondNumber;

    public SimpleCalculator() {
    // this.firstNumber = 1;
    }

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // METHODS

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber == 0) return 0.0;
        return this.firstNumber / this.secondNumber;
    }
}
