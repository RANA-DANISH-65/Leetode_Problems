public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, h * (right - left));
            while(left < right && height[left] <= h) {
                left++;
            }
            while(left < right && height[right] <= h) {
                right--;
            }
        }
        return maxArea;
    }
}
