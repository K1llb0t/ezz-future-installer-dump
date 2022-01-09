/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.Xh;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Xr
extends Xh {
    private static final /* synthetic */ long b;

    public /* synthetic */ Xr(Throwable throwable, short s2, short s3, int n2) {
        long l2 = ((long)s2 << 48 | (long)s3 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ b;
        long l3 = l2 ^ 0x713ACA41C60L;
        Object[] arrobject = new Object[2];
        arrobject[1] = throwable;
        arrobject[0] = l3;
        ye.a("j", (Object)this, (Object)arrobject, (long)-4565516198055008816L, (long)l2);
    }

    public static /* synthetic */ {
        b = wu.a(2706914469062012156L, -3586784083087609941L, MethodHandles.lookup().lookupClass()).a(260699838878930L);
    }
}

