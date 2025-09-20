package pk.org.cas.switchAssignment;

public class EvenOdd {
    private int number;

    public void setNumber(int number){
        this.number = number;
    }
    public  int getNumber(){
        return number;
    }

    public EvenOdd(){

    }
    public EvenOdd(int number){
        this.number = number;
    }

    public void output(){
        switch ((getNumber()%2==0)?1:2){
            case 1:
                System.out.println(getNumber()+" is even Number");
                break;
            case 2:
                System.out.println(getNumber()+" is odd Number");

        }
    }

    public String display(){
        return switch ((getNumber()%2==0)?1:2){
            case 1 -> "Even number";
            case 2-> "odd number";
            default -> "invalid value";
        };
    }
}
