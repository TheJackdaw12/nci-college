package AAPWeek2;

public class Contact{

   private String name;
   private String phoneN; 
   public Contact(){
        name = new String();
        phoneN = new String();
    }

    public void setName(String n){
        name=n;
    }
    public void setPhone(String p){
        phoneN=p;
    }
    public String getPhone(){
        return phoneN;
    }
    public String getName(){
        return name;
    }
}
