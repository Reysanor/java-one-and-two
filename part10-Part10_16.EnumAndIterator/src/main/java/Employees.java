import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> persons = new ArrayList<>();

    public Employees() {
    }

    public void add(Person personToAdd) {
        persons.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd) {
        persons.addAll(peopleToAdd);
    }

    public void print() {
        persons.forEach(System.out::println);
    }

    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
