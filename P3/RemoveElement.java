class RemoveElement {
     public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4};
        int val = 4;
        System.out.println(FunctionRemoveElement(nums, val));
    }

    public static int FunctionRemoveElement(int nums[], int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }
}
