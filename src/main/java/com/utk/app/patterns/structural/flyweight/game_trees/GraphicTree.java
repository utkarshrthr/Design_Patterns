package com.utk.app.patterns.structural.flyweight.game_trees;

public class GraphicTree {

    private Double x;
    private Double y;
    private Tree tree;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public GraphicTree(Double x, Double y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }
}
