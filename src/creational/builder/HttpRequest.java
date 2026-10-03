package creational.builder;

/*
building an HTTP request client.
An HttpRequest has:
    Required:
    - url
    - method
Optional:
    - headers
    - body
    - timeout
    - retry count
    - authentication token
    - follow redirects
    - cache control
 */

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final String body;
    private final int timeout;
    private final int retries;
    private final String authToken;
    private final boolean followRedirects;
    private final String cacheControl;

    public String getCacheControl() {
        return cacheControl;
    }

    public boolean isFollowRedirects() {
        return followRedirects;
    }

    public String getAuthToken() {
        return authToken;
    }

    public int getRetries() {
        return retries;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }


    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = Map.copyOf(builder.headers);
        this.body = builder.body;
        this.timeout = builder.timeout;
        this.retries = builder.retries;
        this.authToken = builder.authToken;
        this.followRedirects = builder.followRedirects;
        this.cacheControl = builder.cacheControl;
    }


    public static class Builder {
        private final String url;
        private final String method;
        private Map<String, String> headers = new HashMap<>();
        private String body;
        private int timeout;
        private int retries;
        private String authToken;
        private boolean followRedirects;
        private String cacheControl;

        public Builder(String url, String method) {
            this.url = url;
            this.method = method;
        }

        public Builder header(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder retries(int retries) {
            this.retries = retries;
            return this;
        }

        public Builder authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

        public Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }

    }
}
