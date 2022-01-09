/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.reflect.Field;
import java.util.Locale;
import net.futureclient.installer.J;
import net.futureclient.installer.NF;
import net.futureclient.installer.ye;

public final class N7
extends NF {
    public /* synthetic */ N7(String string) {
    }

    @Override
    public final /* synthetic */ String i(Object[] object) {
        long l2 = (Long)object[0];
        object = (Field)object[1];
        long l3 = l2 ^ 0x573E7BB7261AL;
        Object[] arrobject = new Object[3];
        arrobject[2] = l3;
        arrobject[1] = J.C("%");
        arrobject[0] = (String)((Object)ye.a("j", (Object)object, (long)2711499661607322038L, (long)l2));
        return (String)((Object)ye.a("j", (String)((Object)ye.a("G", (Object)arrobject, (long)2603147073600913865L, (long)l2)), (Object)((Locale)((Object)ye.a("Z", (long)2707940975269726840L, (long)l2))), (long)2667309195578208883L, (long)l2));
    }
}

