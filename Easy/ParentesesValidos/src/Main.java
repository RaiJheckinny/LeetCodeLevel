import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("(]"));
    }

    private static boolean solution(String s) {
        List<String> arrayString = Arrays.asList(s.split(""));
        for(String element : arrayString){
            switch (element){
                case "(":
                    return testElement(")",arrayString);
                case ")":
                    return testElement("(",arrayString);
                case "{":
                    return testElement("}",arrayString);
                case "}":
                    return testElement("{",arrayString);
                case "[":
                    return testElement("]",arrayString);
                case "]":
                    return testElement("[",arrayString);
            }
        }
        return false;
    }

    private static boolean testElement(String value, List<String> array) {
        if(array.contains(value)){
            return true;
        }
        return false;
    }
}