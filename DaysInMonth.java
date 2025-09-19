package pk.org.cas.switchAssignment;

import java.util.Scanner;

public class DaysInMonth {
    private int month;

    public DaysInMonth() {
    }

    public DaysInMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Enter a month: ");
        setMonth(sc.nextInt());
    }

    public void output(){
        switch (getMonth()){
            case 1:
                System.out.println("31 days in January");
                break;
            case 2:
                System.out.println("28 or 29 days in February");
                break;
            case 3:
                System.out.println("28 or 29 days in March");
                break;
            case 4:
                System.out.println("30 days in April");
                break;
            case 5:
                System.out.println("31 days in May");
                break;
            case 6:
                System.out.println("30 days in June");
                break;
            case 7:
                System.out.println("31 days in July");
                break;
            case 8:
                System.out.println("31 days in August");
                break;
            case 9:
                System.out.println("30 days in september");
                break;
            case 10:
                System.out.println("31 days in october");
                break;
            case 11:
                System.out.println("30 days in November");
            case 12:
                System.out.println("31 days in December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
    public String Display(){
        return switch (getMonth()){
            case 1 -> "31 days in january";
            case 2 -> "28 or 29 days in February";
            case 3 -> "31 days in march";
            case 4 -> "30 days in April";
            case 5 -> "31 days in may";
            case 6 -> "30 days in june";
            case 7 -> "31 days in july";
            case 8 -> "31 days in August";
            case 9 -> "30 days in september";
            case 10 -> "31 days in october";
            case 11 -> "30 days in November";
            case 12 -> "31 days in December";
            default -> "invalid month";

        };
    }
}
