/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.DataInputStream;
import java.lang.invoke.CallSite;
import net.futureclient.installer.TH;
import net.futureclient.installer.v0;
import net.futureclient.installer.ye;

public class Ti
extends TH {
    private /* synthetic */ String x;
    public /* synthetic */ boolean p;
    private /* synthetic */ String i;
    private /* synthetic */ String V;
    public /* synthetic */ String Q;

    @Override
    public final /* synthetic */ void w(Object[] object) {
        long l2 = (Long)object[0];
        object = (v0)object[1];
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)32230822890511014L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)90030989315068959L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)196941132705732866L, (long)l2))), (long)183547887601017616L, (long)l2);
    }

    public /* synthetic */ Ti() {
    }

    @Override
    public final /* synthetic */ int Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return 2;
    }

    @Override
    public final /* synthetic */ void U(Object[] object) {
        block6: {
            Ti ti;
            long l2;
            block5: {
                Object[] arrobject = object;
                object = (DataInputStream)object[0];
                l2 = (Long)arrobject[1];
                CallSite callSite = ye.a("G", (long)7916316916738097343L, (long)l2);
                ye.a("F", (Object)this, (boolean)ye.a("j", (Object)object, (long)7878520610949401765L, (long)l2), (long)7891787664250728874L, (long)l2);
                CallSite callSite2 = callSite;
                try {
                    ti = this;
                    if (callSite2 == null) break block5;
                    if (ye.a("\u00c3", (Object)ti, (long)7891787664250728874L, (long)l2) != false) break block6;
                    ti = this;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)7830067926419829742L, (long)l2));
                    }
                    catch (RuntimeException runtimeException2) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)7830067926419829742L, (long)l2));
                    }
                }
            }
            ye.a("F", (Object)ti, (String)((String)((Object)ye.a("j", (Object)object, (long)7808364854606927854L, (long)l2))), (long)7909219544706693293L, (long)l2);
        }
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ Ti(String string, String string2, String string3) {
        Ti ti = this;
        this.x = string;
        ti.i = string2;
        ti.V = string3;
    }
}

