package ownership;

import java.util.Objects;

public class Owner {                        //1)Aceasta este clasa care are proprietari numele si tipul
    private String name;
    private OwnerType type;

    public String getName() {
        return name;
    }
    public Owner(String name, OwnerType type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(){}

    public OwnerType getType() {
        return type;
    }

    public void setType(OwnerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return getName().equals(owner.getName()) && getType() == owner.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType());
    }
}

