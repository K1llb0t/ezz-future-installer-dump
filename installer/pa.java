/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.util.concurrent.atomic.AtomicLongArray;
import net.futureclient.installer.L;
import net.futureclient.installer.vA;
import net.futureclient.installer.ye;

public final class pa
extends vA {
    private /* synthetic */ vA f;

    @Override
    public final /* synthetic */ void Z(Object[] object) {
        block5: {
            Object object2;
            long l2;
            long l3;
            block6: {
                Object object3 = (L)object[0];
                l3 = (Long)object[1];
                object = object[2];
                long l4 = l3;
                l2 = l4 ^ 0x5FBB8DEC9328L;
                long l5 = l4 ^ 0x5CE045124F65L;
                long l6 = l4 ^ 0L;
                AtomicLongArray atomicLongArray = (AtomicLongArray)object;
                object = object3;
                object3 = this;
                CallSite callSite = ye.a("G", (long)8283329184475062167L, (long)l3);
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                L cfr_ignored_0 = (L)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)8313218727479517614L, (long)l3));
                int n2 = 0;
                int n3 = atomicLongArray.length();
                block2: while (n2 < n3) {
                    try {
                        Object[] arrobject2 = new Object[3];
                        arrobject2[2] = (Long)((Object)ye.a("G", (long)atomicLongArray.get(n2), (long)8296510132101861750L, (long)l3));
                        arrobject2[1] = l6;
                        arrobject2[0] = object;
                        ++n2;
                        ye.a("j", (Object)((vA)((Object)ye.a("\u00c3", (Object)object3, (long)8301878805031451337L, (long)l3))), (Object)arrobject2, (long)8310079564637467710L, (long)l3);
                        do {
                            CallSite callSite2 = callSite;
                            if (l3 > 0L) {
                                if (callSite2 == null) break block5;
                                callSite2 = callSite;
                            }
                            if (callSite2 != null) continue block2;
                        } while (l3 <= 0L);
                        object2 = object;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)8073955890198184229L, (long)l3));
                    }
                }
                object2 = object;
            }
            Object[] arrobject = new Object[1];
            arrobject[0] = l2;
            L cfr_ignored_1 = (L)((Object)ye.a("j", (Object)object2, (Object)arrobject, (long)8284649586992422199L, (long)l3));
        }
    }

    public /* synthetic */ pa(vA vA2) {
        this.f = vA2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ Object i(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[WHILELOOP]
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

