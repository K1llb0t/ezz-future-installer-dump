/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.futureclient.installer.NL;
import net.futureclient.installer.Ni;
import net.futureclient.installer.X7;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public class Ng
extends Ni {
    private /* synthetic */ List C;
    private /* synthetic */ List m;
    private /* synthetic */ List T;
    private /* synthetic */ List z;
    private static final /* synthetic */ long a;
    private /* synthetic */ List i;

    public /* synthetic */ Ng(byte by, long l2) {
        l2 = a ^ l2;
        Ng ng = this;
        ng();
        if (ng.getClass() != Ng.class) {
            throw new IllegalStateException();
        }
    }

    @Override
    public final /* synthetic */ void z(Object[] object) {
        Object[] arrobject = object;
        object = (NL)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x21A2589DD6E9L;
        Ng ng = this;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = object;
        arrobject2[1] = l3;
        arrobject2[0] = (List)((Object)ye.a("\u00c3", (Object)ng, (long)6690058381524160586L, (long)l2));
        ye.a("F", (Object)ng, (List)((List)((Object)ye.a("G", (Object)arrobject2, (long)6700677316737881223L, (long)l2))), (long)6690058381524160586L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ X7 S(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
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
        a = wu.a(-5357456036739818453L, -1221671612639131084L, MethodHandles.lookup().lookupClass()).a(275066144158200L);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ X7 N(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
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

    private /* synthetic */ Ng() {
    }

    private static /* synthetic */ IllegalStateException a(IllegalStateException this_) {
        return this_;
    }
}

