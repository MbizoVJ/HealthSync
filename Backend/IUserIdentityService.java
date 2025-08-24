package Backend;

import java.util.List ;

public interface IUserIdentityService extends IService <UserIdentity, String> {
     public List<UserIdentity> getAll();
}
