package sp.company;


public class _12_linear_search {
    public static void main(String[] args) {

        int[] array = {10, 20, 50, 4, 80, 90};
        int item = 80;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                System.out.println(item + " element is present at " + i + " index position");
            }

        }




        String[] name={"rohit","Raj","mukesh","ankit","yash"};
        String word="ankit";
        int temp=0;
        for (int j=0;j<name.length;j++){
            if (name[j].equals(word)){
                System.out.println(word+ " word is present in " + j+" index position");
                temp=temp+1;

            }
        }
        if (temp==0){
            System.out.println("word is not present inlist");
        }

    }


}
