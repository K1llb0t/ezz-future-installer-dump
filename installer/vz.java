/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.sql.Timestamp;
import java.util.Date;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class vz
extends vA {
    private /* synthetic */ vA j;

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0L;
        Object object3 = object;
        object = (Timestamp)object2;
        object2 = object3;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = object;
        arrobject2[1] = l3;
        arrobject2[0] = object2;
        ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8292949599324670435L, (long)l2))), (Object)arrobject2, (long)8310079564637467710L, (long)l2);
    }

    public /* synthetic */ vz(vA vA2) {
        this.j = vA2;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        object = (Date)((Object)ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8427709192377470464L, (long)l2))), (Object)arrobject2, (long)8617990313664900832L, (long)l2));
        try {
            if (object != null) {
                return new Timestamp((long)ye.a("j", (Object)object, (long)8440291652146358221L, (long)l2));
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8462828658562679805L, (long)l2));
        }
        return null;
    }
}

