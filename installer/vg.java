/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.Eh;
import net.futureclient.installer.L;
import net.futureclient.installer.X7;
import net.futureclient.installer.e;
import net.futureclient.installer.h;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class vg
extends vA {
    private static final /* synthetic */ String b;
    private static final /* synthetic */ long a;

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(8916103200242464604L, -6950436555287195387L, MethodHandles.lookup().lookupClass()).a(215102881863138L);
        long l2 = a ^ 0x512C78A00FF4L;
        Cipher cipher = Cipher.getInstance(X7.C("o8iC\"u}Ga,w1\u00065U\u0006M\u0016\rR"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Eh.C("\u0004bY"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = vg.a(cipher.doFinal(X7.C("\u00fc\u0095k\u00f2Za\u00c6\u0094").getBytes(Eh.C("9\u000e8wHeXy\n;")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void Z(Object[] object) {
        String string;
        long l2;
        long l3;
        L l4;
        block6: {
            Object object2;
            block4: {
                block5: {
                    l4 = (L)object[0];
                    l3 = (Long)object[1];
                    object = object[2];
                    l2 = l3 ^ 0x1F239A2408EEL;
                    CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l3);
                    object2 = object = (URI)object;
                    try {
                        if (callSite == null) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (h h2) {
                        try {
                            throw (Exception)((Object)ye.a("G", (Object)h2, (long)8353141950872842837L, (long)l3));
                        }
                        catch (h h3) {
                            throw (Exception)((Object)ye.a("G", (Object)h3, (long)8353141950872842837L, (long)l3));
                        }
                    }
                    string = null;
                    break block6;
                }
                object2 = object;
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)8304527772312183820L, (long)l3));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l2;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l4, (Object)arrobject, (long)8326898731959281976L, (long)l3));
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

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x7D791EAD2DA3L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (URI)((Object)ye.a("G", (Object)arrobject2, (long)8465541731586483041L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ URI j(Object[] this) {
        block10: {
            var3_1 = (vM)this[0];
            var1_3 = (Long)this[1];
            var1_3 = vg.a ^ var1_3;
            var4_4 = var1_3 ^ 64262114100353L;
            var6_5 = var1_3 ^ 35220285296964L;
            var8_6 = var1_3 ^ 119211534460556L;
            var10_7 = ye.a("G", (long)-7797933946698596693L, (long)var1_3);
            try {
                v0 = var3_1;
                if (var10_7 == null) ** GOTO lbl52
                v1 = new Object[1];
                v1[0] = var4_4;
                if ((e)ye.a("j", (Object)v0, (Object)v1, (long)-7969506104486642955L, (long)var1_3) != (e)ye.a("Z", (long)-7892553617442602666L, (long)var1_3)) break block10;
                v2 = var3_1;
                ** GOTO lbl36
            }
            catch (URISyntaxException v3) {
                try {
                    throw (Exception)ye.a("G", (Object)v3, (long)-7867733309573131415L, (long)var1_3);
                }
                catch (URISyntaxException v4) {
                    throw (Exception)ye.a("G", (Object)v4, (long)-7867733309573131415L, (long)var1_3);
                }
lbl36:
                // 2 sources

                v5 = new Object[1];
                v5[0] = var8_6;
                ye.a("j", (Object)v2, (Object)v5, (long)-7965788556542869704L, (long)var1_3);
                return null;
            }
        }
        try {
            v0 = var3_1;
lbl52:
            // 2 sources

            v6 = new Object[1];
            v6[0] = var6_5;
            var3_1 = (String)ye.a("j", (Object)v0, (Object)v6, (long)-7877454784033255317L, (long)var1_3);
            try {
                if (ye.a("j", vg.b, (Object)var3_1, (long)-7987479302490559707L, (long)var1_3) == false) return new URI((String)var3_1);
                return null;
            }
            catch (URISyntaxException v7) {
                throw (Exception)ye.a("G", (Object)v7, (long)-7867733309573131415L, (long)var1_3);
            }
        }
        catch (URISyntaxException var3_2) {
            throw new h(var3_2);
        }
    }

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }
}

