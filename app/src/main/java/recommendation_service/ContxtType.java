/** Created by anish on 26/1/17.
 *  This class represents the Context Type entity for use in the Context Matrix
 */
package recommendation_service;

import context_service.Kontext;

public class ContxtType {

    private String userId;
    private String siteId;
    private Kontext kontext;

    public ContxtType(String userId, String siteId, Kontext kontext) {
        this.userId = userId;
        this.siteId = siteId;
        this.kontext = kontext;
    }

    // the getter for the parameters of this class
    public String getUserId() {
        return userId;
    }

    public String getSiteId() {
        return siteId;
    }

    public Kontext getKontext() {
        return kontext;
    }

    // the setters for the methods of this class
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setKontext(Kontext kontext) {
        this.kontext = kontext;
    }
}
