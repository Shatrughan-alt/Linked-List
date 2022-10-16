import java.util.Arrays;
 class Akash {
     void selectionsort(int arr[]) {
         int n = arr.length;
         int temp = 0;
         int x = 0;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 1; j < n; j++) {
                 if (arr[temp] > arr[j]) {
                    temp=j;
                 }
                 x=arr[i];
                 arr[i]=arr[temp];
                 arr[temp]=x;

             }
         }
         System.out.println(Arrays.toString(arr));
     }
 }
 class Selectionshort{
    public static void main(String[] args) {
        int arr[]={12,432,13,2234,532,46};
        Akash obj=new Akash();
        obj.selectionsort(arr);
    }
    }

