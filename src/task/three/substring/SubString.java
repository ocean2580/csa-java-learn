package task.three.substring;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/12 19:14
 * @注释
 */
public class SubString {

    public static void main(String[] args) {
        subString("abcde",new String[]{"a", "bb", "acd", "ace"});
    }

    public static void subString(String s, String[] words) {

        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (judge(s, word)) list.add(word);
        }
        System.out.println("There's " +list.size()+" in total, they are " + list.toString());
    }

    public static boolean judge(String s, String target) {
        int s1 = s.length();
        int s2 = target.length();
        int temp = 0; //记录指针移动位置
        if (s1 == s2 && s.equals(target)){
            return true;
        }else {
            for (int i = 0; i < s2; i++) {
                boolean flag = false;//标志位
                for (int j = temp; j < s1; j++) {
                    if (s.charAt(j)==target.charAt(i)){
                        //匹配成功
                        flag = true;
                        temp = j+1;//记录j的位置
                        break;
                    }
                }
                if (!flag) return false;
            }
        }
        return true;
    }
}
