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

public final class pN
extends vA {
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x6348D9E7EFACL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (Number)((Object)ye.a("G", (Object)arrobject2, (long)8605767822300056285L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ Number S(Object[] this) {
        block8: {
            var3_1 = (vM)this[0];
            var1_3 = (Long)this[1];
            var1_3 = pN.a ^ var1_3;
            var4_4 = var1_3 ^ 86250325349720L;
            var6_5 = var1_3 ^ 26867458438997L;
            var8_6 = var1_3 ^ 114022014090785L;
            var10_7 = ye.a("G", (long)4760683482884812658L, (long)var1_3);
            try {
                v0 = var3_1;
                if (var10_7 == null) ** GOTO lbl52
                v1 = new Object[1];
                v1[0] = var4_4;
                if ((e)ye.a("j", (Object)v0, (Object)v1, (long)4665681314848893740L, (long)var1_3) != (e)ye.a("Z", (long)4873299754884714639L, (long)var1_3)) break block8;
                v2 = var3_1;
                ** GOTO lbl36
            }
            catch (NumberFormatException v3) {
                try {
                    throw (NumberFormatException)ye.a("G", (Object)v3, (long)4655673466939178769L, (long)var1_3);
                }
                catch (NumberFormatException v4) {
                    throw (NumberFormatException)ye.a("G", (Object)v4, (long)4655673466939178769L, (long)var1_3);
                }
lbl36:
                // 2 sources

                v5 = new Object[1];
                v5[0] = var6_5;
                ye.a("j", (Object)v2, (Object)v5, (long)4659714338332421857L, (long)var1_3);
                return null;
            }
        }
        try {
            v0 = var3_1;
lbl52:
            // 2 sources

            v6 = new Object[1];
            v6[0] = var8_6;
            return (Byte)ye.a("G", (byte)((byte)ye.a("j", (Object)v0, (Object)v6, (long)4654593526187870720L, (long)var1_3)), (long)4841743598462462695L, (long)var1_3);
        }
        catch (NumberFormatException var3_2) {
            throw new k(var3_2);
        }
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
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

    public static /* synthetic */ {
        a = wu.a(-3094127843341118685L, -5747556415854080708L, MethodHandles.lookup().lookupClass()).a(51711440116400L);
    }
}

