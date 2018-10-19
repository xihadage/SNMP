import java.util.ArrayList;
import java.util.List;

public  class Main{
    public static void testGet()
    {
        String ip = "127.0.0.1";
        String community = "public";
        String oidval = "1.3.6.1.2.1.1.6.0";
        SNMP.SnmpData.snmpGet(ip, community, oidval);
    }
    public static void testGetList()
    {
        String ip = "127.0.0.1";
        String community = "public";
        List<String> oidList=new ArrayList<String>();
        oidList.add("1.3.6.1.2.1.1.5.0");
        oidList.add("1.3.6.1.2.1.1.7.0");
        SNMP.SnmpData.snmpGetList(ip, community, oidList);
    }
    public static void testGetAsyList()
    {
        String ip = "127.0.0.1";
        String community = "public";
        List<String> oidList=new ArrayList<String>();
        oidList.add("1.3.6.1.2.1");
        oidList.add("1.3.6.1.2.12");
        SNMP.SnmpData.snmpAsynGetList(ip, community, oidList);
        System.out.println("i am first!");
    }
    public static  void testWalk()
    {
        String ip = "127.0.0.1";
        String community = "public";
        String targetOid = "1.3.6.1.2.1.1.5.0";
        SNMP.SnmpData.snmpWalk(ip, community, targetOid);
    }
    public  static void testAsyWalk()
    {
        String ip = "127.0.0.1";
        String community = "public";
        // 异步采集数据
        SNMP.SnmpData.snmpAsynWalk(ip, community, "1.3.6.1.2.1.25.4.2.1.2");
    }

    public static void testSetPDU() throws Exception
    {
        String ip = "127.0.0.1";
        String community = "public";
        SNMP.SnmpData.setPDU(ip, community, "1.3.6.1.2.1.1.6.0","lize");
    }
    public static void testVersion()
    {
     System.out.println(org.snmp4j.version.VersionInfo.getVersion());
    }
    public static void main(String args[]) throws Exception{
        testVersion();
        testSetPDU();
        testGet();
        testGetList();
        testGetAsyList();
        testWalk();
        }
}
