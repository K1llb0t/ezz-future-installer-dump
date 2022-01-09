/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.reflect.Method;
import net.futureclient.installer.X2;
import net.futureclient.installer.ye;

public final class Xc
extends X2 {
    private /* synthetic */ Method j;
    private /* synthetic */ int y;

    @Override
    public final /* synthetic */ Object Y(Object[] object) {
        Object[] arrobject = object;
        object = (Class)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x5E6F8107A09BL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        ye.a("G", (Object)arrobject2, (long)336124271414480322L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[0] = object;
        arrobject3[1] = (Integer)((Object)ye.a("G", (int)ye.a("\u00c3", (Object)this, (long)475698811126486251L, (long)l2), (long)510996913846981188L, (long)l2));
        return ye.a("j", (Object)((Method)((Object)ye.a("\u00c3", (Object)this, (long)471842133600431564L, (long)l2))), null, (Object)arrobject3, (long)525035220492178136L, (long)l2);
    }

    public /* synthetic */ Xc(Method method, int n2) {
        this.j = method;
        this.y = n2;
    }
}

