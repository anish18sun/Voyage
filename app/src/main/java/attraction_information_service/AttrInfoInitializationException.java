/** Created by anish on 15/12/16.
 *  The exception class for the Attraction Information Service
 */
package attraction_information_service;

public class AttrInfoInitializationException extends RuntimeException {

    public AttrInfoInitializationException(Exception e){
        super(e);
    }

    public AttrInfoInitializationException(String msg) {
        System.out.err("Exception in Attraction Information Service : " + msg);
    }

    public String toString(){
        return "Exception in Attraction Information Service !";
    }
}
