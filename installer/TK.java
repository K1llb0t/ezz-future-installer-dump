/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import net.futureclient.installer.Z;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class TK {
    private static final /* synthetic */ long b;
    public volatile /* synthetic */ Thread n;
    public static final /* synthetic */ TK A;
    public volatile /* synthetic */ TK a;

    private /* synthetic */ TK(byte by) {
    }

    public final /* synthetic */ void E(Object[] arrobject2) {
        int arrobject2 = (Integer)arrobject2[0];
        long l2 = (Long)arrobject2[1];
        TK tK = (TK)arrobject2[2];
        l2 = ((long)arrobject2 << 48 | l2 << 16 >>> 16) ^ b;
        long l3 = l2 ^ 0xE99D642EB59L;
        long l4 = l2 ^ 0x5B98D65E586CL;
        Object[] arrobject3 = new Object[1];
        arrobject3[0] = l4;
        Object[] arrobject4 = new Object[3];
        arrobject4[2] = tK;
        arrobject4[1] = l3;
        arrobject4[0] = this;
        ye.a("j", (Object)((Z)((Object)ye.a("G", (Object)arrobject3, (long)-7702300258515557961L, (long)l2))), (Object)arrobject4, (long)-7621725822109802554L, (long)l2);
    }

    public /* synthetic */ TK(long l2) {
        l2 = b ^ l2;
        long l3 = l2 ^ 0x17665AB16953L;
        long l4 = l2 ^ 0x3349128FBC11L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = l4;
        arrobject2[1] = (Thread)((Object)ye.a("G", (long)-6609738053608266791L, (long)l2));
        arrobject2[0] = this;
        ye.a("j", (Object)((Z)((Object)ye.a("G", (Object)arrobject, (long)-6618987123327840120L, (long)l2))), (Object)arrobject2, (long)-6499098060540010222L, (long)l2);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ void k(Object[] this) {
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
        b = wu.a(-1822293501081620835L, -1753616668150757880L, MethodHandles.lookup().lookupClass()).a(51426808122491L);
        A = new TK(0);
    }
}

