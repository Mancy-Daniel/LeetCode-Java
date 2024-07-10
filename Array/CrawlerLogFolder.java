import java.util.Scanner;

// 1598. Crawler Log Folder
/*  "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
     "./" : Remain in the same folder.
 Example 3: Input: logs = ["d1/", "d2/","../","d21/","./"]
            Output: 2
 Example 3: Explanation: Use this change folder operation "../" 2 times and go back to the main folder.
            Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
            Output: 3
 Example 3: Input: logs = ["d1/","../","../","../"]
            Output: 0*/
class Solution {
    public static int minOperations(String[] logs) {
        int depth = 0;
        for (int i = 0; i < logs.length; i++) {
            if (!logs[i].equals("./") && !logs[i].equals("../")) {
                depth++;
            }
            if (logs[i].equals("./")) {
                continue;
            } else if (logs[i].equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            }
        }
        return depth;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] logs = new String[6];
        for (int i = 0; i < logs.length; i++) {
            logs[i] = sc.nextLine();
        }
        System.out.println(minOperations(logs));
        sc.close();
    }
}
