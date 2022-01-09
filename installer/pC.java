/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import net.futureclient.installer.d;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class pC
implements Map.Entry {
    public final /* synthetic */ Object d;
    public /* synthetic */ pC c;
    public /* synthetic */ pC j;
    public /* synthetic */ pC C;
    public /* synthetic */ Object f;
    public /* synthetic */ pC o;
    public /* synthetic */ pC D;
    public /* synthetic */ int e;
    private static final /* synthetic */ long a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ int hashCode() {
        int n2;
        Object object;
        int n3;
        block10: {
            long l2;
            block11: {
                CallSite callSite;
                block12: {
                    Object object2;
                    block8: {
                        block9: {
                            l2 = a ^ 0x2295EB7F93BEL;
                            callSite = ye.a("G", (long)4794934100887023592L, (long)l2);
                            try {
                                object2 = ye.a("\u00c3", (Object)this, (long)4819727591525631605L, (long)l2);
                                if (callSite == null) break block8;
                                if (object2 != null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                try {
                                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)4831000447378257614L, (long)l2));
                                }
                                catch (RuntimeException runtimeException2) {
                                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException2, (long)4831000447378257614L, (long)l2));
                                }
                            }
                            n3 = 0;
                            break block12;
                        }
                        object2 = ye.a("\u00c3", (Object)this, (long)4819727591525631605L, (long)l2);
                    }
                    n3 = object2.hashCode();
                }
                try {
                    try {
                        object = ye.a("\u00c3", (Object)this, (long)4841011855419649471L, (long)l2);
                        if (callSite == null) break block10;
                        if (object != null) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)4831000447378257614L, (long)l2));
                    }
                    n2 = 0;
                    return n3 ^ n2;
                }
                catch (RuntimeException runtimeException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)runtimeException, (long)4831000447378257614L, (long)l2));
                }
            }
            object = ye.a("\u00c3", (Object)this, (long)4841011855419649471L, (long)l2);
        }
        n2 = object.hashCode();
        return n3 ^ n2;
    }

    public /* synthetic */ pC(pC pC2, Object object, pC pC3, pC pC4) {
        pC pC5 = this;
        pC pC6 = this;
        pC pC7 = this;
        pC7.C = pC2;
        pC7.d = object;
        pC6.e = 1;
        pC6.c = pC3;
        pC5.D = pC4;
        pC4.c = pC5;
        pC3.D = pC5;
    }

    public /* synthetic */ pC() {
        this.d = null;
        this.c = this.D = this;
    }

    public static /* synthetic */ {
        a = wu.a(-8786965309744495049L, 5822176823783006620L, MethodHandles.lookup().lookupClass()).a(101840753249754L);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* synthetic */ boolean equals(Object this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 15[CATCHBLOCK]
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

    public final /* synthetic */ Object getKey() {
        long l2 = a ^ 0x3918A9D6B4F5L;
        return ye.a("\u00c3", (Object)this, (long)7325112731514822974L, (long)l2);
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public final /* synthetic */ Object getValue() {
        long l2 = a ^ 0xC577786FD8L;
        return ye.a("\u00c3", (Object)this, (long)-4663309246178668071L, (long)l2);
    }

    public final /* synthetic */ Object setValue(Object object) {
        long l2 = a ^ 0x7C7E6D25FEE4L;
        Object object2 = ye.a("\u00c3", (Object)this, (long)3347551428412719333L, (long)l2);
        ye.a("F", (Object)this, (Object)object, (long)3347551428412719333L, (long)l2);
        return object2;
    }

    public final /* synthetic */ String toString() {
        long l2 = a ^ 0x21BDE51A2100L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)ye.a("\u00c3", (Object)this, (long)-1126709571236301621L, (long)l2), (long)-1021167934941276774L, (long)l2))), (Object)net.futureclient.installer.d.C("!"), (long)-963507074886618601L, (long)l2))), (Object)ye.a("\u00c3", (Object)this, (long)-1040127510662373631L, (long)l2), (long)-1021167934941276774L, (long)l2))), (long)-1058353868206238216L, (long)l2));
    }
}

