/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.DataInputStream;
import net.futureclient.installer.TH;
import net.futureclient.installer.v0;
import net.futureclient.installer.ye;

public class Tg
extends TH {
    private /* synthetic */ String X;
    public /* synthetic */ String t;
    private /* synthetic */ String C;
    private /* synthetic */ String k;
    public /* synthetic */ boolean j;

    @Override
    public final /* synthetic */ int Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return 3;
    }

    @Override
    public final /* synthetic */ void U(Object[] object) {
        Object[] arrobject = object;
        object = (DataInputStream)object[0];
        long l2 = (Long)arrobject[1];
        ye.a("F", (Object)this, (boolean)ye.a("j", (Object)object, (long)7878520610949401765L, (long)l2), (long)8050524834677623135L, (long)l2);
        ye.a("F", (Object)this, (String)((String)((Object)ye.a("j", (Object)object, (long)7808364854606927854L, (long)l2))), (long)8013774491372017665L, (long)l2);
    }

    @Override
    public final /* synthetic */ void w(Object[] object) {
        long l2 = (Long)object[0];
        object = (v0)object[1];
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)19361205933835328L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)127144553665290920L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)29539790435300182L, (long)l2))), (long)183547887601017616L, (long)l2);
    }

    public /* synthetic */ Tg() {
    }

    public /* synthetic */ Tg(String string, String string2, String string3) {
        Tg tg = this;
        this.X = string;
        tg.C = string2;
        tg.k = string3;
    }
}

