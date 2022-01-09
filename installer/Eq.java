/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.sql.Timestamp;
import java.util.Date;
import net.futureclient.installer.EF;
import net.futureclient.installer.Nk;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.vz;
import net.futureclient.installer.ye;

public final class Eq
implements Nk {
    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ vA V(Object[] object) {
        Object object2 = (EF)object[0];
        long l2 = (Long)object[1];
        object = (pL)object[2];
        long l3 = l2 ^ 0x3CE824A698EEL;
        try {
            if ((Class)((Object)ye.a("\u00c3", (Object)object, (long)110292910009429894L, (long)l2)) != Timestamp.class) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)98374306665204717L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = Date.class;
        arrobject[0] = l3;
        object2 = (vA)((Object)ye.a("j", (Object)object2, (Object)arrobject, (long)184986359919936423L, (long)l2));
        return new vz((vA)object2);
    }
}

