package homework.Tsk2;

import java.util.ArrayList;

public class MutableList<T> extends AbctractList<T>{

    public MutableList() {
        this.lst = new ArrayList<>();
    }

    @Override
    public void getInt(int i) {
        System.out.println(lst.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(lst.size());
    }

    @Override
    public void lst() {
        System.out.println(lst);
    }

    public void addInLst(T i) {
        lst.add(i);
    }

    public void removeInLst(T i) {
        lst.remove(i);
    }


}

