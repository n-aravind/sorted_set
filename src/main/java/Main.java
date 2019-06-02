import java.util.Arrays;
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
        Thingy[] thingies = {new Thingy(50),
                new Thingy(40),
                new Thingy(20),
                new Thingy(80),
                new Thingy(90),
                new Thingy(30),
                new Thingy(60),
                new Thingy(100),
                new Thingy(70)};
        thingySortedSet.addAll(Arrays.asList(thingies));
        System.out.println(thingySortedSet);
    }
}
