/** Created by anish on 15/12/16.
 *  This class represents the context itself, the parameters that define the context
 */
package context_service;

import java.io.Serializable;
import android.location.Location;

public class Kontext implements Serializable{

    private Time time;              //these classes are defined in the android API
    private Weather weather;
    private Location location;

    public Kontext() {
        time = new Time();          //at this point the time and other context parameters are initialized
        weather = new Weather();
        location = new Location();
    }

    public int kontextDifference(Kontext otherKontext) {
        //function to suitably calculate the difference between two kontexts
    }

    public static int kontextDifference(Kontext kontext1, Kontext kontext2) {
        //function to calculate the difference between two kontexts provided as arguments
    }
}
