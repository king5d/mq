package ceshi;

public class TestMain {
	  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
          
        //  
        System.out.println("***MAC地址***");  
        MacUtils.getMac();  
        //  
        String sn = DiskUtils.getSerialNumber("C");   
        System.out.println("***硬盘编号***");  
        System.out.println(sn);   
  
    }  
  
}
