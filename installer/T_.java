/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NN;
import net.futureclient.installer.Nd;
import net.futureclient.installer.TW;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class T_
implements Serializable,
Nd {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String b;
    private /* synthetic */ Object H;

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x4DAA0223CAABL;
        Object[] arrobject = new Object[1];
        arrobject[0] = ye.a("\u00c3", (Object)this, (long)-6516682925222181866L, (long)l2);
        return (int)ye.a("G", (Object)arrobject, (long)-6572371276668770550L, (long)l2);
    }

    @Override
    public final /* synthetic */ Object get() {
        long l2 = a ^ 0x3799B0400CF5L;
        return ye.a("\u00c3", (Object)this, (long)7191805895689667144L, (long)l2);
    }

    public final /* synthetic */ boolean equals(Object object) {
        boolean bl;
        block2: {
            block3: {
                long l2 = a ^ 0x23FDFC958F92L;
                long l3 = l2 ^ 0x4F8130B8AE82L;
                CallSite callSite = ye.a("G", (long)-2195979246262055707L, (long)l2);
                try {
                    bl = object instanceof T_;
                    if (callSite == null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-2301113015600588170L, (long)l2));
                }
                object = (T_)object;
                Object[] arrobject = new Object[3];
                arrobject[2] = ye.a("\u00c3", (Object)object, (long)-2258140422516702929L, (long)l2);
                arrobject[1] = ye.a("\u00c3", (Object)this, (long)-2258140422516702929L, (long)l2);
                arrobject[0] = l3;
                return (boolean)ye.a("G", (Object)arrobject, (long)-2062847468458483660L, (long)l2);
            }
            bl = false;
        }
        return bl;
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x67A93AF0FA34L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(b), (Object)ye.a("\u00c3", (Object)this, (long)-7705872906821798775L, (long)l2), (long)-7655831316002098801L, (long)l2))), (Object)NN.C("3"), (long)-7586876809914690046L, (long)l2))), (long)-7684574636351917587L, (long)l2));
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(3890843946007879168L, -3896734378697778660L, MethodHandles.lookup().lookupClass()).a(228966883302953L);
        long l2 = a ^ 0x7EDF3581F3A6L;
        Cipher cipher = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOe8d="));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(NN.C("Mk\u0010"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = T_.a(cipher.doFinal(TW.C("Y\u0095W_d\u00fc\u00d5\r\u000b*\u0082)\u00f3E\u00b0\u0005  \u00f5Va\u0093V\u0002").getBytes(NN.C("0G1>A,Q0\u0003r")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    public /* synthetic */ T_(Object object) {
        this.H = object;
    }
}

