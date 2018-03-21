package main.java.Agents;

public class Ability {

    enum Type {
        PhysicalDamaging,
        MagicalDamaging,
        Healing,
        StatusAffect
    }

    private Type abilityType;
    private String name;

    public Type getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(Type abilityType) {
        this.abilityType = abilityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
