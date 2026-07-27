import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class People implements Comparable<People> {
    int age;
    String name;
    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "People [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(People o) {
        return Integer.compare(this.age, o.age);
    }
}

public class LearnCollection{
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        // nums.addAll(nums2);
        
        System.out.println(nums); // Will work fine.

        for(int i : nums){
            System.out.println(i);
        }

        // if want to operate with indexes Use List instead collection
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(0));
        arr.set(0, 11);
        System.out.println(arr.get(0));

        Iterator<Integer> values = arr.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());  
        }

        // Map

        Map <String, Integer> mp = new HashMap<>();
        mp.put("Vivek", 96);
        mp.put("Khushi", 97);
        mp.put("Ash", 86);
        mp.put("Sarthak", 89);

        System.out.println(mp);

        System.out.println("Marks of Khushi : " + mp.get("Khushi"));


        // Sorting & Comparator
        List<Integer> li = new ArrayList<>();
        li.add(53);
        li.add(81);
        li.add(35);
        li.add(67);
        li.add(78);

        for(int num : li){
            System.out.print(num + "  ");
        }

        Collections.sort(li);

        System.out.println("\nSorted list : ");
        for(int num : li){
            System.out.print(num + "  ");
        }

        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 >= j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(li, cmp);
        System.out.println("\nList After Comparator : ");
        for(int num : li){
            System.out.print(num + "  ");
        }
        System.out.println();

        List<People> p = new ArrayList<>();
        p.add(new People(20, "Vivek"));
        p.add(new People(18, "Khushi"));
         
        

        Comparator<People> comp = new Comparator<People>() {
            public int compare(People i, People j){
                if(i.age >= j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(p, comp);
        System.out.println(p);
    }
}
