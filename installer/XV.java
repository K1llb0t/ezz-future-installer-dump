/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.futureclient.installer.NE;
import net.futureclient.installer.NF;
import net.futureclient.installer.NZ;
import net.futureclient.installer.Q;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class XV {
    public final /* synthetic */ Map X;
    public final /* synthetic */ List A;
    public /* synthetic */ boolean s;
    public /* synthetic */ int l;
    public final /* synthetic */ List J;
    public /* synthetic */ NZ x;
    public /* synthetic */ boolean C;
    private static final /* synthetic */ long a;
    public /* synthetic */ String q;
    public /* synthetic */ Q m;
    public /* synthetic */ NE h;
    public /* synthetic */ int n;

    public static /* synthetic */ {
        a = wu.a(1927486318091127566L, -129893940324462371L, MethodHandles.lookup().lookupClass()).a(174202670058471L);
    }

    public static /* synthetic */ void j(Object[] this_) {
        boolean bl = (Boolean)this_[0];
        long l2 = (Long)this_[1];
        int n2 = (Integer)this_[2];
        l2 = (l2 << 32 | (long)n2 << 32 >>> 32) ^ a;
        try {
            if (!bl) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-2131525036979904511L, (long)l2));
        }
    }

    private static /* synthetic */ IllegalArgumentException a(IllegalArgumentException this_) {
        return this_;
    }

    public static /* synthetic */ Object Q(Object[] this_) {
        Object object = this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        try {
            if (object == null) {
                throw new NullPointerException();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-3111141430521358663L, (long)l2));
        }
        return object;
    }

    public /* synthetic */ XV() {
        XV xV = this;
        XV xV2 = this;
        this.x = NZ.l;
        this.m = Q.a;
        this.h = NF.a;
        XV xV3 = this;
        this.X = new HashMap();
        XV xV4 = this;
        this.A = new ArrayList();
        XV xV5 = this;
        this.J = new ArrayList();
        xV2.n = 2;
        xV2.l = 2;
        xV.s = true;
        xV.C = false;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ XV O(Object[] this) {
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
}

