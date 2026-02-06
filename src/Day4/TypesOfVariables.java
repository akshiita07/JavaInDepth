package Day4;

public class TypesOfVariables {
    int age;
    String name;
    char gender;
    // 2. Static Variables:
    static int cnt = 0;

    void printData() {
        System.out.println("Age is " + age + " Name: " + name + " and gender is: " + gender);
        cnt++;
        System.out.println("This function is called for " + cnt + " no. of times.");
        //3. Local Variable:
        int localVar=7;
        System.out.println("The local var in printData() is " + localVar);
        int localVar2; //does not get default value
//        System.out.println("The local var2 in printData() is " + localVar2);
    }

    public static void main(String[] args) {
        //1. Instance Variables:
        // first object:
        TypesOfVariables s1 = new TypesOfVariables();
        s1.age = 20;
        s1.name = "Akshita";
        s1.gender = 'F';
        s1.printData();

        // second object:
        TypesOfVariables s2 = new TypesOfVariables();
        s2.age = 13;
        s2.name = "Saanvi";
        s2.gender = 'F';
        s2.printData();

        // third object:
        TypesOfVariables s3 = new TypesOfVariables();
        s3.age = 52;
        s3.name = "Ritesh";
        s3.gender = 'M';
        s3.printData();

        // static variables called directly with class name (not object name)
        System.out.println("printData() is called for " + TypesOfVariables.cnt + " no. of times.");

//        System.out.println("You can't access local var in printData() from here " + localVar);
    }
}
