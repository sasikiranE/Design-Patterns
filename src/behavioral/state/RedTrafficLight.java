package behavioral.state;

public class RedTrafficLight implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        System.out.println("READY!");
        trafficLight.setTrafficLightState(new YellowTrafficLight());
    }

    @Override
    public void render() {
        System.out.println("❤️");
    }
}
