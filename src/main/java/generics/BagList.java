package generics;

import java.util.ArrayList;
import java.util.List;

public class BagList <T>{

    private List<T> content;

    public BagList(){
        content = new ArrayList<>();

    }

    public void addItem(T item){
        content.add(item);
    }

    public void removeItem(T item){
        content.remove(item);

    }

    public List<T> getItems(){
        return content;
    }


}
