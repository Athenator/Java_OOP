package homework.Tsk2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Immutable List:");
        ImmutableList imLst = new ImmutableList();
        imLst.lst();
        imLst.getInt(2);
        imLst.getSize();
        System.out.println();
        System.out.println("Mutable List:");
        MutableList<Double> mList = new MutableList<>();
        mList.addInLst(2.4);mList.addInLst(3.5);
        mList.addInLst(7.52);mList.addInLst(10.68);
        mList.addInLst(1.2);mList.addInLst(37.2);
        mList.lst();
        mList.getInt(3);
        mList.removeInLst(37.2);
        mList.lst();
        mList.getSize();
    }
}
