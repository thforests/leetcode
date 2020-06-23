public class no_11 {
    //双指针
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int capacity = 0;
        while (left < right) {
            int minheight = Math.min(height[left], height[right]);
            capacity = Math.max(capacity, minheight * (right - left));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }
        return capacity;
    }
}
