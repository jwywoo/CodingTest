import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 10814
public class CodingTestSortingTwo {
    static class Name {
        public Name(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }

        String name;
        int age;
        int order;
    }

    static class Member implements Comparable<Member> {
        int age;
        String name;
        int idx;

        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        @Override
        public int compareTo(Member o) {
            if (this.age == o.age) return this.idx - o.idx;
            return this.age - o.age;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Member[] names = new Member[N];
        for (int i = 0; i < N; i++) {
            names[i] = new Member(Integer.parseInt(sc.next()), sc.next(), i);
        }

        Arrays.sort(names);
//        Arrays.sort(names, new Comparator<Name>() {
//            @Override
//            public int compare(Name o1, Name o2) {
//                if (o1.age == o2.age) {
//                    return o1.order - o2.order;
//                }
//                return o1.age - o2.age;
//            }
//        });
//
        for (int i = 0; i < N; i++) {
            System.out.println(names[i].age + " " + names[i].name);
        }

    }
}
