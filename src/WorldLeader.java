public class WorldLeader {
    private static WorldLeader instance;

    private WorldLeader() {}

    public static WorldLeader getinstance() {
        if (instance == null) {
            instance = new WorldLeader();
        }
        return instance;
    }

    public void makeSpeech(String message) {
        System.out.println(message);
    }
}
