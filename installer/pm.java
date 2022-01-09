/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class pm
extends AbstractSet {
    private static final /* synthetic */ long a;
    public final /* synthetic */ ConcurrentMap V;

    public static /* synthetic */ {
        a = wu.a(-2666924770549862730L, 8941766764046007645L, MethodHandles.lookup().lookupClass()).a(115332950075843L);
    }

    @Override
    public /* synthetic */ int size() {
        long l2 = a ^ 0x12E0740DEC9L;
        return (int)ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("\u00c3", (Object)this, (long)-1298953211060016772L, (long)l2))), (long)-1323785754979974711L, (long)l2);
    }

    @Override
    public /* synthetic */ void clear() {
        long l2 = a ^ 0xAF5BD72371CL;
        ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("\u00c3", (Object)this, (long)300680371544572073L, (long)l2))), (long)469369868170724054L, (long)l2);
    }

    public /* synthetic */ pm(ConcurrentMap concurrentMap) {
        this.V = concurrentMap;
    }

    @Override
    public /* synthetic */ boolean isEmpty() {
        long l2 = a ^ 0x30E16B170DB3L;
        return (boolean)ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("\u00c3", (Object)this, (long)4504445292048677382L, (long)l2))), (long)4504636412036496833L, (long)l2);
    }

    @Override
    public /* synthetic */ Object[] toArray(Object[] arrobject) {
        long l2 = a ^ 0x5CB4FF69A858L;
        long l3 = l2 ^ 0x1FF80443E07DL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = this;
        return (Object[])ye.a("j", (Object)((ArrayList)((Object)ye.a("G", (Object)arrobject2, (long)-7309336900464787963L, (long)l2))), (Object)arrobject, (long)-7315626145575835946L, (long)l2);
    }

    @Override
    public /* synthetic */ Object[] toArray() {
        long l2 = a ^ 0x24D6979A09F2L;
        long l3 = l2 ^ 0x679A6CB041D7L;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = this;
        return (Object[])ye.a("j", (Object)((ArrayList)((Object)ye.a("G", (Object)arrobject, (long)4267860703531474863L, (long)l2))), (long)4306241639039265542L, (long)l2);
    }
}

