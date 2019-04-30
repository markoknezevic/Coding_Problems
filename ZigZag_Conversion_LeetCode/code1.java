class Solution {
    public String convert(String s, int numRows) {
        int num = s.length();
        if (numRows != 1) {
            num = s.length() - numRows;
        }
        char mat[][] = new char[numRows][s.length()];

        boolean end = true;
        String fin = "";
        int i = 0, j = 0, k = 0;
        if (numRows > 1) {
            while (k < s.length()) {
                if (end) {
                    mat[i][j] = s.charAt(k);
                    i++;

                    if (i == numRows) {
                        end = false;
                        i--;
                    }

                } else {
                    if (i > 0)
                        i--;

                    j++;
                    mat[i][j] = s.charAt(k);
                    if (i == 0) {
                        end = true;
                        i++;
                    }
                }
                k++;
            }

        } else {
            fin = s;
        }
        for (int z = 0; z < numRows; z++) {
            for (int u = 0; u < s.length(); u++)
                if (mat[z][u] != '\u0000') {
                    fin = fin.concat("" + mat[z][u]);

                }
        }

        return fin;
    }
}