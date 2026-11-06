/**
 * Week 6 Practice M4 - Library ID Card Management (object references and ==)
 */
public class P4_LibraryIdCardReferences {

    static class IdCard {
        String name;
        int booksIssued;

        IdCard(String name, int booksIssued) {
            this.name = name;
            this.booksIssued = booksIssued;
        }
    }

    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi;            // same object, second reference
        duplicate.booksIssued = 3;          // change through the second variable
        IdCard separate = new IdCard("Ravi", 3); // a different object with the same values

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
