class MaximumSum {

    public MaximumSum(){}

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (numOnes >= k)
            return k;
        if (numOnes + numZeros >= k) {
            return numOnes;
        }
        k -= numZeros;
        k -= numOnes;
        return numOnes - k;
    }

    public static void main(String[] args) {
        MaximumSum maximumSum = new MaximumSum();
        int result = maximumSum.kItemsWithMaximumSum(3, 2, 0, 2);
        System.out.println(result);
    }
}