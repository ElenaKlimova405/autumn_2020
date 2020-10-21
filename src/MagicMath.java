/**
 *  Class description.
 * @author Elena_Klimova
 * @version 1.0
 */
public class MagicMath {
    /**
     * Method description
     * @param n
     * @return factoririal of the n
     */
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * fact(n - 1);
    }

    /**
     *
     * @param n
     * @return absolute variable of the n
     */
    public static int abs(int n) {
        if (n < 0)
            return -n;
        return n;
    }

    /**
     *
     * @param n
     * @param e is power
     * @return n in power e
     */
    public static int pow(int n, int e) {
        if (e == 0)
            return 1;
        if (n == 1)
            return n;

        if (e % 2 == 0)
        {
            int result = pow(n, e / 2);
            return result * result;
        }
        else {
            return n * pow(n, e-1);
        }
    }
}
