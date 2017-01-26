/** Created by anish on 20/1/17.
 *  This class connects to the database on server, and receives the response as json strings
 */
package client;

import recommendation_service.Site;
import recommendation_service.User;
import recommendation_service.SiteList;
import recommendation_service.UserList;
import recommendation_service.RatingType;
import recommendation_service.ContxtType;
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
        /* Logic for simple parsing - from the json string strip off the outermost square brackets
         * split the resulting string delimited at commas, such that individual sites are obtained
         * as array elements or whatever elements, then use a json parsing library for parsing the
         * separate json elements(each of which result into a new site), library such as Gson,
         * create a List<Sites> and return it.
         */
    }

    public UserList parseUsers() {
        //parser for the Users private member
        /* For each of the users the parser will behave in the following manner :
           UserList userList = new UserList();
         * for(every user in the received list) {
         *      User user = new User(name, country, searches);
         *      userList.add(index, user);
         *      userList.getUserIndexMap().put(user.getName(), index);
         * }
         */
    }

    public RatingMatrix parseRatingMatrix() {
        //parser for the Rating Matrix
    }

    public ContxtMatrix parseContxtMatrix() {
        //parser for the Kontext Matrix
    }
}
