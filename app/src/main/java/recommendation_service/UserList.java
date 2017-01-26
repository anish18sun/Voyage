/** Created by anish on 20/1/17.
 *  Class to represent the list of users
 */
package recommendation_service;

import java.util.HashMap;
import java.util.ArrayList;

public class UserList extends ArrayList<User> {

    private HashMap<String, Integer> userIndexMap;

    public UserList() {
        super();

        userIndexMap = new HashMap<>();
        // TODO: 26/1/17 add more functionality as and when needed
    }

    public HashMap<String, Integer> getUserIndexMap() {
        return userIndexMap;
    }

    public int getIndexForUser(String userId) {
        return userIndexMap.get(userId);
    }

    public boolean isRegisteredUser(String userId) {
        return userIndexMap.containsKey(userId);
    }
}
