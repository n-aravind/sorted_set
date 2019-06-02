import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();

        sortedSet.add("India");
        sortedSet.add("America");
        sortedSet.add("England");

        System.out.println(sortedSet);

        SortedSet<Thingy> thingySortedSet = new TreeSet<Thingy>();

        Thingy thingy = new Thingy(10);
        thingySortedSet.add(thingy);
        System.out.println(thingySortedSet);
        Thingy thingy1 = new Thingy(10);
        Thingy thingy2 = new Thingy(13);
        Thingy thingy3 = new Thingy(8);
        Thingy thingy4 = new Thingy(12);
        Thingy thingy5 = new Thingy(11);
        Thingy thingy6 = new Thingy(16);
        thingySortedSet.add(thingy1);
        thingySortedSet.add(thingy2);
        thingySortedSet.add(thingy3);
        thingySortedSet.add(thingy4);
        thingySortedSet.add(thingy5);
        thingySortedSet.add(thingy6);
        System.out.println(thingySortedSet);
    }
}
