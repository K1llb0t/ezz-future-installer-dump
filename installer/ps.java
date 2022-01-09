/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import net.futureclient.installer.EF;
import net.futureclient.installer.NZ;
import net.futureclient.installer.pL;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class ps
extends vA {
    private /* synthetic */ NZ h;
    private /* synthetic */ boolean p;
    private /* synthetic */ vA z;
    private static final /* synthetic */ long a;
    private /* synthetic */ EF N;
    private /* synthetic */ pL S;
    private /* synthetic */ boolean L;

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ Object i(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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

    @Override
    private /* synthetic */ vA i(Object[] arrobject2) {
        vA vA2;
        block6: {
            vA vA3;
            long l2 = (Long)arrobject2[0];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x5712B4AF608FL;
            int arrobject2 = (int)(l3 >>> 48);
            int n2 = (int)(l3 << 16 >>> 32);
            int n3 = (int)(l3 << 48 >>> 48);
            CallSite callSite = ye.a("G", (long)-1929115112732063655L, (long)l2);
            vA2 = vA3 = (vA)((Object)ye.a("\u00c3", (Object)this, (long)-1948286880322284160L, (long)l2));
            try {
                if (callSite == null) break block6;
                if (vA2 != null) {
                    return vA3;
                }
            }
            catch (RuntimeException runtimeException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-1952720782797913648L, (long)l2));
                }
                catch (RuntimeException runtimeException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)-1952720782797913648L, (long)l2));
                }
            }
            ps ps2 = this;
            Object[] arrobject3 = new Object[5];
            arrobject3[4] = (int)((char)n3);
            arrobject3[3] = (pL)((Object)ye.a("\u00c3", (Object)this, (long)-1755159724097225265L, (long)l2));
            arrobject3[2] = n2;
            arrobject3[1] = (NZ)((Object)ye.a("\u00c3", (Object)this, (long)-1973381832658167424L, (long)l2));
            arrobject3[0] = (int)((short)arrobject2);
            vA vA4 = (vA)((Object)ye.a("j", (Object)((EF)((Object)ye.a("\u00c3", (Object)ps2, (long)-1747620129914048671L, (long)l2))), (Object)arrobject3, (long)-1780559068534541528L, (long)l2));
            vA2 = vA4;
            ye.a("F", (Object)ps2, (vA)vA4, (long)-1948286880322284160L, (long)l2);
        }
        return vA2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void Z(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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

    public static /* synthetic */ {
        a = wu.a(-4765131971755286638L, 5483890072167655683L, MethodHandles.lookup().lookupClass()).a(132043988596110L);
    }

    public /* synthetic */ ps(NZ nZ, boolean bl, boolean bl2, EF eF, pL pL2) {
        ps ps2 = this;
        this.h = nZ;
        ps2.L = bl;
        ps2.p = bl2;
        this.N = eF;
        this.S = pL2;
    }
}

