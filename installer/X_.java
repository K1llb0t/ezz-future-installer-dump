/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javafx.concurrent.Task
 *  javafx.stage.DirectoryChooser
 *  javafx.stage.Stage
 */
package net.futureclient.installer;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import javafx.concurrent.Task;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import net.futureclient.installer.Tu;
import net.futureclient.installer.pu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class X_
extends Task {
    private /* synthetic */ pu N;
    private static final /* synthetic */ long a;

    public final /* synthetic */ Object call() {
        long l2 = a ^ 0x5FE063A46AD8L;
        ye.a("G", () -> {
            long l2 = a ^ 0x697CAC3D1716L;
            long l3 = l2 ^ 0x2BBB554597ADL;
            long l4 = l2 ^ 0x1EB5E5D527A2L;
            long l5 = l2 ^ 0x337ABF3DC99BL;
            Object object = new DirectoryChooser();
            Object[] arrobject = new Object[1];
            arrobject[0] = l5;
            ye.a("j", (Object)object, (Object)((File)((Object)ye.a("j", (Object)((Path)((Object)ye.a("G", (Object)arrobject, (long)5466769725908127641L, (long)l2))), (long)5199857491799595572L, (long)l2))), (long)5429487487673310738L, (long)l2);
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = l3;
            object = (File)((Object)ye.a("j", (Object)object, (Object)((Stage)ye.a("G", (Object)arrobject2, (long)5337943497131121998L, (long)l2)), (long)5201177833615023909L, (long)l2));
            try {
                if (object != null) {
                    Object[] arrobject3 = new Object[3];
                    arrobject3[2] = (Path)((Object)ye.a("j", (Object)object, (long)5439440201042793625L, (long)l2));
                    arrobject3[1] = (Tu)((Object)((Object)ye.a("\u00c3", (Object)((Object)((pu)((Object)((Object)ye.a("\u00c3", (Object)((Object)this), (long)5332939188580844447L, (long)l2))))), (long)5434021100093099804L, (long)l2)));
                    arrobject3[0] = l4;
                    ye.a("G", (Object)arrobject3, (long)5409606329367094048L, (long)l2);
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)5412135624935866757L, (long)l2));
            }
        }, (long)3955849970488531612L, (long)l2);
        return null;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public static /* synthetic */ {
        a = wu.a(-6614472290875234849L, -7940840440093164341L, MethodHandles.lookup().lookupClass()).a(31187219743506L);
    }

    public /* synthetic */ X_(pu pu2) {
        this.N = pu2;
    }
}

