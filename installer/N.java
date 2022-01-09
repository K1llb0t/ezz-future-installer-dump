/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.security.SecureRandom;
import net.futureclient.installer.Xq;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class N {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ Throwable F;
    private static final /* synthetic */ SecureRandom b;

    public /* synthetic */ N() {
        new Xq();
    }

    public static /* synthetic */ Throwable M(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        return (Throwable)((Object)ye.a("Z", (long)-6731609161258003749L, (long)l2));
    }

    public static /* synthetic */ SecureRandom Z(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        return (SecureRandom)((Object)ye.a("Z", (long)-3816912105429310299L, (long)l2));
    }

    public static /* synthetic */ {
        a = wu.a(-4713965488550813551L, 6578312292660509374L, MethodHandles.lookup().lookupClass()).a(202057588681631L);
        b = new SecureRandom();
        F = new Throwable();
    }
}

