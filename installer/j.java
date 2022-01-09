/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.J;
import net.futureclient.installer.Xb;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class j
extends OutputStream {
    private static final /* synthetic */ String b;
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ void write(int n2) {
    }

    @Override
    public final /* synthetic */ void write(byte[] arrby, int n2, int n3) {
        long l2 = a ^ 0x2CAC91CECEA8L;
        long l3 = l2 ^ 0x481CAFA8C674L;
        Object[] arrobject = new Object[2];
        arrobject[1] = arrby;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)6463559933579910420L, (long)l2);
    }

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

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x787B1805DD8DL;
        return b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-6747963472284583597L, 4726248796695401210L, MethodHandles.lookup().lookupClass()).a(217777814860967L);
        long l2 = a ^ 0x3B544E7D449CL;
        Cipher cipher = Cipher.getInstance(J.C("\u0016xEV\u0003m\\_@4V)'-t\u001el\u000e,J"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Xb.C("k98"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = j.a(cipher.doFinal(J.C("z\u00e8\u00faI\u00ef\u00fa\u0094\u007f\u00b9\u008c\u00a1A\u00f7\u0013w)\u00ef\u0098\u00f4\u0012\u008ed\u0003\u00929\u00c5\u00d4\f\u00e9+\u00ce\u009c").getBytes(Xb.C("3><I\\K\r\u0016QZ")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    @Override
    public final /* synthetic */ void write(byte[] arrby) {
        long l2 = a ^ 0x59964045A0EDL;
        long l3 = l2 ^ 0x3D267E23A831L;
        Object[] arrobject = new Object[2];
        arrobject[1] = arrby;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)4032508069843907409L, (long)l2);
    }
}

