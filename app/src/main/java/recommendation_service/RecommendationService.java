/** Created by anish on 15/12/16.
 *  The main class for the recommendation service injecting information into the information subspace,
 *  for use by the interfacing layer to recommend apps to the users.
 */
package recommendation_service;

import java.util.TreeMap;

import client.MainClient;
import context_service.Kontext;

public class RecommendationService {

    private UserList userList;
    private SiteList siteList;
    private MainClient mainClient;
    private RatingMatrix ratingMatrix;
    private ContxtMatrix contxtMatrix;

    private Kontext deviceKontext;

    public RecommendationService(MainClient mainClient){

        this.mainClient = mainClient;
        userList = mainClient.getConnector().parseUsers();
        siteList = mainClient.getConnector().parseSites();
        ratingMatrix = mainClient.getConnector().parseRatingMatrix();
        contxtMatrix = mainClient.getConnector().parseContxtMatrix();

        deviceKontext = mainClient.getDeviceKontext();
    }

    public SiteList getRecommendations(String userId) {
        SiteList recommendedSites = new SiteList();
        User user = null;

        if(userList.isRegisteredUser(userId)) {
            user = userList.get(userList.getIndexForUser(userId));
            // TODO: 26/1/17 if the user is already registered  

        }
        else {
            user = new User();
            user.setUserId(userId);

            TreeMap<Integer, Integer> kontextDiff = new TreeMap<>();
            for(Site site: siteList) {
                kontextDiff.put(deviceKontext.kontextDifference(site.getKontext()),
                        siteList.indexOf(site));
            }
            for(int siteIndex : kontextDiff.values()) {
                recommendedSites.add(siteList.get(siteIndex));
            }
        }

        return recommendedSites;
    }

}
