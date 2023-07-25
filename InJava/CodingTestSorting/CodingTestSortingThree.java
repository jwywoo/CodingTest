import java.util.*;

//7785
public class CodingTestSortingThree {
    static class Employee implements Comparable<Employee>{
        String name;
        String status;
        public Employee(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public int compareTo(Employee o) {
            return o.name.compareTo(this.name);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Employee> map = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            String name = sc.next();
//            String status = sc.next();
//            if (map.containsKey(name)) map.get(name).status = status;
//            else map.put(name,new Employee(name,status));
//        }
//
//
//        ArrayList<Employee> stillWorking = new ArrayList<>();
//        for (String key: map.keySet()) {
//            if (map.get(key).status.equals("enter")) {
//                stillWorking.add(map.get(key));
//            }
//        }
//        Collections.sort(stillWorking);
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String status = sc.next();
            if (map.containsKey(name)) map.remove(name);
            else map.put(name,new Employee(name,status));
        }

        Employee[] stillWorking = new Employee[map.size()];
        int index = 0;
        for (String key: map.keySet()) {
            stillWorking[index] = map.get(key);
            index++;
        }

        Arrays.sort(stillWorking);

        for (Employee employee: stillWorking) {
            System.out.println(employee.name);
        }
    }
}
