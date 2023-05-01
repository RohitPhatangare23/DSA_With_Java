package access_control;

public class _1_aa {

    //this are data members
    //default one u can't access it diffrent package
    protected int num;  //private accessable via geters and seters  & only in that file
    public String name; //u can access it everywhere
    private int[] arr;

    public _1_aa(int num, String name) {

    }

    //this method is public that's y it's accessable from evry where
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public _1_aa(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}
