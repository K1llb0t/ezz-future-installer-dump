/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import net.futureclient.installer.ES;
import net.futureclient.installer.NE;
import net.futureclient.installer.XY;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Xe
extends XY
implements Serializable,
NE {
    private static final /* synthetic */ long a;

    @Override
    public final /* synthetic */ float floatValue() {
        long l2 = a ^ 0x64261267C04BL;
        long l3 = l2 ^ 0x7D6F403DDEA2L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (float)ye.a("j", (Object)this, (Object)arrobject, (long)-7889344210680694026L, (long)l2);
    }

    @Override
    public final /* synthetic */ long F(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        long l3 = (Long)arrobject[1];
        return l2 + l3;
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x172CA94774F1L;
        long l3 = l2 ^ 0xE65FB1D6A18L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (String)((Object)ye.a("G", (long)ye.a("j", (Object)this, (Object)arrobject, (long)2754259275117694540L, (long)l2), (long)2812354055507402263L, (long)l2));
    }

    @Override
    public final /* synthetic */ void F(Object[] arrobject2) {
        int arrobject2 = (Integer)arrobject2[0];
        int n2 = (Integer)arrobject2[1];
        int n3 = (Integer)arrobject2[2];
        long l2 = (long)arrobject2 << 48 | (long)n2 << 48 >>> 16 | (long)n3 << 32 >>> 32;
        long l3 = l2 ^ 0x2B4BA1638402L;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = l3;
        arrobject3[0] = 1L;
        ye.a("j", (Object)this, (Object)arrobject3, (long)9208526721357364067L, (long)l2);
    }

    public static /* synthetic */ {
        a = wu.a(2927222182860138740L, -2804799250333765226L, MethodHandles.lookup().lookupClass()).a(280931215898605L);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void t(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 4[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1030)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ double doubleValue() {
        long l2 = a ^ 0x148E8479FD2AL;
        long l3 = l2 ^ 0xDC7D623E3C3L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (double)ye.a("j", (Object)this, (Object)arrobject, (long)-5773021441317828713L, (long)l2);
    }

    @Override
    public final /* synthetic */ long longValue() {
        long l2 = a ^ 0x21AED8684AC9L;
        long l3 = l2 ^ 0x38E78A325420L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (long)ye.a("j", (Object)this, (Object)arrobject, (long)1729715089522045044L, (long)l2);
    }

    private /* synthetic */ long T(Object[] object) {
        reference var4_3;
        block4: {
            ES[] arreS;
            ES[] arreS2;
            long l2;
            block3: {
                l2 = (Long)object[0];
                l2 = a ^ l2;
                var4_3 = ye.a("\u00c3", (Object)this, (long)2055254746491033530L, (long)l2);
                object = ye.a("G", (long)2157531534042099858L, (long)l2);
                arreS = arreS2 = (ES[])ye.a("\u00c3", (Object)this, (long)2119303240739955879L, (long)l2);
                try {
                    if (object == null) break block3;
                    if (arreS == null) break block4;
                    arreS = arreS2;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)2135753510321573582L, (long)l2));
                }
            }
            int n2 = arreS.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                ES eS = arreS2[i2];
                if (eS == null) continue;
                var4_3 += ye.a("\u00c3", (Object)eS, (long)2254902235518385813L, (long)l2);
                if (object != null) continue;
            }
        }
        return (long)var4_3;
    }

    @Override
    public final /* synthetic */ int intValue() {
        long l2 = a ^ 0x2F55CEC8BD1EL;
        long l3 = l2 ^ 0x361C9C92A3F7L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (int)ye.a("j", (Object)this, (Object)arrobject, (long)-1164707931175204957L, (long)l2);
    }
}

