package hu.ibello.demo.model;

import hu.ibello.core.Description;
import hu.ibello.data.Model;

@Model
@Description("Test data for ordering with existing user")
public class ExistingUserData {

    private String nameOrEmail;

    @Description("If null: the valid password from the configuration will be used")
    private String invalidPwd;

    @Description("It is used to identify testdata.")
    private String id;

    public String getNameOrEmail() {
        return nameOrEmail;
    }

    public String getInvalidPwd() {
        return invalidPwd;
    }

    @Override
    public String toString() {
        if (id != null) {
            return id;
        }
        return "No given id";
    }

}
