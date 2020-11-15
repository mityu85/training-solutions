package stringmethods.url;

import java.util.ArrayList;
import java.util.List;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {

        protocol = setProtocol(url);
        port = setPort(url);
        host = setHost(url);
        path = setPath(url);
        query = setQuery(url);
    }

    private String setProtocol(String url) {
        String[] s = url.split(":");
        if (s[0].isEmpty()) {
            throw new IllegalArgumentException("Protocol is missing!");
        }
        return s[0].toLowerCase();
    }

    private Integer setPort(String url) {
        String[] s = url.split("[.]");
        int i = s.length-1;
        if (s[i].contains(":")) {
            String[] s1 = s[i].split(":");
            String port = s1[0];
            return Integer.valueOf(port);
        }
       return null;
    }

    private String setHost(String url) {
        String[] s = url.split("[/]");
        if (url.toLowerCase().startsWith("https://") || (url.toLowerCase().startsWith("http://"))) {
            return s[2].toLowerCase();
        }
        throw new IllegalArgumentException("Illegal Host!");
    }

    private String setPath(String url) {
        String[] s = url.split("[.]");
        int i = s.length-1;
        if (s[i].contains("/")) {
            String[] s1 = s[i].split("/");
            List<String> path = new ArrayList<>();
            if (s[i].contains("query")) {
                for (int j = 1; j < s1.length-1; j++) {
                    path.add(s1[j]);
                }
                return "/" + String.join("/", path) + "/query";
            } else {
                for (int j = 1; j < s1.length; j++) {
                    path.add(s1[j]);
                }
                return "/" + String.join("/", path);
            }
        }
        return "";
    }

    private String setQuery(String url) {
        if (url.contains("/?")) {
            String[] s = url.split("/?");
            return s[1];
        }
        return "";
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        if (key.isBlank() || key == null) {
            throw new IllegalArgumentException("Illegal Argument!");
        }
        if (query.contains(key)) {
            return true;
        }
        return false;
    }

    public String getProperty(String key) {
        if (key.isBlank() || key == null) {
            throw new IllegalArgumentException("Illegal Argument!");
        }
        if (hasProperty(key)) {
            String[] s = query.split("key");
            if (s[1].contains("/&")) {
                String[] s1 = s[1].split("/&");
                return key + s1[0];
            } else {
                return key + s[1];
            }
        }
        return "";
    }
}
