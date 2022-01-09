/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.reflect.Type;
import java.util.Collection;
import net.futureclient.installer.EF;
import net.futureclient.installer.Nk;
import net.futureclient.installer.TM;
import net.futureclient.installer.pL;
import net.futureclient.installer.pn;
import net.futureclient.installer.vA;
import net.futureclient.installer.vD;
import net.futureclient.installer.ye;

public final class px
implements Nk {
    private final /* synthetic */ pn H;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ vA V(Object[] object) {
        Class class_;
        Object object2;
        Object object3;
        Type type;
        long l2;
        long l3;
        long l4;
        long l5;
        Object object4;
        long l6;
        block4: {
            block5: {
                Object object5 = object;
                object = (EF)object[0];
                l6 = (Long)object5[1];
                object4 = (pL)object5[2];
                long l7 = l6;
                l5 = l7 ^ 0x6DC5B76C2E02L;
                l4 = l7 ^ 0x4537C1F5008BL;
                l3 = l7 ^ 0x23397BF0B4C9L;
                l2 = l7 ^ 0x135A4B214331L;
                type = (Type)((Object)ye.a("\u00c3", (Object)object4, (long)204420328214964826L, (long)l6));
                CallSite callSite = ye.a("G", (long)6846633142218107L, (long)l6);
                object3 = (Class)((Object)ye.a("\u00c3", (Object)object4, (long)110292910009429894L, (long)l6));
                try {
                    object2 = Collection.class;
                    class_ = object3;
                    if (callSite == null) break block4;
                    if (ye.a("j", object2, (Object)class_, (long)14258097406989519L, (long)l6) != false) break block5;
                    return null;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)195494822709564045L, (long)l6));
                    }
                    catch (RuntimeException runtimeException2) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)195494822709564045L, (long)l6));
                    }
                }
            }
            object2 = type;
            class_ = object3;
        }
        Object[] arrobject = new Object[3];
        arrobject[2] = l5;
        arrobject[1] = class_;
        arrobject[0] = object2;
        type = (Type)((Object)ye.a("G", (Object)arrobject, (long)178214087975922736L, (long)l6));
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l4;
        arrobject2[0] = type;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = l3;
        arrobject3[0] = (pL)((Object)ye.a("G", (Object)arrobject2, (long)110830329297508861L, (long)l6));
        object3 = (vA)((Object)ye.a("j", (Object)object, (Object)arrobject3, (long)118099467643802887L, (long)l6));
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = object4;
        arrobject4[0] = l2;
        object4 = (TM)((Object)ye.a("j", (Object)((pn)((Object)ye.a("\u00c3", (Object)this, (long)18166480724688411L, (long)l6))), (Object)arrobject4, (long)17248230343589067L, (long)l6));
        return new vD((EF)object, type, (vA)object3, (TM)object4);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ px(pn pn2) {
        this.H = pn2;
    }
}

