/** Created by anish on 15/12/16.
 *  This class represents the context itself, the parameters that define the context
 */
package context_service;

public class Context {

    private Time time;              //these classes are defined in the android API
    private Weather weather;
    private Location location;

    public Context() {
        time = new Time();          //at this point the time and other context parameters are initialized
        weather = new Weather();
        location = new Location();
    }
}
