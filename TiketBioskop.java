public class TiketBioskop {

    static String[] stack = new String[10];
    static int top = -1;


    static void push(String tiket) {

        if (top == stack.length - 1) {
            System.out.println("Stack penuh");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    static String pop() {

        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String data = stack[top];
            top--;
            return data;
        }
    }

    static String peek() {

        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {

        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");

        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }

        System.out.println("==============================");
    }

    static int hitungTotal() {

        int total = 0;

        for (int i = 0; i <= top; i++) {

            if (stack[i].contains("Rp50.000")) {
                total += 50000;
            } else if (stack[i].contains("Rp45.000")) {
                total += 45000;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        // push tiket
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        tampilkanStack();

        System.out.println("Tiket terakhir masuk: " + peek());

        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();

        System.out.println("Total transaksi: Rp" + hitungTotal());
    }
}