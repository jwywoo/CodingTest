import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CodingTestSortingFour {
    static class Item implements Comparable<Item>{
        public Item(String title, int sold) {
            this.title = title;
            this.sold = sold;
        }
        String title;
        int sold;

        public int compareTo(Item o) {
            if (this.sold == o.sold) {
                return this.title.compareTo(o.title);
            }
            return o.sold- this.sold;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Item> soldMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String itemTitle = sc.next();
            if (soldMap.containsKey(itemTitle)) soldMap.get(itemTitle).sold++;
            else soldMap.put(itemTitle, new Item(itemTitle, 0));
        }

        ArrayList<Item> items = new ArrayList<>();
        for (String key:soldMap.keySet()) {
            items.add(soldMap.get(key));
        }

        Collections.sort(items);
        System.out.println(items.get(0).title);
    }
}
