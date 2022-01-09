/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.security.Key;
import java.security.PrivilegedActionException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.F;
import net.futureclient.installer.Nu;
import net.futureclient.installer.TK;
import net.futureclient.installer.Th;
import net.futureclient.installer.XF;
import net.futureclient.installer.Z;
import net.futureclient.installer.pE;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;
import sun.misc.Unsafe;

public final class z
extends Z {
    public static final /* synthetic */ long Q;
    public static final /* synthetic */ long K;
    public static final /* synthetic */ Unsafe x;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long z;

    @Override
    public final /* synthetic */ void f(Object[] object) {
        Object[] arrobject = object;
        object = (TK)object[0];
        Thread thread = (Thread)arrobject[1];
        long l2 = (Long)arrobject[2];
        ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)1967575453409399465L, (long)l2))), (Object)object, (long)ye.a("Z", (long)1870832794655522799L, (long)l2), (Object)thread, (long)1965422255667685950L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ {
        int n2;
        long l2 = wu.a(8257356858125975601L, 6605276390426030332L, MethodHandles.lookup().lookupClass()).a(54663994431439L) ^ 0x2D50F12B6AEAL;
        long l3 = l2 ^ 0x3B0216545D7L;
        Object object = Cipher.getInstance(Nu.C("_<\u001c\u0002J)\u0015\u001b\tp\u001fmni=Z%Je\u000e"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(Th.C("aW\""));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (n3 < 8) {
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
        ((Cipher)object).init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        String string = net.futureclient.installer.z.a(((Cipher)object).doFinal(Nu.C("\u00d9R\u00ce\u00b0s\u0006\u00c3\u00ab\u0086\u0083\u00c1M\u009d@\u00cf\u00d9\u00ca{\u00b57Z\u00fe\u00d1\u00d4w\u00d2\u00bd\u0081L\u00cb\"\u008c").getBytes(Th.C("M4BC\"As\u001c?@")))).intern();
        try {
            object = (Unsafe)((Object)ye.a("G", (long)7544374038210958179L, (long)l2));
        }
        catch (SecurityException securityException) {
            try {
                object = (Unsafe)((Object)ye.a("G", (Object)new pE(), (long)7614723900675834448L, (long)l2));
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException(string, (Throwable)((Object)ye.a("j", (Object)privilegedActionException, (long)7535068151544062821L, (long)l2)));
            }
        }
        try {
            Class<XF> class_ = XF.class;
            K = (long)ye.a("j", (Object)object, (Object)((Field)((Object)ye.a("j", class_, (Object)Nu.C("0"), (long)7512033431735201936L, (long)l2))), (long)7618205238580527151L, (long)l2);
            Q = (long)ye.a("j", (Object)object, (Object)((Field)((Object)ye.a("j", class_, (Object)Th.C("\u0014"), (long)7512033431735201936L, (long)l2))), (long)7618205238580527151L, (long)l2);
            i = (long)ye.a("j", (Object)object, (Object)((Field)((Object)ye.a("j", class_, (Object)Nu.C("<"), (long)7512033431735201936L, (long)l2))), (long)7618205238580527151L, (long)l2);
            z = (long)ye.a("j", (Object)object, (Object)((Field)((Object)ye.a("j", TK.class, (Object)Th.C("\u001f"), (long)7512033431735201936L, (long)l2))), (long)7618205238580527151L, (long)l2);
            b = (long)ye.a("j", (Object)object, (Object)((Field)((Object)ye.a("j", TK.class, (Object)Nu.C("\b"), (long)7512033431735201936L, (long)l2))), (long)7618205238580527151L, (long)l2);
            x = object;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            Object[] arrobject = new Object[2];
            arrobject[1] = l3;
            arrobject[0] = exception;
            ye.a("G", (Object)arrobject, (long)7754120709919035155L, (long)l2);
            throw new RuntimeException(exception2);
        }
    }

    @Override
    public final /* synthetic */ boolean W(Object[] object) {
        XF xF = (XF)object[0];
        object = (TK)object[1];
        TK tK = (TK)object[2];
        long l2 = (Long)object[3];
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)843907230138024529L, (long)l2))), (Object)xF, (long)ye.a("Z", (long)658494219342564483L, (long)l2), (Object)object, (Object)tK, (long)588671390212061387L, (long)l2);
    }

    private /* synthetic */ z() {
        super((byte)0);
    }

    @Override
    public final /* synthetic */ void J(Object[] object) {
        TK tK = (TK)object[0];
        long l2 = (Long)object[1];
        object = (TK)object[2];
        ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)9023325091858789598L, (long)l2))), (Object)tK, (long)ye.a("Z", (long)9009848108359019053L, (long)l2), (Object)object, (long)9021242280041401417L, (long)l2);
    }

    @Override
    public final /* synthetic */ boolean i(Object[] object) {
        long l2 = (Long)object[0];
        XF xF = (XF)object[1];
        F f2 = (F)object[2];
        object = (F)object[3];
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)8868203568285856501L, (long)l2))), (Object)xF, (long)ye.a("Z", (long)8688952065377690096L, (long)l2), (Object)f2, (Object)object, (long)8687294757086627951L, (long)l2);
    }

    public /* synthetic */ z(byte by) {
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

    @Override
    public final /* synthetic */ boolean m(Object[] object) {
        Object[] arrobject = object;
        object = (XF)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        Object object3 = arrobject[3];
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)4958014709476265257L, (long)l2))), (Object)object, (long)ye.a("Z", (long)5173881710661745024L, (long)l2), (Object)object2, (Object)object3, (long)5139487579535194035L, (long)l2);
    }
}

