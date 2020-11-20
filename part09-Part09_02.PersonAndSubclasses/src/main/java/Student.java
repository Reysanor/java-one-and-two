public class Student extends Person{
    private int credit = 0;

    public Student(String ada_lovelace, String s) {
        super(ada_lovelace, s);
    }

    public int credits() {
        return credit;
    }

    public void study() {
        credit++;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + "  Study credits "+ credits();

    }
}
