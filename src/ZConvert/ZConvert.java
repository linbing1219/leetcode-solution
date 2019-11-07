package ZConvert;

import java.util.ArrayList;
import java.util.List;

public class ZConvert {
    public String convert(String s, int numRows) {
        if (null == s || s.isEmpty()) return "";

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();

        for (int i=0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        boolean isDown = false;
        int rowIndex = 0;
        for (char c : s.toCharArray()) {
            rows.get(rowIndex).append(c);
            if (rowIndex == 0 || rowIndex == rows.size() - 1) isDown = !isDown;
            if (isDown) {
                rowIndex += 1;
            } else {
                rowIndex -= 1;
            }
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);

        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZConvert().convert("AB", 1));
    }
}
