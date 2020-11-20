package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        if(age<0 || age > 120 || name == null || name.equals("")|| name.length()>40){
            throw new IllegalArgumentException("age must be between 0 and 120, name lenght must be between 1 and 40.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
