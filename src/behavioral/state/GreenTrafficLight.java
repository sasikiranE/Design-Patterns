package behavioral.state;

public class GreenTrafficLight implements TrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        System.out.println("STOP!");
        trafficLight.setTrafficLightState(new RedTrafficLight());
    }

    @Override
    public void render() {
        System.out.println("💚");
    }
}
