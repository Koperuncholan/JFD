public class Emp {
    private int id;
    private String name;
    private String role;
    private long phone;
    private String mail;


    public Emp() {
    }

    public Emp(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;

    }

    public void showEmployeeDetails(){
        System.out.println("Id :" +id);
        System.out.println("Name :" +name);
        System.out.println("Role :" +role);
        System.out.println("Phone :" +phone);
        System.out.println("Mail :" +mail);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
