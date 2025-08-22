package Backend;

import java.util.ArrayList;
import java.util.List;

public class UserIdentityRepository implements  IUserIdentityRepository{
     public static UserIdentityRepository repository = null;
    public List<UserIdentity> userIdentityList;

public UserIdentityRepository(){
    userIdentityList = new ArrayList<>();
}
    public static UserIdentityRepository createRepo()
    {
        if(repository == null){

         repository = new UserIdentityRepository();
     }
             return repository;
    }
    @Override
    public List<UserIdentity> getAll(){
        return userIdentityList;
    }

    @Override
    public UserIdentity create(UserIdentity t) {
        boolean success = userIdentityList.add(t);
        if(success){
            return t;
        }
        return null;
    }

    @Override
    public UserIdentity read(String email) {
        for(UserIdentity r : userIdentityList){
            if(r.getEmail().equals(email))
                return r;
        }
        return null;
    }

    @Override
    public UserIdentity update(UserIdentity t) {

        String id = t.getEmail();
        UserIdentity userIdentity = read(id);

        if(userIdentity == null)
            return  null;
        boolean success = delete(id);
        if(success){
            if (userIdentityList.add(userIdentity))
                return  userIdentity;
        }
        return null;
    }

    @Override
    public boolean delete(String email) {
        UserIdentity userIdentityToDelete = read(email);
        if(userIdentityToDelete == null){
            return false;
        }

        return (userIdentityList.remove(userIdentityToDelete));
    }
}
