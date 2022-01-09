/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.util.UUID;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.ye;

public final class vQ
extends vA {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ void Z(Object[] object) {
        String string;
        long l2;
        long l3;
        L l4;
        block6: {
            Object object2;
            block4: {
                block5: {
                    l4 = (L)object[0];
                    l3 = (Long)object[1];
                    object = object[2];
                    l2 = l3 ^ 0x1F239A2408EEL;
                    CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l3);
                    object2 = object = (UUID)object;
                    try {
                        if (callSite == null) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        try {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8074415758360584637L, (long)l3));
                        }
                        catch (RuntimeException runtimeException2) {
                            throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)8074415758360584637L, (long)l3));
                        }
                    }
                    string = null;
                    break block6;
                }
                object2 = object;
            }
            string = (String)((Object)ye.a("j", (Object)object2, (long)8111897316526173900L, (long)l3));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = string;
        arrobject[0] = l2;
        L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l4, (Object)arrobject, (long)8326898731959281976L, (long)l3));
    }

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
}

