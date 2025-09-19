package pk.org.cas.switchAssignment;

public class GreaterNumber {
    private int number1;
    private int number2;

    public void setNumber1(int number1){
        this.number1 = number1;
    }
    public int getNumber1(){
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public GreaterNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public GreaterNumber() {
    }




    public void output(){

        switch (getNumber1()>getNumber2()?1:getNumber2()>getNumber1()?2:0){
            case 1:
                System.out.println("Number 1 is greater then number 2");
                break;

            case 2:
                System.out.println("Number 2 greater than number 1");
                break;
            default:
                System.out.println("invalid result");

        }
    }

    public String display(){
        return switch (getNumber1()>getNumber2()?1:getNumber2()>getNumber1()?2:0){
            case 1 -> " No1 Greater";
            case 2 -> "No2 Greater";
            default -> "Not greater";
        };
    }
}
