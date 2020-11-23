/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physics;

import org.engine.GameLoop;
import org.world.GameObject;

/**
 *
 * @author ASUS
 */
public class SupportReaction extends Force{

    @Override
    public void impactOn(GameObject go) {
        ForceVector reaction_vector = new ForceVector(0, 0);
        reaction_vector.setX(-go.getMass()*go.getSpeedX());
        reaction_vector.setY(-go.getMass()*go.getSpeedY());
        go.setForceSuperposition(go.getForceSuperposition().add(reaction_vector));
    }

    @Override
    public void react(GameObject go1, GameObject go2) {
    }
    
}
