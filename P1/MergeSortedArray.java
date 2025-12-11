class MergeSortedArray {
    public static void main(String[] args) {
        int num1[] = {0};
        int m = 0;
        int num2[] = {1};
        int n = 1;

       System.out.println(Merge(num1, m, num2, n));
    }

    public static int[] Merge(int num1[], int m, int num2[], int n) {
        
        // Initialize pointers for num1 and num2
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Merge the arrays from the end
        while (p1 >= 0 && p2 >=0) {
            if (num1[p1] > num2[p2]) {
                num1[p] = num1[p1];
                p1--;
            } else {
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }

        while(p2 >= 0) {
            num1[p] = num2[p2];
            p2--;
            p--;
        }

        return num1;
    }
}