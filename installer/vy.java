/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.N8;
import net.futureclient.installer.Na;
import net.futureclient.installer.TW;
import net.futureclient.installer.pQ;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public class vy {
    public final /* synthetic */ TW D;
    private static final /* synthetic */ String b;
    private final /* synthetic */ String h;
    private final /* synthetic */ pQ O;
    private static final /* synthetic */ long a;

    private static /* synthetic */ String a(byte[] this_) {
        int n2;
        int n3 = 0;
        int n4 = this_.length;
        char[] arrc = new char[n4];
        int n5 = n2 = 0;
        while (n5 < n4) {
            char c2;
            int n6 = 0xFF & this_[n2];
            if (n6 < 192) {
                arrc[n3++] = (char)n6;
            } else if (n6 < 224) {
                c2 = (char)((char)(n6 & 0x1F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            } else if (n2 < n4 - 2) {
                c2 = (char)((char)(n6 & 0xF) << 12);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            }
            n5 = ++n2;
        }
        return new String(arrc, 0, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(2250660956442171876L, -6332730111283341067L, MethodHandles.lookup().lookupClass()).a(1023658577077L);
        long l2 = a ^ 0x77CBE5F3AC47L;
        Cipher cipher = Cipher.getInstance(Na.C("i\u0017yz|\u0002qbb\u0006x\u0017\u0019\u0003\u0011kL>I?"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = vy.a(cipher.doFinal(Na.C("\u0096\"\u008d\u0007'\u00b3\u00ef\u00a8\u00ea\u0091V\u00a5\u00f7'\u00f4\u00b7\u00cf>\u00f6\u00846}(\u008b\u00d1\u00a6\u00fa\u00af\u00cf\u0092-\u0091").getBytes(N8.C("\u0003P\u0002)r;b'0e")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    public /* synthetic */ vy(long l22, String string) {
        long l22 = a ^ l22;
        String[] arrstring = (String[])ye.a("j", string, (Object)N8.C("n"), (long)9053408692143063947L, (long)l22);
        try {
            if (arrstring.length != 3) {
                Object[] arrobject = new Object[1];
                arrobject[0] = string;
                throw new IllegalArgumentException((String)((Object)ye.a("G", b, (Object)arrobject, (long)9034115085199328573L, (long)l22)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)8948203373336030379L, (long)l22));
        }
        this.D = new TW(arrstring[0], arrstring[1], arrstring[2]);
    }

    private static /* synthetic */ IllegalArgumentException a(IllegalArgumentException this_) {
        return this_;
    }
}

