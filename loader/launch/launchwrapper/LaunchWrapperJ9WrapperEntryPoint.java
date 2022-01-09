/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.loader.launch.launchwrapper;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class LaunchWrapperJ9WrapperEntryPoint {
    private static final /* synthetic */ long a;
    private static /* synthetic */ String[] S;

    public static /* synthetic */ void k(String[] this_) {
        S = this_;
    }

    public static /* synthetic */ void main(String[] this_) {
        long l2 = a ^ 0x7B054C11E6FDL;
        throw (IllegalStateException)((Object)ye.a("G", (long)-8195118685960120317L, (long)l2));
    }

    public static /* synthetic */ String[] M() {
        return S;
    }

    public static /* synthetic */ {
        a = wu.a(-7741233066967143441L, 729528611131499398L, MethodHandles.lookup().lookupClass()).a(61863188303221L);
        long l2 = a ^ 0x34AF607CF8EEL;
        if ((String[])ye.a("G", (long)-7839099764153996312L, (long)l2) == null) {
            ye.a("G", (Object)new String[1], (long)-7832475955785298189L, (long)l2);
        }
    }
}

