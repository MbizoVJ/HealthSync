package Backend;

import java.util.Arrays;

public class UserIdentity {
    public static class Builder{
        public String name ;
        public String surname;
        public String email;
        public String password;
        public byte [] profilePicture;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this
            ;
        }

        public Builder setProfilePicture(byte[] profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
             public Builder copy(UserIdentity userIdentity){
              this.name = userIdentity.name;
              this.email = userIdentity.email;
              this.surname = userIdentity.surname;
              this.profilePicture = userIdentity.profilePicture;
              this.password = userIdentity.password;
            return this;
             }

        public UserIdentity build(){
            return new UserIdentity(this);
        }
    }
    public String name;
    public String surname;
    public String email;
    public String password;

    public byte [] profilePicture;

    public UserIdentity(Builder builder){
        this.email = builder.email;
        this.surname = builder.surname;
        this.name = builder.name;
        this.password = builder.password;
        this.profilePicture = builder.profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "UserIdentity{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", profilePicture=" + Arrays.toString(profilePicture) +
                '}';
    }
    
}
