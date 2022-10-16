public class Stack {
   static final int  max=1000;
   int arr[]=new int[max];
   int top;
   Stack(){
      top=-1;
   }
    public boolean isEmpty(){
      if(top==-1)
         return true;
      else
         return false;
    }
    public boolean isFull() {
       if (top >= max - 1)
          return true;
       else
          return false;
    }
    public void push(int x){
      if(isFull())
         System.out.println("Stack overflow");
      else
      {
         top=top+1;
         arr[top]=x;
      }

    }
    public void display(){
      for(int i=0;i<top+1;i++){
         System.out.println(arr[i]);
      }
    }
    public void pop(){
      if(isEmpty())
         System.out.println("Stack underflow");
      else
      {
         int x=arr[top];
         top--;
      }
    }
    public void peek(){
      if(isEmpty())
         System.out.println("Stack underflow");
      else
      {
         int x=arr[top];
         System.out.println("Top element is  "+x);
      }
    }

   public static void main(String[] args) {
      Stack obj=new Stack();
      obj.push(10);
      obj.push(20);
      obj.push(30);
      obj.display();
      obj.pop();
      obj.display();
      obj.peek();


   }
}

