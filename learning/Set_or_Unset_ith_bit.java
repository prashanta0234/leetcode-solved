// set or unset ith bit 


// set:
public class Main {
    public static void main(String[] args) {
        int a=5;
        int i=3;
        a=(a|(1<<i));
        System.out.print(a);
    }
}

// unset:
// ~ use for reverse from of any binary like: 00100 --> 11011

public class Main {
    public static void main(String[] args) {
        int a=5;
        int i=0;
        a=(a&~(1<<i));
        System.out.print(a);
    }
}