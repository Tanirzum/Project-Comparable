import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Tanirbergen", "Zamanbek", 18, 5),
                new Person("Allabergen", "Amanbek", 35, 3),
                new Person("Zhanibek", "Amanbek", 16, 2)
        );
        Collections.sort(personList);
        System.out.println("Сортировка по возрасту");
        for (Person person : personList) {
            System.out.println(person);
        }

        Comparator<Person> personComparator = new FilterName();
        personList.sort(personComparator);
        System.out.println("Сортировка по имени");
        for (Person person : personList) {
            System.out.println(person);
        }


    }
}
