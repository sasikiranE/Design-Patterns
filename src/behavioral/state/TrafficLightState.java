package behavioral.state;

public interface TrafficLightState {
    void next(TrafficLight trafficLight);
    void render();
}
