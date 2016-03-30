package auchanttest;


import auchanttest.IkomobiToolBox;
public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
	    	System.load("/usr/local/liblog.so");
	    } catch (UnsatisfiedLinkError e) {
	      System.err.println("Native code library failed to load.\n" + e);
	      System.exit(1);
	    }*/
		
		String ean = "3033710082919";
		String eanCrypt = IkomobiToolBox.CryptString(ean, 12, new byte[]{(byte) 74, (byte) 113, (byte) -126, (byte) -6, (byte) -2, (byte) -70, (byte) -123, (byte) -121});
		System.out.println(ean);
	}

}
