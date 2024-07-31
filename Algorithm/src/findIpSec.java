public class findIpSec {
    public static void main(String[] args) {
//        String ip1 = "190.100.255.5";
//        String ip2 = "190.200.255.10";
//        String ip1 = "100.200.8.0";
//        String ip2 = "100.200.10.255";
        String ip1 = "190.100.255.5";
        String ip2 = "190.200.255.10";

        // Convert IP addresses to long
        long ip1Long = ipToLong(ip1);
        long ip2Long = ipToLong(ip2);

        // Calculate the number of IP addresses between the two
        long difference = ip2Long - ip1Long;

        // Print the result
        System.out.println("Number of IP addresses between " + ip1 + " and " + ip2 + ": " + difference);

    }
    public static long ipToLong(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        long ipLong = 0;

        // Convert each octet and add it to the final value
        ipLong += Long.parseLong(octets[0]) * (256 * 256 * 256);
        ipLong += Long.parseLong(octets[1]) * (256 * 256);
        ipLong += Long.parseLong(octets[2]) * 256;
        ipLong += Long.parseLong(octets[3]);

        return ipLong;
    }
}




