import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        MyPojo myPojo = new MyPojo();

        myPojo = mapper.readValue(new URL("http://ipinfo.io/json"), MyPojo.class);

        String city = myPojo.getCity();
        String country = myPojo.getCountry();
        String hostname = myPojo.getHostname();
        String ip = myPojo.getIp();
        String local = myPojo.getLoc();
        String org = myPojo.getOrg();
        String timezone = myPojo.getTimezone();
        String readme = myPojo.getReadme();
        String region = myPojo.getRegion();
        String postal = myPojo.getPostal();

        System.out.println("ip: " + ip);
        System.out.println("hostname: " + hostname);
        System.out.println("timezone: " + timezone);
        System.out.println("country: " + country);
        System.out.println("city: " + city);
        System.out.println("region: " + region);
        System.out.println("postal: " + postal);
        System.out.println("localization: " + local);
        System.out.println("organization: " + org);
        System.out.println("readme: " + readme);
    }
}
