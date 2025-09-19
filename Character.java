package pk.org.cas.switchAssignment;

public class Character {
    private int character;

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public Character() {
    }

    public Character(int character) {
        this.character = character;
    }

    public void output(){
        switch (getCharacter()){
            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v'
                    ,'w','x','y','z':
                System.out.println("this small letter");
                break;
            case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U'
            ,'V','W','X','Y','Z':
                System.out.println("this is capital letter");
                break;
            case '1','2','3','4','5','6','7','8','9':
                System.out.println("This is digit");
                break;
            default:
                System.out.println("special character");

        }
    }

}
