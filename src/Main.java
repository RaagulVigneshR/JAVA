import java.util.ArrayList;
import java.util.Random;

//create an address book which have 7 elements first name , last name , city,zip,full address and contact no.
// Try to create at least 20 address and try to do it in one do
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int r1 = r.nextInt(1000);
        Addressbook A = new Addressbook("STEVE", "ROGERS", "USA", 6657, "AVENGER", r1);
        Addressbook A1 = new Addressbook("TONY", "STARK", "USA", 6357, "AVENGER", r1);
        Addressbook A2 = new Addressbook("BRUCE", "BANNER", "MEXICO", 8657, "AVENGER", r1);
        Addressbook A3 = new Addressbook("THOR", "ODINSON", "ASGARD", 6386, "AVENGER", r1);
        Addressbook A4 = new Addressbook("LOKI", "ODINSON", "ASGARD", 6357, "AVENGER", r1);
        Addressbook A5 = new Addressbook("NATASHA", "ROMANOFF", "RUSSIA", 8657, "AVENGER", r1);
        Addressbook A6 = new Addressbook("WANDA", "MAXIMOF", "PARIS", 6367, "AVENGER", r1);
        Addressbook A7 = new Addressbook("HAWK", "EYE", "SA", 6387, "AVENGER", r1);
        ArrayList<Addressbook> addressbookArrayList = new ArrayList<Addressbook>();
        addressbookArrayList.add(A);
        addressbookArrayList.add(A1);
        addressbookArrayList.add(A2);
        addressbookArrayList.add(A3);
        addressbookArrayList.add(A4);
        addressbookArrayList.add(A5);
        addressbookArrayList.add(A6);
        addressbookArrayList.add(A7);

        System.out.println(addressbookArrayList);



    }
}