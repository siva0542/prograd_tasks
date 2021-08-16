public class Arthimetic {
    int num1,num2;
    public Arthimetic(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;

    }

    public int sum() {
        return num1+num2;
    }

    public int sub() {
        return num1-num2;
    }

    public int multiply() {
        return num1*num2;
    }

    public int divide() {
        return num1/num2;
    }
}
