import java.util.ArrayList;
import java.util.List;


public class CareTaker {
    private List<Object> mementoList = new ArrayList<Object>();
    static int saveid = 0;
    public void add(Object obj){
        mementoList.add(obj);
        System.out.println("Save state "+saveid+"\n");
        saveid++;
    }
    public Object get(int index){
        System.out.println("Load stats from save "+index);
        return mementoList.get(index);
    }
}
