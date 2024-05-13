import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        imprimir(solution("dog","racecar","car"));
    }
    
    private static void imprimir(Object elementString) {
        System.out.println(elementString);
    }

    private static String solution(String str1, String str2, String str3) {
        String res = "";
        List<String> arrayStr1 = Arrays.asList(str1.split(""));
        List<String> arrayStr2 = Arrays.asList(str2.split(""));
        List<String> arrayStr3 = Arrays.asList(str3.split(""));

        for(String elementString1 : arrayStr1){
            for(String elementString2 : arrayStr2){
                for (String elementString3 : arrayStr3){
                    if(elementString1.equals(elementString2) && elementString3.equals(elementString2)){
                        res += elementString1;
                    }
                }
            }
        }

        return res;
    };

}