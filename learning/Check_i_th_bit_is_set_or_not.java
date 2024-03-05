// "static void main" must be defined in a public class.

// resource:
// https://youtu.be/yEa0vkjJSf0?si=RxgZ_YPMrImqrNmT&t=551



// ----------------------------------------------
// -------> Check ith bit is set or not -------->
// ----------------------------------------------

// 1st
// right shift the a i`th time and perform and operation with 1 then check set or not
// 0101 ---> right 3 times : 0001
// and operation with 1----> 0001
// and ans is:-------------> 0001(true)
public class Main {
    public static void main(String[] args) {
        int a=5;
        int i=3;
        if((1&(a>>i))!=0){
            System.out.print("Set");
        }else{
            System.out.print("Not Set");
        }
    }
}


// 2nd:

// left shift 1 ith time and perform and operation with a and check set or not.

// if: i=2 --> 0100 (left shift i th time) 
// a=5: ----> 0101
// and ope -> 0100
// ---------> 0100 !=0 (true)

// if: i=3 --> 1000 (left shift i th time) 
// a=5: ----> 0101
// and ope -> 1000
// ---------> 0000 ==0 (false)

public class Main {
    public static void main(String[] args) {
        int a=5;
        int i=2;
        if((a&(1<<i))!=0){
            System.out.print("Set");
        }else{
            System.out.print("Not Set");
        }
    }
}