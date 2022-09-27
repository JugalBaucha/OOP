class Prime17 {
    public static void main(String[] args) {
        int i;
        int j;
        int check;
        for (i = 20; i < 100; i++) {
            check = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    check++;
                }
            }
            if (check == 2) {
                System.out.println("\t" + i);
            }

        }
    }
}