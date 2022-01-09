/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ConcurrentMap;
import net.futureclient.installer.B;
import net.futureclient.installer.T5;
import net.futureclient.installer.Tq;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class El
implements Serializable,
T5 {
    private static final /* synthetic */ long a;
    private /* synthetic */ B Z;

    @Override
    public final /* synthetic */ ConcurrentMap x(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (B)((Object)ye.a("\u00c3", (Object)this, (long)-4223559213455380278L, (long)l2));
    }

    public static /* synthetic */ {
        a = wu.a(4566847981643607313L, 7359999948275401523L, MethodHandles.lookup().lookupClass()).a(89218810270451L);
    }

    public /* synthetic */ El(long l22, Tq tq) {
        long l22 = a ^ l22;
        this(new B(l22 ^= 0xDD4628D251AL, tq));
    }

    private /* synthetic */ El(B b2) {
        this.Z = b2;
    }
}

