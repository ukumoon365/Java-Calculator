import java.util.StringTokenizer;

public class CalculatorLogic {
    int result; // 결과값 변수 초기화

    public  int Calculator(String expression) {
        StringTokenizer token = new StringTokenizer(expression, "+*÷-", true );

        while (token.hasMoreTokens()) {
            String temp = token.nextToken();
            switch (temp) {
                case "+":
                    result += Integer.parseInt(token.nextToken());
                    break;
                case "-":
                    result -= Integer.parseInt(token.nextToken());
                    break;
                case "*":
                    result *= Integer.parseInt(token.nextToken());
                    break;
                case "÷":
                    result /= Integer.parseInt(token.nextToken());
                    break;
                default:    // 모든 case가 아닌 경우
                    result = Integer.parseInt(temp);
            }
        }
        return result;
    }
}
