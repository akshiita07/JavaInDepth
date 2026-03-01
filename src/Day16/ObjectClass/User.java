package Day16.ObjectClass;

public class User {

    public int id;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // override the toString() method:
    @Override
    public String toString(){
        return "We are in toString() method of User class overwritten";
    }

    // override the equals() method:
    @Override
    public boolean equals(Object u){
        return this.id==((User)u).getId();
    }
}
