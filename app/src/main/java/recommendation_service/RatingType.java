/** Created by anish on 26/1/17.
 *  This class represents the Rating Type, the custom type for the individual elements of the
 *  Rating Matrix type
 */
package recommendation_service;

public class RatingType {

    private String userId;
    private String siteId;
    private float rating;

    public RatingType(String userId, String siteId, float rating) {
        this.userId = userId;
        this.siteId = siteId;
        this.rating = rating;
    }

    // the getters for the site type
    public String getUserId() {
        return userId;
    }

    public String getSiteId() {
        return siteId;
    }

    public float getRating() {
        return rating;
    }

    // the setters for the site type
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
