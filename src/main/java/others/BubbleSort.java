package others;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/4/2022
 */
public class BubbleSort {

    public static void bSort(int a[], int n) {
        int i, j, temp;

        for(i=0; i<n; i++) {
            for(j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (i = 0; i<n-1; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 9, 100, 200, 201, 209, 300};
        bSort(a, 10);
    }
}
