package com.gamefactory.components;

import com.gamefactory.displayable.Component;
import com.gamefactory.displayable.ComponentManager;
/**
 * Component permettant de gérer les effets de la gravité sur l'objet.
 * 
 * @author Pascal Luttgens
 *
 * @version 1.0
 *
 * @since 1.0
 */
public class RigidBody extends Component {
    
    private float gravity = 0;

    public RigidBody(ComponentManager owner) {
        super(owner);
    }
    

    public float getGravity() {
        return this.gravity;
    }
    
    public void setGravity(float gravity) {
        this.gravity = gravity;
    }
 
    @Override
    public void update() {
        
    }

}
