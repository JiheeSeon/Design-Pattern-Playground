package adapter.myexample;

public class MyAdapterMain {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>();
        intList.setElement(1);
        intList.setElement(2);
        System.out.println("length = " + intList.getLength());
        System.out.println("intList.getLast() = " + intList.getLast());
        intList.printAll();
        System.out.println(intList.pop());
        System.out.println("length = " + intList.getLength());
        intList.printAll();
    }
}
