package sp.company;

public class _11_string_sort {
    public static void main(String[] args) {

        String[] name ={"deepak","amit","rohit","mukesh","yash","bob"};
        String temp;
        for (int i=0;i<name.length;i++){
            for (int j=0;j< name.length-1-i;j++){
                if (name[j].compareTo(name[j+1])>0){
                    temp = name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                }
            }
        }
        for (int i=0;i<name.length;i++){
            System.out.print(name[i]+",");
        }

    }
}
