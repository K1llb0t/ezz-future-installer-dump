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

public final class pK
extends vA {
    private static final /* synthetic */ long a;

    public static /* synthetic */ {
        a = wu.a(1501133487765733163L, -5718981680818688243L, MethodHandles.lookup().lookupClass()).a(140428758660893L);
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        L l2 = (L)object[0];
        long l3 = (Long)object[1];
        object = object[2];
        long l4 = l3 ^ 0x231113B35056L;
        Object[] arrobject = new Object[2];
        arrobject[1] = l4;
        arrobject[0] = (Number)object;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l2, (Object)arrobject, (long)8106643258153085415L, (long)l3));
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x437E79FF8C7EL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object;
        arrobject2[0] = l3;
        return (Number)((Object)ye.a("G", (Object)arrobject2, (long)8403634550009913597L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ Number V(Object[] this) {
        block8: {
            var2_1 = (Long)this[0];
            var1_2 = (vM)this[1];
            var2_1 = pK.a ^ var2_1;
            var4_4 = var2_1 ^ 9879697045605L;
            var6_5 = var2_1 ^ 104326408493672L;
            var8_6 = var2_1 ^ 36550749541148L;
            var10_7 = ye.a("G", (long)8010811829682897487L, (long)var2_1);
            try {
                v0 = var1_2;
                if (var10_7 == null) ** GOTO lbl52
                v1 = new Object[1];
                v1[0] = var4_4;
                if ((e)ye.a("j", (Object)v0, (Object)v1, (long)7891030998302508561L, (long)var2_1) != (e)ye.a("Z", (long)7970305653131640242L, (long)var2_1)) break block8;
                v2 = var1_2;
                ** GOTO lbl36
            }
            catch (NumberFormatException v3) {
                try {
                    throw (NumberFormatException)ye.a("G", (Object)v3, (long)7894326841587753377L, (long)var2_1);
                }
                catch (NumberFormatException v4) {
                    throw (NumberFormatException)ye.a("G", (Object)v4, (long)7894326841587753377L, (long)var2_1);
                }
lbl36:
                // 2 sources

                v5 = new Object[1];
                v5[0] = var6_5;
                ye.a("j", (Object)v2, (Object)v5, (long)7897034515993658332L, (long)var2_1);
                return null;
            }
        }
        try {
            v0 = var1_2;
lbl52:
            // 2 sources

            v6 = new Object[1];
            v6[0] = var8_6;
            return (Integer)ye.a("G", (int)ye.a("j", (Object)v0, (Object)v6, (long)7900781230794663741L, (long)var2_1), (long)7937669465171753851L, (long)var2_1);
        }
        catch (NumberFormatException var1_3) {
            throw new k(var1_3);
        }
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
    }
}

