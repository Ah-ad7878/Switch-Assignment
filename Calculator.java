package pk.org.cas.switchAssignment;

public class Calculator {
    private int number1;
    private char operand;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public char getOperand() {
        return operand;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public Calculator() {
    }

    public Calculator(int number1, char operand, int number2) {
        this.number1 = number1;
        this.operand = operand;
        this.number2 = number2;
    }

    public void calculate(){
        switch (getOperand()){
            case '+':
                int result = getNumber1()+getNumber2();
                System.out.println("Addition of 2 number is "+result);
                break;
            case '-':
                int result2 = getNumber1()-getNumber2();
                System.out.println("subtraction  of 2 number is "+result2);
                break;
            case '*':
                int result3 = getNumber1()*getNumber2();
                System.out.println("Multiplication of 2 number is "+result3);
                break;
            case '/':
                int result4 = getNumber1()/getNumber2();
                System.out.println("Division of 2 number is "+result4);
                break;
            case '%':
                int result5 = getNumber1()%getNumber2();
                System.out.println("Multiplication of 2 number is "+result5);
                break;
            default:
                System.out.println("invalid operator");
        }
    }

}
