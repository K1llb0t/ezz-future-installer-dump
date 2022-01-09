/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.Currency;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class vk
extends vA {
    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x50EF1C9F79BL;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        return (Currency)((Object)ye.a("G", (String)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)8390924752238081716L, (long)l2)), (long)8621493193849165655L, (long)l2));
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0x1F239A2408EEL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (String)((Object)ye.a("j", (Object)((Currency)object2), (long)8250699892654928721L, (long)l2));
        arrobject2[0] = l3;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)8326898731959281976L, (long)l2));
    }
}

