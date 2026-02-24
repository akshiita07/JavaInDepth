package Day14;

public class finalKeyword {
    private static int idIntitialiser=100;
    private final int id;
    private String name;
    private String gender;

    public finalKeyword(String gender, String name) {
        this.gender = gender;
        this.name = name;
        id=idIntitialiser++;
        System.out.println("Name: "+name+" Gender: "+gender+" Id: "+id);
    }

    public static void main(String[] args) {
        finalKeyword s1=new finalKeyword("AKshita","F");
        finalKeyword s2=new finalKeyword("Ritesh","M");
        finalKeyword s3=new finalKeyword("Shaktee","F");
        finalKeyword s4=new finalKeyword("Saanvi","F");
    }
}
