public class Teacher extends Person{
    private int salary;

    public Teacher(String ada_lovelace, String s, int i) {
        super(ada_lovelace,s);
        this.salary=i;

    }

    @Override
    public String toString() {
        return super.toString() +  "\n" + "  salary "+ salary + " euro/month";

    }

}
