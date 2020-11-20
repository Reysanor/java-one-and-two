import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        list= new ArrayList<>();
    }

    public void add(String task){
        list.add(task);

    }
    public void print(){
        for(int i=1;i<list.size()+1;i++){
            System.out.println(i+": "+ list.get(i-1));
        }
    }

    public void remove(int number){
        list.remove(number-1);
    }


}
