/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.concurrent.atomic.AtomicLong;
import net.futureclient.installer.NE;

public final class N0
extends AtomicLong
implements NE {
    public /* synthetic */ N0(byte by) {
        this();
    }

    @Override
    public final /* synthetic */ void F(Object[] arrobject2) {
        int n2 = (Integer)arrobject2[0];
        int n3 = (Integer)arrobject2[1];
        int arrobject2 = (Integer)arrobject2[2];
        this.getAndIncrement();
    }

    @Override
    public final /* synthetic */ void t(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        this.getAndAdd(l2);
    }

    private /* synthetic */ N0() {
    }
}

