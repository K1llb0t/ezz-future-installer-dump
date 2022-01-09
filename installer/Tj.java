/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.TH;
import net.futureclient.installer.v0;
import net.futureclient.installer.ye;

public class Tj
extends TH {
    public /* synthetic */ String R;
    public /* synthetic */ String O;
    private /* synthetic */ int W;
    public /* synthetic */ String B;
    public /* synthetic */ boolean K;

    public /* synthetic */ Tj() {
        this.W = 0;
    }

    public /* synthetic */ Tj(byte by) {
        Tj tj = this;
        tj.W = 0;
        tj.W = 21;
    }

    @Override
    public final /* synthetic */ int Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return 4;
    }

    @Override
    public final /* synthetic */ void w(Object[] object) {
        long l2 = (Long)object[0];
        object = (v0)object[1];
        ye.a("j", (Object)object, (int)ye.a("\u00c3", (Object)this, (long)207912955700392485L, (long)l2), (long)202782696257677629L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void U(Object[] this) {
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }
}

