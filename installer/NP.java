/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;
import net.futureclient.installer.Nf;
import net.futureclient.installer.Nn;
import net.futureclient.installer.Nu;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class NP
extends Nf
implements Set {
    private static final /* synthetic */ long b;

    public static /* synthetic */ NP i(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = b ^ l2;
        return (Nn)((Object)ye.a("Z", (long)-2559889475545496086L, (long)l2));
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ boolean P(Object[] arrobject) {
        return false;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        long l2 = b ^ 0x6967526F18EAL;
        long l3 = l2 ^ 0x2556386C10EFL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (Nu)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-7426464566496546221L, (long)l2));
    }

    @Override
    public abstract /* synthetic */ Nu l(Object[] var1);

    /*
     * Exception decompiling
     */
    @Override
    public /* synthetic */ boolean equals(Object this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public /* synthetic */ int hashCode() {
        var1_1 = NP.b ^ 89540594926738L;
        var4_2 = this;
        var5_3 = 0;
        var4_2 = (Iterator)ye.a("j", (Object)var4_2, (long)464345929573492857L, (long)var1_1);
        var3_4 = ye.a("G", (long)338109027538987474L, (long)var1_1);
        while (ye.a("j", (Object)var4_2, (long)394301059989487529L, (long)var1_1) != false) {
            block7: {
                block6: {
                    block5: {
                        var6_5 = ye.a("j", (Object)var4_2, (long)488357423182456766L, (long)var1_1);
                        try {
                            v0 = var5_3;
                            if (var3_4 == null) return v0;
                            v1 = var6_5;
                            if (var3_4 == null) break block5;
                            ** GOTO lbl19
                        }
                        catch (RuntimeException v2) {
                            try {
                                throw (RuntimeException)ye.a("G", (Object)v2, (long)346795855598999272L, (long)var1_1);
lbl19:
                                // 1 sources

                                if (v1 == null) break block6;
                                v1 = var6_5;
                            }
                            catch (RuntimeException v3) {
                                throw (RuntimeException)ye.a("G", (Object)v3, (long)346795855598999272L, (long)var1_1);
                            }
                        }
                    }
                    v4 = v1.hashCode();
                    break block7;
                }
                v4 = 0;
            }
            var5_3 = ~(~(v0 + v4));
            if (var3_4 != null) continue;
        }
        v0 = var5_3;
        return v0;
    }

    public static /* synthetic */ {
        b = wu.a(314445543220055732L, 4707582541502320027L, MethodHandles.lookup().lookupClass()).a(58126729770778L);
    }
}

