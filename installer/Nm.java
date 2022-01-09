/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import net.futureclient.installer.NU;
import net.futureclient.installer.p8;
import net.futureclient.installer.pz;
import net.futureclient.installer.ye;

public final class Nm
extends NU {
    private /* synthetic */ pz q;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object m(Object[] object) {
        p8 p82;
        p8 p83;
        block4: {
            long l2 = (Long)object[0];
            object = object[1];
            long l3 = l2 ^ 0x1B4E78C87B44L;
            p83 = (p8)object;
            object = this;
            CallSite callSite = ye.a("G", (long)-613025490047559139L, (long)l2);
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            p82 = p83 = (p8)((Object)ye.a("j", (Object)p83, (Object)arrobject, (long)-754320974623506478L, (long)l2));
            try {
                if (callSite == null) return p82;
                if (p82 != (p8)((Object)ye.a("\u00c3", (Object)((pz)((Object)ye.a("\u00c3", (Object)object, (long)-677653245574204883L, (long)l2))), (long)-698898425481077143L, (long)l2))) break block4;
                return null;
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-654530836505800963L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-654530836505800963L, (long)l2));
                }
            }
        }
        p82 = p83;
        return p82;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ Nm(pz pz2, p8 p82) {
        this.q = pz2;
        super(p82);
    }
}

