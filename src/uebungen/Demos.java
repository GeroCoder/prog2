package uebungen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demos {
    public static void main(String[] args) {
        List<Number> myList = new LinkedList<>();
        myList.add(2);
        myList.add(5);
        myList.add(7);
        myList.add(0,1);

        Iterator<Number> it = myList.iterator();

        while (it.hasNext()){
            Number currentValue = it.next();
            if(currentValue.equals(5)){
                it.remove();
            }
            System.out.println(it.next());
        }

    }
}
