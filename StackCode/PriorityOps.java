public class PriorityOps {
    static int precedence(char operator) {
        switch(operator) {
            case '+' :
                return 1;
            case '-' :
                return 1;
            case '*' :
                return 2;
            case '/' :
                return 2;
            case '^' :
                return 3;
            default :
                return -1;
        }
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
}