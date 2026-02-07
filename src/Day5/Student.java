package Day5;

public class Student {
    int id;
    String name;
    char gender;

    //Constructor with name param names as instance variables:
    Student(int id, String name, char gender){
        //Use this keyword to reference instance variables:
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    void printVals(){
        System.out.println("Name: "+name+" Id: "+id+" Gender: "+gender);
    }

    boolean updateName(String name){
        this.name=name;
        return true;
    }

    static void swap(Student[] s){
        //swap s3 and s1:
        Student sSwap=s[2];
        s[2]=s[0];
        s[0]=sSwap;
        System.out.println("\nAfter swap:");
        s[0].printVals();
        s[1].printVals();
        s[2].printVals();
    }

    public static void main(String[] args){
        Student s1=new Student(7,"Akshita",'F');
        s1.updateName("Akiii");
        s1.printVals();
        Student s2=new Student(27,"Saanvi",'F');
        s2.printVals();
        Student s3=new Student(52,"Ritesh",'M');
        s3.printVals();

        //array:
        Student[] s= {s1,s2,s3};
        swap(s);
    }
}
