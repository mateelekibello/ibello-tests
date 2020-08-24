package hu.ibello.demo.model;

import hu.ibello.core.Name;
import hu.ibello.demo.EnumTools;

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
