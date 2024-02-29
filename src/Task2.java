import java.util.List;
/*
    2. სტრინგი არის ‘ბედნიერი’ თუ მისი შემადგენელი ყოველი სიმბოლოს მომდევნო ელემენტი არ
    უდრის ამ სიმბოლოს. სტრინგები შედგება მარტო ‘a’, ‘b’, ‘c’ სიმბოლოებისგან. თქვენ შემოგდით
    სტრინგების ლისტი, გამოთვალეთ რამდენი სტრინგი არის ‘ბედნიერი’. int
    numberOfHappyStrings(List<String> strings);

    მაგ. strings = [“abbcc”, “abc”, “abcabc”, “cabcbb”], result = 2.
*/
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcbb");
        int happyCount = numberOfHappyStrings(strings);
        System.out.println("Number of happy strings: " + happyCount);
    }

    private static int numberOfHappyStrings(List<String> strings) {
        int count = 0;
        for (String str : strings) {
            if (isHappy(str))
                count++;
        }
        return count;
    }

    private static boolean isHappy(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return false;
        }
        return true;
    }
}
