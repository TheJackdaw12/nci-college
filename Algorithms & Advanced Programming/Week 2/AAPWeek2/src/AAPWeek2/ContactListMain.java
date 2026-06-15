package AAPWeek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactListMain {

    public static void main(String[] args) {
        ContactList cl = new ContactList();
        try {
            cl.readFile();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e);
            return;
        }

        ArrayList<Contact> list = cl.getContacts();

        // Sort using Contact.compareTo()
        Collections.sort(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String key = sc.nextLine();

        int index = binarySearch(list, key);

        if (index >= 0) {
            System.out.println("Found: " + list.get(index).getName() + " - " + list.get(index).getPhone());
        } else {
            System.out.println("No contact details found for " + key);
        }
    }

    public static int binarySearch(ArrayList<Contact> list, String key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Contact midContact = list.get(mid);

            int cmp = midContact.getName().compareTo(key);

            if (cmp == 0) {
                return mid;  // found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }
}
