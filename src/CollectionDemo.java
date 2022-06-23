import java.util.ArrayList;
import java.util.*;
public class CollectionDemo {
    public void demoOfCollections()
    { // creating arraylist
        ArrayList<String>list=new ArrayList<String>();
        //adding arraylist
        list.add("pooja");
        list.add("archana");
        list.add("kritika");
        list.add("abhishek");
        list.add("vijay");

        Iterator itrString = list.iterator();
        while(itrString.hasNext()){
            System.out.println(itrString.next());
        }
    }
    public static void main(String[] args)
    {
       CollectionDemo cld=new CollectionDemo();
       cld.demoOfCollections();

    }
}
