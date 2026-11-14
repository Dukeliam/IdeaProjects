import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("FIFA");
        stack.push("EFootball");

        //String myFavGame = stack.pop();


        //System.out.println(stack.peek());
        //System.out.println(stack.search("EFootball"));

        for(int i = 0; i < 10000000000; i++){
            stack.push("EFoo");
        }
    }
}
