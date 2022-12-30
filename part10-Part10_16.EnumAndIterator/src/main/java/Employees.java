import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Employees {
    private ArrayList<Person> employees= new ArrayList<>();
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> employees.add(person));
    }
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
