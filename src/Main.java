public class Main {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.append("ABC ABC2 bug fix branch1");
        }

        System.out.println((System.currentTimeMillis() - startTime));

    }
}
