public class Main {
    public static void main(String[] args) {
//         convert small latter to Capital latter and Capital to small
        
//         Binary of space: 00100000
//         Binaray of B   : 01000010  
        
//         Binary of b    : 01100010 (result of B|' ')
//         Binary of '_'  : 01011111
//         Binaray of B   : 01000010  (result of b &'_')
        
        char b='B'|' ';
        char B='b'&'_';
        System.out.println(b);
        System.out.println(B);

    }
}