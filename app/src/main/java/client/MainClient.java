/** Created by anish on 11/12/16.
 *  This class represents a general simple prototype of the main client class that forms the interfacing
 *  layer of the application.
 */
package client;

import context_service.Kontext;
import context_service.KontextService;
import recommendation_service.RecommendationService;
import attraction_information_service.AttrInfoService;
import context_service.KontextInitializationException;
import recommendation_service.RecommendationInitializationException;
import attraction_information_service.AttrInfoInitializationException;
import recommendation_service.SiteList;

public class MainClient {

    private Connector connector;
    private KontextService kontextService;
    private AttrInfoService attrInfoService;
    private PubTransService pubTransService;
    private RecommendationService recommendationService;

    public MainClient() throws Exception{

        try {
            connector = new Connector();    //establish connection to server
            connector.receive();
        }
        catch(Exception e) {
            System.out.println("Exception in establishing connection : " + e.getMessage());
        }
    }

    public void initializeKontextService() throws KontextInitializationException {
        try {
            kontextService = new KontextService(this);
        }
        catch(Exception e) {
            throw new KontextInitializationException(e);
        }
    }

    public void initializeAttrInfoService() throws AttrInfoInitializationException {
        try {
            attrInfoService = new AttrInfoService(this);
        }
        catch(Exception e) {
            throw new AttrInfoInitializationException(e);
        }
    }

    public void initializePubTransService() throws PubTransInitializationException {
        try {
            pubTransService = new PubTransService(this);
        }
        catch(Exception e) {
            throw new PubTransInitializationException(e);
        }
    }

    public void initializeRecommendationService() throws RecommendationInitializationException{
        try {
            recommendationService = new RecommendationService(this);
        }
        catch(Exception e) {
            throw new RecommendationInitializationException(e);
        }
    }

    public Connector getConnector() {
        return connector;
    }

    public Kontext getDeviceKontext() { return kontextService.getKontext(); }

    public SiteList getRecommendations(String deviceId) {
        return recommendationService.getRecommendations(deviceId);
    }


}
