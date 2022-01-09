/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class TV
extends Number {
    private final /* synthetic */ String U;
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ int intValue() {
        long l2 = a ^ 0x46D041FF8177L;
        try {
            return (int)ye.a("G", (String)((Object)ye.a("\u00c3", (Object)this, (long)1211143282918961245L, (long)l2)), (long)1369779501310176736L, (long)l2);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                return (int)ye.a("G", (String)((Object)ye.a("\u00c3", (Object)this, (long)1211143282918961245L, (long)l2)), (long)1298066065036235104L, (long)l2);
            }
            catch (NumberFormatException numberFormatException2) {
                return (int)ye.a("j", (Object)new BigDecimal((String)((Object)ye.a("\u00c3", (Object)this, (long)1211143282918961245L, (long)l2))), (long)1216073603655978276L, (long)l2);
            }
        }
    }

    public /* synthetic */ TV(String string) {
        this.U = string;
    }

    @Override
    public final /* synthetic */ double doubleValue() {
        long l2 = a ^ 0x62709C6426A8L;
        return (double)ye.a("G", (String)((Object)ye.a("\u00c3", (Object)this, (long)-5255141359544199294L, (long)l2)), (long)-5462965410430175622L, (long)l2);
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x771EEF30BD16L;
        return (String)((Object)ye.a("\u00c3", (Object)this, (long)3220049169321495612L, (long)l2));
    }

    @Override
    public final /* synthetic */ long longValue() {
        long l2 = a ^ 0x7C2F0AAE91C1L;
        try {
            return (long)ye.a("G", (String)((Object)ye.a("\u00c3", (Object)this, (long)34026145392173291L, (long)l2)), (long)195223555781706198L, (long)l2);
        }
        catch (NumberFormatException numberFormatException) {
            return (long)ye.a("j", (Object)new BigDecimal((String)((Object)ye.a("\u00c3", (Object)this, (long)34026145392173291L, (long)l2))), (long)16218158842663281L, (long)l2);
        }
    }

    @Override
    public final /* synthetic */ float floatValue() {
        long l2 = a ^ 0x5BC162324CF6L;
        return (float)ye.a("G", (String)((Object)ye.a("\u00c3", (Object)this, (long)-2499562152240480804L, (long)l2)), (long)-2495458748109365991L, (long)l2);
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
    }

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x7B5BDA81FE9CL;
        return (int)ye.a("j", (String)((Object)ye.a("\u00c3", (Object)this, (long)8009060320649826230L, (long)l2)), (long)7796371908999073542L, (long)l2);
    }

    public static /* synthetic */ {
        a = wu.a(8378176380497628426L, -2594592074252351987L, MethodHandles.lookup().lookupClass()).a(248634668800699L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ boolean equals(Object object) {
        Object object2;
        String string;
        String string2;
        CallSite callSite;
        long l2;
        block18: {
            TV tV;
            Object object3;
            block16: {
                block17: {
                    l2 = a ^ 0x1BB7520016CAL;
                    callSite = ye.a("G", (long)-8797426479797573494L, (long)l2);
                    try {
                        object3 = this;
                        if (callSite == null) break block16;
                        if (object3 != object) break block17;
                        return true;
                    }
                    catch (NumberFormatException numberFormatException) {
                        try {
                            throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
                        }
                        catch (NumberFormatException numberFormatException2) {
                            throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException2, (long)-8717518374788916559L, (long)l2));
                        }
                    }
                }
                object3 = object;
            }
            try {
                boolean bl = object3 instanceof TV;
                if (callSite == null) return bl;
                if (!bl) return false;
            }
            catch (NumberFormatException numberFormatException) {
                throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
            }
            object = (TV)object;
            try {
                try {
                    string2 = (String)((Object)ye.a("\u00c3", (Object)this, (long)-8686453016699361312L, (long)l2));
                    string = (String)((Object)ye.a("\u00c3", (Object)object, (long)-8686453016699361312L, (long)l2));
                    if (callSite == null) break block18;
                    if (string2 == string) return true;
                    tV = this;
                }
                catch (NumberFormatException numberFormatException) {
                    throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
            }
            string2 = (String)((Object)ye.a("\u00c3", (Object)tV, (long)-8686453016699361312L, (long)l2));
            string = (String)((Object)ye.a("\u00c3", (Object)object, (long)-8686453016699361312L, (long)l2));
        }
        try {
            try {
                object2 = ye.a("j", string2, (Object)string, (long)-8716810834029904636L, (long)l2);
                if (callSite == null) return (boolean)object2;
                if (object2 != false) {
                    return true;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)-8717518374788916559L, (long)l2));
        }
        object2 = false;
        return (boolean)object2;
    }
}

