/** Created by anish on 15/12/16.
 *  This class represents the Kontext Service that interacts with the other modules directly, basically
 *  it is an information injector into the information sub-space from where the other modules may pick
 *  up information or this module may pass on information.
 */
package context_service;

import client.MainClient;

public class KontextService {

    private Kontext kontext;
    private MainClient mainClient;

    public KontextService(MainClient mainClient) throws KontextInitializationException {
        try {
            kontext = new Kontext();
        }
        catch(Exception e) {
            throw new KontextInitializationException(e);
        }

        this.mainClient = mainClient;
    }

}
