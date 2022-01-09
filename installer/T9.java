/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.futureclient.installer.B;
import net.futureclient.installer.Nj;
import net.futureclient.installer.p8;
import net.futureclient.installer.vl;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public abstract class T9
implements Iterator {
    private /* synthetic */ vl Q;
    private /* synthetic */ Nj c;
    private /* synthetic */ AtomicReferenceArray r;
    private /* synthetic */ int s;
    private /* synthetic */ int m;
    private /* synthetic */ Nj i;
    private /* synthetic */ B E;
    private /* synthetic */ p8 I;
    private static final /* synthetic */ long b;

    @Override
    public /* synthetic */ boolean hasNext() {
        long l2 = b ^ 0x7F53CCDD3309L;
        try {
            if ((Nj)((Object)ye.a("\u00c3", (Object)this, (long)-1296681983983272378L, (long)l2)) != null) {
                return true;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)-1202974838634130973L, (long)l2));
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void J(Object[] this) {
        block11: {
            var2_3 = (Long)this /* !! */ [0];
            var2_3 = T9.b ^ var2_3;
            var4_4 = var2_3 ^ 29382708093255L;
            var6_5 = var2_3 ^ 103226862542001L;
            v0 = ye.a("G", (long)4078339504768112122L, (long)var2_3);
            ye.a("F", (Object)this, null, (long)4171591871051590051L, (long)var2_3);
            this = v0;
            try {
                v1 = new Object[1];
                v1[0] = var6_5;
                v2 = ye.a("j", (Object)this, (Object)v1, (long)4153631976523559665L, (long)var2_3);
                if (this == null) break block11;
                if (v2 != false) {
                    return;
                }
            }
            catch (IllegalStateException v3) {
                throw (IllegalStateException)ye.a("G", (Object)v3, (long)4083382696159610374L, (long)var2_3);
            }
            v4 = new Object[1];
            v4[0] = var4_4;
            v2 = ye.a("j", (Object)this, (Object)v4, (long)4091495712194923474L, (long)var2_3);
        }
        try {
            if (var2_3 > 0L && this != null) {
                if (v2 != false) {
                    return;
                }
            }
            ** GOTO lbl48
        }
        catch (IllegalStateException v5) {
            throw (IllegalStateException)ye.a("G", (Object)v5, (long)4083382696159610374L, (long)var2_3);
        }
lbl46:
        // 3 sources

        while (true) {
            v2 = ye.a("\u00c3", (Object)this, (long)4183284833310361235L, (long)var2_3);
lbl48:
            // 2 sources

            try {
                if (v2 < 0) return;
                v6 = this;
                v7 = (vl[])ye.a("\u00c3", (Object)((B)ye.a("\u00c3", (Object)v6, (long)4244781875274490663L, (long)var2_3)), (long)4196611586873785510L, (long)var2_3);
                v8 = this;
                v9 = ye.a("\u00c3", (Object)v8, (long)4183284833310361235L, (long)var2_3);
                ye.a("F", (Object)v8, (int)(v9 - true), (long)4183284833310361235L, (long)var2_3);
                ye.a("F", (Object)v6, (vl)v7[v9], (long)4140457912349425421L, (long)var2_3);
                v10 = this;
                ** GOTO lbl63
            }
            catch (IllegalStateException v11) {
                throw (IllegalStateException)ye.a("G", (Object)v11, (long)4083382696159610374L, (long)var2_3);
            }
            break;
        }
lbl-1000:
        // 1 sources

        {
            block12: {
                v10 = this;
lbl63:
                // 2 sources

                v12 = ye.a("\u00c3", (Object)((vl)ye.a("\u00c3", (Object)v10, (long)4140457912349425421L, (long)var2_3)), (long)4083946831638326525L, (long)var2_3);
                if (this == null) break block12;
                if (v12 == false) ** GOTO lbl46
                v13 = this;
                ye.a("F", (Object)v13, (AtomicReferenceArray)((AtomicReferenceArray)ye.a("\u00c3", (Object)((vl)ye.a("\u00c3", (Object)v13, (long)4140457912349425421L, (long)var2_3)), (long)4150240068842687827L, (long)var2_3)), (long)4153299380514338614L, (long)var2_3);
                v14 = this;
                ye.a("F", (Object)v14, (int)(((AtomicReferenceArray)ye.a("\u00c3", (Object)v14, (long)4153299380514338614L, (long)var2_3)).length() - 1), (long)4084403594848187838L, (long)var2_3);
                v15 = new Object[1];
                v15[0] = var4_4;
                v12 = ye.a("j", (Object)this, (Object)v15, (long)4091495712194923474L, (long)var2_3);
            }
            if (v12 == false) ** continue;
            if (var2_3 <= 0L) return;
            ** while (this == null)
        }
lbl86:
        // 1 sources

    }

    public /* synthetic */ T9(long l22, B b2) {
        long l22 = b ^ l22;
        long l3 = l22 ^ 0x478BBA56CB76L;
        this.E = b2;
        this.m = b2.p.length - 1;
        this.s = -1;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        ye.a("j", (Object)this, (Object)arrobject, (long)3315561986048401143L, (long)l22);
    }

    @Override
    public /* synthetic */ void remove() {
        boolean bl;
        long l2;
        block6: {
            block5: {
                l2 = b ^ 0x55D90C1AF874L;
                try {
                    if ((Nj)((Object)ye.a("\u00c3", (Object)this, (long)2787344564113251880L, (long)l2)) == null) break block5;
                    bl = true;
                    break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)2608435518802565790L, (long)l2));
                }
            }
            bl = false;
        }
        try {
            if (!bl) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)2608435518802565790L, (long)l2));
        }
        Object cfr_ignored_0 = ye.a("j", (Object)((B)((Object)ye.a("\u00c3", (Object)this, (long)2769834741202927551L, (long)l2))), (Object)ye.a("j", (Object)((Nj)((Object)ye.a("\u00c3", (Object)this, (long)2787344564113251880L, (long)l2))), (long)2708425349068486092L, (long)l2), (long)2638572912733696991L, (long)l2);
        ye.a("F", (Object)this, null, (long)2787344564113251880L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ boolean V(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * java.lang.UnsupportedOperationException
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:346)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:62)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:640)
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
        b = wu.a(2834336245270620647L, 3237285016689627233L, MethodHandles.lookup().lookupClass()).a(22810328541459L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Nj i(Object[] object) {
        Nj nj;
        long l2;
        long l3;
        block4: {
            l3 = (Long)object[0];
            l3 = b ^ l3;
            l2 = l3 ^ 0x88D4FBB7CEEL;
            object = ye.a("G", (long)-7270424124368030087L, (long)l3);
            try {
                nj = (Nj)((Object)ye.a("\u00c3", (Object)this, (long)-7320856998410040800L, (long)l3));
                if (object == null) return nj;
                if (nj != null) break block4;
                throw new NoSuchElementException();
            }
            catch (IllegalStateException illegalStateException) {
                try {
                    throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException, (long)-7266424949312871035L, (long)l3));
                }
                catch (IllegalStateException illegalStateException2) {
                    throw (IllegalStateException)((Object)ye.a("G", (Object)illegalStateException2, (long)-7266424949312871035L, (long)l3));
                }
            }
        }
        T9 t9 = this;
        ye.a("F", (Object)t9, (Nj)((Nj)((Object)ye.a("\u00c3", (Object)t9, (long)-7320856998410040800L, (long)l3))), (long)-7370742954102578893L, (long)l3);
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        ye.a("j", (Object)this, (Object)arrobject, (long)-7378179277879400081L, (long)l3);
        nj = (Nj)((Object)ye.a("\u00c3", (Object)this, (long)-7370742954102578893L, (long)l3));
        return nj;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ boolean Q(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 10[DOLOOP]
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

    /*
     * Exception decompiling
     */
    private /* synthetic */ boolean T(Object[] this) {
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

    private static /* synthetic */ IllegalStateException a(IllegalStateException this_) {
        return this_;
    }
}

