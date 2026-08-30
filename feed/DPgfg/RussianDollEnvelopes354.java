import java.util.ArrayList;

public class RussianDollEnvelopes354 {
    public int maxEnvelopes(int[][] envelopes) {
        java.util.Arrays.sort(envelopes, (a, b) -> {

            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }

            return Integer.compare(a[0], b[0]);
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] x : envelopes){
            int ele = x[1];
            if(ans.size()== 0 || ele > ans.get(ans.size()-1)){
                ans.add(ele);
            }
            else replace(ans, ele);
        }   
        return ans.size();  
    }
    private void replace(ArrayList<Integer> ans, int x){
        int l = 0, r = ans.size()-1;
        while(l < r){
            int mid = l + (r-l)/2;
            if(ans.get(mid) >= x) r = mid;
            else l = mid + 1;
        }
        ans.set(r, x);
    }

    public static void main(String[] args) {
        RussianDollEnvelopes354 obj = new RussianDollEnvelopes354();
        int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
        int result = obj.maxEnvelopes(envelopes);
        System.out.println("Maximum number of envelopes: " + result);
    }
}
