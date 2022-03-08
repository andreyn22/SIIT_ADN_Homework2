package domain;

public class Main {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////// adding apartments 1,2,3
        Apartment apartment1 = new Apartment();
        apartment1.setAddress("Bd.Carol 1, nr. 50, B9, Ap.59");
        apartment1.setRentValue(300);
        apartment1.setRoomsNumber(2);

        Apartment apartment2 = new Apartment();
        apartment2.setAddress("Bd.Decebal 65, Tr.2, Ap.61");
        apartment2.setRentValue(475);
        apartment2.setRoomsNumber(3);

        Apartment apartment3 = new Apartment();
        apartment3.setAddress("Bd.Aviatiei 1, sc.B, Ap.12");
        apartment3.setRentValue(525);
        apartment3.setRoomsNumber(4);

        System.out.println("No tenant moved in: ");
        System.out.println(apartment1);
        System.out.println(apartment2);
        System.out.println(apartment3);

        ////////////////////////////////////////////////////////// adding users 1, 2, 3
        User user1 = new User();
        user1.setFirstName("Andrei");
        user1.setLastName("Negura");
        user1.setIDnumber("MZ123355");

        User user2 = new User();
        user2.setFirstName("Ioana");
        user2.setLastName("Chitac");
        user2.setIDnumber("XV132323");

        User user3 = new User();
        user3.setFirstName("Madalina");
        user3.setLastName("Popa");
        user3.setIDnumber("XT145323");


        User user4 = new User();
        user4.setFirstName("Madalin");
        user4.setLastName("Pop");
        user4.setIDnumber("XT145612");
        ///////////////////////////////////////////////////////// allocating an owner or a tenant to each apartment

        System.out.println("Some tenants moved in: ");
        apartment1.addTenant(user1);
        apartment2.addTenant(user2);
        apartment2.addTenant(user4);
        apartment3.setOwner(user3);

        System.out.println(apartment1);
        System.out.println(apartment2);
        System.out.println(apartment3);

        ///////////////////////////////////////////////////////// removing a tenant from the apartment

        System.out.println("One tenant left from the apartment2: ");
        apartment2.removeTenant(user2);
        System.out.println(apartment2);
    }
}
