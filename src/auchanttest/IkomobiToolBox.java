package auchanttest;

public class IkomobiToolBox {
    public static final String sepPath = "/";

    public static native String CryptString(String str, int i, byte[] bArr);

    public static native String fulltext_it_by_string(String str, String[] strArr, String[] strArr2, String str2);

    static {
    	System.loadLibrary("c");
    	System.loadLibrary("log");
    	
        System.loadLibrary("IkomobiToolBoxJni");
        //System.loadLibrary("log");
        //sepPath = PatchClientJni.isWindows() ? PatchClientJni.sepPathWin : PatchClientJni.sepPathUnixMac;
    }
}
