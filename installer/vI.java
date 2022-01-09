/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import net.futureclient.installer.v6;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class vI
implements Map.Entry {
    private static final /* synthetic */ long b;

    public /* synthetic */ String toString() {
        long l2 = b ^ 0x6FDF1A8942E3L;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)ye.a("j", (Object)this, (long)-6039966217436899531L, (long)l2), (long)-5999064455609448207L, (long)l2))), (Object)v6.C("A"), (long)-5779260789630505092L, (long)l2))), (Object)ye.a("j", (Object)this, (long)-5989196339514033561L, (long)l2), (long)-5999064455609448207L, (long)l2))), (long)-6042450509210826605L, (long)l2));
    }

    public abstract /* synthetic */ Object getKey();

    private static /* synthetic */ UnsupportedOperationException a(UnsupportedOperationException this_) {
        return this_;
    }

    public /* synthetic */ Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public /* synthetic */ int hashCode() {
        int n2;
        Object object;
        int n3;
        block10: {
            Object object2;
            block11: {
                CallSite callSite;
                long l2;
                block12: {
                    Object object3;
                    block8: {
                        Object object4;
                        block9: {
                            l2 = b ^ 0x6CDAB31C4F0EL;
                            object4 = ye.a("j", (Object)this, (long)-6791224019430057256L, (long)l2);
                            object2 = ye.a("j", (Object)this, (long)-6841219979079633014L, (long)l2);
                            callSite = ye.a("G", (long)-6867118067495481904L, (long)l2);
                            try {
                                object3 = object4;
                                if (callSite == null) break block8;
                                if (object3 != null) break block9;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                try {
                                    throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)-6873178244273511386L, (long)l2));
                                }
                                catch (UnsupportedOperationException unsupportedOperationException2) {
                                    throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException2, (long)-6873178244273511386L, (long)l2));
                                }
                            }
                            n3 = 0;
                            break block12;
                        }
                        object3 = object4;
                    }
                    n3 = object3.hashCode();
                }
                try {
                    try {
                        object = object2;
                        if (callSite == null) break block10;
                        if (object != null) break block11;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)-6873178244273511386L, (long)l2));
                    }
                    n2 = 0;
                    return n3 ^ n2;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw (UnsupportedOperationException)((Object)ye.a("G", (Object)unsupportedOperationException, (long)-6873178244273511386L, (long)l2));
                }
            }
            object = object2;
        }
        n2 = object.hashCode();
        return n3 ^ n2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public /* synthetic */ boolean equals(Object this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 8[CATCHBLOCK]
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
        b = wu.a(-8726033798868281224L, -4785735190450241500L, MethodHandles.lookup().lookupClass()).a(86037182136631L);
    }

    public abstract /* synthetic */ Object getValue();
}

