package Day2;

class Student {
    int id;
    String name;
    String gender;

    void updateName(String newName){
        name=newName;
    }
}

public class variables {
    public static void main(String[] args){
        Student s=new Student();
        s.id=814168;
        s.name="Akshi";
        System.out.println("Name: "+s.name+ " ID: "+s.id);
        s.gender="F";
        s.updateName("Akshita");
        System.out.println("Name: "+s.name);
    }
}
