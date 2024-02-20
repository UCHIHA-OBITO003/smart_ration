package model;

public class FamilyMembers {
    private int rationUid;
    private String names;

    public FamilyMembers(int rationUid, String names) {
        this.rationUid = rationUid;
        this.names = names;
    }

    public void setRationUid(int rationUid) {
        this.rationUid = rationUid;
    }

    public void setNames(String names) {
        this.names = names;
    }


    public int getRationUid() {
        return rationUid;
    }

    public String getNames() {
        return names;
    }
}
