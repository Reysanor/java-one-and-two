import java.util.StringJoiner;

public class Person {

    private String ada;
    private String s;
    public Person(String ada_lovelace, String s) {
        this.ada=ada_lovelace;
        this.s=s;

    }

    @Override
    public String toString() {
        return ada + "\n" +"  "+ s;

    }
}
