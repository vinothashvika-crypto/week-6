/**
 * Week 6 Assignment M4 - Exam Hall Ticket Reference Management (object references and ==)
 */
public class A4_HallTicketReferences {

    static class HallTicket {
        String studentName;
        int seatNumber;

        HallTicket(String studentName, int seatNumber) {
            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }

    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya;                       // same object, second reference
        copy.seatNumber = 45;                          // change through the second variable
        HallTicket separate = new HallTicket("Priya", 45); // different object, same values

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}
