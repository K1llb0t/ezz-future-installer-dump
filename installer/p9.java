/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.concurrent.atomic.AtomicLong;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class p9
extends vA {
    private /* synthetic */ vA S;

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        object = (Number)((Object)ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8381676912625979974L, (long)l2))), (Object)arrobject2, (long)8617990313664900832L, (long)l2));
        return new AtomicLong((long)ye.a("j", (Object)object, (long)8409435173777662227L, (long)l2));
    }

    public /* synthetic */ p9(vA vA2) {
        this.S = vA2;
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0L;
        Object object3 = object;
        object = (AtomicLong)object2;
        object2 = object3;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = (Long)((Object)ye.a("G", (long)((AtomicLong)object).get(), (long)8296510132101861750L, (long)l2));
        arrobject2[1] = l3;
        arrobject2[0] = object2;
        ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8336998389869254053L, (long)l2))), (Object)arrobject2, (long)8310079564637467710L, (long)l2);
    }
}

