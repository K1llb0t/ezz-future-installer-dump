/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.lang.ref.ReferenceQueue;
import net.futureclient.installer.NR;
import net.futureclient.installer.p8;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class ND
extends NR {
    private /* synthetic */ p8 C;
    private /* synthetic */ p8 E;
    private volatile /* synthetic */ long Z;
    private static final /* synthetic */ long b;

    public /* synthetic */ ND(long l22, ReferenceQueue referenceQueue, Object object, int n2, p8 p82) {
        long l22 = b ^ l22;
        long l3 = l22 ^ 0x5A9CE7B54472L;
        long l4 = l22 ^ 0x2D2482DB1EA5L;
        super(l4, referenceQueue, object, n2, p82);
        this.Z = Long.MAX_VALUE;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        this.E = (p8)((Object)ye.a("G", (Object)arrobject, (long)7245834659220252049L, (long)l22));
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        this.C = (p8)((Object)ye.a("G", (Object)arrobject2, (long)7245834659220252049L, (long)l22));
    }

    @Override
    public final /* synthetic */ long Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (long)ye.a("\u00c3", (Object)this, (long)-8178677826245761029L, (long)l2);
    }

    @Override
    public final /* synthetic */ void h(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        ye.a("F", (Object)this, (long)l2, (long)3315903077743150976L, (long)l3);
    }

    public static /* synthetic */ {
        b = wu.a(-3610851210656946466L, 3862103905819624850L, MethodHandles.lookup().lookupClass()).a(118131308401865L);
    }

    @Override
    public final /* synthetic */ p8 D(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (p8)((Object)ye.a("\u00c3", (Object)this, (long)-8286116043750842870L, (long)l2));
    }

    @Override
    public final /* synthetic */ void X(Object[] object) {
        Object[] arrobject = object;
        object = (p8)object[0];
        long l2 = (Long)arrobject[1];
        ye.a("F", (Object)this, (p8)object, (long)-4905301299491247897L, (long)l2);
    }

    @Override
    public final /* synthetic */ void N(Object[] object) {
        long l2 = (Long)object[0];
        object = (p8)object[1];
        ye.a("F", (Object)this, (p8)object, (long)-5858154850490017922L, (long)l2);
    }

    @Override
    public final /* synthetic */ p8 a(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (p8)((Object)ye.a("\u00c3", (Object)this, (long)5294171322347057333L, (long)l2));
    }
}

