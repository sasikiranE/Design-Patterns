package behavioral.state;

public class TrafficLight {

    private TrafficLightState trafficLightState = new GreenTrafficLight();

    public void next() {
        trafficLightState.next(this);
    }

    public void render() {
        trafficLightState.render();
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }
}
