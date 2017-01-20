/** Created by anish on 15/12/16.
 *  The context initialization exception class used to indicate the app about the exceptions from the Kontext
 *  Service
 */
package context_service;

public class KontextInitializationException extends RuntimeException {

    public KontextInitializationException(Exception e) {
        super(e);
    }

    public KontextInitializationException(String msg) {
        super(msg);
    }

    public String toString() {
        return "Exception in Kontext Service !";
    }
}
