public class _q9_trappingRainWater {

    public static int trappedRainWater(int height[]){
        int trappedRainWater = 0;
        int n = height.length;

        int LeftMaxBoundary[] = new int[n];
        int RightMaxBoundary[] = new int[n];

        LeftMaxBoundary[0] = height[0];
        RightMaxBoundary[n-1] = height[n-1];

        for (int i = 1; i < n; i++) {
            LeftMaxBoundary[i] = Math.max(height[i], LeftMaxBoundary[i-1]);
        }

        for (int i = n-2; i >= 0; i--) {
            RightMaxBoundary[i] = Math.max(height[i], RightMaxBoundary[i+1]);
        }

        int waterLevel = 0;

        for (int i = 0; i < RightMaxBoundary.length; i++) {
            waterLevel = Math.min(RightMaxBoundary[i], LeftMaxBoundary[i]);
            trappedRainWater += waterLevel - height[i];
        }

        return trappedRainWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappedRainWater(height));
    }
}
