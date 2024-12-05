public class Main {
    public static void main(String[] args) {

        int n = 100, total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % j == 0)
                    total += j;

            }

            if (total == i + 1)
                System.out.println(i);

            total = 0;

        }

    }
}
