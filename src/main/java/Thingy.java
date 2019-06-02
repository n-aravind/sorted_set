import java.util.Objects;

public class Thingy implements Comparable<Thingy>{
    private long max;

    public Thingy(long max) {
        this.max = max;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public int compareTo(Thingy o) {
        return Long.compare(max,o.max);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thingy thingy = (Thingy) o;
        return max == thingy.max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(max);
    }

    @Override
    public String toString() {
        return "Thingy{" +
                "max=" + max +
                '}';
    }
}
