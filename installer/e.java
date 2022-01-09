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
import net.futureclient.installer.NH;
import net.futureclient.installer.pe;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class e
extends Enum {
    public static final /* synthetic */ e c;
    public static final /* synthetic */ e i;
    public static final /* synthetic */ e j;
    public static final /* synthetic */ e b;
    private static final /* synthetic */ long k;
    public static final /* synthetic */ e d;
    public static final /* synthetic */ e e;
    public static final /* synthetic */ e g;
    public static final /* synthetic */ e a;
    public static final /* synthetic */ e h;
    public static final /* synthetic */ e f;
    private static final /* synthetic */ e[] W;

    public static /* synthetic */ e[] values(long this_) {
        this_ = k ^ this_;
        return (e[])((e[])ye.a("Z", (long)-1430293101701618817L, (long)this_)).clone();
    }

    public static /* synthetic */ e valueOf(long this_2, String string) {
        long this_2 = k ^ this_2;
        return (e)((Object)ye.a("G", e.class, (Object)string, (long)7855479406307424868L, (long)this_2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        net.futureclient.installer.e.k = wu.a(1790567683198974058L, -2597542703541105928L, MethodHandles.lookup().lookupClass()).a(83047552775148L);
        var8 = net.futureclient.installer.e.k ^ 135248978887830L;
        var1_1 = Cipher.getInstance(pe.C("bJh=\u007fWj/tFg^\u0018T[w\u0002&Cc"));
        v0 = SecretKeyFactory.getInstance(NH.C("h#5"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var8 >>> 56);
        v3 = var2_2 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var2_2++;
            v2[v4] = (byte)(var8 << v4 * 8 >>> 56);
            v3 = var2_2;
        }
        var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var7_3 = new String[10];
        var5_4 = 0;
        var4_5 = pe.C("\u00a6D\\\u00a3~\u008c\u0085wn\u00c0\u00f3\u008a\u0090\u0016\u00c3$\u0005 \u0016\u0013W\u0088\u001e\t+d\u001a\u00e6\u008b\u00a1\u001b\u00db\u008e;n\u00e5B \u00e6\u00a80vp\u0014P\u00c8\u00f2\u00c6\u0016\u00cf\f3\u00d6\u0005\u00cc\u00a0\u009e\u00fa\u00e3,\u00ba\n2\u00d0\u0081ep:\u00fd\u00e2\u0089\u00bf\u00b2y\u00d2Z\u0007G\u0086\u00b7$\u00c8uX{3\r\u00e4h8\u00b0d\u0001\u00bd\u0005\u0095\u00b6\u00dc{FjmH");
        var6_6 = var4_5.length();
        var3_7 = 16;
        var2_2 = -1;
        block4: while (true) {
            v5 = ++var2_2;
            v6 = var4_5.substring(v5, v5 + var3_7);
            v7 = -1;
            ** GOTO lbl71
            {
                var4_5 = NH.C("-\u00ba\u008a{\u008c\u00c7\u0082\u008b-J\u00d9t\u00aa3\u00b0Vb[\u00c4\u00df\\`nt8");
                var6_6 = var4_5.length();
                var3_7 = 8;
                var2_2 = -1;
                while (true) {
                    v8 = ++var2_2;
                    v6 = var4_5.substring(v8, v8 + var3_7);
                    v7 = 0;
lbl71:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = net.futureclient.installer.e.a(var1_1.doFinal(v6.getBytes(pe.C("m^b)\u0002+Sv\u00005")))).intern();
                            if ((var2_2 += var3_7) >= var6_6) continue block5;
                            var3_7 = var4_5.charAt(var2_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = net.futureclient.installer.e.a(var1_1.doFinal(v6.getBytes(pe.C("m^b)\u0002+Sv\u00005")))).intern();
                    if ((var2_2 += var3_7) >= var6_6) {
                        var0_8 = var7_3;
                        net.futureclient.installer.e.a = new e(var0_8[2], 0);
                        net.futureclient.installer.e.b = new e(var0_8[4], 1);
                        net.futureclient.installer.e.c = new e(var0_8[0], 2);
                        net.futureclient.installer.e.d = new e(var0_8[1], 3);
                        net.futureclient.installer.e.e = new e(var0_8[6], 4);
                        net.futureclient.installer.e.f = new e(var0_8[8], 5);
                        net.futureclient.installer.e.g = new e(var0_8[5], 6);
                        net.futureclient.installer.e.h = new e(var0_8[7], 7);
                        net.futureclient.installer.e.i = new e(var0_8[3], 8);
                        net.futureclient.installer.e.j = new e(var0_8[9], 9);
                        v9 = new e[10];
                        v9[0] = (e)ye.a("Z", (long)7190562666120398123L, (long)var8);
                        v9[1] = (e)ye.a("Z", (long)6920595945454087103L, (long)var8);
                        v9[2] = (e)ye.a("Z", (long)7137013882718864823L, (long)var8);
                        v9[3] = (e)ye.a("Z", (long)7009759331669799236L, (long)var8);
                        v9[4] = (e)ye.a("Z", (long)7010783465799550085L, (long)var8);
                        v9[5] = (e)ye.a("Z", (long)7004676797357217848L, (long)var8);
                        v9[6] = (e)ye.a("Z", (long)6926679891022704143L, (long)var8);
                        v9[7] = (e)ye.a("Z", (long)6988795759412142244L, (long)var8);
                        v9[8] = (e)ye.a("Z", (long)6974755133811127269L, (long)var8);
                        v9[9] = (e)ye.a("Z", (long)6936234898234497754L, (long)var8);
                        net.futureclient.installer.e.W = v9;
                        return;
                    }
                    var3_7 = var4_5.charAt(var2_2);
                }
            }
            break;
        }
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
}

