package Day7;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,13,98,76,4};
        for (int i = arr.length - 1;i>=0;i-- )
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
