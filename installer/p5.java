/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.installer.L;
import net.futureclient.installer.k;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class p5
extends vA {
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0x23CBB22AC3DCL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = (long)((AtomicInteger)object2).get();
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)8310643313580377986L, (long)l2));
    }

    private static /* synthetic */ AtomicInteger G(Object[] this_) {
        vM vM2 = (vM)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x54B9AADFEF7L;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            return new AtomicInteger((int)ye.a("j", (Object)vM2, (Object)arrobject, (long)-4589710221570848042L, (long)l2));
        }
        catch (NumberFormatException numberFormatException) {
            throw new k(numberFormatException);
        }
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x3253AA2FFA70L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (AtomicInteger)((Object)ye.a("G", (Object)arrobject2, (long)8643303112183142665L, (long)l2));
    }

    public static /* synthetic */ {
        a = wu.a(-1751968864146239267L, -1504472483544261975L, MethodHandles.lookup().lookupClass()).a(3552307756978L);
    }
}

