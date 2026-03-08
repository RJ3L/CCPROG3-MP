package MP3;

public class RoomFactory {
    public static RoomInterface createRoom(String type, String name, Hotel hotel) {
        return switch (type.toLowerCase()) {
            case "standard" -> new StandardRoom(name, hotel);
            case "deluxe" -> new DeluxeRoom(name, hotel);
            case "luxury" -> new LuxuryRoom(name, hotel);
            default -> throw new IllegalArgumentException("Unknown room type: " + type);
        };
    }
}
