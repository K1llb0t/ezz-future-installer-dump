/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.concurrent.atomic.AtomicBoolean;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class pB
extends vA {
    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x68A027D3ED27L;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        return new AtomicBoolean((boolean)ye.a("j", (Object)object, (Object)arrobject2, (long)8468947063830843008L, (long)l2));
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0x284B8A1FF29FL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = ((AtomicBoolean)object2).get();
        arrobject2[0] = l3;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)8277540319083723184L, (long)l2));
    }
}

