package hu.ibello.demo;

import hu.ibello.core.Name;

public enum Languages {

    @Name("english")
    ENGLISH,

    @Name("magyar")
    HUNGARIAN;

    @Override
    public String toString() {
        return EnumTools.toString(this);
    }

}
