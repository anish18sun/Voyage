/** Created by anish on 15/12/16.
 *  The context initialization exception class used to indicate the app about the exceptions from the Context
 *  Service
 */
package context_service;

public class ContextInitializationException extends RuntimeException {

    public ContextInitializationException(Exception e) {
        super(e);
    }

    public ContextInitializationException(String msg) {
        System.out.err("Exception in Context Service : " + msg);
    }

    public String toString() {
        return "Exception in Context Service !";
    }
}
