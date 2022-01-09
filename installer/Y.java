/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.ref.ReferenceQueue;
import net.futureclient.installer.ND;
import net.futureclient.installer.g;
import net.futureclient.installer.p8;
import net.futureclient.installer.vl;
import net.futureclient.installer.ye;

public final class Y
extends g {
    @Override
    public final /* synthetic */ p8 S(Object[] object) {
        Object object2 = (vl)object[0];
        long l2 = (Long)object[1];
        p8 p82 = (p8)object[2];
        object = (p8)object[3];
        long l3 = l2;
        long l4 = l3 ^ 0L;
        long l5 = l3 ^ 0x342F69121F81L;
        Object[] arrobject = new Object[4];
        arrobject[3] = object;
        arrobject[2] = p82;
        arrobject[1] = l4;
        arrobject[0] = object2;
        object2 = super.S(arrobject);
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = object2;
        arrobject2[1] = p82;
        arrobject2[0] = l5;
        ye.a("G", (Object)arrobject2, (long)1162368663764631410L, (long)l2);
        return object2;
    }

    @Override
    public final /* synthetic */ p8 B(Object[] arrobject2) {
        vl vl2 = (vl)arrobject2[0];
        long l2 = (Long)arrobject2[1];
        Object object = arrobject2[2];
        int arrobject2 = (Integer)arrobject2[3];
        p8 p82 = (p8)arrobject2[4];
        long l3 = l2 ^ 0x1D299EE04A2AL;
        return new ND(l3, (ReferenceQueue)((Object)ye.a("\u00c3", (Object)vl2, (long)-1869935711752618358L, (long)l2)), object, arrobject2, p82);
    }

    public /* synthetic */ Y(String string) {
    }
}

