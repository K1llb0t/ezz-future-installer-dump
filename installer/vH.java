/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import net.futureclient.installer.L;
import net.futureclient.installer.e;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class vH
extends vA {
    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        long l2;
        long l3;
        block6: {
            Object object2;
            long l4;
            block5: {
                Object[] arrobject = object;
                object = (vM)object[0];
                l3 = (Long)arrobject[1];
                long l5 = l3 ^ 0x1F749D2A225EL;
                l2 = l3 ^ 0x50EF1C9F79BL;
                l4 = l3 ^ 0x496AB47BC053L;
                CallSite callSite = ye.a("G", (long)8437222746236131444L, (long)l3);
                try {
                    object2 = object;
                    if (callSite == null) break block5;
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l5;
                    if ((e)((Object)ye.a("j", (Object)object2, (Object)arrobject2, (long)8627073254665083946L, (long)l3)) != (e)((Object)ye.a("Z", (long)8405723837677561737L, (long)l3))) break block6;
                    object2 = object;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8474258528771643925L, (long)l3));
                    }
                    catch (RuntimeException runtimeException2) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)8474258528771643925L, (long)l3));
                    }
                }
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l4;
            ye.a("j", (Object)object2, (Object)arrobject, (long)8623531842780404199L, (long)l3);
            return null;
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        return new StringBuilder((String)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)8390924752238081716L, (long)l3)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void Z(Object[] object) {
        String string;
        long l2;
        long l3;
        block6: {
            Object object2;
            block4: {
                Object object3;
                block5: {
                    Object object4 = object;
                    object = (L)object[0];
                    l3 = (Long)object4[1];
                    object3 = object4[2];
                    l2 = l3 ^ 0x1F239A2408EEL;
                    CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l3);
                    object2 = object3 = (StringBuilder)object3;
                    try {
                        if (callSite == null) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        try {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8248862067260464630L, (long)l3));
                        }
                        catch (RuntimeException runtimeException2) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)8248862067260464630L, (long)l3));
                        }
                    }
                    string = null;
                    break block6;
                }
                object2 = object3;
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)8326787111714395961L, (long)l3));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l2;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)8326898731959281976L, (long)l3));
    }
}

