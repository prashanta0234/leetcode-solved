// Toggle ith bit

// ex: for 1th bit
// 0101
// 0010
// 0111

// ex: for 2nd bit
// 0101
// 0100
// 0001


public class Main {
    public static void main(String[] args) {
        int a=5;
        int i=1;
        a=(a^(1<<i));
        System.out.print(a);
    }
}