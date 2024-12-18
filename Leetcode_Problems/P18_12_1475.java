public class P18_12_1475 {
    public static int[] finalPrices(int[] prices) {
        for(int i=0; i<prices.length-1; i++){
            int j = i+1;
            while(j<prices.length){
                if(prices[j] <= prices[i]){
                    prices[i] -= prices[j];
                    break;
                }
                else j++;
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        int[] ans =  finalPrices(prices);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
