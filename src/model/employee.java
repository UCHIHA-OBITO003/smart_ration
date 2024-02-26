package model;

public class employee {
    private String e_id;

    private String e_name;
    private String e_phno;
    private String e_mail ;
    private String e_address;

    private String pass;

    public employee(String e_id, String e_name , String e_phno, String e_mail, String e_address, String pass) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_phno = e_phno;
        this.e_mail = e_mail;
        this.e_address = e_address;
        this.pass = pass;

    }


    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setE_phno(String e_phno) {
        this.e_phno = e_phno;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setE_address(String e_address) {
        this.e_address= e_address;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



    public String getE_id() {
        return e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public String getE_phno() {
        return e_phno;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getE_address() {
        return e_address;
    }

    public String getPass() {
        return pass;
    }
}
