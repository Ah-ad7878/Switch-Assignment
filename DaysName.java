package pk.org.cas.switchAssignment;

public class DaysName {
    private int day;
    public DaysName(){

    }
    public DaysName(int day){
        this.day = day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }

    //first we try by switch as a statement
    public void daysToWords(){
        switch (getDay()){
            case 1:
                System.out.println(getDay()+" in word is Monday");
                break;
            case 2:
                System.out.println(getDay()+" in word is Tuesday");
                break;
            case 3:
                System.out.println(getDay()+ " in word is wednesday");
                break;
            case 4:
                System.out.println(getDay()+ " in word is Thursday");
                break;
            case 5:
                System.out.println(getDay()+ " in word is Friday");
                break;
            case 6:
                System.out.println(getDay()+ " in word is Saturday");
                break;
            case 7:
                System.out.println(getDay()+ " in word is Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }
    }

    //by switch expression
    public String output(){
        return switch (getDay()){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "saturday";
            case 7 -> "Sunday";
            default -> "invalid day";
        };
    }
}
