/*
    1. მოცემულია სტრინგი, რომელიც შეიცავს არითმეტიკულ ოპერაციებს (+,-). დაწერეთ ფუნცქია,
    რომელიც გამოთვლის მოცემული არითმეტიკული ოპერაციის შედეგს int evaluateExpression(String expression);

    მაგ. expression = “5+20-8+5”. result = 22.
*/
public class Task1 {
    public static void main(String[] args) {

        String expression = "5+20-8+5";
        int result = evaluateExpression(expression);
        System.out.println("Result = " + result);
    }

    public static int evaluateExpression(String expression) {
        int result = 0;
        int currentNumber = 0;
        char addition = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }
            if (!Character.isDigit(c) && c != ' ' || i == expression.length() - 1) {
                if (addition == '+') {
                    result += currentNumber;
                } else if (addition == '-') {
                    result -= currentNumber;
                }
                addition  = c;
                currentNumber = 0;
            }
        }

        return result;
    }
}
