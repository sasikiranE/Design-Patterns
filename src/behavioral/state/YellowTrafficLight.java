package behavioral.state;

public class YellowTrafficLight implements TrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        System.out.println("GO!");
        trafficLight.setTrafficLightState(new GreenTrafficLight());
    }

    @Override
    public void render() {
        System.out.println("💛");
    }
}
