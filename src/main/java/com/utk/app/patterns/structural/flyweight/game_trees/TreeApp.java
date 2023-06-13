package com.utk.app.patterns.structural.flyweight.game_trees;

public class TreeApp {

    public static void main(String[] args) {
        Tree oakTree = new Tree(10, "Green", new byte[100], TreeType.OAK);
        Tree banyanTree = new Tree(12, "Green", new byte[100], TreeType.BANYAN);

        GraphicTree graphicOakTree1 = new GraphicTree(100.0, 120.1, oakTree);
        GraphicTree graphicOakTree2 = new GraphicTree(100.3, 120.3, oakTree);
        GraphicTree graphicBanyanTree = new GraphicTree(100.3, 120.3, banyanTree);

        System.out.println(graphicOakTree1.getTree() == graphicOakTree2.getTree());

        FlyWeightRegistry registry = new FlyWeightRegistry();
        registry.add(TreeType.OAK, graphicOakTree1);
        registry.add(TreeType.BANYAN, graphicBanyanTree);
    }
}
