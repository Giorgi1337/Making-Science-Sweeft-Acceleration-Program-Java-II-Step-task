/*
    6. მოცემული გვაქვს მთელი რიცხვების ორი მასივი, array და sequence. იპოვეთ თუ მეორე მასივი
    პირველი მასივის ქვესიმრავლეა და ელემენტები იგივე მიმდევრობით არის მოცემული. boolean
    isValidSequence(int[] array, int[] sequence);

    მაგ. array = [5,1,22,25,6,-1,8,10], sequence = [1,6-1,10], result = true. (edited)
*/
public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean result = (isValidSequence(array, sequence));
        System.out.println(result);
    }
    private static boolean isValidSequence(int[] array, int[] sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while (arrayIndex < array.length && sequenceIndex < sequence.length) {
            if (array[arrayIndex] == sequence[sequenceIndex])
                sequenceIndex++;

            arrayIndex++;
        }
        return sequenceIndex == sequence.length;
    }
}
