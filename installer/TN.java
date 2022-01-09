/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.SecureRandom;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class TN {
    private static final /* synthetic */ long a;

    public final /* synthetic */ int hashCode() {
        Object object = a ^ 0x1D03299DB6F3L;
        long l2 = object ^ 0x6F122CA31A73L;
        long l3 = object ^ 0x58AB7ABA3A28L;
        long l4 = object ^ 0x457F32259B6BL;
        long l5 = object ^ 0x7011ABE9E6E7L;
        long l6 = object ^ 0x38E8F5F5E957L;
        long l7 = object ^ 0x403E592BD420L;
        long l8 = object ^ 0x12DDF05EDC1EL;
        long l9 = object ^ 0x7981BA00E956L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l9;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l2;
        arrobject2[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject3 = new Object[1];
        arrobject3[0] = l9;
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = l3;
        arrobject4[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject5 = new Object[1];
        arrobject5[0] = l9;
        Object[] arrobject6 = new Object[2];
        arrobject6[1] = l8;
        arrobject6[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject5, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject7 = new Object[1];
        arrobject7[0] = l9;
        Object[] arrobject8 = new Object[2];
        arrobject8[1] = l7;
        arrobject8[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject9 = new Object[1];
        arrobject9[0] = l9;
        Object[] arrobject10 = new Object[2];
        arrobject10[1] = l4;
        arrobject10[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject9, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject11 = new Object[1];
        arrobject11[0] = l9;
        Object[] arrobject12 = new Object[2];
        arrobject12[1] = l6;
        arrobject12[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        Object[] arrobject13 = new Object[1];
        arrobject13[0] = l9;
        Object[] arrobject14 = new Object[2];
        arrobject14[1] = l5;
        arrobject14[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject13, (long)-7945684569050745164L, (long)object))), (long)-8062769974346576895L, (long)object);
        reference v14 = ye.a("G", (Object)arrobject2, (long)-8008016133021918721L, (long)object) ^ ye.a("G", (Object)arrobject4, (long)-8020118981470688362L, (long)object) ^ ye.a("G", (Object)arrobject6, (long)-8028022831378331899L, (long)object) ^ ye.a("G", (Object)arrobject8, (long)-8033754738712466231L, (long)object) ^ ye.a("G", (Object)arrobject10, (long)-8024695967330832661L, (long)object) ^ ye.a("G", (Object)arrobject12, (long)-8002776654908457186L, (long)object) ^ ye.a("G", (Object)arrobject14, (long)-8009723816515802468L, (long)object);
        object = v14;
        return (int)(v14 >>> 32 ^ object);
    }

    private static /* synthetic */ long D(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x1B2C59F09D8FL;
            l2 = l4 ^ 0x10C12F50F735L;
            int n2 = 0;
            callSite = ye.a("G", (long)-8087537360508165472L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)-8073887196987431490L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)-8073887196987431490L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)-8073887196987431490L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)-8073887196987431490L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                if (l4 <= 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-8073887196987431490L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)-8073887196987431490L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)-8073887196987431490L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)-8073887196987431490L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)-8073887196987431490L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                    if (l4 <= 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-8073887196987431490L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)-8073887196987431490L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)-8073887196987431490L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)-8073887196987431490L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)-8073887196987431490L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)-8073887196987431490L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)-8073887196987431490L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)-8073887196987431490L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                                                    if (l4 <= 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)-8081664747403122473L, (long)l4))), (long)-8180753342650969502L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long J(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x7B6FD6BF4EF0L;
            l2 = l4 ^ 0x7082A01F244AL;
            int n2 = 0;
            callSite = ye.a("G", (long)6682264176514707935L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)6668892188378838721L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)6668892188378838721L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)6668892188378838721L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)6668892188378838721L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                if (l4 < 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)6668892188378838721L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)6668892188378838721L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)6668892188378838721L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)6668892188378838721L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)6668892188378838721L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                    if (l4 <= 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)6668892188378838721L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)6668892188378838721L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)6668892188378838721L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)6668892188378838721L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)6668892188378838721L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)6668892188378838721L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)6668892188378838721L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)6668892188378838721L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                                                    if (l4 <= 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)6676385205247458216L, (long)l4))), (long)6703397412217340189L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    public static /* synthetic */ {
        a = wu.a(-7554664950843774897L, -3013868207603740316L, MethodHandles.lookup().lookupClass()).a(26336186810515L);
    }

    private static /* synthetic */ long S(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x339688A34140L;
            l2 = l4 ^ 0x387BFE032BFAL;
            int n2 = 0;
            callSite = ye.a("G", (long)5984267011514318447L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)5997918281014360433L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)5997918281014360433L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)5997918281014360433L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)5997918281014360433L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                if (l4 <= 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)5997918281014360433L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)5997918281014360433L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)5997918281014360433L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)5997918281014360433L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)5997918281014360433L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                    if (l4 < 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)5997918281014360433L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)5997918281014360433L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)5997918281014360433L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)5997918281014360433L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)5997918281014360433L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)5997918281014360433L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)5997918281014360433L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)5997918281014360433L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                                                    if (l4 < 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)5987254237135811608L, (long)l4))), (long)5960242078517612205L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long p(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x515AD3147BB9L;
            l2 = l4 ^ 0x5AB7A5B41103L;
            int n2 = 0;
            callSite = ye.a("G", (long)7635010840526128278L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)7621638860796691336L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)7621638860796691336L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)7621638860796691336L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)7621638860796691336L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                if (l4 <= 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)7621638860796691336L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)7621638860796691336L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)7621638860796691336L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)7621638860796691336L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)7621638860796691336L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                    if (l4 <= 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)7621638860796691336L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)7621638860796691336L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)7621638860796691336L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)7621638860796691336L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)7621638860796691336L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)7621638860796691336L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)7621638860796691336L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)7621638860796691336L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                                                    if (l4 < 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)7633147053662113505L, (long)l4))), (long)7516061767787082836L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long N(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x2C950FE9BDD4L;
            l2 = l4 ^ 0x27787949D76EL;
            int n2 = 0;
            callSite = ye.a("G", (long)-5793744411230944517L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)-5789098154739350043L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)-5789098154739350043L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)-5789098154739350043L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)-5789098154739350043L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                if (l4 <= 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-5789098154739350043L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)-5789098154739350043L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)-5789098154739350043L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)-5789098154739350043L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)-5789098154739350043L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                    if (l4 < 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-5789098154739350043L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)-5789098154739350043L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)-5789098154739350043L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)-5789098154739350043L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)-5789098154739350043L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)-5789098154739350043L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)-5789098154739350043L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)-5789098154739350043L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                                                    if (l4 <= 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)-5799757800479111028L, (long)l4))), (long)-5898845158238440903L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long z(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x3B97A617387L;
            l2 = l4 ^ 0x8540CC1193DL;
            int n2 = 0;
            callSite = ye.a("G", (long)7046817352496975016L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)7060468605882502070L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)7060468605882502070L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)7060468605882502070L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)7060468605882502070L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                if (l4 < 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)7060468605882502070L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)7060468605882502070L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)7060468605882502070L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)7060468605882502070L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)7060468605882502070L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                    if (l4 <= 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)7060468605882502070L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)7060468605882502070L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)7060468605882502070L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)7060468605882502070L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)7060468605882502070L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)7060468605882502070L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)7060468605882502070L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)7060468605882502070L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                                                    if (l4 < 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)7048186391811622623L, (long)l4))), (long)6949116590300527722L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long W(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x6F8116F3CCCL;
            l2 = l4 ^ 0xD1567CF5676L;
            int n2 = 0;
            callSite = ye.a("G", (long)3350773001001518051L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)3364425915431044349L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)3364425915431044349L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)3364425915431044349L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)3364425915431044349L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                if (l4 < 0L) break block37;
                                if (callSite != null) continue;
                            }
                        }
                    }
                }
                break;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            Object[] arrobject17 = new Object[1];
            arrobject17[0] = l2;
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)3364425915431044349L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)3364425915431044349L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)3364425915431044349L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)3364425915431044349L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)3364425915431044349L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                    if (l4 < 0L) break block38;
                                    if (callSite != null) continue;
                                }
                            }
                        }
                    }
                    break;
                }
                Object[] arrobject35 = new Object[1];
                arrobject35[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)3364425915431044349L, (long)l4));
            }
            catch (Throwable throwable9) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject36 = new Object[1];
                arrobject36[0] = l2;
                Object[] arrobject37 = new Object[1];
                arrobject37[0] = l2;
                Object[] arrobject38 = new Object[1];
                arrobject38[0] = l2;
                Object[] arrobject39 = new Object[1];
                arrobject39[0] = l2;
                Object[] arrobject40 = new Object[1];
                arrobject40[0] = l2;
                Object[] arrobject41 = new Object[1];
                arrobject41[0] = l2;
                Object[] arrobject42 = new Object[1];
                arrobject42[0] = l2;
                Object[] arrobject43 = new Object[1];
                arrobject43[0] = l2;
                Object[] arrobject44 = new Object[1];
                arrobject44[0] = l2;
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)3364425915431044349L, (long)l4));
                }
                catch (Throwable throwable10) {
                    long l6;
                    block39: {
                        Object[] arrobject46 = new Object[1];
                        arrobject46[0] = l2;
                        Object[] arrobject47 = new Object[1];
                        arrobject47[0] = l2;
                        Object[] arrobject48 = new Object[1];
                        arrobject48[0] = l2;
                        Object[] arrobject49 = new Object[1];
                        arrobject49[0] = l2;
                        Object[] arrobject50 = new Object[1];
                        arrobject50[0] = l2;
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)3364425915431044349L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)3364425915431044349L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)3364425915431044349L, (long)l4));
                                    }
                                    catch (Throwable throwable13) {
                                        Object[] arrobject59 = new Object[1];
                                        arrobject59[0] = l2;
                                        Object[] arrobject60 = new Object[1];
                                        arrobject60[0] = l2;
                                        Object[] arrobject61 = new Object[1];
                                        arrobject61[0] = l2;
                                        Object[] arrobject62 = new Object[1];
                                        arrobject62[0] = l2;
                                        Object[] arrobject63 = new Object[1];
                                        arrobject63[0] = l2;
                                        Object[] arrobject64 = new Object[1];
                                        arrobject64[0] = l2;
                                        Object[] arrobject65 = new Object[1];
                                        arrobject65[0] = l2;
                                        Object[] arrobject66 = new Object[1];
                                        arrobject66[0] = l2;
                                        Object[] arrobject67 = new Object[1];
                                        arrobject67[0] = l2;
                                        Object[] arrobject68 = new Object[1];
                                        arrobject68[0] = l2;
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)3364425915431044349L, (long)l4));
                                        }
                                        catch (Throwable throwable14) {
                                            Object[] arrobject70 = new Object[1];
                                            arrobject70[0] = l2;
                                            Object[] arrobject71 = new Object[1];
                                            arrobject71[0] = l2;
                                            Object[] arrobject72 = new Object[1];
                                            arrobject72[0] = l2;
                                            Object[] arrobject73 = new Object[1];
                                            arrobject73[0] = l2;
                                            Object[] arrobject74 = new Object[1];
                                            arrobject74[0] = l2;
                                            Object[] arrobject75 = new Object[1];
                                            arrobject75[0] = l2;
                                            Object[] arrobject76 = new Object[1];
                                            arrobject76[0] = l2;
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)3364425915431044349L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)3364425915431044349L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                                                    if (l4 < 0L) break block39;
                                                    ++n4;
                                                    l5 = l6;
                                                    if (callSite != null) continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        Object[] arrobject85 = new Object[1];
                        arrobject85[0] = l2;
                        Object[] arrobject86 = new Object[1];
                        arrobject86[0] = l2;
                        Object[] arrobject87 = new Object[1];
                        arrobject87[0] = l2;
                        Object[] arrobject88 = new Object[1];
                        arrobject88[0] = l2;
                        Object[] arrobject89 = new Object[1];
                        arrobject89[0] = l2;
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)3358336699496319380L, (long)l4))), (long)3403382086834107169L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }
}

