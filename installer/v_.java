/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicIntegerArray;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.vM;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class v_
extends vA {
    private static final /* synthetic */ long a;

    public static /* synthetic */ {
        a = wu.a(-3986777091601144950L, -6157273588989267417L, MethodHandles.lookup().lookupClass()).a(84799058533535L);
    }

    private static /* synthetic */ NumberFormatException a(NumberFormatException this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ AtomicIntegerArray N(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 1[TRYBLOCK]
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
    public final /* synthetic */ void Z(Object[] object) {
        block5: {
            L l2;
            long l3;
            long l4;
            block6: {
                L l5 = (L)object[0];
                l4 = (Long)object[1];
                object = object[2];
                long l6 = l4;
                long l7 = l6 ^ 0x23CBB22AC3DCL;
                l3 = l6 ^ 0x5FBB8DEC9328L;
                long l8 = l6 ^ 0x5CE045124F65L;
                object = (AtomicIntegerArray)object;
                Object[] arrobject = new Object[1];
                arrobject[0] = l8;
                L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)l5, (Object)arrobject, (long)8313218727479517614L, (long)l4));
                int n2 = 0;
                CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l4);
                int n3 = ((AtomicIntegerArray)object).length();
                block2: while (n2 < n3) {
                    try {
                        Object[] arrobject2 = new Object[2];
                        arrobject2[1] = l7;
                        arrobject2[0] = (long)((AtomicIntegerArray)object).get(n2);
                        ++n2;
                        L cfr_ignored_1 = (L)((Object)ye.a("j", (Object)l5, (Object)arrobject2, (long)8310643313580377986L, (long)l4));
                        do {
                            CallSite callSite2 = callSite;
                            if (l4 > 0L) {
                                if (callSite2 == null) break block5;
                                callSite2 = callSite;
                            }
                            if (callSite2 != null) continue block2;
                        } while (l4 <= 0L);
                        l2 = l5;
                        break block6;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw (NumberFormatException)((Object)ye.a("G", (Object)numberFormatException, (long)8271480208483028425L, (long)l4));
                    }
                }
                l2 = l5;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l3;
            L cfr_ignored_2 = (L)((Object)ye.a("j", (Object)l2, (Object)arrobject, (long)8284649586992422199L, (long)l4));
        }
    }

    @Override
    public final /* synthetic */ Object i(Object[] object) {
        Object[] arrobject = object;
        object = (vM)object[0];
        long l2 = (Long)arrobject[1];
        long l3 = l2 ^ 0x7A3598742B27L;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = object;
        return (AtomicIntegerArray)((Object)ye.a("G", (Object)arrobject2, (long)8427775399460522829L, (long)l2));
    }
}

