package pk.org.cas.switchAssignment;

public class NumberCheck {
    private int number;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public NumberCheck(){

    }
    public NumberCheck(int number){
        this.number = number;
    }
    public void checkNumber(){
        switch ((getNumber()>0)?1:getNumber()<0?2:getNumber()==0?3:0){
            case 1:
                System.out.println(getNumber()+" is positive No");
                break;
            case 2:
                System.out.println(getNumber()+" is negative No");
                break;
            case 3:
                System.out.println(getNumber()+" is equal to zero");
                break;
            default:
                System.out.println("invalid number");
        }
    }

    public String display(){
        return switch ((getNumber()>0?1:getNumber()<0?2:getNumber()==0?3:0)){
            case 1 -> "positive Number";
            case 2 -> "negative Number";
            case 3 -> "Equal to zero";
            default -> "invalid value";
        };
    }


}
