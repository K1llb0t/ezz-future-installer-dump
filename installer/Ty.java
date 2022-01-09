/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.o;
import net.futureclient.installer.pQ;
import net.futureclient.installer.pi;
import net.futureclient.installer.v1;
import net.futureclient.installer.v6;
import net.futureclient.installer.vy;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Ty
implements o {
    private static final /* synthetic */ String a;

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        long l2 = wu.a(3878582845057331402L, -57608417111928447L, MethodHandles.lookup().lookupClass()).a(54557491743819L) ^ 0x4928B7B1CCA8L;
        Cipher cipher = Cipher.getInstance(v1.C("`&Za\u000fIP{L\u0010Z\r+\tx:`* n"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(v6.C("%h\u001f"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                a = Ty.a(cipher.doFinal(v1.C("'\u0094\u00a0\u001d*^\u00cb\u0082").getBytes(v6.C("x\u0003ijB#5X\u0000}")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object z(Object[] object) {
        Object object2;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                Object object3 = object;
                object = (pi)object[0];
                l4 = (Long)object3[1];
                long l5 = l4 ^ 0x6DB56A4D0B5DL;
                l3 = l4 ^ 0x235D8D14DF29L;
                l2 = l4 ^ 0x2AC4E02CC589L;
                long l6 = l4 ^ 0x655CE76D0C92L;
                CallSite callSite = ye.a("G", (long)1906775527106967317L, (long)l4);
                Object[] arrobject = new Object[1];
                arrobject[0] = l6;
                Object[] arrobject2 = new Object[2];
                arrobject2[1] = l5;
                arrobject2[0] = a;
                object2 = object = (pi)((Object)ye.a("j", (Object)((pQ)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)1773137564975926233L, (long)l4))), (Object)arrobject2, (long)1782213908271784098L, (long)l4));
                try {
                    if (callSite == null) break block4;
                    if (object2 != null) break block5;
                    return null;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)1743653498541875981L, (long)l4));
                    }
                    catch (RuntimeException runtimeException2) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)1743653498541875981L, (long)l4));
                    }
                }
            }
            object2 = object;
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        object = (String)((Object)ye.a("j", (Object)object2, (Object)arrobject, (long)1774099484431331553L, (long)l4));
        return new vy(l2, (String)object);
    }

    private /* synthetic */ Ty() {
    }

    public /* synthetic */ Ty(byte by) {
        this();
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
}

