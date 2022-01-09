/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.NM;
import net.futureclient.installer.Nc;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class NJ
extends NM {
    private final /* synthetic */ Object[] i;
    private static final /* synthetic */ long a;
    public static final /* synthetic */ Nc r;

    @Override
    public final /* synthetic */ Object k(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        return ((Object[])ye.a("\u00c3", (Object)this, (long)-6295421517607086071L, (long)l2))[arrobject2];
    }

    public static /* synthetic */ {
        a = wu.a(-5202779534949076753L, -4974770839493047203L, MethodHandles.lookup().lookupClass()).a(159921323546605L);
        long l2 = a ^ 0x1BA111AF6624L ^ 0x343314F2023CL;
        r = new NJ(new Object[0], 0, l2);
    }

    public /* synthetic */ NJ(Object[] arrobject, int n2, long l2) {
        l2 = a ^ l2;
        super(l2 ^= 0x7E4491762E7FL, n2);
        this.i = arrobject;
    }
}

