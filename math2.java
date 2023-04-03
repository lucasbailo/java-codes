import java.lang.Math;

public class MyClass {
    public static void main(String args[]) {
      int A = 2;
      int B = 3;
      float C = 1.5f;
      
      System.out.println(B == A*C);
      System.out.println(B > A || B == Math.pow(A,A));
      System.out.println(B/A >= C || A <= C);
      System.out.println(B/A >= C || A <= C);
      System.out.println(Math.sqrt( A + B ) >= C);
      System.out.println(B + A == C && B / A != C);
      System.out.println(Math.pow(B,2) <= C * 10 + A * B);
      System.out.println((120 - 30) == (3 * 30));
      System.out.println((((20 % 4) == 1) || (9 != 9)));
    }
}
