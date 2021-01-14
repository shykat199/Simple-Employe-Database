import java.util.*;

public class Method_Overloading {
    int h, k;
    Scanner sc = new Scanner(System.in);

    Method_Overloading(int h1, int k1) {
        this.h = h1;
        this.k = k1;
    }

    public void show() {
        int r = this.h + this.k;
        System.out.println(r);
    }

    void add() {
        String s;
        int nid;
        System.out.print("Name:");
        s = sc.nextLine();
        System.out.print("Nid:");
        nid = sc.nextInt();
        System.out.println("Name of Emp:" + s);
        System.out.println("National Id:" + nid);
    }

    void add(int s1, int i) {
        int mul = s1 * i;
        System.out.print("Salary:" + mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st value:");
        int h1 = sc.nextInt();
        System.out.print("2st value:");
        int k1 = sc.nextInt();

        Method_Overloading mo = new Method_Overloading(h1, k1);
        mo.show();

        mo.add();

        System.out.print("Enter mounth:");
        int s1 = sc.nextInt();
        System.out.print("Enter salary:");
        int i = sc.nextInt();
        mo.add(s1, i);
    }
}
