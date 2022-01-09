/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import net.futureclient.installer.Nu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;
import sun.misc.Unsafe;

public final class ES {
    public volatile /* synthetic */ long F;
    public volatile /* synthetic */ long x;
    private static final /* synthetic */ long b;
    private static final /* synthetic */ Unsafe Q;
    public volatile /* synthetic */ long l;
    private static final /* synthetic */ long a;
    public volatile /* synthetic */ long L;
    public volatile /* synthetic */ long Y;
    public volatile /* synthetic */ long k;
    public volatile /* synthetic */ long T;
    public volatile /* synthetic */ long c;
    public volatile /* synthetic */ long w;
    public volatile /* synthetic */ long I;
    public volatile /* synthetic */ long g;
    public volatile /* synthetic */ long P;
    public volatile /* synthetic */ long m;
    public volatile /* synthetic */ long M;
    public volatile /* synthetic */ long u;

    public static /* synthetic */ {
        b = wu.a(4548708200026427637L, -8683045118657310747L, MethodHandles.lookup().lookupClass()).a(90319428924523L);
        long l2 = b ^ 0x342067C9166BL;
        long l3 = l2 ^ 0x33C0F4277D4DL;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            Q = (Unsafe)((Object)ye.a("G", (Object)arrobject, (long)-2394424114759408222L, (long)l2));
            Class<ES> class_ = ES.class;
            a = (long)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)-2503861884106883263L, (long)l2))), (Object)((Field)((Object)ye.a("j", class_, (Object)Nu.C("/"), (long)-2480592779620530877L, (long)l2))), (long)-2564098686826940932L, (long)l2);
            return;
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    public final /* synthetic */ boolean T(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        long l4 = (Long)arrobject[2];
        l4 = b ^ l4;
        return (boolean)ye.a("j", (Object)((Unsafe)((Object)ye.a("Z", (long)3974427759285818665L, (long)l4))), (Object)this, (long)ye.a("Z", (long)3966842228649995068L, (long)l4), (long)l2, (long)l3, (long)3990025730391236958L, (long)l4);
    }

    public /* synthetic */ ES(long l2) {
        this.F = l2;
    }
}

