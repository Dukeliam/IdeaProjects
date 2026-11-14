public class Main {
    public static void main(String[] args){
        System.out.println(length("aabbc"));
    }

    public static int length(String word){
        int sum = 0;
        for(int index = 0; index < word.length(); index++){
            for(int count = index + 1; count < word.length(); count++){
                if(word.charAt(index) == word.charAt(count))
                    sum += 1;
            }
        }
            return sum;
    }
}