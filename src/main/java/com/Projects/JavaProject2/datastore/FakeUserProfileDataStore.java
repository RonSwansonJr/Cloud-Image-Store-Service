package com.Projects.JavaProject2.datastore;


import com.Projects.JavaProject2.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("71cc5b33-1b9f-4a3d-b3b6-61d1671a73e7"),"bigboi",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("624ae083-b94d-46be-8d20-381e6a7a8429"),"smolboi",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("ba14217b-b097-4174-adf5-d2a8e9ed198c"),"medboi",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
