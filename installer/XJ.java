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
import net.futureclient.installer.J;
import net.futureclient.installer.X2;
import net.futureclient.installer.Xb;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class XJ
extends X2 {
    private static final /* synthetic */ String e;

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        long l2 = wu.a(2224604084055860273L, -402796407567437832L, MethodHandles.lookup().lookupClass()).a(16855922526946L) ^ 0x568C9FAC12B1L;
        Cipher cipher = Cipher.getInstance(J.C("`\u000eev\u0003m\\_@4V)'-t\u001el\u000e,J"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Xb.C("\u001d\u0019\u0018"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                e = XJ.b(cipher.doFinal(J.C("\u00b28\u001fA\u00b9\u00c5\u00d9\u00b6\u00d3\u00fcL\u00dc\u00da1\u00ed\u0018\u0096\u00c1\u00f7\u0091\u00db`\u0093\u008b").getBytes(Xb.C(":7+^\u0000\u0017{`qz")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    @Override
    public final /* synthetic */ Object Y(Object[] object) {
        Object[] arrobject = object;
        object = (Class)object[0];
        long l2 = (Long)arrobject[1];
        throw new UnsupportedOperationException((String)((Object)ye.a("j", e, (Object)((String)((Object)ye.a("G", (Object)object, (long)337552487067744964L, (long)l2))), (long)322601666509687672L, (long)l2)));
    }

    private static /* synthetic */ String b(byte[] this_) {
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
}

