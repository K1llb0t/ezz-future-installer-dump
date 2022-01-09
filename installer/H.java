/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class H {
    private static final /* synthetic */ long a;

    public static /* synthetic */ void U(Object[] this_) {
        DataOutputStream dataOutputStream = (DataOutputStream)this_[0];
        long l2 = (Long)this_[1];
        byte[] arrby = (byte[])this_[2];
        l2 = a ^ l2;
        ye.a("j", (Object)dataOutputStream, (int)arrby.length, (long)7269720886430645522L, (long)l2);
        ye.a("j", (Object)dataOutputStream, (Object)arrby, (long)7299393316928769204L, (long)l2);
    }

    public static /* synthetic */ {
        a = wu.a(-3387217547449240065L, -2548607306392203591L, MethodHandles.lookup().lookupClass()).a(204953910538566L);
    }
}

