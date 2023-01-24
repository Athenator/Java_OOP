package homework.Tsk2;

import java.util.ArrayList;

public class ImmutableList extends AbctractList<Integer>{

    public ImmutableList() {
        this.lst = new ArrayList<>();
        lst.add(1);lst.add(3);lst.add(9);
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
    
}
