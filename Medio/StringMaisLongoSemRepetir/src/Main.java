import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("abcabcbb"));
    }

    private static Integer solution(String text) {
        List<String> arrayText = Arrays.asList(text.split(""));
        List<String> arrayRepetString = new ArrayList<>();

        for(String element : arrayText){
            if (!arrayRepetString.contains(element)){
                arrayRepetString.add(element);
            }
        }

        return arrayRepetString.size();
    }
}