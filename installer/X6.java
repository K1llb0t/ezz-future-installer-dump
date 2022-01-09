/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandles;
import net.futureclient.installer.j;
import net.futureclient.installer.pP;
import net.futureclient.installer.v0;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class X6 {
    private static final /* synthetic */ long a;

    public static /* synthetic */ {
        a = wu.a(-3750560102628336869L, 8416981305911475115L, MethodHandles.lookup().lookupClass()).a(165150025328112L);
        new j();
    }

    public static /* synthetic */ v0 K(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x6CA34159C7F8L;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object[] arrobject = new Object[2];
        arrobject[1] = byteArrayOutputStream;
        arrobject[0] = l3;
        return new pP((ByteArrayOutputStream)((Object)ye.a("G", (Object)arrobject, (long)6358811353507650712L, (long)l2)));
    }
}

