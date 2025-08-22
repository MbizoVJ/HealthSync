package Backend;

public class UserIdentityFactory {
        
    public static UserIdentity createUserIdentityFactory(String password , String email, String surname, String name , byte [] profilePicture ) {

        if(Helper.isNull(password) || Helper.isNull(email) || Helper.isNull(surname) || Helper.isNull(name)){
        return null;
    }
        return new UserIdentity.Builder().setPassword(password).setEmail(email).setSurname(surname).setName(name).setProfilePicture(profilePicture).build();
    }
}
