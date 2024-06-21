import java.util.UUID;

public class Check {

    public boolean isValidUUID(final String input) {
        try {
            UUID.fromString(input);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
