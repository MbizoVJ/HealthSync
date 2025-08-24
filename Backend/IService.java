package Backend;

public interface IService <Type  , id> { 
    public Type create (Type t);

    public Type read( id email);

    public Type update(Type t);
}
