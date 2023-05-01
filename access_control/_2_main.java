package access_control;

import java.util.ArrayList;

public class _2_main {
    public static void main(String[] args) {
        _1_aa obj=new _1_aa(15,"rohit");

        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

        ArrayList<Integer> list = new ArrayList<>(23);
        //list.DEFAULT_CAPACITY; //not accessable

        obj.getNum();
        //int n = obj.num;
    }
}
