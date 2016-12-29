/** Created by anish on 11/12/16.
 *  This class represents a general simple prototype of the main client class that forms the interfacing
 *  layer of the application.
 */
package client;

import context_service.ContextService;
import recommendation_service.RecommendationService;
import attraction_information_service.AttrInfoService;
import context_service.ContextInitializationException;
import attraction_information_service.AttrInfoInitializationException;

public class MainClient {

    private ContextService contextService;
    private AttrInfoService attrInfoService;
    private PubTransService pubTransService;
    private RecommendationService recommendationService;

    public MainClient() {

        //constructor prototype here
    }

    public void initializeContextService() throws ContextInitializationException {
        try {
            contextService = new ContextService();
        }
        catch(Exception e) {
            throw new ContextInitializationException(e);
        }
    }

    public void initializeAttrInfoService() throws AttrInfoInitializationException {
        try {
            attrInfoService = new AttrInfoService();
        }
        catch(Exception e) {
            throw new AttrInfoInitializationException(e);
        }
    }

    public void initializePubTransService() throws PubTransInitializationException {
        try {
            pubTransService = new PubTransService();
        }
        catch(Excpetion e) {
            throw new PubTransInitializationException(e);
        }
    }

    public void initializeRecommendationService() throws RecommendationInitializationException{
        try {
            recommendationService = new RecommendationService();
        }
        catch(Exception e) {
            throw new RecommendationInitializationException(e);
        }
    }
}
