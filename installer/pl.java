/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.L;
import net.futureclient.installer.e;
import net.futureclient.installer.k;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class pl
extends vA {
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        Object[] arrobject = object;
        object = (L)object[0];
        long l2 = (Long)arrobject[1];
        Object object2 = arrobject[2];
        long l3 = l2 ^ 0x231113B35056L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = (Number)object2;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject2, (long)8106643258153085415L, (long)l2));
    }

    public static /* synthetic */ {
        a = wu.a(-2986880465369117399L, 8787997086482933283L, MethodHandles.lookup().lookupClass()).a(204963695518949L);
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x3499E47C450DL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (Number)((Object)ye.a("G", (Object)arrobject2, (long)8644901620597181754L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ Number T(Object[] this) {
        block8: {
            var3_1 = (vM)this[0];
            var1_3 = (Long)this[1];
            var1_3 = pl.a ^ var1_3;
            var4_4 = var1_3 ^ 108414614799677L;
            var6_5 = var1_3 ^ 40009283011777L;
            var8_6 = var1_3 ^ 125882442966732L;
            var10_7 = ye.a("G", (long)6019116381523427051L, (long)var1_3);
            try {
                v0 = var3_1;
                if (var10_7 == null) ** GOTO lbl52
                v1 = new Object[1];
                v1[0] = var6_5;
                if ((e)ye.a("j", (Object)v0, (Object)v1, (long)5847570611435862709L, (long)var1_3) != (e)ye.a("Z", (long)5924514294375760150L, (long)var1_3)) break block8;
                v2 = var3_1;
                ** GOTO lbl36
            }
            catch (NumberFormatException v3) {
                try {
                    throw (NumberFormatException)ye.a("G", (Object)v3, (long)5970508709393109478L, (long)var1_3);
                }
                catch (NumberFormatException v4) {
                    throw (NumberFormatException)ye.a("G", (Object)v4, (long)5970508709393109478L, (long)var1_3);
                }
lbl36:
                // 2 sources

                v5 = new Object[1];
                v5[0] = var8_6;
                ye.a("j", (Object)v2, (Object)v5, (long)5851244170823483256L, (long)var1_3);
                return null;
            }
        }
        try {
            v0 = var3_1;
lbl52:
            // 2 sources

            v6 = new Object[1];
            v6[0] = var4_4;
            return (Long)ye.a("G", (long)ye.a("j", (Object)v0, (Object)v6, (long)6023944956546244018L, (long)var1_3), (long)5935566698746703882L, (long)var1_3);
        }
        catch (NumberFormatException var3_2) {
            throw new k(var3_2);
        }
    }
}

