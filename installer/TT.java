/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.ref.ReferenceQueue;
import net.futureclient.installer.K;
import net.futureclient.installer.TJ;
import net.futureclient.installer.Xk;
import net.futureclient.installer.p8;
import net.futureclient.installer.pc;
import net.futureclient.installer.vl;
import net.futureclient.installer.ye;

public final class TT
extends K {
    @Override
    public final /* synthetic */ pc A(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = l2 ^ 0x34CB2E7A1A50L;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        return (pc)((Object)ye.a("G", (Object)arrobject2, (long)-2969606285011204952L, (long)l2));
    }

    public /* synthetic */ TT(String string) {
    }

    @Override
    public final /* synthetic */ Xk D(Object[] object) {
        long l2 = (Long)object[0];
        object = (vl)object[1];
        p8 p82 = (p8)object[2];
        Object object2 = object[3];
        return new TJ((ReferenceQueue)((Object)ye.a("\u00c3", (Object)object, (long)-8774551170155535480L, (long)l2)), object2, p82);
    }
}

