public class MxnimunWealthyPerson {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3},{1, 5, 3},{9, 1}};
        System.out.println(maximimWealth(accounts));
    }
    public static int maximimWealth(int[][] accounts){
        int maxWealthy = Integer.MIN_VALUE;
        for(int[] person: accounts){
            int totalAmmount = 0;
            for(int account: person){
                totalAmmount += account;
            }
            if(totalAmmount > maxWealthy){
                maxWealthy = totalAmmount;
            }
        }
        return maxWealthy;
    }
}
