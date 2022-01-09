/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import net.futureclient.installer.Nu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class Nf
extends AbstractCollection
implements Serializable {
    private static final /* synthetic */ long a;
    private static final /* synthetic */ Object[] k;

    @Override
    @Deprecated
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        long l2 = a ^ 0x253652108216L;
        long l3 = l2 ^ 0x5084BE3809EL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (Nu)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)621101202900103489L, (long)l2));
    }

    public abstract /* synthetic */ Nu l(Object[] var1);

    @Override
    @Deprecated
    public final /* synthetic */ boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final /* synthetic */ boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final /* synthetic */ boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ {
        a = wu.a(1945753874790670530L, -309287736113849604L, MethodHandles.lookup().lookupClass()).a(275424853355009L);
        k = new Object[0];
    }

    public /* synthetic */ int e(Object[] arrobject3) {
        long l2 = (Long)arrobject3[0];
        Object[] arrobject2 = (Object[])arrobject3[1];
        int arrobject3 = (Integer)arrobject3[2];
        long l3 = l2 ^ 0x728B962EAF49L;
        Object[] arrobject4 = new Object[1];
        arrobject4[0] = l3;
        Nu nu = (Nu)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)2831057461671141014L, (long)l2));
        CallSite callSite = ye.a("G", (long)2841590545517070860L, (long)l2);
        while (ye.a("j", (Object)nu, (long)2785117295772212343L, (long)l2) != false) {
            Object object = ye.a("j", (Object)nu, (long)2673046530042102880L, (long)l2);
            arrobject2[arrobject3++] = object;
            if (callSite != null) continue;
        }
        return arrobject3;
    }

    @Override
    @Deprecated
    public final /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object[] toArray(Object[] this) {
        block12: {
            block13: {
                block11: {
                    block10: {
                        var2_2 = Nf.a ^ 37273611042869L;
                        var4_3 = var2_2 ^ 126804606397940L;
                        var6_4 = var2_2 ^ 24859492390841L;
                        v0 = new Object[2];
                        v0[1] = this;
                        v0[0] = var6_4;
                        (Object)ye.a("G", (Object)v0, (long)612053056156339417L, (long)var2_2);
                        var7_6 = ye.a("j", (Object)this, (long)844749116101234497L, (long)var2_2);
                        var6_5 = ye.a("G", (long)764249471174469624L, (long)var2_2);
                        try {
                            v1 /* !! */  = this.length;
                            v2 = var7_6;
                            if (var6_5 == null) break block10;
                            if (v1 /* !! */  < v2) {
                            }
                            ** GOTO lbl34
                        }
                        catch (UnsupportedOperationException v3) {
                            throw (UnsupportedOperationException)ye.a("G", (Object)v3, (long)762172229956833331L, (long)var2_2);
                        }
                        this = (Object[])ye.a("G", (Object)((Class)ye.a("j", this.getClass(), (long)846766893312949681L, (long)var2_2)), (int)var7_6, (long)847324635184087985L, (long)var2_2);
                        try {
                            if (var6_5 != null) break block11;
lbl34:
                            // 2 sources

                            v1 /* !! */  = this.length;
                            if (var6_5 == null) break block12;
                            v2 = var7_6;
                        }
                        catch (UnsupportedOperationException v4) {
                            try {
                                throw (UnsupportedOperationException)ye.a("G", (Object)v4, (long)762172229956833331L, (long)var2_2);
                            }
                            catch (UnsupportedOperationException v5) {
                                throw (UnsupportedOperationException)ye.a("G", (Object)v5, (long)762172229956833331L, (long)var2_2);
                            }
                        }
                    }
                    try {
                        if (v1 /* !! */  <= v2) break block11;
                        this[var7_6] = null;
                        v6 = this;
                        break block13;
                    }
                    catch (UnsupportedOperationException v7) {
                        throw (UnsupportedOperationException)ye.a("G", (Object)v7, (long)762172229956833331L, (long)var2_2);
                    }
                }
                v6 = this;
            }
            v8 = new Object[3];
            v8[2] = 0;
            v8[1] = this;
            v8[0] = var4_3;
            v1 /* !! */  = (int)ye.a("j", (Object)v6, (Object)v8, (long)825663904449404844L, (long)var2_2);
        }
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object[] toArray() {
        CallSite callSite;
        long l2;
        long l3;
        block4: {
            CallSite callSite2;
            block5: {
                l3 = a ^ 0x63E1F1238F3DL;
                l2 = l3 ^ 0x31547EFE22FCL;
                CallSite callSite3 = ye.a("G", (long)401782301137660144L, (long)l3);
                callSite = callSite2 = ye.a("j", (Object)this, (long)338162359945199689L, (long)l3);
                try {
                    if (callSite3 == null) break block4;
                    if (callSite != false) break block5;
                    return (Object[])ye.a("Z", (long)525058231019610223L, (long)l3);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    try {
                        throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)404063502568103739L, (long)l3));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException2) {
                        throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException2, (long)404063502568103739L, (long)l3));
                    }
                }
            }
            callSite = callSite2;
        }
        Object[] arrobject = new Object[callSite];
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = 0;
        arrobject2[1] = arrobject;
        arrobject2[0] = l2;
        ye.a("j", (Object)this, (Object)arrobject2, (long)323444391331664036L, (long)l3);
        return arrobject;
    }

    private static /* synthetic */ UnsupportedOperationException a(UnsupportedOperationException this_) {
        return this_;
    }

    @Override
    public /* synthetic */ Spliterator spliterator() {
        long l2 = a ^ 0x14B7D3FAA3C8L;
        return (Spliterator)((Object)ye.a("G", (Object)this, (int)1296, (long)3151785468904453109L, (long)l2));
    }

    @Override
    @Deprecated
    public final /* synthetic */ boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final /* synthetic */ boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }
}

