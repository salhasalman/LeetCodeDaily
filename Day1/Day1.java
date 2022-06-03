package Day1;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxAmount = 0;
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];

            }
            if (temp > maxAmount)
                maxAmount = temp;

        }
        return maxAmount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        Solution s = new Solution();
        System.out.println(s.maximumWealth(accounts));
    }
}
