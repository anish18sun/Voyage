/**
 * Created by anish on 20/1/17.
 */
package recommendation_service;

public class RecommendationInitializationException extends RuntimeException{

    public RecommendationInitializationException(String msg) {
        super(msg);
    }

    public RecommendationInitializationException(Exception e) {
        super(e);
    }

    public String toString() {
        return "Exception in Recommendation Service Initialization !";
    }
}
