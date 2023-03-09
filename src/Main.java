import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> client = generateClient();
        Deque<Person> atr = new ArrayDeque<>(client);

        while (!atr.isEmpty()) {
            Person person = atr.poll();
            //System.out.println(person.getName() + " " + person.getFamily() + " прокатился на атракционе");
            System.out.println(person.getName() + " " + person.getFamily() + " прокатился на атракционе" + ", потрачен 1 билет, осталось: " + person.getTicket());
            int ticket = person.getTicket();
            ticket = ticket - 1;
            person.setTicket(ticket);
            if (ticket > 0) {
                atr.offer(person);
            }
        }
    }

    public static List<Person> generateClient() {
        List<Person> listPerson = new ArrayList<>();

        Person client1 = new Person("Ivan", "Ivanov", 7);
        Person client2 = new Person("Petr", "Petrov", 12);
        Person client3 = new Person("Sidr", "Sidorov", 3);
        Person client4 = new Person("Nikolai", "Nikolaev", 19);
        Person client5 = new Person("Viktor", "Viktorov", 9);

        listPerson.add(client1);
        listPerson.add(client2);
        listPerson.add(client3);
        listPerson.add(client4);
        listPerson.add(client5);

        return listPerson;
    }

}