import behavioral.state.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.render();
        trafficLight.next();
        trafficLight.render();
        trafficLight.next();
        trafficLight.render();
        trafficLight.next();
        trafficLight.render();
    }
}