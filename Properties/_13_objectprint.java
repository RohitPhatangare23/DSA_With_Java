package Properties;

public class _13_objectprint {

    public _13_objectprint(int num) {
        this.num = num;
    }

    int num;
    public static void main(String[] args) {
        _13_objectprint ob=new _13_objectprint(45);
        System.out.println(ob);  //Properties._13_objectprint@4dd8dc3
        System.out.println(ob.num);  //45
    }


}
