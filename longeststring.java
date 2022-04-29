class longeststring {
    public int substring(String s) {

        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (repetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    boolean repetition(String s, int a, int b) {
        int[] chars = new int[128];

        for (int i = a; i <= b; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        longeststring ob = new longeststring();
        String s = "marketsimplified";
        System.out.println(" longest of substring without repitition " + ob.substring(s));
    }
}