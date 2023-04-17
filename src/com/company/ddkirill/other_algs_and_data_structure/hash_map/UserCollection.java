package com.company.ddkirill.other_algs_and_data_structure.hash_map;

import java.util.HashMap;
import java.util.Map;

public class UserCollection {

    Map<Integer, User> userMap = new HashMap<>();

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public boolean addNewUser(User user) {
        int id = generateId();

        if (userMap.containsKey(id) && userMap.containsValue(user)) {
            userMap.put(id, user);
            return true;
        } else {
            return false;
        }
    }

    private static int generateId() {
        double random = Math.random();
        return (Integer) (int) random;
    }

}
