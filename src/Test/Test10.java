package Test;

public class Test10 {
    public static void main(String[] args) {
        String ftpFile = "http://ftp-dev.ibaimi.net:80/baimi/waybill/JX71_461458446.txt";
        int i = ftpFile.lastIndexOf("/");
        System.out.println("i = " + i);
        System.out.println("ftpFile.substring(42) = " + ftpFile.substring(ftpFile.lastIndexOf("/")+1));


    }
}
