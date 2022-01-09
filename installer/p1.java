/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import net.futureclient.installer.B;
import net.futureclient.installer.TG;
import net.futureclient.installer.pm;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class p1
extends pm {
    private /* synthetic */ B K;
    private static final /* synthetic */ long b;

    public static /* synthetic */ {
        b = wu.a(-6540075740338386744L, 7944929714759351962L, MethodHandles.lookup().lookupClass()).a(141952868091585L);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        long l2 = b ^ 0x3B6E00C68E91L;
        long l3 = l2 ^ 0x642DB4533C5EL;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 56);
        int n4 = (int)(l3 << 40 >>> 40);
        return new TG(n2, (B)((Object)ye.a("\u00c3", (Object)this, (long)-8947588317697544436L, (long)l2)), (byte)n3, n4);
    }

    @Override
    public final /* synthetic */ boolean contains(Object object) {
        long l2 = b ^ 0x1FF7FBAB1111L;
        return (boolean)ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("\u00c3", (Object)this, (long)2022192875850356885L, (long)l2))), (Object)object, (long)2212933769315192611L, (long)l2);
    }

    public /* synthetic */ p1(B b2, ConcurrentMap concurrentMap) {
        this.K = b2;
        super(concurrentMap);
    }

    @Override
    public final /* synthetic */ boolean remove(Object object) {
        long l2 = b ^ 0x14CCA486E2C5L;
        try {
            if ((Object)ye.a("j", (Object)((ConcurrentMap)((Object)ye.a("\u00c3", (Object)this, (long)-1169723623912559807L, (long)l2))), (Object)object, (long)-1231767401484888934L, (long)l2) != null) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-1304977731103733067L, (long)l2));
        }
        return false;
    }
}

