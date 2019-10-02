public class Array {
    public static void main(String[] args) {
        int[] sortedNumbers = {1, 2, 4, 15, 23, 36, 48, 59, 93};
        int searchNumber = 2;

        boolean i = true;
        int firstIndex = 0;
        int lastIndex = sortedNumbers.length - 1;
        while (i) {
            int midIndex = (firstIndex + lastIndex) / 2;

            if (sortedNumbers[midIndex] == searchNumber) {
                System.out.println(midIndex);
                i = false;
            } else {
                if (sortedNumbers[midIndex] < searchNumber) {
                    firstIndex = midIndex + 1;
                } else {
                    if (sortedNumbers[midIndex] > searchNumber) {
                        lastIndex = midIndex - 1;
                    }
                }
            }
        }
    }
}