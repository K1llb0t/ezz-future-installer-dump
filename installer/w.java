/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import net.futureclient.installer.F;
import net.futureclient.installer.TK;
import net.futureclient.installer.XF;
import net.futureclient.installer.Z;
import net.futureclient.installer.ye;

public final class w
extends Z {
    public final /* synthetic */ AtomicReferenceFieldUpdater d;
    public final /* synthetic */ AtomicReferenceFieldUpdater N;
    public final /* synthetic */ AtomicReferenceFieldUpdater O;
    public final /* synthetic */ AtomicReferenceFieldUpdater V;
    public final /* synthetic */ AtomicReferenceFieldUpdater o;

    @Override
    public final /* synthetic */ boolean W(Object[] object) {
        Object[] arrobject = object;
        object = (XF)object[0];
        TK tK = (TK)arrobject[1];
        TK tK2 = (TK)arrobject[2];
        long l2 = (Long)arrobject[3];
        return ((AtomicReferenceFieldUpdater)((Object)ye.a("\u00c3", (Object)this, (long)636507549652717945L, (long)l2))).compareAndSet(object, tK, tK2);
    }

    public /* synthetic */ w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        w w2 = this;
        w w3 = this;
        super((byte)0);
        this.N = atomicReferenceFieldUpdater;
        w3.o = atomicReferenceFieldUpdater2;
        w3.d = atomicReferenceFieldUpdater3;
        w2.V = atomicReferenceFieldUpdater4;
        w2.O = atomicReferenceFieldUpdater5;
    }

    @Override
    public final /* synthetic */ void f(Object[] object) {
        Object[] arrobject = object;
        object = (TK)object[0];
        Thread thread = (Thread)arrobject[1];
        long l2 = (Long)arrobject[2];
        ((AtomicReferenceFieldUpdater)((Object)ye.a("\u00c3", (Object)this, (long)1796234954325131878L, (long)l2))).lazySet(object, thread);
    }

    @Override
    public final /* synthetic */ void J(Object[] object) {
        Object[] arrobject = object;
        object = (TK)object[0];
        long l2 = (Long)arrobject[1];
        TK tK = (TK)arrobject[2];
        ((AtomicReferenceFieldUpdater)((Object)ye.a("\u00c3", (Object)this, (long)9058377401700924986L, (long)l2))).lazySet(object, tK);
    }

    @Override
    public final /* synthetic */ boolean m(Object[] object) {
        Object[] arrobject = object;
        XF xF = (XF)object[0];
        long l2 = (Long)arrobject[1];
        object = arrobject[2];
        Object object2 = arrobject[3];
        return ((AtomicReferenceFieldUpdater)((Object)ye.a("\u00c3", (Object)this, (long)5150988881027153476L, (long)l2))).compareAndSet(xF, object, object2);
    }

    @Override
    public final /* synthetic */ boolean i(Object[] object) {
        Object[] arrobject = object;
        long l2 = (Long)object[0];
        XF xF = (XF)arrobject[1];
        object = (F)arrobject[2];
        F f2 = (F)arrobject[3];
        return ((AtomicReferenceFieldUpdater)((Object)ye.a("\u00c3", (Object)this, (long)8876338340265197918L, (long)l2))).compareAndSet(xF, object, f2);
    }
}

