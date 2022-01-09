/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.Xj;
import net.futureclient.installer.g;
import net.futureclient.installer.p8;
import net.futureclient.installer.vl;
import net.futureclient.installer.ye;

public final class q
extends g {
    @Override
    public final /* synthetic */ p8 S(Object[] object) {
        Object[] arrobject = object;
        object = (vl)object[0];
        long l2 = (Long)arrobject[1];
        p8 p82 = (p8)arrobject[2];
        p8 p83 = (p8)arrobject[3];
        long l3 = l2;
        long l4 = l3 ^ 0L;
        long l5 = l3 ^ 0x71B59F6B8F46L;
        Object[] arrobject2 = new Object[4];
        arrobject2[3] = p83;
        arrobject2[2] = p82;
        arrobject2[1] = l4;
        arrobject2[0] = object;
        object = super.S(arrobject2);
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = object;
        arrobject3[1] = l5;
        arrobject3[0] = p82;
        ye.a("G", (Object)arrobject3, (long)1196630893671053069L, (long)l2);
        return object;
    }

    @Override
    public final /* synthetic */ p8 B(Object[] object) {
        Object[] arrobject = object;
        object = (vl)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        int n2 = (Integer)arrobject[3];
        object = (p8)arrobject[4];
        l2 = l2 ^ 0x1A4090F70D1EL;
        return new Xj(l2, object2, n2, (p8)object);
    }

    public /* synthetic */ q(String string) {
    }
}

