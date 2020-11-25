package B14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort_method {
    public static void insertionSort1(int[] list) {
        int index = list.length;
        for (int i = 1; i < list.length ; i++) {
            int temp = list[i];
            int j = i-1;

            while (j>0 && list[j] > temp) {
                list[j+1] = list[j];
                j = j-1;
            }
            list[j+1] = temp;
        }
    }

    static void printArray( int list[]){
        int index = list.length;
        for (int i = 0; i < index; i++) {
            System.out.println(list[i] + " ");

        }
    }

    public static void main(String[] args) {
        int list[]={12,11,13,5,6};
        System.out.println("Mang ban dau : ");
        printArray(list);
        InsertionSort ob = new InsertionSort();
        ob.insertionSort1(list);
        System.out.println(" mang sau khi sap xep: ");
        printArray(list);
    }
}
