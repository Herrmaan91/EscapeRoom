package org.example;

public enum Choice {
    WINDOW(1),
    KEY(2),
    DOOR(3);

    private int selection;

    Choice(int selection) {
        this.selection = selection;
    }

    public int getSelection() {
        return selection;
    }
}
