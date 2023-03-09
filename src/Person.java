public class Person {

    private String name;
    private String family;
    private int ticket;

    public Person(String name, String family, int ticket) {
        this.name = name;
        this.family = family;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
}