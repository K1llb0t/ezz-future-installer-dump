/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.reflect.Field;
import net.futureclient.installer.NF;
import net.futureclient.installer.ye;

public final class Nr
extends NF {
    @Override
    public final /* synthetic */ String i(Object[] object) {
        long l2 = (Long)object[0];
        object = (Field)object[1];
        long l3 = l2 ^ 0x72648F75500FL;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = (String)((Object)ye.a("j", (Object)object, (long)2711499661607322038L, (long)l2));
        return (String)((Object)ye.a("G", (Object)arrobject, (long)2688321473313609061L, (long)l2));
    }

    public /* synthetic */ Nr(String string) {
    }
}

