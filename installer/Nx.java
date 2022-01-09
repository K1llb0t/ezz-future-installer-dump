/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.AbstractMap;
import net.futureclient.installer.vT;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Nx
extends AbstractMap.SimpleImmutableEntry {
    private static final /* synthetic */ long a;

    private /* synthetic */ Nx(Object object, Object object2, long l22, vT vT2) {
        long l22 = a ^ l22;
        long l3 = l22 ^ 0x1689532BB124L;
        super(object, object2);
        Object[] arrobject = new Object[2];
        arrobject[1] = vT2;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)3378670685361089092L, (long)l22);
    }

    public static /* synthetic */ Nx G(Object[] this_) {
        long l2 = (Long)this_[0];
        Object object = this_[1];
        Object object2 = this_[2];
        vT vT2 = (vT)((Object)this_[3]);
        l2 = a ^ l2;
        return new Nx(object, object2, l2 ^= 0x349342CF4B74L, vT2);
    }

    public static /* synthetic */ {
        a = wu.a(7724962238015862637L, -2927305478490111554L, MethodHandles.lookup().lookupClass()).a(66214270779480L);
    }
}

