/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public interface T6
extends Map {
    public static final /* synthetic */ long a;

    public /* synthetic */ Set K(Object[] var1);

    public static /* synthetic */ {
        a = wu.a(1711770761348117580L, -5784899408642235070L, MethodHandles.lookup().lookupClass()).a(127803476516513L);
    }

    default public /* synthetic */ Collection values() {
        long l2 = a ^ 0x537B7A85B1DL;
        return (Set)((Object)ye.a("j", (Object)this, (Object)new Object[0], (long)6941934547132750120L, (long)l2));
    }
}

