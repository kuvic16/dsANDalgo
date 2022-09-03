package others;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/4/2022
 */
public class InsertionSort {

    public static void iSort(int a[], int n) {
        int i, j, item;

        for(i=1; i<n; i++){
            item = a[i];
            j = i-1;
            while(j>=0 && a[j] > item) {
                a[j+1] = a[j];
                j = j -1;
            }
            a[j+1] = item;
        }

        for (i = 0; i<n-1; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 9, 100, 200, 201, 209, 300};
        iSort(a, 10);
    }
}
