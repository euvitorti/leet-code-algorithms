package leetjava;

class RandomLeet {

    private int[] arrayLength;
    private int sum = 0;
    private int[] arrayPrefixos;
    private float result;

    public RandomLeet(int[] w) {
        this.arrayLength = w;
    }

    public float pickIndex() {
        int sum = allWeigth();
        for (int i = 0; i < arrayLength.length; i++) {
            result = arrayLength[i] / (1 + sum);
        }
        return result;
    }

    public int allWeigth() {
        for (int i = 0; i < arrayLength.length; i++) {
            sum += arrayLength[i];
            arrayPrefixos[i] = sum;
        }
        // sumArray = sum;
        return sum;
    }

    public static void main(String[] args) {
        int[] values = { 1, 3, 4};
        RandomLeet randomLeet = new RandomLeet(values);
        float resultPick = randomLeet.pickIndex();
        System.out.println(resultPick);

        System.out.println(randomLeet.pickIndex());
        System.out.println(randomLeet.pickIndex());
        System.out.println(randomLeet.pickIndex());
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */