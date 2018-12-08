import java.util.ArrayList;

public class ArLi {
    public static void main(String args []) {

        ArrayList list = new ArrayList();

        String name1 = "Ollie";
        String name2 = "Aldan";
        
        list.add(name1);
        list.add(name2);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}