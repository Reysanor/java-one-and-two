import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
   private  ArrayList<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        if (cards.stream().mapToInt(s -> s.getValue()).sum() > o.cards.stream().mapToInt(s -> s.getValue()).sum())
            return 1;
        if (cards.stream().mapToInt(s -> s.getValue()).sum() < o.cards.stream().mapToInt(s -> s.getValue()).sum())
            return -1;
        return 0;

    }
    public void sortBySuit(){
        Collections.sort(cards, (c1, c2) ->

                {
                    if (c1.getSuit().ordinal() - c2.getSuit().ordinal() == 0) {
                        return c1.getValue() - c2.getValue();
                    }
                    return c1.getSuit().ordinal() - c2.getSuit().ordinal();
                }
        );
    }
}
