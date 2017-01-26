/** Created by anish on 20/1/17.
 *  Class to represent an individual user
 */
package recommendation_service;

public class User {

    private String userId;
    private String country;
    private String searches[];

    public User() {
        userId = null;
        country = null;
        searches = null;
    }

    public User(String userId, String country, String searches []) {
        this.userId = userId;
        this.country = country;
        this.searches = searches;
    }

    @Override
    public boolean equals(Object obj) {
        User user = null;
        if(obj instanceof User) {
            user = (User)obj;
            return user.getUserId().equals(userId);
        }
        else return false;
    }

    //the getters for the User type
    public String getUserId() {
        return userId;
    }

    public String getCountry() {
        return country;
    }

    public String[] getSearches() {
        return searches;
    }

    //the setters for the User type
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSearches(String[] searches) {
        this.searches = searches;
    }
}
