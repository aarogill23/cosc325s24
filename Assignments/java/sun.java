public class sun extends CelestialBodyImpl{
    public sun(String name, double x, double y, float movementBehavior, float degreesRotated) {
        super(name, x, y, movementBehavior, degreesRotated);
    }
    public String getName() {
        return "Sun";
    }
    public String getPosition() {
        return "Center";
    }
    public float getMovementBehavior() {
        return 0.0f;
    }

    public float getDegreesRotated() {
        return 0.0f;
    }
}
