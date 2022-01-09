/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import net.futureclient.installer.I;
import net.futureclient.installer.pi;
import net.futureclient.installer.pj;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class pQ
extends pi {
    public final /* synthetic */ I I;
    private static final /* synthetic */ long a;

    public final /* synthetic */ void x(Object[] object) {
        block2: {
            Object object2;
            long l2;
            String string;
            block3: {
                string = (String)object[0];
                l2 = (Long)object[1];
                object = (pi)object[2];
                l2 = a ^ l2;
                CallSite callSite = ye.a("G", (long)-3164035341551289996L, (long)l2);
                try {
                    object2 = object;
                    if (callSite == null) break block2;
                    if (object2 != null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)-3162307942243475845L, (long)l2));
                }
                object = (pj)((Object)ye.a("Z", (long)-3029974059352490369L, (long)l2));
            }
            object2 = ye.a("j", (Object)((I)((Object)ye.a("\u00c3", (Object)this, (long)-3063966049005113310L, (long)l2))), (Object)string, (Object)object, (long)-3149397242078355501L, (long)l2);
        }
    }

    public final /* synthetic */ int hashCode() {
        long l2 = a ^ 0x10011C78031FL;
        return (int)ye.a("j", (Object)((I)((Object)ye.a("\u00c3", (Object)this, (long)-4431328086789298216L, (long)l2))), (long)-4412917229940962336L, (long)l2);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public final /* synthetic */ pi e(Object[] object) {
        Object[] arrobject = object;
        object = (String)object[0];
        long l2 = (Long)arrobject[1];
        l2 = a ^ l2;
        return (pi)((Object)ye.a("j", (Object)((I)((Object)ye.a("\u00c3", (Object)this, (long)-3194025019280754956L, (long)l2))), (Object)object, (long)-3175434340200074239L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean equals(Object this) {
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

    public /* synthetic */ pQ(int n2, int n3, int n4) {
        long l2 = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ a ^ 0x5CBCAB549DBAL;
        pQ pQ2 = this;
        pQ2.I = new I(l2);
    }

    public static /* synthetic */ {
        a = wu.a(-7153606543192552247L, 1513933452066815112L, MethodHandles.lookup().lookupClass()).a(219245892997412L);
    }
}

