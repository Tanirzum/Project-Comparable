public class Person implements Comparable<Person> {
    private String name;
    private String surName;
    private int age;
    private int id;

    public Person(String name, String surName, int age, int id) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
