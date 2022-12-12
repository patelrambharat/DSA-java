package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
class Al{

}
public class AList {
    public static void main(String[] args) {
        //declared arrayList
        // ArrayList<Integer>list = new ArrayList<>(5);
        // //to add element to arraylist
        // //method : add(element) -> add ele in arrayList at last
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // System.out.println(list);
        // //add at a particular index  
        // //add(index, element ) -> 1st is index, second element
        // list.add(2, 3);
        // System.out.println(list);

        // //get any index using -> arr[i] in array 
        // //we have method to get thing in ArrayList termed as get
        // //method : get(index) -> gives ele at that index in ArrayList
        // Integer a = list.get(4);
        // System.out.println("index element "+a);

        // //set an index to val -> arr[i] = val in array
        // //but in arrayList we have a method for this 
        // //method: set(index, value) -> sets/ update ArrayList index to the given value

        // list.set(3, 10);
        // System.out.println(list);

        // //to get the length we have a method in ArrayList and that one is size()
        // //method: size() -> size of ArrayList
        // int mylistSize = list.size();
        // System.out.println("size " + mylistSize);

        // //want to remove some element 
        // //method : remove() -> remove from given index in ArrayList
        // list.remove(4);
        // System.out.println(list);

        // //remove from last 
        // list.remove(list.size() -1);
        // System.out.println(list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(5);
        list2.add(4);
        list2.add(3);
        System.out.println(list2);
        int list2size= list2.size();
        System.out.println(list2size);


        //Sort a list 
        //use collection library in java 
        Collections.sort(list2);
        System.out.println(list2);

        //loop around arraylist 
        //for looop
        for(int i=0;i<list2size;i++){
            System.out.println(list2.get(i));
        }
         
        //for Each loop
        //it takes each element
        for(var element : list2){
            System.out.print(element+" ");
        }

        //hetrogeneous object in arrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add{3f};
        list3.add("bharat");
        System.out.println(list3);;
    }
}
