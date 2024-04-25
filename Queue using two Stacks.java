// https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s1.isEmpty()) return -1;
	   
	   while(!s1.isEmpty()){
	       int temp= s1.pop();
	       s2.push(temp);
	   }
	   
	   int ans=s2.pop();
	   while(!s2.isEmpty()){
	       int temp= s2.pop();
	       s1.push(temp);
	   }
	   return ans;
    }
}