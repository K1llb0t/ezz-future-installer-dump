/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.futureclient.installer.XI;
import net.futureclient.installer.XT;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public interface T0
extends ScheduledExecutorService,
XT {
    public static final /* synthetic */ long b;

    public /* synthetic */ XI L(Object[] var1);

    public /* synthetic */ XI Y(Object[] var1);

    public /* synthetic */ XI S(Object[] var1);

    public /* synthetic */ XI d(Object[] var1);

    default public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        long l3 = b ^ 0x5178E6AAF7DBL;
        return (XI)((Object)ye.a("j", (Object)this, (Object)new Object[0], (long)7201588591159966113L, (long)l3));
    }

    default public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        long l4 = b ^ 0xF1DF68BA303L;
        return (XI)((Object)ye.a("j", (Object)this, (Object)new Object[0], (long)3971435060519880502L, (long)l4));
    }

    public static /* synthetic */ {
        b = wu.a(-7366210459190744662L, 2310977231676529670L, MethodHandles.lookup().lookupClass()).a(280973635038379L);
    }

    default public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        long l4 = b ^ 0xC43127618E1L;
        return (XI)((Object)ye.a("j", (Object)this, (Object)new Object[0], (long)-8101255642456437218L, (long)l4));
    }

    default public /* synthetic */ ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        long l3 = b ^ 0x1672040A441CL;
        return (XI)((Object)ye.a("j", (Object)this, (Object)new Object[0], (long)-3319789596070200755L, (long)l3));
    }
}

