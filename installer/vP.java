/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.L;
import net.futureclient.installer.Nk;
import net.futureclient.installer.Th;
import net.futureclient.installer.e;
import net.futureclient.installer.k;
import net.futureclient.installer.pY;
import net.futureclient.installer.v1;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class vP
extends vA {
    private final /* synthetic */ DateFormat V;
    private static final /* synthetic */ long a;
    public static final /* synthetic */ Nk o;
    private static final /* synthetic */ String b;

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(6958646928684506381L, -7188834036464418480L, MethodHandles.lookup().lookupClass()).a(124983310100885L);
        long l2 = a ^ 0x5C6E62522C8CL;
        Cipher cipher = Cipher.getInstance(v1.C("B\u0004sH\u000fIP{L\u0010Z\r+\tx:`* n"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Th.C("9}\b"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (true) {
            if (n3 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
                b = vP.a(cipher.doFinal(v1.C("/7\u001f=\u00fb\u00eb3\u001f\u00df\u00f6\u0012\u00a1\u00ff5\u00b8d").getBytes(Th.C("D=UT~\u001d+D\u0015j")))).intern();
                o = new pY();
                return;
            }
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
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

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        L l2 = (L)object[0];
        long l3 = (Long)object[1];
        object = object[2];
        long l4 = l3 ^ 0x5907CE33C2AL;
        Object[] arrobject = new Object[3];
        arrobject[2] = (Date)object;
        arrobject[1] = l2;
        arrobject[0] = l4;
        ye.a("j", (Object)this, (Object)arrobject, (long)8343712260383656953L, (long)l3);
    }

    private synchronized /* synthetic */ void C(Object[] object) {
        String string;
        L l2;
        long l3 = (Long)object[0];
        L l4 = (L)object[1];
        object = (Date)object[2];
        l3 = a ^ l3;
        long l5 = l3 ^ 0x5C6CC2BAF18EL;
        try {
            l2 = l4;
            string = object == null ? null : (String)((Object)ye.a("j", (Object)((DateFormat)((Object)ye.a("\u00c3", (Object)this, (long)-8469673471857732879L, (long)l3))), (Object)object, (long)-8501752230063919963L, (long)l3));
        }
        catch (k k2) {
            throw (Exception)((Object)ye.a("G", (Object)k2, (long)-8367215876958302173L, (long)l3));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l5;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l2, (Object)arrobject, (long)-8435430083127439272L, (long)l3));
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x12AF03FD646AL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (Date)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)8370310401390918429L, (long)l2));
    }

    public /* synthetic */ vP(long l2) {
        l2 = a ^ l2;
        vP vP2 = this;
        vP2.V = new SimpleDateFormat(b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private synchronized /* synthetic */ Date Y(Object[] object3) {
        long l2;
        Object object2;
        block8: {
            vM vM2;
            long l3;
            block7: {
                vM object3 = (vM)object3[0];
                Object object2 = (Long)object3[1];
                object2 = a ^ object2;
                long l4 = object2 ^ 0x4B04BAAA837EL;
                l2 = object2 ^ 0x517ED64956BBL;
                l3 = object2 ^ 0x1D1A93FB6173L;
                CallSite callSite = ye.a("G", (long)-3154950679647176364L, (long)object2);
                try {
                    vM2 = object3;
                    if (callSite == null) break block7;
                    Object[] arrobject = new Object[1];
                    arrobject[0] = l4;
                    if ((e)((Object)ye.a("j", (Object)vM2, (Object)arrobject, (long)-2983123365938234102L, (long)object2)) != (e)((Object)ye.a("Z", (long)-3060348522704582999L, (long)object2))) break block8;
                    vM2 = object3;
                }
                catch (ParseException parseException) {
                    try {
                        throw (Exception)((Object)ye.a("G", (Object)parseException, (long)-3151676269591457920L, (long)object2));
                    }
                    catch (ParseException parseException2) {
                        throw (Exception)((Object)ye.a("G", (Object)parseException2, (long)-3151676269591457920L, (long)object2));
                    }
                }
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            ye.a("j", (Object)vM2, (Object)arrobject, (long)-2986831077966694201L, (long)object2);
            return null;
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            object2 = ye.a("j", (Object)((java.util.Date)((Object)ye.a("j", (Object)((DateFormat)((Object)ye.a("\u00c3", (Object)this, (long)-3037961045873029806L, (long)object2))), (Object)((String)((Object)ye.a("j", (Object)object3, (Object)arrobject, (long)-3075155993044297836L, (long)object2))), (long)-3030406097555758890L, (long)object2))), (long)-3170071269691341075L, (long)object2);
            return new Date((long)object2);
        }
        catch (ParseException parseException) {
            throw new k(parseException);
        }
    }

    private static /* synthetic */ Exception a(Exception this_) {
        return this_;
    }
}

