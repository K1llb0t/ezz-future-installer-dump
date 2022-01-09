/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.X8;
import net.futureclient.installer.p8;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Xi
extends X8 {
    private volatile /* synthetic */ long R;
    private static final /* synthetic */ long b;
    private /* synthetic */ p8 m;
    private /* synthetic */ p8 s;

    @Override
    public final /* synthetic */ void N(Object[] object) {
        long l2 = (Long)object[0];
        object = (p8)object[1];
        ye.a("F", (Object)this, (p8)object, (long)-5814855343065988653L, (long)l2);
    }

    @Override
    public final /* synthetic */ void h(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        ye.a("F", (Object)this, (long)l2, (long)3252629979726198982L, (long)l3);
    }

    public /* synthetic */ Xi(Object object, int n2, p8 p82, long l2) {
        l2 = b ^ l2;
        long l3 = l2 ^ 0x829F7F49D32L;
        long l4 = l2 ^ 0xB43D91D2423L;
        super(l4, object, n2, p82);
        this.R = Long.MAX_VALUE;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        this.s = (p8)((Object)ye.a("G", (Object)arrobject, (long)-4769819367384236847L, (long)l2));
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        this.m = (p8)((Object)ye.a("G", (Object)arrobject2, (long)-4769819367384236847L, (long)l2));
    }

    @Override
    public final /* synthetic */ long Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (long)ye.a("\u00c3", (Object)this, (long)-8261675235949078339L, (long)l2);
    }

    @Override
    public final /* synthetic */ p8 a(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (p8)((Object)ye.a("\u00c3", (Object)this, (long)5225987737555101208L, (long)l2));
    }

    @Override
    public final /* synthetic */ p8 D(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (p8)((Object)ye.a("\u00c3", (Object)this, (long)-8308524108497278603L, (long)l2));
    }

    @Override
    public final /* synthetic */ void X(Object[] object) {
        Object[] arrobject = object;
        object = (p8)object[0];
        long l2 = (Long)arrobject[1];
        ye.a("F", (Object)this, (p8)object, (long)-5017253590161481832L, (long)l2);
    }

    public static /* synthetic */ {
        b = wu.a(-8724971930628834700L, -8648121260978368685L, MethodHandles.lookup().lookupClass()).a(113297661139962L);
    }
}

