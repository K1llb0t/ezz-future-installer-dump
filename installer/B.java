/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.futureclient.installer.EZ
 *  net.futureclient.installer.N5
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;
import net.futureclient.installer.EZ;
import net.futureclient.installer.J;
import net.futureclient.installer.K;
import net.futureclient.installer.N5;
import net.futureclient.installer.NE;
import net.futureclient.installer.Nx;
import net.futureclient.installer.O;
import net.futureclient.installer.T3;
import net.futureclient.installer.T4;
import net.futureclient.installer.Tq;
import net.futureclient.installer.Xk;
import net.futureclient.installer.Xn;
import net.futureclient.installer.a;
import net.futureclient.installer.g;
import net.futureclient.installer.p1;
import net.futureclient.installer.p8;
import net.futureclient.installer.pU;
import net.futureclient.installer.pc;
import net.futureclient.installer.py;
import net.futureclient.installer.vl;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public class B
extends AbstractMap
implements ConcurrentMap {
    private /* synthetic */ int o;
    private /* synthetic */ Set V;
    public final /* synthetic */ Xn x;
    public final /* synthetic */ vl[] p;
    public static final /* synthetic */ Logger U;
    private /* synthetic */ long M;
    public static final /* synthetic */ Xk D;
    private /* synthetic */ K l;
    private /* synthetic */ O v;
    private /* synthetic */ int k;
    public final /* synthetic */ g W;
    private /* synthetic */ int K;
    private /* synthetic */ T4 s;
    public final /* synthetic */ K N;
    public static final /* synthetic */ Queue E;
    private /* synthetic */ long R;
    private /* synthetic */ Set F;
    public final /* synthetic */ pc P;
    public final /* synthetic */ long X;
    public final /* synthetic */ pc w;
    private /* synthetic */ Collection Y;
    private /* synthetic */ long i;
    private static final /* synthetic */ long e;
    public final /* synthetic */ Queue c;

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean N(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 11[CATCHBLOCK]
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
    @Override
    public /* synthetic */ boolean containsValue(Object this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 12[CATCHBLOCK]
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
        e = wu.a(-9191471621020326351L, -7039484278728896223L, MethodHandles.lookup().lookupClass()).a(263806089498177L);
        long l2 = e ^ 0x5399D3EE12L;
        U = (Logger)((Object)ye.a("G", (String)((Object)ye.a("j", B.class, (long)-8955806337643576869L, (long)l2)), (long)-9043301832846855086L, (long)l2));
        D = new pU();
        E = new T3();
    }

    public static /* synthetic */ ArrayList N(Object[] this_) {
        Collection collection = (Collection)this_[0];
        long l2 = (Long)this_[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x652D8378A92EL;
        ArrayList arrayList = new ArrayList((int)ye.a("j", (Object)collection, (long)1528856862743467323L, (long)l2));
        Object[] arrobject = new Object[3];
        arrobject[2] = l3;
        arrobject[1] = (Iterator)((Object)ye.a("j", (Object)collection, (long)1652938915804054117L, (long)l2));
        arrobject[0] = arrayList;
        ye.a("G", (Object)arrobject, (long)1520244111900914455L, (long)l2);
        return arrayList;
    }

    @Override
    public /* synthetic */ Set keySet() {
        long l2;
        block4: {
            Set set;
            block3: {
                l2 = e ^ 0x2DD2DD57F93EL;
                CallSite callSite = ye.a("G", (long)-7693212134946637729L, (long)l2);
                set = (Set)((Object)ye.a("\u00c3", (Object)this, (long)-7745044106121087545L, (long)l2));
                try {
                    if (callSite == null) break block3;
                    if (set != null) {
                        return set;
                    }
                    break block4;
                }
                catch (J j2) {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)-7531441581683583862L, (long)l2));
                }
            }
            return set;
        }
        B b2 = this;
        p1 p12 = new p1(b2, b2);
        ye.a("F", (Object)this, (Set)p12, (long)-7745044106121087545L, (long)l2);
        return p12;
    }

    public static /* synthetic */ Xk n(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = e ^ l2;
        return (Xk)((Object)ye.a("Z", (long)1622267528048214532L, (long)l2));
    }

    private /* synthetic */ int W(Object[] object22) {
        Object object = object22;
        long l2 = (Long)object[0];
        object22 = object[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x3F60F143AC84L;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = object22;
        CallSite callSite = ye.a("j", (Object)((pc)((Object)ye.a("\u00c3", (Object)this, (long)1300522313528832457L, (long)l2))), (Object)arrobject, (long)1317846756563116911L, (long)l2);
        reference v32 = callSite + (callSite << 15 ^ 0xFFFFCD7D);
        int n3 = v32 ^ v32 >>> 10;
        n3 = n3 + (n3 << 3);
        int object22 = n3 ^ n3 >>> 6;
        int n4 = object22 + ((object22 << 2) + (object22 << 14));
        return n4 ^ n4 >>> 16;
    }

    public final /* synthetic */ void I(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = e ^ l2;
        while ((Nx)((Object)ye.a("j", (Object)((Queue)((Object)ye.a("\u00c3", (Object)this, (long)-4167133440298524494L, (long)l2))), (long)-4091981762931103956L, (long)l2)) != null) {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public /* synthetic */ boolean remove(Object object, Object object2) {
        Object object3;
        long l2 = e ^ 0x7DB917C1C8B5L;
        long l3 = l2 ^ 0x29A1A484D8F2L;
        long l4 = l2 ^ 0x4F7A5C7A2B35L;
        long l5 = l2 ^ 0xBF7CE954E2FL;
        CallSite callSite = ye.a("G", (long)-6577674136455099948L, (long)l2);
        try {
            object3 = object;
            if (callSite != null) {
                if (object3 == null) return false;
                object3 = object2;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)-6417170271774251775L, (long)l2));
        }
        try {
            if (object3 == null) {
                return false;
            }
        }
        catch (J j3) {
            throw (J)((Object)ye.a("G", (Object)j3, (long)-6417170271774251775L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l3;
        CallSite callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)-6546777668648200989L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (int)callSite2;
        arrobject2[0] = l5;
        Object[] arrobject3 = new Object[4];
        arrobject3[3] = object2;
        arrobject3[2] = l4;
        arrobject3[1] = (int)callSite2;
        arrobject3[0] = object;
        return (boolean)ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-6586959940614031497L, (long)l2))), (Object)arrobject3, (long)-6558738758520956135L, (long)l2);
    }

    @Override
    public /* synthetic */ boolean replace(Object object, Object object2, Object object3) {
        long l2 = e ^ 0x459CF6F4C51AL;
        long l3 = l2 ^ 0x466934CA20ACL;
        long l4 = l2 ^ 0x118445B1D55DL;
        long l5 = l2 ^ 0x6E58B570343AL;
        long l6 = l2 ^ 0x33D22FA04380L;
        try {
            Object[] arrobject = new Object[2];
            arrobject[1] = object;
            arrobject[0] = l5;
            Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-6053669371641680038L, (long)l2);
            Object[] arrobject2 = new Object[2];
            arrobject2[1] = object3;
            arrobject2[0] = l5;
            Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-6053669371641680038L, (long)l2);
            if (object2 == null) {
                return false;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)-6098268041143392082L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject, (long)-6302202461596247732L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = (int)callSite;
        arrobject3[0] = l6;
        Object[] arrobject4 = new Object[5];
        arrobject4[4] = object3;
        arrobject4[3] = object2;
        arrobject4[2] = (int)callSite;
        arrobject4[1] = l3;
        arrobject4[0] = object;
        return (boolean)ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject3, (long)-6252875413982414120L, (long)l2))), (Object)arrobject4, (long)-6301078428457749518L, (long)l2);
    }

    @Override
    public /* synthetic */ Object computeIfAbsent(Object object, Function function) {
        long l2 = e ^ 0x112DF1AA379CL;
        long l3 = l2 ^ 0x3AE9B22EC6BCL;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)6447852255092432348L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = function;
        arrobject2[0] = l3;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)6447852255092432348L, (long)l2);
        Object object2 = object;
        return ye.a("j", (Object)this, (Object)object2, (this, this) -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
             * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
             * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             * org.benf.cfr.reader.entities.Method.getAnalysis(Method.java:510)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:350)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:166)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:104)
             * org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
             * org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriterToArgs(StaticFunctionInvokation.java:80)
             * org.benf.cfr.reader.bytecode.analysis.parse.expression.StaticFunctionInvokation.applyExpressionRewriter(StaticFunctionInvokation.java:68)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:102)
             * org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.rewriteExpressions(StructuredReturn.java:91)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:87)
             * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1125)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:868)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
             * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:185)
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
        }, (long)6497766074103971998L, (long)l2);
    }

    @Override
    public /* synthetic */ Object merge(Object object3, Object object4, BiFunction biFunction) {
        long l2 = e ^ 0x689EB6125C2L;
        long l3 = l2 ^ 0x2D4DA8E5D4E2L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object3;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)5414814196551864194L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object4;
        arrobject2[0] = l3;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)5414814196551864194L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = biFunction;
        arrobject3[0] = l3;
        Object cfr_ignored_2 = ye.a("G", (Object)arrobject3, (long)5414814196551864194L, (long)l2);
        return ye.a("j", (Object)this, (Object)object3, (object, object2) -> {
            Object object3;
            block6: {
                long l2 = e ^ 0x5466F86F5182L;
                object = ye.a("G", (long)4431614493725774051L, (long)l2);
                try {
                    object3 = object2;
                    if (object == null) break block6;
                    if (object3 == null) {
                        return object4;
                    }
                }
                catch (J j2) {
                    try {
                        throw (J)((Object)ye.a("G", (Object)j2, (long)4595510539158584374L, (long)l2));
                    }
                    catch (J j3) {
                        throw (J)((Object)ye.a("G", (Object)j3, (long)4595510539158584374L, (long)l2));
                    }
                }
                object3 = ye.a("j", (Object)biFunction, (Object)object2, (Object)object4, (long)4550767833121184975L, (long)l2);
            }
            return object3;
        }, (long)5220415741605860032L, (long)l2);
    }

    private /* synthetic */ vl r(Object[] object) {
        Object[] arrobject = object;
        int n2 = (Integer)object[0];
        long l2 = (Long)arrobject[1];
        object = (NE)arrobject[2];
        long l3 = (Long)arrobject[3];
        l3 = e ^ l3;
        return new vl(this, n2, l2, (NE)object, l3 ^= 0x5F3CE186980CL);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        long l2 = e ^ 0x58635695A83L;
        long l3 = l2 ^ 0x519E862C4AC4L;
        long l4 = l2 ^ 0x73C8EC3DDC19L;
        long l5 = l2 ^ 0x1B173A33BA8DL;
        try {
            if (object == null) {
                return null;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)3803247674595637047L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l3;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject, (long)3968608445093578453L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (int)callSite;
        arrobject2[0] = l4;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (int)callSite;
        arrobject3[1] = l5;
        arrobject3[0] = object;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)3936166872421000513L, (long)l2))), (Object)arrobject3, (long)3956770023166964097L, (long)l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ boolean q(Object[] object) {
        Object object2;
        block4: {
            long l2 = (Long)object[0];
            l2 = e ^ l2;
            object = ye.a("G", (long)-5116269067585333860L, (long)l2);
            try {
                reference cfr_temp_0 = ye.a("\u00c3", (Object)this, (long)-5031724112033790109L, (long)l2) - 0L;
                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object == null) return (boolean)object2;
                if (object2 < 0) break block4;
                return true;
            }
            catch (J j2) {
                try {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)-4991793811582420663L, (long)l2));
                }
                catch (J j3) {
                    throw (J)((Object)ye.a("G", (Object)j3, (long)-4991793811582420663L, (long)l2));
                }
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    public static /* synthetic */ void a(Object[] this_) {
        p8 p82 = (p8)this_[0];
        long l2 = (Long)this_[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x7E1242C1DE23L;
        long l4 = l2 ^ 0x416107FECBB6L;
        N5 n5 = (N5)ye.a("Z", (long)7354209318736961857L, (long)l2);
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = n5;
        ye.a("j", (Object)p82, (Object)arrobject, (long)7361740194260562861L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = n5;
        arrobject2[0] = l4;
        ye.a("j", (Object)p82, (Object)arrobject2, (long)7361032311405396960L, (long)l2);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        long l2 = e ^ 0x6567D856433AL;
        long l3 = l2 ^ 0x20145BFAF122L;
        long l4 = l2 ^ 0x317F6B13537DL;
        long l5 = l2 ^ 0x13290102C5A0L;
        try {
            if (object == null) {
                return null;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)3278261529054899854L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject, (long)3362558050678611820L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (int)callSite;
        arrobject2[0] = l5;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (int)callSite;
        arrobject3[1] = l3;
        arrobject3[0] = object;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)3393869187958930680L, (long)l2))), (Object)arrobject3, (long)3328344730091128385L, (long)l2);
    }

    @Override
    public /* synthetic */ Object putIfAbsent(Object object, Object object2) {
        long l2 = e ^ 0x7B27AE46AB1EL;
        long l3 = l2 ^ 0x4BBC4664A8EL;
        long l4 = l2 ^ 0x2F3F1D03BB59L;
        long l5 = l2 ^ 0x50E3EDC25A3EL;
        long l6 = l2 ^ 0xD6977122D84L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l5;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-4181251968535051938L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object2;
        arrobject2[0] = l5;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-4181251968535051938L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject3, (long)-4139323749088037048L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (int)callSite;
        arrobject4[0] = l6;
        Object[] arrobject5 = new Object[5];
        arrobject5[4] = true;
        arrobject5[3] = object2;
        arrobject5[2] = l3;
        arrobject5[1] = (int)callSite;
        arrobject5[0] = object;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)-4089993813102193444L, (long)l2))), (Object)arrobject5, (long)-4224172790737671613L, (long)l2);
    }

    public final /* synthetic */ boolean J(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = e ^ l2;
        try {
            if ((K)((Object)ye.a("\u00c3", (Object)this, (long)964381425523767605L, (long)l2)) != (K)((Object)ye.a("Z", (long)1064572908787615740L, (long)l2))) {
                return true;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)992930178567851575L, (long)l2));
        }
        return false;
    }

    public static /* synthetic */ void K(Object[] this_) {
        p8 p82 = (p8)this_[0];
        long l2 = (Long)this_[1];
        p8 p83 = (p8)this_[2];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x3F779005EE61L;
        long l4 = l2 ^ 0x72D59E656564L;
        Object[] arrobject = new Object[2];
        arrobject[1] = p83;
        arrobject[0] = l4;
        ye.a("j", (Object)p82, (Object)arrobject, (long)-6730712055223543453L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = p82;
        ye.a("j", (Object)p83, (Object)arrobject2, (long)-6799361641382680186L, (long)l2);
    }

    public final /* synthetic */ void u(Object[] object) {
        long l2 = (Long)object[0];
        object = (p8)object[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x3DCE92AB7CEEL;
        long l4 = l2 ^ 0x6336195D7845L;
        long l5 = l2 ^ 0x2D7C6F77674CL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l4;
        CallSite callSite = ye.a("j", (Object)object, (Object)arrobject, (long)-8293079679847375606L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (int)callSite;
        arrobject2[0] = l5;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (int)callSite;
        arrobject3[1] = object;
        arrobject3[0] = l3;
        ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-8217577974495781356L, (long)l2))), (Object)arrobject3, (long)-8223311680951080585L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public /* synthetic */ boolean isEmpty() {
        Object object;
        block19: {
            CallSite callSite;
            long l2;
            block20: {
                long l3;
                CallSite callSite2;
                int n2;
                vl[] arrvl;
                long l4;
                block18: {
                    long l5;
                    CallSite callSite3;
                    l2 = e ^ 0x2F916E12A8C3L;
                    l4 = 0L;
                    callSite = ye.a("G", (long)-4269067125311493726L, (long)l2);
                    arrvl = (vl[])ye.a("\u00c3", (Object)this, (long)-4150829866817584898L, (long)l2);
                    for (n2 = 0; n2 < arrvl.length; ++n2, l4 += (long)callSite3) {
                        try {
                            object = ye.a("\u00c3", (Object)arrvl[n2], (long)-4254478622325895003L, (long)l2);
                            if (callSite == null) break block18;
                            if (callSite == null) boolean bl;
                            return bl;
                        }
                        catch (J j2) {
                            try {
                                throw (J)((Object)ye.a("G", (Object)j2, (long)-4141073552568646281L, (long)l2));
                            }
                            catch (J j3) {
                                throw (J)((Object)ye.a("G", (Object)j3, (long)-4141073552568646281L, (long)l2));
                            }
                        }
                        if (object != false) {
                            return false;
                        }
                        callSite3 = ye.a("\u00c3", (Object)arrvl[n2], (long)-4208088910891622368L, (long)l2);
                        if (callSite != null) continue;
                    }
                    object = (l5 = l4 - 0L) == 0L ? 0 : (l5 < 0L ? -1 : 1);
                }
                try {
                    if (callSite == null) return (boolean)object;
                    if (object == false) break block19;
                }
                catch (J j4) {
                    throw (J)((Object)ye.a("G", (Object)j4, (long)-4141073552568646281L, (long)l2));
                }
                for (n2 = 0; n2 < arrvl.length; ++n2, l4 -= (long)callSite2) {
                    block21: {
                        try {
                            try {
                                object = ye.a("\u00c3", (Object)arrvl[n2], (long)-4254478622325895003L, (long)l2);
                                if (callSite == null) break block20;
                                if (callSite == null) boolean bl;
                                return bl;
                            }
                            catch (J j5) {
                                throw (J)((Object)ye.a("G", (Object)j5, (long)-4141073552568646281L, (long)l2));
                            }
                            if (object == false) break block21;
                            return false;
                        }
                        catch (J j6) {
                            throw (J)((Object)ye.a("G", (Object)j6, (long)-4141073552568646281L, (long)l2));
                        }
                    }
                    callSite2 = ye.a("\u00c3", (Object)arrvl[n2], (long)-4208088910891622368L, (long)l2);
                    if (callSite != null) continue;
                }
                object = (l3 = l4 - 0L) == 0L ? 0 : (l3 < 0L ? -1 : 1);
            }
            try {
                try {
                    if (callSite == null) return (boolean)object;
                    if (object != false) {
                        return false;
                    }
                }
                catch (J j7) {
                    throw (J)((Object)ye.a("G", (Object)j7, (long)-4141073552568646281L, (long)l2));
                }
            }
            catch (J j8) {
                throw (J)((Object)ye.a("G", (Object)j8, (long)-4141073552568646281L, (long)l2));
            }
        }
        object = 1;
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ boolean L(Object[] object) {
        Object object2;
        block4: {
            long l2 = (Long)object[0];
            l2 = e ^ l2;
            object = ye.a("G", (long)-5744771181276963547L, (long)l2);
            try {
                reference cfr_temp_0 = ye.a("\u00c3", (Object)this, (long)-5758871918147125073L, (long)l2) - 0L;
                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object == null) return (boolean)object2;
                if (object2 <= 0) break block4;
                return true;
            }
            catch (J j2) {
                try {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)-5620298176533171728L, (long)l2));
                }
                catch (J j3) {
                    throw (J)((Object)ye.a("G", (Object)j3, (long)-5620298176533171728L, (long)l2));
                }
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    @Override
    public /* synthetic */ Object getOrDefault(Object object, Object object2) {
        Object object3;
        block6: {
            long l2 = e ^ 0x78A16777A20CL;
            CallSite callSite = ye.a("G", (long)-3598819062095305875L, (long)l2);
            object3 = object = (Object)ye.a("j", (Object)this, (Object)object, (long)-3565392588858634760L, (long)l2);
            try {
                if (callSite == null) break block6;
                if (object3 != null) {
                    return object;
                }
            }
            catch (J j2) {
                try {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)-3726547566989111368L, (long)l2));
                }
                catch (J j3) {
                    throw (J)((Object)ye.a("G", (Object)j3, (long)-3726547566989111368L, (long)l2));
                }
            }
            object3 = object2;
        }
        return object3;
    }

    @Override
    public /* synthetic */ Object replace(Object object, Object object2) {
        long l2 = e ^ 0x5FA72AD9D94L;
        long l3 = l2 ^ 0x4890323B6E11L;
        long l4 = l2 ^ 0x51E2C1E88DD3L;
        long l5 = l2 ^ 0x2E3E31296CB4L;
        long l6 = l2 ^ 0x73B4ABF91B0EL;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l5;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-904295944236042284L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object2;
        arrobject2[0] = l5;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-904295944236042284L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject3, (long)-1151703078593904190L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (int)callSite;
        arrobject4[0] = l6;
        Object[] arrobject5 = new Object[4];
        arrobject5[3] = object2;
        arrobject5[2] = (int)callSite;
        arrobject5[1] = object;
        arrobject5[0] = l3;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)-1029333553695645098L, (long)l2))), (Object)arrobject5, (long)-1136769386826931887L, (long)l2);
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        long l2 = e ^ 0x119FADF4D0CCL;
        long l3 = l2 ^ 0x6E03C7D4315CL;
        long l4 = l2 ^ 0x45871EB1C08BL;
        long l5 = l2 ^ 0x3A5BEE7021ECL;
        long l6 = l2 ^ 0x67D174A05656L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l5;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-4743592483317695860L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = object2;
        arrobject2[0] = l5;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-4743592483317695860L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject3, (long)-4801892445254677350L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (int)callSite;
        arrobject4[0] = l6;
        Object[] arrobject5 = new Object[5];
        arrobject5[4] = false;
        arrobject5[3] = object2;
        arrobject5[2] = l3;
        arrobject5[1] = (int)callSite;
        arrobject5[0] = object;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)-4832636230240964850L, (long)l2))), (Object)arrobject5, (long)-4705466104384351855L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean W(Object[] this) {
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

    @Override
    public /* synthetic */ void putAll(Map object) {
        long l2 = e ^ 0x2D60E4B0B8D3L;
        object = (Iterator)((Object)ye.a("j", (Object)((Set)((Object)ye.a("j", (Object)object, (long)-3073368694113594157L, (long)l2))), (long)-3021426514843355111L, (long)l2));
        CallSite callSite = ye.a("G", (long)-3111643329001899598L, (long)l2);
        while (ye.a("j", (Object)object, (long)-3091481416466468919L, (long)l2) != false) {
            Map.Entry entry = (Map.Entry)((Object)ye.a("j", (Object)object, (long)-2979427182804731938L, (long)l2));
            Object cfr_ignored_0 = ye.a("j", (Object)this, (Object)ye.a("j", (Object)entry, (long)-3099419910338057297L, (long)l2), (Object)ye.a("j", (Object)entry, (long)-3016450975561322772L, (long)l2), (long)-3103022872166902581L, (long)l2);
            if (callSite != null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ B(long this, Tq this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Nonsensical loop would be emitted - failure
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:401)
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ boolean I(Object[] object) {
        Object object2;
        block4: {
            long l2 = (Long)object[0];
            l2 = e ^ l2;
            object = ye.a("G", (long)-3198578083532914945L, (long)l2);
            try {
                reference cfr_temp_0 = ye.a("\u00c3", (Object)this, (long)-3246212406694330211L, (long)l2) - 0L;
                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object == null) return (boolean)object2;
                if (object2 <= 0) break block4;
                return true;
            }
            catch (J j2) {
                try {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)-3325178574582279638L, (long)l2));
                }
                catch (J j3) {
                    throw (J)((Object)ye.a("G", (Object)j3, (long)-3325178574582279638L, (long)l2));
                }
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public /* synthetic */ int size() {
        int n2;
        long l2;
        block13: {
            CallSite callSite;
            long l3;
            block11: {
                block12: {
                    long l4;
                    block10: {
                        l3 = e ^ 0x1402838837BL;
                        vl[] arrvl = (vl[])ye.a("\u00c3", (Object)this, (long)-1306777355591898298L, (long)l3);
                        callSite = ye.a("G", (long)-1190897810796936678L, (long)l3);
                        long l5 = 0L;
                        for (int i2 = 0; i2 < arrvl.length; ++i2) {
                            l4 = l5 + (long)ye.a("G", (int)0, (int)ye.a("\u00c3", (Object)arrvl[i2], (long)-1203269332991231203L, (long)l3), (long)-1290571591420086128L, (long)l3);
                            if (callSite != null) {
                                l5 = l4;
                                if (callSite != null) continue;
                            }
                            break block10;
                        }
                        l4 = l5;
                    }
                    l2 = l4;
                    try {
                        long l6 = l4 - Integer.MAX_VALUE;
                        n2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                        if (callSite == null) break block11;
                        if (n2 <= 0) break block12;
                        return Integer.MAX_VALUE;
                    }
                    catch (J j2) {
                        try {
                            throw (J)((Object)ye.a("G", (Object)j2, (long)-1351117984297668913L, (long)l3));
                        }
                        catch (J j3) {
                            throw (J)((Object)ye.a("G", (Object)j3, (long)-1351117984297668913L, (long)l3));
                        }
                    }
                }
                long l7 = l2 - Integer.MIN_VALUE;
                n2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            }
            try {
                try {
                    if (callSite == null) return n2;
                    if (n2 >= 0) break block13;
                    return Integer.MIN_VALUE;
                }
                catch (J j4) {
                    throw (J)((Object)ye.a("G", (Object)j4, (long)-1351117984297668913L, (long)l3));
                }
            }
            catch (J j5) {
                throw (J)((Object)ye.a("G", (Object)j5, (long)-1351117984297668913L, (long)l3));
            }
        }
        n2 = (int)l2;
        return n2;
    }

    public static /* synthetic */ void v(Object[] this_) {
        p8 p82 = (p8)this_[0];
        long l2 = (Long)this_[1];
        p8 p83 = (p8)this_[2];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x24660145EDE0L;
        long l4 = l2 ^ 0x1B15447AF875L;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = p83;
        ye.a("j", (Object)p82, (Object)arrobject, (long)6190617458934120558L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = p82;
        arrobject2[0] = l4;
        ye.a("j", (Object)p83, (Object)arrobject2, (long)6189346216040067107L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean v(Object[] this) {
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

    @Override
    public /* synthetic */ Object compute(Object object, BiFunction biFunction) {
        long l2 = e ^ 0xED6427DE16FL;
        long l3 = l2 ^ 0x5ACEF138F128L;
        long l4 = l2 ^ 0x251201F9104FL;
        long l5 = l2 ^ 0x78989B2967F5L;
        long l6 = l2 ^ 0x6E73A2F1C661L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l4;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-8104156554864129233L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = biFunction;
        arrobject2[0] = l4;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-8104156554864129233L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = object;
        arrobject3[0] = l3;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject3, (long)-8286800289135084231L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = (int)callSite;
        arrobject4[0] = l5;
        Object[] arrobject5 = new Object[4];
        arrobject5[3] = biFunction;
        arrobject5[2] = l6;
        arrobject5[1] = (int)callSite;
        arrobject5[0] = object;
        return ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)-8265202929069924691L, (long)l2))), (Object)arrobject5, (long)-8078637325621160810L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public /* synthetic */ void clear() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 22[DOLOOP]
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

    public static /* synthetic */ Queue h(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = e ^ l2;
        return (Queue)((Object)ye.a("Z", (long)1895346864143433729L, (long)l2));
    }

    private /* synthetic */ vl y(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        l2 = e ^ l2;
        return ((vl[])ye.a("\u00c3", (Object)this, (long)-8708263675598356035L, (long)l2))[arrobject2 >>> ye.a("\u00c3", (Object)this, (long)-8699112897324586582L, (long)l2) & ye.a("\u00c3", (Object)this, (long)-8879343093234886687L, (long)l2)];
    }

    public static /* synthetic */ p8 R(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = e ^ l2;
        return (N5)ye.a("Z", (long)5729176494458669260L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean U(Object[] this) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ boolean Y(Object[] object) {
        Object object2;
        block4: {
            long l2 = (Long)object[0];
            l2 = e ^ l2;
            object = ye.a("G", (long)8069465343801688735L, (long)l2);
            try {
                reference cfr_temp_0 = ye.a("\u00c3", (Object)this, (long)7948018323513719178L, (long)l2) - 0L;
                object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object == null) return (boolean)object2;
                if (object2 <= 0) break block4;
                return true;
            }
            catch (J j2) {
                try {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)7906832635597631050L, (long)l2));
                }
                catch (J j3) {
                    throw (J)((Object)ye.a("G", (Object)j3, (long)7906832635597631050L, (long)l2));
                }
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    @Override
    public /* synthetic */ boolean containsKey(Object object) {
        long l2 = e ^ 0x73C792644BC9L;
        long l3 = l2 ^ 0x6B7E7495D641L;
        long l4 = l2 ^ 0x27DF21215B8EL;
        long l5 = l2 ^ 0x5894B30CD53L;
        try {
            if (object == null) {
                return false;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)2706012317695829629L, (long)l2));
        }
        Object[] arrobject = new Object[2];
        arrobject[1] = object;
        arrobject[0] = l4;
        CallSite callSite = ye.a("j", (Object)this, (Object)arrobject, (long)2763277345885656991L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (int)callSite;
        arrobject2[0] = l5;
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = (int)callSite;
        arrobject3[1] = l3;
        arrobject3[0] = object;
        return (boolean)ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)2876222000993235979L, (long)l2))), (Object)arrobject3, (long)2777675228941197067L, (long)l2);
    }

    @Override
    public /* synthetic */ Collection values() {
        long l2;
        block4: {
            Collection collection;
            block3: {
                l2 = e ^ 0x24763605411BL;
                CallSite callSite = ye.a("G", (long)3249683539588104314L, (long)l2);
                collection = (Collection)((Object)ye.a("\u00c3", (Object)this, (long)3458542403212456175L, (long)l2));
                try {
                    if (callSite == null) break block3;
                    if (collection != null) {
                        return collection;
                    }
                    break block4;
                }
                catch (J j2) {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)3413720185552923823L, (long)l2));
                }
            }
            return collection;
        }
        B b2 = this;
        a a2 = new a(b2, b2);
        ye.a("F", (Object)this, (Collection)a2, (long)3458542403212456175L, (long)l2);
        return a2;
    }

    public final /* synthetic */ void x(Object[] object) {
        long l2 = (Long)object[0];
        object = (Xk)object[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0x7048FA414C9L;
        long l4 = l2 ^ 0x362CA45CEC1AL;
        long l5 = l2 ^ 0x38E24E6DE23AL;
        long l6 = l2 ^ 0x70239380CF47L;
        long l7 = l2 ^ 0x3E69E5AAD04EL;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        p8 p82 = (p8)((Object)ye.a("j", (Object)object, (Object)arrobject, (long)4216221075099456428L, (long)l2));
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l6;
        CallSite callSite = ye.a("j", (Object)p82, (Object)arrobject2, (long)4317576475461184008L, (long)l2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = (int)callSite;
        arrobject3[0] = l7;
        Object[] arrobject4 = new Object[1];
        arrobject4[0] = l4;
        Object[] arrobject5 = new Object[4];
        arrobject5[3] = l5;
        arrobject5[2] = object;
        arrobject5[1] = (int)callSite;
        arrobject5[0] = ye.a("j", (Object)p82, (Object)arrobject4, (long)4230770905467280748L, (long)l2);
        ye.a("j", (Object)((vl)((Object)ye.a("j", (Object)this, (Object)arrobject3, (long)4248969550898882838L, (long)l2))), (Object)arrobject5, (long)4036891858746920158L, (long)l2);
    }

    private static /* synthetic */ J a(J this_) {
        return this_;
    }

    public final /* synthetic */ boolean Z(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = e ^ l2;
        try {
            if ((O)((Object)ye.a("\u00c3", (Object)this, (long)3279594141892103673L, (long)l2)) != (EZ)ye.a("Z", (long)3404735923067485944L, (long)l2)) {
                return true;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)3442657572669320246L, (long)l2));
        }
        return false;
    }

    @Override
    public /* synthetic */ Set entrySet() {
        long l2;
        block4: {
            Set set;
            block3: {
                l2 = e ^ 0x4FE29FB71A18L;
                CallSite callSite = ye.a("G", (long)8510213825375968121L, (long)l2);
                set = (Set)((Object)ye.a("\u00c3", (Object)this, (long)8595073049850045527L, (long)l2));
                try {
                    if (callSite == null) break block3;
                    if (set != null) {
                        return set;
                    }
                    break block4;
                }
                catch (J j2) {
                    throw (J)((Object)ye.a("G", (Object)j2, (long)8384739302432847788L, (long)l2));
                }
            }
            return set;
        }
        B b2 = this;
        py py2 = new py(b2, b2);
        ye.a("F", (Object)this, (Set)py2, (long)8595073049850045527L, (long)l2);
        return py2;
    }

    public static /* synthetic */ void C(Object[] this_) {
        p8 p82 = (p8)this_[0];
        long l2 = (Long)this_[1];
        l2 = e ^ l2;
        long l3 = l2 ^ 0xABE21EDCDEDL;
        long l4 = l2 ^ 0x471C2F8D46E8L;
        N5 n5 = (N5)ye.a("Z", (long)-9118098125784168904L, (long)l2);
        Object[] arrobject = new Object[2];
        arrobject[1] = n5;
        arrobject[0] = l4;
        ye.a("j", (Object)p82, (Object)arrobject, (long)-9143573046137832721L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = n5;
        ye.a("j", (Object)p82, (Object)arrobject2, (long)-9065775370965366262L, (long)l2);
    }

    public final /* synthetic */ boolean P(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = e ^ l2;
        try {
            if ((K)((Object)ye.a("\u00c3", (Object)this, (long)8334189119060346057L, (long)l2)) != (K)((Object)ye.a("Z", (long)8294601600612710950L, (long)l2))) {
                return true;
            }
        }
        catch (J j2) {
            throw (J)((Object)ye.a("G", (Object)j2, (long)8078859470482912237L, (long)l2));
        }
        return false;
    }

    @Override
    public /* synthetic */ Object computeIfPresent(Object object3, BiFunction biFunction) {
        long l2 = e ^ 0xEA680328BD8L;
        long l3 = l2 ^ 0x2562C3B67AF8L;
        Object[] arrobject = new Object[2];
        arrobject[1] = object3;
        arrobject[0] = l3;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)-1927750656674438760L, (long)l2);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = biFunction;
        arrobject2[0] = l3;
        Object cfr_ignored_1 = ye.a("G", (Object)arrobject2, (long)-1927750656674438760L, (long)l2);
        return ye.a("j", (Object)this, (Object)object3, (object, object2) -> {
            Object object3;
            long l2;
            block4: {
                l2 = e ^ 0x69D9598B1584L;
                CallSite callSite = ye.a("G", (long)8756823248741274853L, (long)l2);
                try {
                    object3 = object2;
                    if (callSite == null) return object3;
                    if (object3 != null) break block4;
                    return null;
                }
                catch (J j2) {
                    try {
                        throw (J)((Object)ye.a("G", (Object)j2, (long)8917327112960489520L, (long)l2));
                    }
                    catch (J j3) {
                        throw (J)((Object)ye.a("G", (Object)j3, (long)8917327112960489520L, (long)l2));
                    }
                }
            }
            object3 = ye.a("j", (Object)biFunction, (Object)object, (Object)object2, (long)8872564623217400009L, (long)l2);
            return object3;
        }, (long)-1844034544171877158L, (long)l2);
    }
}

