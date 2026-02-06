package Day4;

class Student{
    int id;
    Student(int newId){
        //This is a constructor
        id=newId;
    }
}

public class Constructors {
    static public void main(String[] args){
        Student s=new Student(7);
        System.out.println("Id of student is: "+s.id);
    }
}
