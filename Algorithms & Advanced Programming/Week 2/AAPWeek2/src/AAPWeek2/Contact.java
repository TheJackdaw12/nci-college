package AAPWeek2;


public class Contact implements Comparable<Contact> {
    private String name;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    
    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }
}
