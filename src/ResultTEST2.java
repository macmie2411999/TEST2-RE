public class ResultTEST2 {
    Integer numberOne;
    Integer numberTwo;

    public ResultTEST2(Integer numberOne, Integer numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Integer getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Integer numberOne) {
        this.numberOne = numberOne;
    }

    public Integer getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Integer numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return "[" + this.numberOne + ", " + this.numberTwo + "]";
    }
}
