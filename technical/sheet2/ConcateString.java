package InJava.technical.sheet2;

public class ConcateString {
    static void main(String[] args) {
        String a = "hello Boy";
        String b = "roj";
        a=a.concat(b);
        System.out.println("Concat String: " + a);
        try {
            char[] ab = a.toCharArray();
            char[] ba = b.toCharArray();
            char[] result = new char[ab.length + ba.length];
            int i = 0;
            while (i < ab.length) {
                result[i] = ab[i];
                i++;
            }
            int j = 0;
            while (j < ba.length) {
                result[ab.length + j] = ba[j];
                j++;
            }
            String concat = new String(result);

            System.out.println("Concat String: " + concat);
        } catch (ArrayIndexOutOfBoundsException e) {
           throw new RuntimeException(e);
        }
    }
}
