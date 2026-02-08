package Day6;

public class SwitchMethod {
    static void findBirthday(String name){
        switch(name){
            case "Akshita": System.out.println("7 March 2005");
                break;
            case "Saanvi": System.out.println("27 September 2012");
                break;
            case "Shaktee": System.out.println("12 July 1979");
                break;
            case "Ritesh": System.out.println("8 September 1974");
                break;
            default: System.out.println("I don't know this birthdate");
                break;
        }
    }

    public static void main(String[] args) {
        findBirthday("Akshita");
        findBirthday("Saanvi");
        findBirthday("Aryan");
    }
}
