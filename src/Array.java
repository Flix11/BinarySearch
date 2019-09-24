public class Array {
    public static int main (String[] args) {
        int[] sortedNumbers = {1, 2, 4, 15, 23, 36, 48, 59, 93};
        int firstIndex  = 0;
        int lastIndex = sortedNumbers.length - 1;
        int desiredNumber = 2;

        while (firstIndex < lastIndex) {
            int midLength = (firstIndex + lastIndex) / 2;
            if (sortedNumbers[midLength] == desiredNumber){
                return midLength; // элемент найден.
            } else if (firstIndex > lastIndex) {
                return lastIndex;
            }
            else if (sortedNumbers[midLength] < desiredNumber) {
                    firstIndex = midLength + 1; // В верхней половине
                }
            else if (sortedNumbers[midLength] > desiredNumber) {
                lastIndex = midLength - 1; // В нижней половине
            }

        }
        return firstIndex;
    }

    private static int getIndex(int[] arr, int var) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var) { //arr[i] - возвращает элемент массива под индексом i
                return i;
            }
        }
        return -1;
    }
}