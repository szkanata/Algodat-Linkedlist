
public class InfixToPostfix {

    static String hasil(String infix) {

        StackCode stack = new StackCode();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {

            char c = infix.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;
            }

            if (Character.isDigit(c)) {

                while (i < infix.length()
                        && Character.isDigit(infix.charAt(i))) {

                    postfix.append(infix.charAt(i));
                    i++;
                }

                postfix.append(' ');
                i--;

            } else if (Character.isLetter(c)) {

                postfix.append(c);
                postfix.append(' ');

            } else if (c == '(') {

                stack.push(c);

            } else if (c == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {

                    postfix.append(stack.pop());
                    postfix.append(' ');
                }

                if (stack.isEmpty()) {
                    throw new IllegalArgumentException(
                        "Kurung tidak seimbang"
                    );
                }

                stack.pop();

            } else if (PriorityOps.isOperator(c)) {

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && (PriorityOps.precedence(stack.peek())
                        > PriorityOps.precedence(c)
                        || (PriorityOps.precedence(stack.peek())
                        == PriorityOps.precedence(c) && c != '^'))) {

                    postfix.append(stack.pop());
                    postfix.append(' ');
                }

                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {

            if (stack.peek() == '(') {
                throw new IllegalArgumentException(
                    "Kurung tidak seimbang"
                );
            }

            postfix.append(stack.pop());
            postfix.append(' ');
        }

        return postfix.toString().trim();
    }
}
