import java.util.Scanner;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 1/6/2022
 */
public class StackExample {
    public static int is_balanced(char[] input) {
        char[] stack = new char[100]; char last_char;
        int top, i, len;

        top =0;
        len = input.length;
        for(i=0; i< len; i++) {
            if(input[i] == '(') {
                stack[top] = '(';
                top++;
            }else if(input[i] == ')') {
                if(top == 0){
                    return 0;
                }
                top--;

                last_char = stack[top];
                if(last_char != '(') {
                    return 0;
                }
            }
        }


        return top == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        char[] input = new char[100];
        Scanner obj = new Scanner(System.in);
        input = obj.nextLine().toCharArray();
        System.out.println(input);
        if(is_balanced(input) == 1){
            System.out.println("balanced");
        }else{
            System.out.println("is not balanced");
        }
    }
}
