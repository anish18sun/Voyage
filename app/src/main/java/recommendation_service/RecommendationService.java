/** Created by anish on 15/12/16.
 *  The main class for the recommendation service injecting information into the information subspace,
 *  for use by the interfacing layer to recommend apps to the users.
 */
package recommendation_service;

import client.MainClient;

public class RecommendationService {

    private UserList userList;
    private SiteList siteList;
    private MainClient mainClient;
    private RatingMatrix ratingMatrix;
    private ContxtMatrix contxtMatrix;

    public RecommendationService(MainClient mainClient){

        this.mainClient = mainClient;
        userList = mainClient.getConnector().parseUsers();
        siteList = mainClient.getConnector().parseSites();
        ratingMatrix = mainClient.getConnector().parseRatingMatrix();
        contxtMatrix = mainClient.getConnector().parseContxtMatrix();
    }

}
