// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        String binary=scn.nextLine();
        int[] binaryInNumber=new int[binary.length()];
        int decimal=0;
        for(int i=0;i<binary.length();i++){
            binaryInNumber[i]=binary.charAt(i)-'0';
        }
        swap(binaryInNumber,0,binaryInNumber.length-1);
        for(int i=0;i<binaryInNumber.length;i++){
            decimal+= binaryInNumber[i]*Math.pow(2,i);            
        }
        
        System.out.print(decimal);
        
    }
    
    public static void swap(int[] nums,int p,int l){

        while(p<l){
            int temp=nums[p];
            nums[p]=nums[l];
            nums[l]=temp;
            p++;
            l--;
        }
    } 
}