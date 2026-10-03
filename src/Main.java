import creational.builder.HttpRequest;

public class Main {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder(
                "https://api.example.com/users",
                "POST"
        )
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer abc123")
                .body("{\"name\":\"Sasi\"}")
                .timeout(5000)
                .retries(3)
                .authToken("abc123")
                .followRedirects(true)
                .cacheControl("no-cache")
                .build();

        System.out.println(request.getUrl());
        System.out.println(request.getMethod());
        System.out.println(request.getHeaders());
        System.out.println(request.getBody());
        System.out.println(request.getTimeout());
        System.out.println(request.getRetries());
        System.out.println(request.getAuthToken());
        System.out.println(request.isFollowRedirects());
        System.out.println(request.getCacheControl());
    }
}