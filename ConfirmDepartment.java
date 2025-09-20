package pk.org.cas.switchAssignment;

public class ConfirmDepartment {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfirmDepartment() {
    }

    public ConfirmDepartment(String id) {
        this.id = id;
    }

    public void output(){
        switch (getId()){
            case "cs-1":
                System.out.println(getId()+" is the id of computer Science department");
                break;
            case "se-2":
                System.out.println(getId()+" is the id of software engineering Department");
                break;
            case "it-3":
                System.out.println(getId()+" is the id of information technology Department");
                break;
            case "ai-4":
                System.out.println(getId()+" is the id of  Artificial Intelligence Department");
                break;
            case "ad-0":
                System.out.println(getId()+" is the id of   Anonymous Department Department");
                break;
            default:
                System.out.println("invalid id");
        }
    }

    public String display(){
        return switch (getId()){
          case "cs-1" -> "computer science";
            case "se-2" -> "Software Engineering";
            case "it-3" -> "information technology";
            case "ai-4" -> "Artificial intelligence";
            case "ad-0" -> " Anonymous Department";
            default -> "invalid id";

        };
    }
}
