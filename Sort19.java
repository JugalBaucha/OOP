class Sort19 {
    public static void main(String[] args) {
        int n = 4;
        int[] a = { 10, 2, 34, 4 };
        int i;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp;
                    a[i] = a[j];

                    temp = a[i];

                    a[j] = a[i];
                }
            }
        }
        for (i = 0; i < n; i++) {

            System.out.print("\t" + a[i]);
        }
    }
}