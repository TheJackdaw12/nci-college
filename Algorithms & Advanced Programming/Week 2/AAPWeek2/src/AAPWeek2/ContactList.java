package AAPWeek2;


import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactList {
    private final ArrayList<Contact> contacts = new ArrayList<>();

    public void readFile() throws FileNotFoundException {
        File file = new File("people.txt");
        Scanner s = new Scanner(file);
        s.useDelimiter(";");
        
        while (s.hasNext()) {
            Contact p = new Contact();
            p.setName(s.next());
            if (s.hasNext()) {
                p.setPhone(s.next());
            }
            contacts.add(p);
        }
        s.close();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
