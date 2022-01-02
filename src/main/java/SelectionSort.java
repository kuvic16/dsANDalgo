/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/2/2022
 */
public class SelectionSort {

    public static void sSort(int[] a) {
        int i, j, index_main, temp, n = a.length;

        for(i = 0; i< n-1; i++) {
            index_main = i;

            for(j= i+1; j < n; j++) {
                if(a[j] < a[index_main]) {
                    index_main = j;
                }
            }

            if(index_main != i) {
                temp = a[i];
                a[i] = a[index_main];
                a[index_main] = temp;
            }
        }

        for (i = 0; i<n-1; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 9, 100, 200, 201, 209, 300};
        sSort(a);
    }
}
