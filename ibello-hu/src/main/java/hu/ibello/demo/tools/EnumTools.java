package hu.ibello.demo.tools;

import hu.ibello.core.Name;

import java.lang.reflect.Field;

public class EnumTools {

    public static <E extends Enum<?>> String toString(E item) {
        try {
            Field field = item.getClass().getField(item.name());
            Name name = field.getAnnotation(Name.class);
            if (name != null) {
                return name.value();
            }
        } catch (Exception e) {
            // impossible error :-)
            e.printStackTrace();
        }
        return item.name();
    }
}
