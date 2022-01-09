/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.reflect.Field;
import net.futureclient.installer.NF;
import net.futureclient.installer.XU;
import net.futureclient.installer.ye;

public final class NS
extends NF {
    @Override
    public final /* synthetic */ String i(Object[] object) {
        long l2 = (Long)object[0];
        object = (Field)object[1];
        long l3 = l2;
        long l4 = l3 ^ 0x573E7BB7261AL;
        long l5 = l3 ^ 0x72648F75500FL;
        Object[] arrobject = new Object[3];
        arrobject[2] = l4;
        arrobject[1] = XU.C("~");
        arrobject[0] = (String)((Object)ye.a("j", (Object)object, (long)2711499661607322038L, (long)l2));
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l5;
        arrobject2[0] = (String)((Object)ye.a("G", (Object)arrobject, (long)2603147073600913865L, (long)l2));
        return (String)((Object)ye.a("G", (Object)arrobject2, (long)2688321473313609061L, (long)l2));
    }

    public /* synthetic */ NS(String string) {
    }
}

