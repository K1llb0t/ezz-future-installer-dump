/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.ye;

public final class pd
extends vA {
    private /* synthetic */ vA G;

    public /* synthetic */ pd(vA vA2) {
        this.G = vA2;
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        L l2 = (L)object[0];
        long l3 = (Long)object[1];
        object = object[2];
        long l4 = l3;
        long l5 = l4 ^ 0x4A39C73D8715L;
        long l6 = l4 ^ 0L;
        try {
            if (object == null) {
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l2, (Object)arrobject, (long)8289433266214942419L, (long)l3));
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8333666672127679631L, (long)l3));
        }
        Object[] arrobject = new Object[3];
        arrobject[2] = object;
        arrobject[1] = l6;
        arrobject[0] = l2;
        ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)this, (long)8300578881200406442L, (long)l3))), (Object)arrobject, (long)8310079564637467710L, (long)l3);
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
}

