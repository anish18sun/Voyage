/** Created by anish on 15/12/16.
 *  This class represents the Context Service that interacts with the other modules directly, basically
 *  it is an information injector into the information sub-space from where the other modules may pick
 *  up information or this module may pass on information.
 */
package context_service;

public class ContextService {

    private Context context;

    public ContextService() throws ContextInitializationException {
        try {
            context = new Context();
        }
        catch(Exception e) {
            throw new ContextInitializationException(e);
        }
    }
}
