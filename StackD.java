import java.util.Stack;

public class StackD{
    
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderland");
        stack.push("FFVII");

        
        //String myFavGame = stack.pop();
        //System.out.println(stack.peek());

        System.out.println(stack.search("FFVII"));
        

    }
}