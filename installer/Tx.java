/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.DataInputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import net.futureclient.installer.TH;
import net.futureclient.installer.v0;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Tx
extends TH {
    private static final /* synthetic */ long a;
    private /* synthetic */ DataInputStream Q;
    private /* synthetic */ int g;

    @Override
    public final /* synthetic */ void w(Object[] object) {
        long l2 = (Long)object[0];
        object = (v0)object[1];
    }

    @Override
    public final /* synthetic */ void U(Object[] object) {
        Object[] arrobject = object;
        object = (DataInputStream)object[0];
        long l2 = (Long)arrobject[1];
    }

    public final /* synthetic */ TH Y(Object[] object) {
        long l2 = (Long)object[0];
        object = (Class)object[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x3259140F0D53L;
        object = (Constructor)((Object)ye.a("j", (Object)object, (Object)new Class[0], (long)6974476180572232973L, (long)l2));
        ye.a("j", (Object)object, (boolean)true, (long)6976938217529771564L, (long)l2);
        object = (TH)((Object)ye.a("j", (Object)object, (Object)new Object[0], (long)7004581632201366542L, (long)l2));
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = (DataInputStream)((Object)ye.a("\u00c3", (Object)this, (long)7019660247320533473L, (long)l2));
        ye.a("j", (Object)object, (Object)arrobject, (long)6969026179463158305L, (long)l2);
        return object;
    }

    public /* synthetic */ Tx(int n2, DataInputStream dataInputStream) {
        Tx tx = this;
        tx.g = n2;
        tx.Q = dataInputStream;
    }

    @Override
    public final /* synthetic */ int Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return (int)ye.a("\u00c3", (Object)this, (long)84366372701402176L, (long)l2);
    }

    public static /* synthetic */ {
        a = wu.a(-4167699364407425894L, -1416382446125871934L, MethodHandles.lookup().lookupClass()).a(47462015979380L);
    }
}

