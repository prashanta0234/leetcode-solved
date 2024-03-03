// find given number is even or odd

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        byte one=1;
        
        
        if((n&one)==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");

        }
        
    }
}