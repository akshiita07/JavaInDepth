package Day13;

public class Student {
    // private fields in public classes:
    private int id;
    private String name;
    private String gender;
    private int age;
    private long phone;
    private double cgpa;

    public Student(int id, String name, String gender, int age, long phone, double cgpa) {
        setId(id);
        setName(name);
        setGender(gender);
        setAge(age);
        setPhone(phone);
        setCgpa(cgpa);
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("gender: "+this.gender);
        System.out.println("age: "+this.age);
        System.out.println("phone: "+this.phone);
        System.out.println("cgpa: "+this.cgpa);
    }

    // generate getters and setters:
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female") || gender.equals("Transgender")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Wrong gender provided");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student s = new Student(7, "Akshita", "Female", 21, 828384, 9.27);
        Student s2 = new Student(7, "Akshita", "F", 21, 828384, 9.27);
    }
}