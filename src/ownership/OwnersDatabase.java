package ownership;

public class OwnersDatabase {
    private static Owner[] owners = new Owner[100];
    private static int index;

    public static void addOwner(Owner owner){
        owners[index] = owner;
        index++;
    }
    public static Owner[] getOwners(){
        return owners;
    }
    public static int getSize( ){
        return index;
    }
    public static Owner getOwner(int index){
        return owners[index];
    }

    public static String getOwnerName(int index){
         return owners[index].getName();

    }
        public static OwnerType ownerType(int index){
        return owners[index].getType();
    }


}
