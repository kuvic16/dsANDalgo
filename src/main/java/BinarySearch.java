/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/1/2022
 */
public class BinarySearch {


    public static int bSearch(int a[], int n, int x) {

        int left, right, mid;
        left = 0;
        right = n - 1;

        while(left <= right) {
            mid = (left + right) / 2;

            if(a[mid] == x) {
                return mid;
            }

            if(a[mid] < x) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 9, 100, 200, 201, 209, 300};
        System.out.println(bSearch(a, 10, 201));
    }
}
