package Lab5;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("FERN");
        myList.add("MEEN");
        myList.add("DEL");
        System.out.println(myList);
        //remove
        myList.remove(1);
        System.out.println(myList);
        //insert at index 0
        myList.add(0,"LEE");
        System.out.println(myList);



    }
}
