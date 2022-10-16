
import java.util.Arrays;
class Akashh
{
    public void bubblesort(int arr[])
    {
        int n=arr.length;
        int q=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    q=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=q;
                }
            }
        }
        //return(int arr[]);
        System.out.print(Arrays.toString(arr));
    }
}
public class Bubblesort{

    public static void main(String[] args) {
        //System.out.println("Hello World");
        int arr[]={1,34,234,42,67};
        Akashh  obj=new Akashh();

        obj.bubblesort(arr);
        //System.out.print(obj.bubblesort);
    }
}
