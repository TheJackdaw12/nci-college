package AAPWeek2;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ContactList {

    private final ArrayList<Contact> contacts = new ArrayList<>();

    // Reads people.txt and populates `contacts`
    public void readFile() {
        // ✅ POINT THIS TO YOUR ACTUAL people.txt FILE
        File file = new File(
            "C:\\Users\\jcanning\\OneDrive - Obelisk Group\\Documents\\Desktop\\College\\Algorithms & Advanced Programming\\Week 2\\Class Materials-week 2\\people.txt"
        );

        try (Scanner s = new Scanner(file)) {
            // Accepts ; and line breaks as delimiters: name ; phone \n
            s.useDelimiter("[;\\r\\n]+");

            while (s.hasNext()) {
                Contact p = new Contact();

                if (!s.hasNext()) break; // name
                String name = s.next().trim();

                if (!s.hasNext()) break; // phone
                String phone = s.next().trim();

                p.setName(name);
                p.setPhone(phone);
                contacts.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("error - people.txt not found: " + e.getMessage());
        }
    }

    // Strongly-typed getter
    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
