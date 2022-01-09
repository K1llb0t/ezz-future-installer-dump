/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.SecureRandom;
import net.futureclient.installer.NY;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Xq {
    private static final /* synthetic */ long a;

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
            l3 = l4 ^ 0x66D865446E1FL;
            l2 = l4 ^ 0x6D3513E404A5L;
            int n2 = 0;
            callSite = ye.a("G", (long)8958563916884021552L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)8963209628972848686L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)8963209628972848686L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)8963209628972848686L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)8963209628972848686L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)8963209628972848686L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)8963209628972848686L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)8963209628972848686L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)8963209628972848686L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)8963209628972848686L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)8963209628972848686L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)8963209628972848686L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)8963209628972848686L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)8963209628972848686L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)8963209628972848686L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)8963209628972848686L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)8963209628972848686L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)8963209628972848686L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)8955501657581001543L, (long)l4))), (long)9072604638419083762L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    public static /* synthetic */ {
        a = wu.a(-6420074975748102931L, 1628472902311990558L, MethodHandles.lookup().lookupClass()).a(227899932597161L);
    }

    private static /* synthetic */ long M(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x4C0EEB7F24B7L;
            l2 = l4 ^ 0x47E39DDF4E0DL;
            int n2 = 0;
            callSite = ye.a("G", (long)3961791892957059992L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)3948422660940291206L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)3948422660940291206L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)3948422660940291206L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)3948422660940291206L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)3948422660940291206L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)3948422660940291206L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)3948422660940291206L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)3948422660940291206L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)3948422660940291206L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)3948422660940291206L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)3948422660940291206L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)3948422660940291206L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)3948422660940291206L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)3948422660940291206L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)3948422660940291206L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)3948422660940291206L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)3948422660940291206L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)3954300770684424687L, (long)l4))), (long)3981312977352305498L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long k(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x25E1A705BBA2L;
            l2 = l4 ^ 0x2E0CD1A5D118L;
            int n2 = 0;
            callSite = ye.a("G", (long)-6201890636530924403L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)-6206254324876033133L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)-6206254324876033133L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)-6206254324876033133L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)-6206254324876033133L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-6206254324876033133L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)-6206254324876033133L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)-6206254324876033133L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)-6206254324876033133L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)-6206254324876033133L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-6206254324876033133L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)-6206254324876033133L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)-6206254324876033133L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)-6206254324876033133L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)-6206254324876033133L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)-6206254324876033133L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)-6206254324876033133L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)-6206254324876033133L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)-6200024611920785670L, (long)l4))), (long)-6317108953439914929L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long w(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x27789C571961L;
            l2 = l4 ^ 0x2C95EAF773DBL;
            int n2 = 0;
            callSite = ye.a("G", (long)805431617879434830L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)801066839728382288L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)801066839728382288L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)801066839728382288L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)801066839728382288L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)801066839728382288L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)801066839728382288L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)801066839728382288L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)801066839728382288L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)801066839728382288L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)801066839728382288L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)801066839728382288L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)801066839728382288L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)801066839728382288L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)801066839728382288L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)801066839728382288L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)801066839728382288L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)801066839728382288L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)807856203456244793L, (long)l4))), (long)762828494740952716L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long t(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x6A4820770D76L;
            l2 = l4 ^ 0x61A556D767CCL;
            int n2 = 0;
            callSite = ye.a("G", (long)2250175812440584793L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)2236806028555121991L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)2236806028555121991L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)2236806028555121991L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)2236806028555121991L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)2236806028555121991L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)2236806028555121991L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)2236806028555121991L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)2236806028555121991L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)2236806028555121991L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)2236806028555121991L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)2236806028555121991L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)2236806028555121991L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)2236806028555121991L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)2236806028555121991L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)2236806028555121991L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)2236806028555121991L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)2236806028555121991L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)2243172905476880430L, (long)l4))), (long)2198127470626243227L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    private static /* synthetic */ long R(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x3664717FD667L;
            l2 = l4 ^ 0x3D8907DFBCDDL;
            int n2 = 0;
            callSite = ye.a("G", (long)-4311239144946095800L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)-4315601731758969258L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)-4315601731758969258L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)-4315601731758969258L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)-4315601731758969258L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-4315601731758969258L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)-4315601731758969258L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)-4315601731758969258L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)-4315601731758969258L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)-4315601731758969258L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-4315601731758969258L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)-4315601731758969258L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)-4315601731758969258L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)-4315601731758969258L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)-4315601731758969258L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)-4315601731758969258L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)-4315601731758969258L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)-4315601731758969258L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)-4309938301190397121L, (long)l4))), (long)-4210850921988728438L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x38C6F19DA3D8L;
        Object object = l2 ^ 0x413A671DABEDL;
        long l3 = l2 ^ 0xC0ADB3DBFFAL;
        long l4 = l2 ^ 0x43A35C4F092EL;
        long l5 = l2 ^ 0x9A9E0EDC93L;
        long l6 = l2 ^ 0x7556FDA512E2L;
        long l7 = l2 ^ 0x2A4C1035963BL;
        long l8 = l2 ^ 0x50268A3564EBL;
        long l9 = l2 ^ 0x5B3FF4B44125L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l6;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l9;
        arrobject2[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject3 = new Object[1];
        arrobject3[0] = l6;
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = l7;
        arrobject4[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject5 = new Object[1];
        arrobject5[0] = l6;
        Object[] arrobject6 = new Object[2];
        arrobject6[1] = object;
        arrobject6[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject5, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject7 = new Object[1];
        arrobject7[0] = l6;
        Object[] arrobject8 = new Object[2];
        arrobject8[1] = l8;
        arrobject8[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject9 = new Object[1];
        arrobject9[0] = l6;
        Object[] arrobject10 = new Object[2];
        arrobject10[1] = l5;
        arrobject10[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject9, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject11 = new Object[1];
        arrobject11[0] = l6;
        Object[] arrobject12 = new Object[2];
        arrobject12[1] = l3;
        arrobject12[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        Object[] arrobject13 = new Object[1];
        arrobject13[0] = l6;
        Object[] arrobject14 = new Object[2];
        arrobject14[1] = l4;
        arrobject14[0] = (long)ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject13, (long)7642411947329621248L, (long)l2))), (long)7759497350208747445L, (long)l2);
        reference v14 = ye.a("G", (Object)arrobject2, (long)7713046351390318859L, (long)l2) ^ ye.a("G", (Object)arrobject4, (long)7752617029777146455L, (long)l2) ^ ye.a("G", (Object)arrobject6, (long)7640367680809184955L, (long)l2) ^ ye.a("G", (Object)arrobject8, (long)7736024113785558810L, (long)l2) ^ ye.a("G", (Object)arrobject10, (long)7720165923173114380L, (long)l2) ^ ye.a("G", (Object)arrobject12, (long)7762797171216596497L, (long)l2) ^ ye.a("G", (Object)arrobject14, (long)7535770140425998051L, (long)l2);
        object = v14;
        return (int)(v14 >>> 32 ^ object ^ (long)ye.a("j", (Object)new NY(), (long)7727003024430037995L, (long)l2));
    }

    private static /* synthetic */ long i(Object[] this_) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block37: {
            l5 = (Long)this_[0];
            l4 = (Long)this_[1];
            l4 = a ^ l4;
            l3 = l4 ^ 0x3D7D0FFEF3A9L;
            l2 = l4 ^ 0x3690795E9913L;
            int n2 = 0;
            callSite = ye.a("G", (long)-2169206907246769018L, (long)l4);
            while (true) {
                if (n2 >= 100) break;
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                try {
                    Object[] arrobject2 = new Object[1];
                    arrobject2[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject2, (long)-2173571698300613736L, (long)l4));
                }
                catch (Throwable throwable) {
                    Object[] arrobject3 = new Object[1];
                    arrobject3[0] = l2;
                    Object[] arrobject4 = new Object[1];
                    arrobject4[0] = l2;
                    l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject3, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject4, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                    try {
                        Object[] arrobject5 = new Object[1];
                        arrobject5[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject5, (long)-2173571698300613736L, (long)l4));
                    }
                    catch (Throwable throwable2) {
                        Object[] arrobject6 = new Object[1];
                        arrobject6[0] = l2;
                        Object[] arrobject7 = new Object[1];
                        arrobject7[0] = l2;
                        Object[] arrobject8 = new Object[1];
                        arrobject8[0] = l2;
                        l5 = l5 ^ (long)throwable2.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject6, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject7, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject8, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                        try {
                            Object[] arrobject9 = new Object[1];
                            arrobject9[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject9, (long)-2173571698300613736L, (long)l4));
                        }
                        catch (Throwable throwable3) {
                            Object[] arrobject10 = new Object[1];
                            arrobject10[0] = l2;
                            Object[] arrobject11 = new Object[1];
                            arrobject11[0] = l2;
                            Object[] arrobject12 = new Object[1];
                            arrobject12[0] = l2;
                            l5 = l5 ^ (long)throwable3.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject10, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject11, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject12, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                            try {
                                Object[] arrobject13 = new Object[1];
                                arrobject13[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject13, (long)-2173571698300613736L, (long)l4));
                            }
                            catch (Throwable throwable4) {
                                Object[] arrobject14 = new Object[1];
                                arrobject14[0] = l2;
                                Object[] arrobject15 = new Object[1];
                                arrobject15[0] = l2;
                                Object[] arrobject16 = new Object[1];
                                arrobject16[0] = l2;
                                ++n2;
                                l5 = l5 ^ (long)throwable4.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject14, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject15, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject16, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
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
            l5 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject17, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
        }
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-2173571698300613736L, (long)l4));
        }
        catch (Throwable throwable) {
            block38: {
                Object[] arrobject = new Object[1];
                arrobject[0] = l2;
                Object[] arrobject18 = new Object[1];
                arrobject18[0] = l2;
                l5 = l5 ^ (long)throwable.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject18, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                int n3 = 0;
                while (true) {
                    if (n3 >= 100) break;
                    Object[] arrobject19 = new Object[1];
                    arrobject19[0] = l2;
                    l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject19, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                    try {
                        Object[] arrobject20 = new Object[1];
                        arrobject20[0] = l3;
                        throw (Throwable)((Object)ye.a("G", (Object)arrobject20, (long)-2173571698300613736L, (long)l4));
                    }
                    catch (Throwable throwable5) {
                        Object[] arrobject21 = new Object[1];
                        arrobject21[0] = l2;
                        Object[] arrobject22 = new Object[1];
                        arrobject22[0] = l2;
                        l5 = l5 ^ (long)throwable5.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject21, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject22, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                        try {
                            Object[] arrobject23 = new Object[1];
                            arrobject23[0] = l3;
                            throw (Throwable)((Object)ye.a("G", (Object)arrobject23, (long)-2173571698300613736L, (long)l4));
                        }
                        catch (Throwable throwable6) {
                            Object[] arrobject24 = new Object[1];
                            arrobject24[0] = l2;
                            Object[] arrobject25 = new Object[1];
                            arrobject25[0] = l2;
                            Object[] arrobject26 = new Object[1];
                            arrobject26[0] = l2;
                            l5 = l5 ^ (long)throwable6.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject24, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject25, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject26, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                            try {
                                Object[] arrobject27 = new Object[1];
                                arrobject27[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject27, (long)-2173571698300613736L, (long)l4));
                            }
                            catch (Throwable throwable7) {
                                Object[] arrobject28 = new Object[1];
                                arrobject28[0] = l2;
                                Object[] arrobject29 = new Object[1];
                                arrobject29[0] = l2;
                                Object[] arrobject30 = new Object[1];
                                arrobject30[0] = l2;
                                l5 = l5 ^ (long)throwable7.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject28, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject29, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject30, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                try {
                                    Object[] arrobject31 = new Object[1];
                                    arrobject31[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject31, (long)-2173571698300613736L, (long)l4));
                                }
                                catch (Throwable throwable8) {
                                    Object[] arrobject32 = new Object[1];
                                    arrobject32[0] = l2;
                                    Object[] arrobject33 = new Object[1];
                                    arrobject33[0] = l2;
                                    Object[] arrobject34 = new Object[1];
                                    arrobject34[0] = l2;
                                    ++n3;
                                    l5 = l5 ^ (long)throwable8.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject32, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject33, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject34, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
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
                l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject35, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
            }
            try {
                Object[] arrobject = new Object[1];
                arrobject[0] = l3;
                throw (Throwable)((Object)ye.a("G", (Object)arrobject, (long)-2173571698300613736L, (long)l4));
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
                l5 = l5 ^ (long)throwable9.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject36, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject37, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject38, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject39, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject40, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject41, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject42, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject43, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject44, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                try {
                    Object[] arrobject45 = new Object[1];
                    arrobject45[0] = l3;
                    throw (Throwable)((Object)ye.a("G", (Object)arrobject45, (long)-2173571698300613736L, (long)l4));
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
                        l5 = l5 ^ (long)throwable10.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject46, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject47, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject48, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject49, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject50, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                        int n4 = 0;
                        while (true) {
                            if (n4 >= 100) break;
                            Object[] arrobject51 = new Object[1];
                            arrobject51[0] = l2;
                            l5 ^= ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject51, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                            try {
                                Object[] arrobject52 = new Object[1];
                                arrobject52[0] = l3;
                                throw (Throwable)((Object)ye.a("G", (Object)arrobject52, (long)-2173571698300613736L, (long)l4));
                            }
                            catch (Throwable throwable11) {
                                Object[] arrobject53 = new Object[1];
                                arrobject53[0] = l2;
                                Object[] arrobject54 = new Object[1];
                                arrobject54[0] = l2;
                                l5 = l5 ^ (long)throwable11.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject53, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject54, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                try {
                                    Object[] arrobject55 = new Object[1];
                                    arrobject55[0] = l3;
                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject55, (long)-2173571698300613736L, (long)l4));
                                }
                                catch (Throwable throwable12) {
                                    Object[] arrobject56 = new Object[1];
                                    arrobject56[0] = l2;
                                    Object[] arrobject57 = new Object[1];
                                    arrobject57[0] = l2;
                                    l5 = l5 ^ (long)throwable12.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject56, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject57, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                    try {
                                        Object[] arrobject58 = new Object[1];
                                        arrobject58[0] = l3;
                                        throw (Throwable)((Object)ye.a("G", (Object)arrobject58, (long)-2173571698300613736L, (long)l4));
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
                                        l5 = l5 ^ (long)throwable13.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject59, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject60, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject61, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject62, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject63, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject64, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject65, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject66, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject67, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject68, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                        try {
                                            Object[] arrobject69 = new Object[1];
                                            arrobject69[0] = l3;
                                            throw (Throwable)((Object)ye.a("G", (Object)arrobject69, (long)-2173571698300613736L, (long)l4));
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
                                            l5 = l5 ^ (long)throwable14.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject70, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject71, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject72, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject73, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject74, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject75, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject76, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                            try {
                                                Object[] arrobject77 = new Object[1];
                                                arrobject77[0] = l3;
                                                throw (Throwable)((Object)ye.a("G", (Object)arrobject77, (long)-2173571698300613736L, (long)l4));
                                            }
                                            catch (Throwable throwable15) {
                                                Object[] arrobject78 = new Object[1];
                                                arrobject78[0] = l2;
                                                Object[] arrobject79 = new Object[1];
                                                arrobject79[0] = l2;
                                                Object[] arrobject80 = new Object[1];
                                                arrobject80[0] = l2;
                                                l5 = l5 ^ (long)throwable15.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject78, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject79, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject80, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                                                try {
                                                    Object[] arrobject81 = new Object[1];
                                                    arrobject81[0] = l3;
                                                    throw (Throwable)((Object)ye.a("G", (Object)arrobject81, (long)-2173571698300613736L, (long)l4));
                                                }
                                                catch (Throwable throwable16) {
                                                    Object[] arrobject82 = new Object[1];
                                                    arrobject82[0] = l2;
                                                    Object[] arrobject83 = new Object[1];
                                                    arrobject83[0] = l2;
                                                    Object[] arrobject84 = new Object[1];
                                                    arrobject84[0] = l2;
                                                    l6 = l5 ^ (long)throwable16.hashCode() ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject82, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject83, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject84, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
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
                        l6 = l5 ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject85, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject86, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject87, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject88, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4) ^ ye.a("j", (Object)((SecureRandom)((Object)ye.a("G", (Object)arrobject89, (long)-2162274371711596815L, (long)l4))), (long)-2279377227491738556L, (long)l4);
                    }
                    return l6;
                }
            }
        }
    }
}

