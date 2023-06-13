package com.utk.app.patterns.structural.flyweight.game_trees;

public class Tree {

    private int height;
    private String color;
    private byte[] image;
    private TreeType type;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public TreeType getType() {
        return type;
    }

    public void setType(TreeType type) {
        this.type = type;
    }

    public Tree(int height, String color, byte[] image, TreeType type) {
        this.height = height;
        this.color = color;
        this.image = image;
        this.type = type;
    }
}
