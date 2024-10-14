
import org.prog.dto.*;

public class Main {
    public static void main(String[] args) {

        NameDto name = new NameDto("Mrs", "Jeanette", "Cook");
        Street street = new Street(3300, "Robinson Rd");
        Coordinates coordinates = new Coordinates("84.4045", "90.1233");
        Timezone timezone = new Timezone("-3:30", "Newfoundland");
        Location location = new Location(street, "Fort Worth", "Kansas", "United States", 11911, coordinates, timezone);

        UserDto user = new UserDto("female", "US", name, location);


        System.out.println(user);
    }
}
