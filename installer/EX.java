/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.Date;
import net.futureclient.installer.EF;
import net.futureclient.installer.Nk;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.vV;
import net.futureclient.installer.ye;

public final class EX
implements Nk {
    @Override
    public final /* synthetic */ vA V(Object[] object) {
        EF eF = (EF)object[0];
        long l2 = (Long)object[1];
        object = (pL)object[2];
        long l3 = l2 ^ 0x718961E2BFF6L;
        try {
            if ((Class)((Object)ye.a("\u00c3", (Object)object, (long)110292910009429894L, (long)l2)) == Date.class) {
                return new vV(l3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)194177566461395058L, (long)l2));
        }
        return null;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }
}

