public class P2_6_135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        int ans = 1;
        int minIndx = 0, maxIndx = 0; 
        candies[0] = 1;
        for (int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                ans += candies[i - 1] + 1;
                candies[i] = candies[i - 1] + 1;
                maxIndx = i;
            } else if (ratings[i] < ratings[i - 1] && candies[i - 1] > 1) {
                ans += 1;
                candies[i] = 1;
                minIndx = i;
            }
            else if(ratings[i] < ratings[i - 1] && candies[i - 1] == 1) {
                candies[i] = 1;
                if(candies[maxIndx]> i-maxIndx){
                    ans += i - maxIndx;
                }else{
                    ans += i - maxIndx + 1;
                }minIndx = i; 
            }
            else{
                ans += 1;
                candies[i] = 1;
                maxIndx = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P2_6_135 obj = new P2_6_135();
        int[] ratings = {1,2,87,87,87,2,1};
        System.out.println(obj.candy(ratings)); // Example usage
    }
}
