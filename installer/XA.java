/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.TW;
import net.futureclient.installer.Xb;
import net.futureclient.installer.d;
import net.futureclient.installer.e;
import net.futureclient.installer.pk;
import net.futureclient.installer.vJ;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class XA
extends Xb {
    private static final /* synthetic */ String a;

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
        long l2 = wu.a(5438061354102393370L, -3793973718659060119L, MethodHandles.lookup().lookupClass()).a(32785449115362L) ^ 0x4B412A6EAB2EL;
        Cipher cipher = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOi4z#"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(d.C("K-\u0016"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                a = XA.a(cipher.doFinal(TW.C("\u008f\u0014\u00caE\u00d4\u00ff\u0085mb\u00c2h\u00da\u000e\u0006J\u00e8\u00ce\u00e6\u0098\u009eFO2\u0016\u008f~<\u0001@\u001d\u00ca/").getBytes(d.C("vAw8\u0007*\u00176Et")))).intern();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ void j(Object[] this) {
        block24: {
            block25: {
                block22: {
                    block23: {
                        block20: {
                            block21: {
                                block18: {
                                    block19: {
                                        this = (vM)this /* !! */ [0];
                                        var2_4 = (Long)this /* !! */ [1];
                                        var4_5 = var2_4 ^ 89120225794644L;
                                        v0 = var2_4 ^ 131797754254586L;
                                        var6_6 = (int)(v0 >>> 48);
                                        var7_7 = v0 << 16 >>> 16;
                                        var9_8 = var2_4 ^ 127100530082756L;
                                        var11_9 = var2_4 ^ 14993570557910L;
                                        var13_10 = var2_4 ^ 101474654392046L;
                                        v1 = var2_4 ^ 16673442479204L;
                                        var15_11 = (int)(v1 >>> 48);
                                        var16_12 = (int)(v1 << 16 >>> 32);
                                        var17_13 = (int)(v1 << 48 >>> 48);
                                        var18_14 = var2_4 ^ 58234621717237L;
                                        var20_15 = ye.a("G", (long)1480951516534176238L, (long)var2_4);
                                        try {
                                            v2 /* !! */  = this instanceof vJ;
                                            if (var20_15 == null) break block18;
                                            if (v2 /* !! */  == 0) break block19;
                                        }
                                        catch (IllegalStateException v3) {
                                            throw (IllegalStateException)ye.a("G", (Object)v3, (long)1560520473511960754L, (long)var2_4);
                                        }
                                        this = (vJ)this;
                                        v4 = new Object[3];
                                        v4[2] = (e)ye.a("Z", (long)1494435425523822963L, (long)var2_4);
                                        v4[1] = var7_7;
                                        v4[0] = (int)((short)var6_6);
                                        ye.a("j", (Object)this, (Object)v4, (long)1549157754169847525L, (long)var2_4);
                                        v5 = new Object[1];
                                        v5[0] = var13_10;
                                        var21_16 = (Map.Entry)ye.a("j", (Object)((Iterator)ye.a("j", (Object)this, (Object)v5, (long)1657227317184573157L, (long)var2_4)), (long)1655828972681770882L, (long)var2_4);
                                        v6 = new Object[2];
                                        v6[1] = ye.a("j", (Object)var21_16, (long)1621072390063763120L, (long)var2_4);
                                        v6[0] = var18_14;
                                        ye.a("j", (Object)this, (Object)v6, (long)1612078201993478938L, (long)var2_4);
                                        v7 = new Object[2];
                                        v7[1] = new pk((char)var15_11, var16_12, (String)ye.a("j", (Object)var21_16, (long)1486464324233735155L, (long)var2_4), (short)var17_13);
                                        v7[0] = var18_14;
                                        ye.a("j", (Object)this, (Object)v7, (long)1612078201993478938L, (long)var2_4);
                                        return;
                                    }
                                    v2 /* !! */  = ye.a("\u00c3", (Object)this, (long)1585111246487552456L, (long)var2_4);
                                }
                                v8 = var21_17 = v2 /* !! */ ;
                                try {
                                    if (var2_4 <= 0L || var20_15 == null) break block20;
                                    if (v8 != 0) break block21;
                                }
                                catch (IllegalStateException v9) {
                                    throw (IllegalStateException)ye.a("G", (Object)v9, (long)1560520473511960754L, (long)var2_4);
                                }
                                v10 = new Object[1];
                                v10[0] = var11_9;
                                var21_18 = ye.a("j", (Object)this, (Object)v10, (long)1486533615851968401L, (long)var2_4);
                            }
                            v8 = var21_18;
                        }
                        try {
                            try {
                                v11 = 13;
                                v12 = var20_15;
                                if (var2_4 > 0L) {
                                    if (v12 == null) break block22;
                                    if (v8 != v11) break block23;
                                    v13 = this;
                                }
                                ** GOTO lbl154
                            }
                            catch (IllegalStateException v14) {
                                throw (IllegalStateException)ye.a("G", (Object)v14, (long)1560520473511960754L, (long)var2_4);
                            }
                            ye.a("F", (Object)v13, (int)9, (long)1585111246487552456L, (long)var2_4);
                            return;
                        }
                        catch (IllegalStateException v15) {
                            throw (IllegalStateException)ye.a("G", (Object)v15, (long)1560520473511960754L, (long)var2_4);
                        }
                    }
                    v8 = var21_18;
                    v11 = 12;
                }
                try {
                    try {
                        if (var2_4 <= 0L) break block24;
                        v12 = var20_15;
lbl154:
                        // 2 sources

                        if (v12 == null) break block24;
                        if (v8 != v11) break block25;
                        v16 = this;
                    }
                    catch (IllegalStateException v17) {
                        throw (IllegalStateException)ye.a("G", (Object)v17, (long)1560520473511960754L, (long)var2_4);
                    }
                    ye.a("F", (Object)v16, (int)8, (long)1585111246487552456L, (long)var2_4);
                    return;
                }
                catch (IllegalStateException v18) {
                    throw (IllegalStateException)ye.a("G", (Object)v18, (long)1560520473511960754L, (long)var2_4);
                }
            }
            v8 = var21_18;
            v11 = 14;
        }
        try {
            if (v8 == v11) {
                ye.a("F", (Object)this, (int)10, (long)1585111246487552456L, (long)var2_4);
                return;
            }
        }
        catch (IllegalStateException v19) {
            throw (IllegalStateException)ye.a("G", (Object)v19, (long)1560520473511960754L, (long)var2_4);
        }
        v20 = new Object[1];
        v20[0] = var9_8;
        v21 = new Object[1];
        v21[0] = var4_5;
        throw new IllegalStateException((String)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)new StringBuilder(XA.a), (Object)((e)ye.a("j", (Object)this, (Object)v20, (long)1595375458030828976L, (long)var2_4)), (long)1543737012756197666L, (long)var2_4)), (Object)((String)ye.a("j", (Object)this, (Object)v21, (long)1514336094057593183L, (long)var2_4)), (long)1592179585510037167L, (long)var2_4)), (long)1582902352263967040L, (long)var2_4));
    }

    private static /* synthetic */ IllegalStateException a(IllegalStateException this_) {
        return this_;
    }
}

