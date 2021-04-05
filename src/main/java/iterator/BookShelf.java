package iterator;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface CustomConsumer {
    public void accept(int a);
}


class BookShelf  {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[1] = 0;
        Consumer<Integer> lambda = x -> System.out.println(x);
        CustomConsumer consumer = x -> System.out.println(x);

        consumer.accept(123456789);

        a[0] = 1;
        int[] b = a.clone();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("b[0] = " + b[0]);
        b[1] = 2;
        System.out.println("a[1] = " + a[1]);
        System.out.println("b[1] = " + b[1]);

        Example[] c = new Example[5];
        c[0] = new Example(-1);
        c[0].N = 1;
        Example[] d = c.clone();
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("c[0] = " + c[0]);
        System.out.println("d[0] = " + d[0]);
        System.out.println("c[0].N = " + c[0].N);
        System.out.println("d[0].N = " + d[0].N);

    }
    private static class Example {
        public int N = 1;
        public int M = 2;

        Example(int i) {
            this.N = i;
        }
    }
}
