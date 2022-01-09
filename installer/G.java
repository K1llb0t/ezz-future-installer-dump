/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.ref.ReferenceQueue;
import net.futureclient.installer.Np;
import net.futureclient.installer.g;
import net.futureclient.installer.p8;
import net.futureclient.installer.vl;
import net.futureclient.installer.ye;

public final class G
extends g {
    @Override
    public final /* synthetic */ p8 B(Object[] object) {
        Object[] arrobject = object;
        object = (vl)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        int n2 = (Integer)arrobject[3];
        p8 p82 = (p8)arrobject[4];
        long l3 = l2 ^ 0x6356FB2BC097L;
        return new Np((ReferenceQueue)((Object)ye.a("\u00c3", (Object)object, (long)-1869935711752618358L, (long)l2)), object2, n2, l3, p82);
    }

    @Override
    public final /* synthetic */ p8 S(Object[] object) {
        Object object2 = (vl)object[0];
        long l2 = (Long)object[1];
        p8 p82 = (p8)object[2];
        object = (p8)object[3];
        long l3 = l2;
        long l4 = l3 ^ 0L;
        long l5 = l3 ^ 0x71B59F6B8F46L;
        Object[] arrobject = new Object[4];
        arrobject[3] = object;
        arrobject[2] = p82;
        arrobject[1] = l4;
        arrobject[0] = object2;
        object2 = super.S(arrobject);
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = object2;
        arrobject2[1] = l5;
        arrobject2[0] = p82;
        ye.a("G", (Object)arrobject2, (long)1196630893671053069L, (long)l2);
        return object2;
    }

    public /* synthetic */ G(String string) {
    }
}

