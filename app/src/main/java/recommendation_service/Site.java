/** Created by anish on 20/1/17.
 *  Class to represent the observation site in all its details
 */
package recommendation_service;

import context_service.Kontext;

public class Site {

    //add more parameters here after their conception and creation such as location and unique site id
    private String name;
    private String hours;
    private String address;
    private String longDes;
    private String shortDes;

    private int phone;
    private float review;
    private int reviewers;
    private Kontext kontext;

    public Site(String name,
                String hours,
                String address,
                String longDes,
                String shortDes,
                int phone,
                float review,
                int reviewers,
                Kontext kontext) {
        this.name = name;
        this.hours = hours;
        this.address = address;
        this.longDes = longDes;
        this.shortDes = shortDes;
        this.phone = phone;
        this.review = review;
        this.reviewers = reviewers;
        this.kontext = kontext;
    }

    @Override
    public boolean equals(Object obj) {
        Site site = null;
        if(obj instanceof Site) {
            site = (Site) obj;
            return site.getName().equals(name);
        }
        else return false;
    }

    // the getters for the all the parameters of the site type
    public String getName() {
        return name;
    }
    public String getHours() {
        return hours;
    }
    public String getAddress() {
        return address;
    }

    public String getLongDes() {
        return longDes;
    }

    public String getShortDes() {
        return shortDes;
    }

    public int getPhone() {
        return phone;
    }

    public float getReview() {
        return review;
    }

    public int getReviewers() {
        return reviewers;
    }

    public Kontext getKontext() { return kontext; }

    //the setter for the parameters of the site type
    public void setName(String name) {
        this.name = name;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLongDes(String longDes) {
        this.longDes = longDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setReview(float review) {
        this.review = review;
    }

    public void setReviewers(int reviewers) {
        this.reviewers = reviewers;
    }

    public void setKontext(Kontext kontext) { this.kontext = kontext; }
}

