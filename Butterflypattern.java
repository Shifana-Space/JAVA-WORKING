public class Butterflypattern {
    public static void main(String args[]) {

        int n = 5;

        // Upper Half
        for(int i = 1; i <= n; i++) {

            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // First space loop
            for(int k = i; k <= n - 1; k++) {
                System.out.print("  ");
            }

            // Second space loop
            for(int k = i; k <= n - 1; k++) {
                System.out.print("  ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n - 1; i >= 1; i--) {

            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // First space loop
            for(int k = i; k <= n - 1; k++) {
                System.out.print("  ");
            }

            // Second space loop
            for(int k = i; k <= n - 1; k++) {
                System.out.print("  ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}