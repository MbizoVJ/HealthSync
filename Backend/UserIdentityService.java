package Backend;

import java.util.List;

public class UserIdentityService implements IUserIdentityService{
    static IUserIdentityService ServiceRepo ;

    public static IUserIdentityService getServiceRepo(){
        if(ServiceRepo == null){
            ServiceRepo = new UserIdentityService();
        }

        return ServiceRepo ;
    }

    IUserIdentityRepository repository;

    UserIdentityService(){
        repository = UserIdentityRepository.createRepo();
    }
    @Override
    public List<UserIdentity> getAll() {
        return this.repository.getAll();
    }

    @Override
    public UserIdentity create(UserIdentity t) {
        return this.repository.create(t);
    }

    @Override
    public UserIdentity read(String email) {
        return this.repository.read(email);
    }

    @Override
    public UserIdentity update(UserIdentity t) {
        return this.repository .update(t);
    }
}
