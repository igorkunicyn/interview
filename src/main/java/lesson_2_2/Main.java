package lesson_2_2;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertLast("two");
        mll.insertFirst("three");
        mll.insertLast("four");
        System.out.println(mll);
        System.out.println(mll.remove("one"));
        mll.removeFirst();
        mll.removeLast();
        System.out.println(mll);
        mll.insert(1, "one");
        mll.insert(2, "three");
        mll.insert(3, "four");
        mll.insert(4, "five");
        System.out.println(mll);

        ListIterator<String> li = mll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println();
        System.out.println(li.nextIndex());
        System.out.println(li.next());
        li.remove();
        li.add("ten");
        System.out.println(li.next());
        li.set("null");
        System.out.println(mll);


    }
}
