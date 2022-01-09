/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.security.CodeSource;
import java.security.Key;
import java.security.ProtectionDomain;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.ET;
import net.futureclient.installer.Th;
import net.futureclient.installer.Xb;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class E6 {
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ long a;

    /*
     * Exception decompiling
     */
    public static /* synthetic */ String I(Object[] this) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ boolean c(Object[] this) {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var2_1 = (Long)this[0];
                        var4_2 = this[1];
                        var1_3 = this[2];
                        var2_1 = E6.a ^ var2_1;
                        var5_4 = ye.a("G", (long)-6787073687219024724L, (long)var2_1);
                        try {
                            v0 = var4_2;
                            if (var5_4 == null) break block14;
                            if (v0 != var1_3) {
                                v0 = var4_2;
                            }
                            ** GOTO lbl48
                        }
                        catch (ClassCastException v1) {
                            try {
                                throw (Throwable)ye.a("G", (Object)v1, (long)-6666199251234279957L, (long)var2_1);
                            }
                            catch (ClassCastException v2) {
                                throw (Throwable)ye.a("G", (Object)v2, (long)-6666199251234279957L, (long)var2_1);
                            }
                        }
                    }
                    try {
                        v3 = var5_4;
                        if (var2_1 > 0L) {
                            if (v3 == null) break block15;
                            if (v0 == null) break block16;
                            v0 = var4_2;
                        }
                        ** GOTO lbl41
                    }
                    catch (ClassCastException v4) {
                        throw (Throwable)ye.a("G", (Object)v4, (long)-6666199251234279957L, (long)var2_1);
                    }
                }
                try {
                    try {
                        v3 = var1_3;
lbl41:
                        // 2 sources

                        v5 /* !! */  = ye.a("j", (Object)v0, (Object)v3, (long)-6809209024767064788L, (long)var2_1);
                        if (var5_4 == null) break block17;
                        if (v5 /* !! */ ) {
                        }
                        break block16;
                    }
                    catch (ClassCastException v6) {
                        throw (Throwable)ye.a("G", (Object)v6, (long)-6666199251234279957L, (long)var2_1);
                    }
lbl48:
                    // 2 sources

                    return true;
                }
                catch (ClassCastException v7) {
                    throw (Throwable)ye.a("G", (Object)v7, (long)-6666199251234279957L, (long)var2_1);
                }
            }
            v5 /* !! */  = false;
        }
        return v5 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ String M(Object[] this) {
        block7: {
            var2_1 = (Long)this[0];
            var4_2 = (String)this[1];
            var1_3 = (Object[])this[2];
            var2_1 = E6.a ^ var2_1;
            var4_2 = (String)ye.a("G", var4_2, (long)-4868096262140050918L, (long)var2_1);
            var5_4 = new StringBuilder((int)(ye.a("j", var4_2, (long)-4675750405790558173L, (long)var2_1) + 16 * var1_3.length));
            var6_5 /* !! */  = 0;
            for (var7_6 = 0; var7_6 < var1_3.length; ++var7_6) {
                v0 /* !! */  = ye.a("j", var4_2, (Object)((String)E6.a("l", (int)2770, (long)(8594628317389173509L ^ var2_1))), (int)var6_5 /* !! */ , (long)-4876475711111094175L, (long)var2_1);
                v1 = -1;
                if (var2_1 >= 0L && var2_1 > 0L) {
                    if (v0 /* !! */  == v1) break;
                    (StringBuilder)ye.a("j", (Object)var5_4, (Object)var4_2, (int)var6_5 /* !! */ , (int)var8_7, (long)-4646165589079378563L, (long)var2_1);
                    v2 = var1_3[var7_6];
                    (StringBuilder)ye.a("j", (Object)var5_4, (Object)v2, (long)-4671339578521937054L, (long)var2_1);
                    var6_5 /* !! */  = (int)(var8_7 + 2);
                    if (var2_1 > 0L) continue;
                }
                ** GOTO lbl46
            }
            try {
                v3 = var4_2;
                v4 = (StringBuilder)ye.a("j", (Object)var5_4, (Object)v3, (int)var6_5 /* !! */ , (int)ye.a("j", v3, (long)-4675750405790558173L, (long)var2_1), (long)-4646165589079378563L, (long)var2_1);
                if (var2_1 < 0L) return (String)ye.a("j", (Object)v4, (long)-4631956026388882688L, (long)var2_1);
                v0 /* !! */  = (CallSite)var7_6;
                v1 = var1_3.length;
lbl46:
                // 2 sources

                if (v0 /* !! */  >= v1) break block7;
                (StringBuilder)ye.a("j", (Object)var5_4, (Object)((String)E6.a("l", (int)2650, (long)(1802268591844668288L ^ var2_1))), (long)-4874888070467748625L, (long)var2_1);
                v5 = var1_3[var7_6];
                (StringBuilder)ye.a("j", (Object)var5_4, (Object)v5, (long)-4671339578521937054L, (long)var2_1);
                v6 = ++var7_6;
            }
            catch (ClassCastException v7) {
                throw (Throwable)ye.a("G", (Object)v7, (long)-4864275575523855639L, (long)var2_1);
            }
            {
                while (v6 < var1_3.length) {
                    (StringBuilder)ye.a("j", (Object)var5_4, (Object)((String)E6.a("l", (int)21638, (long)(370850744617069900L ^ var2_1))), (long)-4874888070467748625L, (long)var2_1);
                    v8 = var1_3[var7_6];
                    ++var7_6;
                    (StringBuilder)ye.a("j", (Object)var5_4, (Object)v8, (long)-4671339578521937054L, (long)var2_1);
                    if (var2_1 > 0L) {
                        v6 = var7_6;
                        continue;
                    }
                    break block7;
                }
            }
            (StringBuilder)ye.a("j", (Object)var5_4, (char)']', (long)-4653045239255683360L, (long)var2_1);
        }
        v4 = var5_4;
        return (String)ye.a("j", (Object)v4, (long)-4631956026388882688L, (long)var2_1);
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List x(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public static /* synthetic */ List h(Object[] this_) {
        List list;
        Object object;
        long l2;
        List list2;
        block3: {
            block2: {
                list2 = (List)this_[0];
                l2 = (Long)this_[1];
                object = this_[2];
                l2 = a ^ l2;
                try {
                    if (list2 != null) break block2;
                    list = new ArrayList(1);
                    break block3;
                }
                catch (ClassCastException classCastException) {
                    throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)7262847253676386909L, (long)l2));
                }
            }
            list = list2;
        }
        list2 = list;
        ye.a("j", (Object)list, (Object)object, (long)7468706601712594375L, (long)l2);
        return list2;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ byte[] L(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static /* synthetic */ List Y(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public static /* synthetic */ void E(Object[] this_) {
        boolean bl = (Boolean)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        try {
            if (!bl) {
                throw new IllegalArgumentException();
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)-2812885898431113631L, (long)l2));
        }
    }

    public static /* synthetic */ boolean O(Object[] this_) {
        boolean bl;
        long l2 = (Long)this_[0];
        long l3 = (Long)this_[1];
        l3 = a ^ l3;
        try {
            ye.a("G", (long)l2, (long)-7306314423370773563L, (long)l3);
            bl = true;
        }
        catch (InterruptedException interruptedException) {
            return false;
        }
        return bl;
    }

    public static /* synthetic */ Path G(Object[] this_) {
        Class class_ = (Class)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        return (Path)((Object)ye.a("G", (Object)((URI)((Object)ye.a("j", (Object)((URL)((Object)ye.a("j", (Object)((CodeSource)((Object)ye.a("j", (Object)((ProtectionDomain)((Object)ye.a("j", (Object)class_, (long)8734995893785135677L, (long)l2))), (long)8655333949958703587L, (long)l2))), (long)8706599322871554139L, (long)l2))), (long)8756248817494927580L, (long)l2))), (long)8684472797738558138L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List U(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static /* synthetic */ List v(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    private static /* synthetic */ String n(Object[] this_) {
        long l2 = (Long)this_[0];
        int n2 = (Integer)this_[1];
        int n3 = (Integer)this_[2];
        String string = (String)this_[3];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x1CFB780C792DL;
        try {
            if (n2 < 0) {
                Object[] arrobject = new Object[2];
                arrobject[0] = string;
                arrobject[1] = (Integer)((Object)ye.a("G", (int)n2, (long)2895569899350441340L, (long)l2));
                Object[] arrobject2 = new Object[3];
                arrobject2[2] = arrobject;
                arrobject2[1] = (String)((Object)E6.a("l", (int)982, (long)(0x7D75A42EF445ADFBL ^ l2)));
                arrobject2[0] = l3;
                return (String)((Object)ye.a("G", (Object)arrobject2, (long)2965907710528571145L, (long)l2));
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)3141512162568905999L, (long)l2));
        }
        try {
            if (n3 < 0) {
                throw new IllegalArgumentException((String)((Object)ye.a("j", (String)((Object)E6.a("l", (int)24164, (long)(0x7638BDF311F8F052L ^ l2))), (Object)((String)((Object)ye.a("G", (int)n3, (long)2942217953876838297L, (long)l2))), (long)3117142980896580672L, (long)l2)));
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)3141512162568905999L, (long)l2));
        }
        Object[] arrobject = new Object[3];
        arrobject[0] = string;
        arrobject[1] = (Integer)((Object)ye.a("G", (int)n2, (long)2895569899350441340L, (long)l2));
        arrobject[2] = (Integer)((Object)ye.a("G", (int)n3, (long)2895569899350441340L, (long)l2));
        Object[] arrobject3 = new Object[3];
        arrobject3[2] = arrobject;
        arrobject3[1] = (String)((Object)E6.a("l", (int)29135, (long)(0x4B6AAEAAB77CDFF8L ^ l2)));
        arrobject3[0] = l3;
        return (String)((Object)ye.a("G", (Object)arrobject3, (long)2965907710528571145L, (long)l2));
    }

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
    }

    public static /* synthetic */ void n(Object[] this_) {
        long l2 = (Long)this_[0];
        l2 = a ^ l2;
        try {
            Class[] arrclass = new Class[1];
            arrclass[0] = (Class)((Object)ye.a("Z", (long)6816915205254405766L, (long)l2));
            Method method = (Method)((Object)ye.a("j", (Object)((Class)((Object)ye.a("G", (String)((Object)E6.a("l", (int)15807, (long)(0x21796E20927B657FL ^ l2))), (long)6829555267192626681L, (long)l2))), (Object)((String)((Object)E6.a("l", (int)18528, (long)(0x2C8B6EC4B4E190A5L ^ l2)))), (Object)arrclass, (long)6724196668974982654L, (long)l2));
            Object cfr_ignored_0 = ye.a("G", (Object)method, (long)6890177365706203995L, (long)l2);
            ye.a("j", (Object)method, (boolean)true, (long)6803769865951546870L, (long)l2);
            Object[] arrobject = new Object[1];
            arrobject[0] = (Integer)((Object)ye.a("G", (int)0, (long)6832616985128913793L, (long)l2));
            Object cfr_ignored_1 = ye.a("j", (Object)method, null, (Object)arrobject, (long)6812948766358899485L, (long)l2);
        }
        catch (Exception exception) {
            ye.a("G", (int)0, (long)6882896679024642123L, (long)l2);
        }
        throw new IllegalStateException();
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List b(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public static /* synthetic */ int M(Object[] this_) {
        long l2 = (Long)this_[0];
        int n2 = (Integer)this_[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x5CFD8934C6DBL;
        String string = (String)((Object)E6.a("l", (int)31458, (long)(0x92E61838C68FCC8L ^ l2)));
        try {
            if (n2 < 0) {
                Object[] arrobject = new Object[4];
                arrobject[3] = string;
                arrobject[2] = n2;
                arrobject[1] = 0;
                arrobject[0] = l3;
                throw new IndexOutOfBoundsException((String)((Object)ye.a("G", (Object)arrobject, (long)118094423867018893L, (long)l2)));
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)254698725303258399L, (long)l2));
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List s(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public static /* synthetic */ ET V(Object[] this_) {
        Object object = this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x2FCE8DFB3DA9L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        return new ET((String)((Object)ye.a("j", object.getClass(), (long)2162516977083213714L, (long)l2)), 0, (char)n2, n3, (char)n4);
    }

    public static /* synthetic */ void z(Object[] this_) {
        boolean bl = (Boolean)this_[0];
        Object object = this_[1];
        long l2 = (Long)this_[2];
        l2 = a ^ l2;
        try {
            if (!bl) {
                throw new IllegalArgumentException((String)((Object)ye.a("G", (Object)object, (long)5950960156176592125L, (long)l2)));
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)5951961713344404494L, (long)l2));
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ Object R(Object[] this_) {
        Future future;
        Future future2 = (Future)this_[0];
        long l2 = (Long)this_[1];
        l2 = a ^ l2;
        boolean bl = false;
        try {
            future = future2;
        }
        catch (InterruptedException interruptedException) {
            bl = true;
            future = future2;
        }
        Object object = ye.a("j", (Object)future, (long)-8744948395797724939L, (long)l2);
        try {
            if (l2 <= 0L) return object;
            if (!bl) return object;
            ye.a("j", (Object)((Thread)((Object)ye.a("G", (long)-8761976476725345797L, (long)l2))), (long)-8760470679470568515L, (long)l2);
            return object;
        }
        catch (InterruptedException interruptedException) {
            throw (Throwable)((Object)ye.a("G", (Object)interruptedException, (long)-8851077491506639939L, (long)l2));
        }
        catch (Throwable throwable) {
            try {
                if (l2 < 0L) throw throwable;
                if (!bl) throw throwable;
                ye.a("j", (Object)((Thread)((Object)ye.a("G", (long)-8761976476725345797L, (long)l2))), (long)-8760470679470568515L, (long)l2);
                throw throwable;
            }
            catch (InterruptedException interruptedException) {
                throw (Throwable)((Object)ye.a("G", (Object)interruptedException, (long)-8851077491506639939L, (long)l2));
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ DateFormat D(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public static /* synthetic */ void d(Object[] this_) {
        boolean bl = (Boolean)this_[0];
        Object object = this_[1];
        long l2 = (Long)this_[2];
        l2 = a ^ l2;
        try {
            if (!bl) {
                throw new IllegalStateException((String)((Object)ye.a("G", (Object)object, (long)6304772215581419796L, (long)l2)));
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)6300711741337459175L, (long)l2));
        }
    }

    public static /* synthetic */ Object q(Object[] this_) {
        Object object;
        block6: {
            Object object2 = this_[0];
            long l2 = (Long)this_[1];
            Object object3 = this_[2];
            l2 = a ^ l2;
            long l3 = l2 ^ 0x7CB1DC57573EL;
            CallSite callSite = ye.a("G", (long)-3883155156111218817L, (long)l2);
            try {
                object = object2;
                if (callSite == null) break block6;
                if (object != null) {
                    return object2;
                }
            }
            catch (ClassCastException classCastException) {
                try {
                    throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)-3985723479279286728L, (long)l2));
                }
                catch (ClassCastException classCastException2) {
                    throw (Throwable)((Object)ye.a("G", (Object)classCastException2, (long)-3985723479279286728L, (long)l2));
                }
            }
            Object[] arrobject = new Object[2];
            arrobject[1] = object3;
            arrobject[0] = l3;
            object = ye.a("G", (Object)arrobject, (long)-3965110308031837090L, (long)l2);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        E6.a = wu.a(2789026148524106090L, -8733140123172101252L, MethodHandles.lookup().lookupClass()).a(83890777489900L);
        E6.d = new HashMap<K, V>(13);
        var0 = E6.a ^ 50500572891714L;
        var2_1 = Cipher.getInstance(Xb.C("!71Z4\"9B*&07Q#YK7-NP"));
        v0 = SecretKeyFactory.getInstance(Th.C("\n\u001bn"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var0 >>> 56);
        v3 = var3_2 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var3_2++;
            v2[v4] = (byte)(var0 << v4 * 8 >>> 56);
            v3 = var3_2;
        }
        var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var7_3 = new String[21];
        var5_4 = 0;
        var4_5 = Xb.C("\u0094&\u00847\u0014g\u00cd=<\u00dd\u00f0\u00be\u00eci$\u00ef\u00aa\u00ad\u00f6\u00d8\u00ba\u0088\u00b5\u00ceC\u0085\u00e9W7\u00a5\u00a9\u00d9\u00ce\u00e62\u00ee\u00f6I\u00e7\u0013\u00fcKm\u00fe\u001ek\u009a\u00bd\u0093\u0086\u00d7\u00ddF\u0080$\u0080(}\u0086\u00ec.\u00ceQ\u00f4\u00b4F\u00a0\u00e6\n\u00b4\u00a0 RyW\u00dd~\u00a1\u00a2\u001d\u00d7\u00ec]\u0013\u00a2\u00fa\u00a3H\f\u0002\u00ae\u00a9\u0086\u009b\u00c0 \u00c8\u00c3:\u00fan\u009bO)5\u001d\u001e\u00ad\u00ad\u00e1\b8\u0096\u00cb\u009de\u00c8\u0095\u00da\u0091hi%\u00a3\u0088\u008b9x3N.\u008bk\u001b\\\u00c8\u00d5\u00c8\u00164\u00b79\u00a78p\u000e\u00f2\r\u008e%\u00ce\u00e7\u001eR\\\u00f3p/\u00f7\u00db6T\u00efLB\u0093\u001f\u0004\u0096\u00de\u001dd\u0004mt\u00d86\u008f\u00a9\u0004\u00eb\u0083\u008f\u00cd\u00cb\u00c2[\u00c3:\u00a6\u00887\u00cb\u0091n\u001a\u0094\u00ad\u00ad\u00ac\u00f4<;^\u00ec\u00e7g\u0014s'\u00af\u00aa\u0085]\u00d7^z\u000f\u00f1(\u00d9E\u0017\u008f\u00c8\u00b8\u00eeM6\u00ca\u00e5 \u00f5`\u00cc\u00a3\u0007i\u00af>\u00f64\u0010z\u00b3 \u00eb\u00df\u00b3\u0085\u0012D\u0000\u0086\u00a8\u0010\u00fb\u00fe~\u0096+\u00f4i\u00bcg\u00a0q\u00ec\u00d4\u0000a~\u000f\u0003\u0010'\u00af\u0084\u00d3\u00e2\u00e3\u00c5\u00ff\u009e\u00ca~\u0001\ne-\u0012\u008f\u00a6!\u00b5\u00a0xX\u009e\u00af\u00ea\u0098\u00a6\u00bb\u00fe\u00a7\u00daR(\u000f\u008cv\u00d4\u00ec\u00c1\u00f8\u00ddM\u00b4\u00b2\u00d6\u00b0\u00a1\u00cbE\u00d9\u00bd\fA\u001b1J\u0082q\u00ad%*@\u00f1\u0089A\u00e0u\u0019\u0015tB\u00e5*;\f\u00dfE\u0085\u001ao\u0016\u00e3\u0012Mp\u0002\u008f\u000f?\u000e\u0007\u00b1\u0091]qq\u0093>\u00b7\t\u00c6\u00bfr\u001fS9\u0093\u00d0\u0084.\u00f3\u00d0\u00ac\u00a1' \u00c0%\u00a6>\u00b0\u000f\u00fd\u00ae\u0018\u00abo\u00d6z\u00bdD_\u001ff\u0083\u00b8\u0010\u00e5\u00fcc\u0098N\u00a1\u00fe\u008aUML\u00b7z\u008a\u00c7n\f\u0010!\u001b\"x\u00d29\u00ed\u0003\f\u00e57O5\nr\u0086\u00b2\u00f0p^\u0003\u00e2\u0007\u00d1\u00fc,\u0080pu@\u00ed\u0004\u00ce\u0084\u0081\u00e12\u00ba\u00fa\u009e\u00e8K(^Wo\u00174\u009a\u0011\u0011!\u0097#x_\u0013\u0097\u00fa\u009c\u009eoY\u00ad\u00c3\r\u00b2\u007fPI\u00d5C\u0090WN`\u00b4p\u00b70\u0005t&\u00ac\u00e2\u0003\u00fd\u00f5\tZ\u000f\u0080RL*\u00ae'\u00bb=\u0085\u0012n\u00b7\u00eb\u008f\u00cd_\u00ff\u00e7\u001a~~\u00fbT\\\u00d8\u00ac\u0005n\u00a6\u00eeo\u00f0\u00a3\u00b0\u009c\u008a\u0015;\u00ccJ\u009a\u00c2\b\u00b7m\u00b7\u00b5e\u00af\u009c1\u00d1\u00e6\u00ff\u0006uD\u00e81F\u0095\u0095+T");
        var6_6 = var4_5.length();
        var1_7 = 24;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Th.C("5\u0003\u00f8[rd3\u0012\u008d\\o\u00e2\u00caN\u00a8\u000fVi\u00ba\u00ffK\u00db\u00f5(\u009a`<Te\u0010\u00e7\\\u0011\u00d5\u00a8;\u00b0\u00d5\u00d6\u00fe\u0099\u0098L\u0016\nA\njr\u00d9\u00af\u00f6\u001eB\u00e9\u000e2\u00bb.\u00efB-\u00c2\u00ac\u00de\u008c\u00ef\u00e5\u0095-\u00f1\u0012;\u00b0\u001e\r\u008c\u00e7\u00dc\u00a3\u00bb<\u0015X\u00ad\u00cf\n\u00b7\u00c9k~P<\u0089\u00d3\u001e\u00ac\u00e4\u008a\u0080o\u00adb\u00d4e9\u00a9\u008f\u00e5\u00e7\u00aa\u0093\u008b~\u0098\u0014\u0081\u009f<c\u00b9\u00e6\u00971\u00a9\u00cd\u00e7\u00e6\u00dd1d\u00fc\u00ab\u00e7\u009f\u0011H<6sd\u0087\u00eb$$");
                var6_6 = var4_5.length();
                var1_7 = 56;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = E6.a(var2_1.doFinal(v6.getBytes(Xb.C(":7+^\u0000\u0017f}\r\u0006")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = E6.a(var2_1.doFinal(v6.getBytes(Xb.C(":7+^\u0000\u0017f}\r\u0006")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        E6.b = var7_3;
                        E6.c = new String[21];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
    }

    public /* synthetic */ E6() {
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List L(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x40D;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Th.C("_=OPJ(GHT,N=/)'AI'0Z"));
                    arrobject[1] = SecretKeyFactory.getInstance(Xb.C("\u0000ed"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Th.C("\u000by\u000biCt\u0016s\u0017~\u001bp\u0016l\u0004pHm\t~\u001a{\u0015*@_a\u001b\u000b"), exception);
            }
            byte[] arrby = new byte[8];
            object = arrby;
            arrby[0] = (byte)(l2 >>> 56);
            int n4 = n3 = 1;
            while (n4 < 8) {
                int n5 = n3++;
                object[n5] = (byte)(l2 << n5 * 8 >>> 56);
                n4 = n3;
            }
            DESKeySpec dESKeySpec = new DESKeySpec((byte[])object);
            object = ((SecretKeyFactory)arrobject[1]).generateSecret(dESKeySpec);
            ((Cipher)arrobject[0]).init(2, (Key)object, (IvParameterSpec)arrobject[2]);
            byte[] arrby2 = b[n2].getBytes(Xb.C(":7+^\u0000\u0017f}\r\u0006"));
            E6.c[n2] = E6.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ String p(Object[] this) {
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

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List B(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ boolean d(Object[] this) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        var3_1 = (Long)this[0];
                        var2_2 = (Set)this[1];
                        var1_3 = this[2];
                        var3_1 = E6.a ^ var3_1;
                        var5_4 = ye.a("G", (long)3716647349322604279L, (long)var3_1);
                        try {
                            v0 = var2_2;
                            if (var5_4 == null) break block19;
                            if (v0 != var1_3) break block20;
                            return true;
                        }
                        catch (NullPointerException v1) {
                            throw (Throwable)ye.a("G", (Object)v1, (long)3541993678289059760L, (long)var3_1);
                            {
                                catch (NullPointerException v2) {
                                    throw (Throwable)ye.a("G", (Object)v2, (long)3541993678289059760L, (long)var3_1);
                                }
                            }
                        }
                    }
                    v0 = var1_3;
                }
                try {
                    v3 = v0 instanceof Set;
                    if (var5_4 == null) return v3;
                    if (v3 == false) return false;
                }
                catch (NullPointerException v4) {
                    throw (Throwable)ye.a("G", (Object)v4, (long)3541993678289059760L, (long)var3_1);
                }
                var1_3 = (Set)var1_3;
                v5 /* !! */  = ye.a("j", (Object)var2_2, (long)3629585811354181377L, (long)var3_1);
                if (var5_4 == null) return (boolean)v5 /* !! */ ;
                if (v5 /* !! */  == ye.a("j", (Object)var1_3, (long)3629585811354181377L, (long)var3_1)) {
                    v6 = var2_2;
                    break block21;
                }
                ** GOTO lbl63
                catch (NullPointerException v7) {
                    throw (Throwable)ye.a("G", (Object)v7, (long)3541993678289059760L, (long)var3_1);
                }
            }
            v5 /* !! */  = ye.a("j", (Object)v6, (Object)var1_3, (long)3564359333845610919L, (long)var3_1);
            if (var5_4 == null) return (boolean)v5 /* !! */ ;
            v8 = var3_1;
            break block22;
            {
                catch (NullPointerException v9) {
                    throw (Throwable)ye.a("G", (Object)v9, (long)3541993678289059760L, (long)var3_1);
                }
            }
        }
        try {
            block23: {
                try {
                    if (v8 < 0L) return (boolean)v5 /* !! */ ;
                    if (v5 /* !! */  == false) break block23;
                    return true;
                    catch (NullPointerException v10) {
                        throw (Throwable)ye.a("G", (Object)v10, (long)3541993678289059760L, (long)var3_1);
                    }
                }
                catch (NullPointerException v11) {
                    throw (Throwable)ye.a("G", (Object)v11, (long)3541993678289059760L, (long)var3_1);
                }
            }
            v5 /* !! */  = (CallSite)false;
        }
        catch (NullPointerException v12) {
            return false;
        }
        catch (ClassCastException v13) {
            return false;
        }
        return (boolean)v5 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ byte[] f(Object[] this) {
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
     * Exception decompiling
     */
    private static /* synthetic */ CallSite a(MethodHandles.Lookup this, String this, MethodType this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Expecting a ConstantPoolEntryLiteral or ConstantPoolEntryDynamicInfo
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackType(OperationFactoryLDC.java:37)
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDCW.getStackDelta(OperationFactoryLDCW.java:17)
         * org.benf.cfr.reader.bytecode.opcode.JVMInstr.getStackDelta(JVMInstr.java:315)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:195)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1542)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:400)
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = E6.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ Object K(Object[] this_) {
        Object object;
        Object object2;
        block4: {
            long l2 = (Long)this_[0];
            object2 = this_[1];
            Object object3 = this_[2];
            l2 = a ^ l2;
            CallSite callSite = ye.a("G", (long)4590658173865317078L, (long)l2);
            try {
                object = object2;
                if (callSite == null) return object;
                if (object != null) break block4;
                throw new NullPointerException((String)((Object)ye.a("G", (Object)object3, (long)4398124847739618146L, (long)l2)));
            }
            catch (ClassCastException classCastException) {
                try {
                    throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)4397435320457507729L, (long)l2));
                }
                catch (ClassCastException classCastException2) {
                    throw (Throwable)((Object)ye.a("G", (Object)classCastException2, (long)4397435320457507729L, (long)l2));
                }
            }
        }
        object = object2;
        return object;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ boolean e(Object[] this) {
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

    private static /* synthetic */ String a(byte[] this_) {
        int n2;
        int n3 = 0;
        int n4 = this_.length;
        char[] arrc = new char[n4];
        int n5 = n2 = 0;
        while (n5 < n4) {
            char c2;
            int n6 = 0xFF & this_[n2];
            if (n6 < 192) {
                arrc[n3++] = (char)n6;
            } else if (n6 < 224) {
                c2 = (char)((char)(n6 & 0x1F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            } else if (n2 < n4 - 2) {
                c2 = (char)((char)(n6 & 0xF) << 12);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F) << 6);
                n6 = this_[++n2];
                c2 = (char)(c2 | (char)(n6 & 0x3F));
                arrc[n3++] = c2;
            }
            n5 = ++n2;
        }
        return new String(arrc, 0, n3);
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ List H(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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
    public static /* synthetic */ List d(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public /* synthetic */ E6(long l22, int n2, Field field) {
        long l22 = (l22 << 32 | (long)n2 << 32 >>> 32) ^ a;
        long l3 = l22 ^ 0x70A5A3B09D2DL;
        Object[] arrobject = new Object[2];
        arrobject[1] = l3;
        arrobject[0] = field;
        Object cfr_ignored_0 = ye.a("G", (Object)arrobject, (long)446039561422506340L, (long)l22);
    }

    public static /* synthetic */ Object E(Object[] this_) {
        long l2 = (Long)this_[0];
        Object object = this_[1];
        l2 = a ^ l2;
        try {
            if (object == null) {
                throw new NullPointerException();
            }
        }
        catch (ClassCastException classCastException) {
            throw (Throwable)((Object)ye.a("G", (Object)classCastException, (long)8168058982510067661L, (long)l2));
        }
        return object;
    }
}

