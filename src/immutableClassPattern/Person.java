package immutableClassPattern;

public class Person {

    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Person other){
        this.name = other.name;
        this.age = other.age;

    }
}
