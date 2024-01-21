public class Addressbook {
    String firstname;
    String lastname;
    String city;
    long zip;
    String fulladdress;
    long phonenumber;

    public Addressbook(String f,String l,String c,long z,String a,long p) {
        this.firstname = f;
        this.lastname = l;
        this.city = c;
        this.zip = z;
        this.fulladdress = a;
        this.phonenumber = p;
    }

    @Override
    public String toString() {
        return "Addressbook{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", fulladdress='" + fulladdress + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
