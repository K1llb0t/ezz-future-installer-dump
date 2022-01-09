/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import net.futureclient.installer.v6;
import net.futureclient.installer.vG;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Nt
implements Iterable {
    public /* synthetic */ v6 c;
    private static final /* synthetic */ long a;
    public /* synthetic */ v6[] F;
    public /* synthetic */ int P;
    public /* synthetic */ v6 G;

    public static /* synthetic */ {
        a = wu.a(6337713482324066410L, 5905683950072607697L, MethodHandles.lookup().lookupClass()).a(121714601891087L);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final /* synthetic */ v6[] Q(Object[] this) {
        var2_3 = (Long)this /* !! */ [0];
        var2_3 = Nt.a ^ var2_3;
        var4_4 = 0;
        var5_5 = (v6)ye.a("\u00c3", (Object)this, (long)112725858245026001L, (long)var2_3);
        var6_6 = new v6[ye.a("\u00c3", (Object)this, (long)76509863340925068L, (long)var2_3)];
        this = ye.a("G", (long)19556865430285606L, (long)var2_3);
        while (var5_5 != null) {
            v0 = var6_6;
            if (this == null) return v0;
            v0[var4_4] = var5_5;
            ye.a("F", (Object)var5_5, (int)var4_4, (long)72252454971691134L, (long)var2_3);
            ++var4_4;
            var5_5 = (v6)ye.a("\u00c3", (Object)var5_5, (long)78412832738318299L, (long)var2_3);
lbl21:
            // 2 sources

            ** while (this == null)
lbl22:
            // 1 sources

        }
lbl23:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl21
        v0 = var6_6;
        return v0;
    }

    public final /* synthetic */ Iterator iterator() {
        long l2 = a ^ 0x44B030ADA949L ^ 0x3B24822CFD95L;
        Nt nt = this;
        return new vG(nt, l2);
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ void t(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[CATCHBLOCK]
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

