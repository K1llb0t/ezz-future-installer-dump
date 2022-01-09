/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.AbstractQueue;
import java.util.Iterator;
import net.futureclient.installer.NP;
import net.futureclient.installer.Nu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class T3
extends AbstractQueue {
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ Object poll() {
        return null;
    }

    @Override
    public final /* synthetic */ boolean offer(Object object) {
        return true;
    }

    public static /* synthetic */ {
        a = wu.a(737035747285803377L, 5276469742278747855L, MethodHandles.lookup().lookupClass()).a(260485303272661L);
    }

    @Override
    public final /* synthetic */ int size() {
        return 0;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        long l2 = a ^ 0x7FFB1EBA1491L;
        long l3 = l2 ^ 0x764A0F71C0CFL;
        long l4 = l2 ^ 0x7F54EDA216DEL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        return (Nu)((Object)ye.a("j", (Object)((NP)((Object)ye.a("G", (Object)arrobject, (long)5220218060655214868L, (long)l2))), (Object)arrobject2, (long)5246613090546442867L, (long)l2));
    }

    @Override
    public final /* synthetic */ Object peek() {
        return null;
    }
}

