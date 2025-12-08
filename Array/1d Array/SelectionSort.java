public class SelectionSort {
    public static void Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // n-1 iterations because
                                                   // last element will be sorted automatically

            int smallest = i; // assume smallest is first element
            for (int j = i + 1; j < arr.length-1-i; j++) {
                if (arr[smallest] > arr[j]) {/// means current element is smaller than smallest
                    smallest = j; // update smallest
                }
            }
            // swap(bubble sort me ineer loop me swap karte the, yahan outer loop me
            // karenge)
            // kyuki inner loop me sirf smallest dhund rahe hain, Inner loop me hi har bar
            // neighbouring elements swap hote hain

             // swaping 
            int temp = arr[smallest]; 
            arr[smallest] = arr[i];
            arr[i] = temp; 

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 8, 4, 6, 5, 3, 9 };
        Sort(arr);

    }
}
