/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.ref.ReferenceQueue;
import net.futureclient.installer.NR;
import net.futureclient.installer.g;
import net.futureclient.installer.p8;
import net.futureclient.installer.vl;
import net.futureclient.installer.ye;

public final class C
extends g {
    @Override
    public final /* synthetic */ p8 B(Object[] object) {
        vl vl2 = (vl)object[0];
        long l2 = (Long)object[1];
        Object object2 = object[2];
        int n2 = (Integer)object[3];
        object = (p8)object[4];
        long l3 = l2 ^ 0x7BD8EDB39CDEL;
        return new NR(l3, (ReferenceQueue)((Object)ye.a("\u00c3", (Object)vl2, (long)-1869935711752618358L, (long)l2)), object2, n2, (p8)object);
    }

    public /* synthetic */ C(String string) {
    }
}

