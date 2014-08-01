package com.jcloisterzone.action;

import com.jcloisterzone.LittleBuilding;
import com.jcloisterzone.rmi.RmiProxy;
import com.jcloisterzone.ui.grid.GridLayer;
import com.jcloisterzone.ui.grid.layer.LittleBuildingActionLayer;

public class LittleBuildingAction extends PlayerAction<LittleBuilding> {

    public LittleBuildingAction() {
        super("building");
    }

    @Override
    protected GridLayer createGridLayer() {
        return new LittleBuildingActionLayer(client.getGridPanel(), client.getGame().getCurrentTile().getPosition(), this);
    }

    @Override
    public void perform(RmiProxy server, LittleBuilding target) {
       server.placeLittleBuilding(target);
    }

}