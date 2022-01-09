/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.reflect.Type;
import net.futureclient.installer.EF;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.ye;

public final class vW
extends vA {
    private final /* synthetic */ Type z;
    private final /* synthetic */ EF k;
    private final /* synthetic */ vA n;

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8419285227041474925L, (long)l2))), (Object)arrobject2, (long)8617990313664900832L, (long)l2);
    }

    public /* synthetic */ vW(EF eF, vA vA2, Type type) {
        vW vW2 = this;
        this.k = eF;
        vW2.n = vA2;
        vW2.z = type;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ void Z(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 18[CATCHBLOCK]
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

