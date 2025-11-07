import java.util.Scanner;

public class MagicalCreatureFactory {
    public static MagicalCreature create(String creatureType) {
        return switch (creatureType.toLowerCase()) {
            case "dragon" -> new Dragon();
            case "unicorn" -> new Unicorn();
            default -> null;
        };
    }

}
