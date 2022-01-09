/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.EF;
import net.futureclient.installer.Nk;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.ye;

public final class u
implements Nk {
    private /* synthetic */ pL t;
    private /* synthetic */ vA O;

    @Override
    public final /* synthetic */ vA V(Object[] object) {
        EF eF = (EF)object[0];
        long l2 = (Long)object[1];
        object = (pL)object[2];
        try {
            if (ye.a("j", (Object)object, (Object)((pL)((Object)ye.a("\u00c3", (Object)this, (long)11166819556886456L, (long)l2))), (long)203900064698872830L, (long)l2) != false) {
                return (vA)((Object)ye.a("\u00c3", (Object)this, (long)73741019047437301L, (long)l2));
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)94604264093379176L, (long)l2));
        }
        return null;
    }

    public /* synthetic */ u(pL pL2, vA vA2) {
        this.t = pL2;
        this.O = vA2;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }
}

