/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.TH;
import net.futureclient.installer.v0;
import net.futureclient.installer.ye;

public final class T8
extends TH {
    private /* synthetic */ String V;
    public /* synthetic */ boolean k;
    public /* synthetic */ byte[] T;
    public /* synthetic */ boolean Q;
    private /* synthetic */ String l;
    private /* synthetic */ String I;
    public /* synthetic */ boolean Y;
    private /* synthetic */ String z;

    @Override
    public final /* synthetic */ int Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        return 0;
    }

    public /* synthetic */ T8() {
    }

    @Override
    public final /* synthetic */ void w(Object[] object) {
        long l2 = (Long)object[0];
        object = (v0)object[1];
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)135663309227936264L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)148388941088450988L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)73558886372321908L, (long)l2))), (long)183547887601017616L, (long)l2);
        ye.a("j", (Object)object, (Object)((String)((Object)ye.a("\u00c3", (Object)this, (long)143293612107080270L, (long)l2))), (long)183547887601017616L, (long)l2);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ T8(String string, String string2, String string3, String string4) {
        T8 t8 = this;
        T8 t82 = this;
        t82.V = string;
        t82.I = string2;
        t8.l = string3;
        t8.z = string4;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void U(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 8[CATCHBLOCK]
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
}

