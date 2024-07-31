public class FindIp {
    public static void main(String[] args) {
//        String startIp = "100.200.8.0";
//        String endIp = "100.200.10.255";
        String startIp = "190.100.255.5";
        String endIp = "190.200.255.10";

        String[] ip1 = startIp.split("\\.");
        String[] ip2 = endIp.split("\\.");
        long ipAddress = 0;
        for(int i=0 ; i<ip1.length ; i++){
            long diff = Math.abs(Integer.parseInt(ip1[i]) - Integer.parseInt(ip2[i]));
            if(diff != 0){
                switch (i){
                    case 0:
                        ipAddress += (diff * 255 * 255 * 255);
                        break;
                    case 1:
                        ipAddress += (diff * 255 * 255);
                        break;
                    case 2:
                        ipAddress += (diff * 255);
                        break;
                    case 3:
                        ipAddress += diff;
                        break;
                }
            }
            else continue;
        }
        System.out.println(ipAddress);
    }

}
