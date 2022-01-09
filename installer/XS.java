/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.Xh;

public final class XS
extends Xh {
    @Override
    public final /* synthetic */ boolean h(Object[] object) {
        long l2 = (Long)object[0];
        object = (Throwable)object[1];
        l2 = l2 ^ 0L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l2;
        return super.h(arrobject);
    }

    @Override
    public final /* synthetic */ boolean d(Object[] object) {
        Object[] arrobject = object;
        object = object[0];
        long l2 = (Long)arrobject[1] ^ 0L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l2;
        arrobject2[0] = object;
        return super.d(arrobject2);
    }

    public static /* synthetic */ XS Q(Object[] this_) {
        return new XS();
    }

    private /* synthetic */ XS() {
    }
}

