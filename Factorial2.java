public class Factorial2 {
   private static long factrecur(int n) {
    if (n == 0) {
        return 1;
    }
    else {
        return n * factrecur(n-1);
    }
}
}
