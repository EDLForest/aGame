package main.java.Agents.Abilities;

import main.java.Agents.Agent;

public class Attack extends Action {

    private Agent invoker;
    private Agent target;
    private Ability ability;

    /**
     * Simply reduce the HP by the damage of the ability for now
     */
    @Override
    public void execute() {
        target.setHP(target.getHP()- ((DamagingAbility)ability).getDamage());
    }
}
