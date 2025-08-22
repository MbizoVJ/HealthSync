package Backend;

public interface IRepository  <Type , id>{
    
        Type create (Type t);

        Type read( id email)
        ;

        Type update(Type t);

        boolean delete(id email);

}
