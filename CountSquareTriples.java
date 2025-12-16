package InJava;

public class CountSquareTriples {
    /*using euclid formula every primitive Pythagoras triple(no common factors) can
    be generated
    a=m^2-n^2
    b=2mn
    c=m^2+n^2
    condition
    m>n
    gcd(m,n)==1
    m and n have opposite parity {if(((m-n)&1)==0)
    m and n are positive integer
    for non-primitive multiply with k (k>=1)
     */
     static void main(String[] args)
    {
      System.out.println(countTriples(5));
    }
    public static int countTriples(int n) {
        int count = 0;
        for (int m = 2; m * m <= n; m++) {
            for (int nn = 1; nn < m; nn++) {
                if (((m - nn) & 1) == 0) continue;
                if (gcd(m, nn) != 1) continue;
                int a = m * m - nn * nn;
                int b = 2 * m * nn;
                int c = m * m + nn * nn;
                if (c > n) continue;
                int k = 1;
                while (k * c <=n && k *a <=n && k * b <= n) {
                    count++;
                    k++;
                }

            }
        }
        return count;
    }

    private static int gcd(int m, int nn)
    {
        while(nn!=0)
        {
            int t=nn;
            nn=m%nn;
            m=t;
        }
        return m;
    }
}
