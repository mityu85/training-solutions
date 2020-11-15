package stringmethods.url;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UrlManagerTest {

    @Test
    public void testCreate() {

        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("/fdsnws/event/1/query", urlManager.getPath());
        assertNull(urlManager.getPort());
    }

}
