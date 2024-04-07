public class earth extends CelestialBodyImpl{
    public earth(String name, double x, double y, float movementBehavior, float degreesRotated) {
        super(name, x, y, movementBehavior, degreesRotated);
    }
    private float degreesRotated = 0.0f;

    public String getName() {
        return "Earth";
    }
    public String getPosition() {
        return "Orbiting Sun";
    }
    public float getMovementBehavior() {
        return ((360 / 365));
    }
    public float getDegreesRotated() {
        return degreesRotated;
    }
}
