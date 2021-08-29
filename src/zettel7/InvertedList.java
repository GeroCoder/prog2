package zettel7;

import java.util.List;

public class InvertedList<T extends Number> {
    List<T> regularList;
    List<T> invertedList;

    public InvertedList(List<T> regularList){
        this.regularList = regularList;
    }

    List<T> getInvertedList(){
        return invertedList;
    }

    public List<T> invertList(List<T> myList){
        for(int i = myList.size(); i > 0; i--){
            getInvertedList().add(myList.get(i));
        }
        return getInvertedList();
    }
}
