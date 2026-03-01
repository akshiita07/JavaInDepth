package Day16.ObjectClass;

public class Staff extends User{
    public int staffId;

    public Staff(int id, int staffId) {
        super(id);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }


}
