/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.security.Key;
import java.security.PrivilegedActionException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.ES;
import net.futureclient.installer.NH;
import net.futureclient.installer.pA;
import net.futureclient.installer.v1;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;
import sun.misc.Unsafe;

public abstract class XY
extends Number {
    public static final /* synthetic */ int Y;
    private static final /* synthetic */ long q;
    private static final /* synthetic */ String b;
    public volatile transient /* synthetic */ ES[] V;
    public static final /* synthetic */ ThreadLocal M;
    public static final /* synthetic */ Random w;
    private static final /* synthetic */ Unsafe o;
    public volatile transient /* synthetic */ long j;
    private static final /* synthetic */ long J;
    private static final /* synthetic */ long c;
    public volatile transient /* synthetic */ int R;

    public final /* synthetic */ boolean P(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = c ^ l2;
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)6287736872822419790L, (long)l2))), (Object)this, (long)ye.a("Z", (long)6260312441775062759L, (long)l2), (int)0, (int)1, (long)6284813977975782954L, (long)l2);
    }

    public static /* synthetic */ Unsafe V(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x3BF40EAD4B7L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (Unsafe)((Object)ye.a("G", (Object)arrobject, (long)-7937717235594218579L, (long)l2));
    }

    public abstract /* synthetic */ long F(Object[] var1);

    public final /* synthetic */ boolean u(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        long l4 = (Long)arrobject[2];
        l4 = c ^ l4;
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)6134142287532569388L, (long)l4))), (Object)this, (long)ye.a("Z", (long)6096581655260386958L, (long)l4), (long)l2, (long)l3, (long)6062474311063765539L, (long)l4);
    }

    private static /* synthetic */ Unsafe X(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = c ^ l2;
        try {
            return (Unsafe)((Object)ye.a("G", (long)8402028954773180234L, (long)l2));
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)((Object)ye.a("G", (Object)new pA(), (long)8468438478940987001L, (long)l2));
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException(b, (Throwable)((Object)ye.a("j", (Object)privilegedActionException, (long)8410736639803375436L, (long)l2)));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ {
        int n2;
        c = wu.a(222556758886273904L, 2011912069964999703L, MethodHandles.lookup().lookupClass()).a(207587372060061L);
        long l2 = c ^ 0x3B6888E9598L;
        long l3 = l2 ^ 0x36EDF324E34AL;
        Cipher cipher = Cipher.getInstance(NH.C("DER.'&x\u0014d\u007frb\u0003fPUHE\b\u0001"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(v1.C("\u0007\u000bZ"));
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
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        b = XY.a(cipher.doFinal(NH.C("ai\u0010\u0004\u0018\u00dd\u0082\u00bdysTS\u00a0~\u007f\u00acn\u00ach}\f\u00fbN\u0000\u008a?\u00a5\u00c2q.H\u00bf").getBytes(v1.C("P\rQt!f1zc8")))).intern();
        M = new ThreadLocal();
        w = new Random();
        Y = (int)ye.a("j", (Object)((Runtime)((Object)ye.a("G", (long)-6350827034105918853L, (long)l2))), (long)-6458580985802344430L, (long)l2);
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            o = (Unsafe)((Object)ye.a("G", (Object)arrobject, (long)-6473179646834310064L, (long)l2));
            Class<XY> class_ = XY.class;
            J = (long)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)-6469834243640573894L, (long)l2))), (Object)((Field)((Object)ye.a("j", class_, (Object)NH.C("\f"), (long)-6372502215065223360L, (long)l2))), (long)-6455622914181558273L, (long)l2);
            q = (long)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)-6469834243640573894L, (long)l2))), (Object)((Field)((Object)ye.a("j", class_, (Object)v1.C("["), (long)-6372502215065223360L, (long)l2))), (long)-6455622914181558273L, (long)l2);
            return;
        }
        catch (Exception exception) {
            throw new Error(exception);
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

