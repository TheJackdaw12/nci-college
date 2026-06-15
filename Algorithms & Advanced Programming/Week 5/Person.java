public class Person {
    private String name;
    private int age;

    // no-arg constructor (kept in case you still need it)
    public Person() { }

    // parameterized constructor that your main() is trying to use
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessors
    public String getName() { return name; }
    public int getAge() { return age; }

    // mutators
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return name + " - Age: " + age;
    }
}
