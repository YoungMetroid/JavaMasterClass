package Java8;
@FunctionalInterface
public interface SlowStringComparator<T> {
    String compare(T t1, T t2);
}
