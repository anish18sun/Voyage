/** Created by anish on 20/1/17.
 *  This class connects to the database on server, and receives the response as json strings
 */
package client;

import recommendation_service.Site;
import recommendation_service.User;
import recommendation_service.SiteList;
import recommendation_service.UserList;
import recommendation_service.RatingMatrix;
import recommendation_service.ContxtMatrix;

public class Connector {

    private String sites;
    private String users;
    private String ratingMatrix;
    private String contxtMatrix;

    public void receive() {
        //receive the json from the server here; populate the above private members
    }

    public SiteList parseSites() {
        //parser for the sites private member
    }

    public UserList parseUsers() {
        //parser for the Users private member
    }

    public RatingMatrix parseRatingMatrix() {
        //parser for the Rating Matrix
    }

    public ContxtMatrix parseContxtMatrix() {
        //parser for the Kontext Matrix
    }
}
