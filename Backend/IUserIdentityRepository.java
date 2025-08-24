package Backend;

import java.util.List ;

public interface IUserIdentityRepository  extends IRepository <UserIdentity , String>{

      public List<UserIdentity> getAll();
    
}
