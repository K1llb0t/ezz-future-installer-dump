/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.X1;
import net.futureclient.installer.Xy;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class Xm {
    private static final /* synthetic */ Xm m;
    private static final /* synthetic */ long a;

    public abstract /* synthetic */ void E(Object[] var1);

    public static /* synthetic */ {
        Xm xm;
        a = wu.a(954237825664112087L, -2502111426352586437L, MethodHandles.lookup().lookupClass()).a(136608597441521L);
        long l2 = a ^ 0x681C7DE2B61FL;
        long l3 = l2 ^ 0xF0D64034ADDL;
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            xm = ye.a("G", (Object)arrobject, (long)1770584557388058382L, (long)l2) < 9 ? new Xy() : new X1();
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)1789652395567246604L, (long)l2));
        }
        m = xm;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public static /* synthetic */ Xm u(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        return (Xm)((Object)ye.a("Z", (long)-2538692500944844844L, (long)l2));
    }
}

