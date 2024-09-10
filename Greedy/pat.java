class Pat {
    public static void main(String[] args) {
        int input = 5;
        String w = "W";
        String b = "B";
        String row = "";
        for (int i = 0; i < input; i++) {
            row = "";
            if (i % 2 != 0) {
                b = "W";
                w = "B";
            } else {
                w = "W";
                b = "B";
            }
            for (int j = 0; j < input; j++) {
                if (j % 2 == 0) {
                    row += w + " ";
                } else {
                    row += b + " ";
                }
            }
            System.out.println(row.trim());
        }
    }
}