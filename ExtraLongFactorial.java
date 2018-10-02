/**Author: Wenhao Lin
 *Question:  Complete the extraLongFactorials function. It should print the result and return.
 *extraLongFactorials has the following parameter(s):
 * n: an integer
*/

import java.math.BigInteger;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        String myString = String.valueOf(n);
        BigInteger myBig = new BigInteger(myString);
        for(int i = n-1; i>0; i--){
            String aString = String.valueOf(i);
            BigInteger aBig = new BigInteger(aString);
            myBig = myBig.multiply(aBig);
        }//for
        System.out.println(myBig.toString());
     }
}