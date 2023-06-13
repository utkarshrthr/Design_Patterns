package com.utk.app.patterns.structural.flyweight.game_trees;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightRegistry {

    private Map<TreeType, GraphicTree> registry = new HashMap<>();

    public void add(TreeType treeType, GraphicTree graphicTree){
        registry.put(treeType, graphicTree);
    }

    public GraphicTree get(TreeType  type){
        return registry.get(type);
    }
}
