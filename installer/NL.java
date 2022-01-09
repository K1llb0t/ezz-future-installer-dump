/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.TQ;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class NL {
    private static final /* synthetic */ long a;
    public /* synthetic */ NL b;
    private /* synthetic */ byte[] h;
    public final /* synthetic */ String u;

    public final /* synthetic */ NL G(Object[] object) {
        Object[] arrobject = object;
        object = (TQ)object[0];
        long l2 = (Long)arrobject[1];
        int n2 = (Integer)arrobject[2];
        int n3 = (Integer)arrobject[3];
        l2 = a ^ l2;
        NL nL = new NL((String)((Object)ye.a("\u00c3", (Object)this, (long)2360921191596706893L, (long)l2)));
        ye.a("F", (Object)nL, (byte[])new byte[n3], (long)2383205169576123615L, (long)l2);
        ye.a("G", (Object)ye.a("\u00c3", (Object)object, (long)2567325971526901180L, (long)l2), (int)n2, (Object)ye.a("\u00c3", (Object)nL, (long)2383205169576123615L, (long)l2), (int)0, (int)n3, (long)2406813063657050497L, (long)l2);
        return nL;
    }

    public /* synthetic */ NL(String string) {
        this.u = string;
    }

    public static /* synthetic */ {
        a = wu.a(-6643948972778201666L, -4875569309518278478L, MethodHandles.lookup().lookupClass()).a(169901488399188L);
    }
}

