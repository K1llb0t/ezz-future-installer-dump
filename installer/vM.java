/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.J;
import net.futureclient.installer.N8;
import net.futureclient.installer.XA;
import net.futureclient.installer.XU;
import net.futureclient.installer.Xb;
import net.futureclient.installer.e;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public class vM
implements Closeable {
    private /* synthetic */ int p;
    private /* synthetic */ String[] W;
    public /* synthetic */ boolean n;
    private /* synthetic */ int j;
    private /* synthetic */ int Y;
    private /* synthetic */ int s;
    private static /* synthetic */ int[] b;
    private static final /* synthetic */ long c;
    private /* synthetic */ int[] h;
    private static final /* synthetic */ char[] A;
    private static final /* synthetic */ String[] f;
    private /* synthetic */ String M;
    private /* synthetic */ int i;
    private /* synthetic */ int[] S;
    private /* synthetic */ long R;
    private static final /* synthetic */ String[] d;
    public /* synthetic */ int G;
    private /* synthetic */ int L;
    private final /* synthetic */ Reader w;
    private static final /* synthetic */ Map g;
    private final /* synthetic */ char[] H;

    /*
     * Exception decompiling
     */
    private /* synthetic */ int E(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 35[CATCHBLOCK]
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

    public /* synthetic */ String toString() {
        long l2 = c ^ 0x69114B834FF7L;
        long l3 = l2 ^ 0x21BECAB54CC1L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)((String)((Object)ye.a("j", this.getClass(), (long)-4463147547498497121L, (long)l2))), (long)-4571718398888148934L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-4354576131928018998L, (long)l2))), (long)-4571718398888148934L, (long)l2))), (long)-4367671408696678443L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ double R(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 31[CATCHBLOCK]
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
    public /* synthetic */ boolean K(Object[] this) {
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

    /*
     * Exception decompiling
     */
    private /* synthetic */ char N(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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
    private /* synthetic */ void c(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[CATCHBLOCK]
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
    public final /* synthetic */ int s(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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

    public /* synthetic */ void x(Object[] object) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block6: {
            CallSite callSite2;
            block7: {
                l4 = (Long)object[0];
                l3 = l4 ^ 0x4D25585DC044L;
                l2 = l4 ^ 0x6FB056C919D4L;
                long l5 = l4 ^ 0x118A454935C6L;
                object = ye.a("G", (long)5664817661845119998L, (long)l4);
                callSite = callSite2 = ye.a("\u00c3", (Object)this, (long)5759943873520819160L, (long)l4);
                try {
                    if (object == null) break block6;
                    if (callSite == false) {
                    }
                    break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)5669600980566735796L, (long)l4));
                }
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)5670355574440840577L, (long)l4);
            }
            callSite = callSite2;
        }
        try {
            if (callSite == 4) {
                vM vM2 = this;
                ye.a("F", (Object)vM2, (int)(ye.a("\u00c3", (Object)vM2, (long)5501211649727951314L, (long)l4) - true), (long)5501211649727951314L, (long)l4);
                CallSite callSite2 = ye.a("\u00c3", (Object)this, (long)5665724576126520714L, (long)l4);
                reference v52 = ye.a("\u00c3", (Object)this, (long)5501211649727951314L, (long)l4) - true;
                callSite2[v52] = callSite2[v52] + true;
                ye.a("F", (Object)this, (int)0, (long)5759943873520819160L, (long)l4);
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)5669600980566735796L, (long)l4));
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)10075, (long)(0x2FAD5D99004B259AL ^ l4)))), (Object)((Object)((e)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)5491002500254721952L, (long)l4)))), (long)5727567772264688434L, (long)l4))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)5698210832524092239L, (long)l4))), (long)5478790355993169087L, (long)l4))), (long)5757717318392720208L, (long)l4)));
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ long C(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 6[TRYBLOCK]
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

    public final /* synthetic */ String T(Object[] arrobject22) {
        long l2 = (Long)arrobject22[0];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x511C09FF48E9L;
        int arrobject22 = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 56);
        int n3 = (int)(l3 << 40 >>> 40);
        reference var6_6 = ye.a("\u00c3", (Object)this, (long)29676162155138825L, (long)l2) + true;
        reference var7_7 = ye.a("\u00c3", (Object)this, (long)213477217276316797L, (long)l2) - ye.a("\u00c3", (Object)this, (long)22405915568663687L, (long)l2) + true;
        Object[] arrobject = new Object[3];
        arrobject[2] = n3;
        arrobject[1] = (int)((byte)n2);
        arrobject[0] = arrobject22;
        return (String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)14286, (long)(0x5C47564DADE27BBDL ^ l2)))), (int)var6_6, (long)183986715625432444L, (long)l2))), (Object)((String)((Object)vM.a("m", (int)420, (long)(0x73121AF4D5A4CDC9L ^ l2)))), (long)196942265515000332L, (long)l2))), (int)var7_7, (long)183986715625432444L, (long)l2))), (Object)((String)((Object)vM.a("m", (int)22946, (long)(0x456E80CF006F15D5L ^ l2)))), (long)196942265515000332L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)115654444208418457L, (long)l2))), (long)196942265515000332L, (long)l2))), (long)95906388889232867L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ e H(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public /* synthetic */ void p(Object[] object) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block6: {
            CallSite callSite2;
            block7: {
                l4 = (Long)object[0];
                l3 = l4 ^ 0x66D205029AEAL;
                l2 = l4 ^ 0x44470B96437AL;
                long l5 = l4 ^ 0x3A7D18166F68L;
                object = ye.a("G", (long)1455597613473364304L, (long)l4);
                callSite = callSite2 = ye.a("\u00c3", (Object)this, (long)1531581868061360502L, (long)l4);
                try {
                    if (object == null) break block6;
                    if (callSite == false) {
                    }
                    break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)1441244217417244954L, (long)l4));
                }
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)1449892643762640687L, (long)l4);
            }
            callSite = callSite2;
        }
        try {
            if (callSite == 2) {
                vM vM2 = this;
                ye.a("F", (Object)vM2, (int)(ye.a("\u00c3", (Object)vM2, (long)1654528802725374844L, (long)l4) - true), (long)1654528802725374844L, (long)l4);
                ((String[])ye.a("\u00c3", (Object)this, (long)1604430083356036358L, (long)l4))[ye.a("\u00c3", (Object)this, (long)1654528802725374844L, (long)l4)] = null;
                CallSite callSite2 = ye.a("\u00c3", (Object)this, (long)1445261359396132644L, (long)l4);
                reference v52 = ye.a("\u00c3", (Object)this, (long)1654528802725374844L, (long)l4) - true;
                callSite2[v52] = callSite2[v52] + true;
                ye.a("F", (Object)this, (int)0, (long)1531581868061360502L, (long)l4);
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)1441244217417244954L, (long)l4));
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)24744, (long)(0xED00CCD73F1B8C3L ^ l4)))), (Object)((Object)((e)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)1629703114769153294L, (long)l4)))), (long)1572393426766311836L, (long)l4))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)1565624811462261217L, (long)l4))), (long)1632195575247033873L, (long)l4))), (long)1533949091975197182L, (long)l4)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public /* synthetic */ String Q(Object[] this) {
        block29: {
            block27: {
                block28: {
                    block25: {
                        block26: {
                            block23: {
                                block24: {
                                    block21: {
                                        block22: {
                                            block19: {
                                                block20: {
                                                    block17: {
                                                        block18: {
                                                            var2_3 = (Long)this /* !! */ [0];
                                                            var4_4 = var2_3 ^ 62600800308309L;
                                                            var6_5 = var2_3 ^ 58425825484256L;
                                                            var8_6 = var2_3 ^ 29113115203013L;
                                                            var10_7 = var2_3 ^ 110228177942999L;
                                                            var12_8 = var2_3 ^ 46192289666419L;
                                                            this = ye.a("G", (long)-9039836692541214737L, (long)var2_3);
                                                            v0 = var14_9 = ye.a("\u00c3", (Object)this, (long)-8935674214077196343L, (long)var2_3);
                                                            try {
                                                                if (this == null) break block17;
                                                                if (v0 != false) break block18;
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                throw (RuntimeException)ye.a("G", (Object)v1, (long)-9025479977012283483L, (long)var2_3);
                                                            }
                                                            v2 = new Object[1];
                                                            v2[0] = var10_7;
                                                            var14_9 = ye.a("j", (Object)this, (Object)v2, (long)-9034128974051475056L, (long)var2_3);
                                                        }
                                                        v0 = var14_9;
                                                    }
                                                    try {
                                                        v3 = 10;
                                                        v4 = this;
                                                        if (var2_3 >= 0L) {
                                                            if (v4 == null) break block19;
                                                            if (v0 != v3) break block20;
                                                        }
                                                        ** GOTO lbl60
                                                    }
                                                    catch (IllegalStateException v5) {
                                                        throw (RuntimeException)ye.a("G", (Object)v5, (long)-9025479977012283483L, (long)var2_3);
                                                    }
                                                    v6 = new Object[1];
                                                    v6[0] = var12_8;
                                                    var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v6, (long)-9158125471405714819L, (long)var2_3);
                                                    v7 = this;
                                                    break block29;
                                                }
                                                v0 = var14_9;
                                                v3 = 8;
                                            }
                                            try {
                                                v4 = this;
lbl60:
                                                // 2 sources

                                                if (var2_3 > 0L) {
                                                    if (v4 == null) break block21;
                                                    if (v0 != v3) break block22;
                                                }
                                                ** GOTO lbl88
                                            }
                                            catch (IllegalStateException v8) {
                                                throw (RuntimeException)ye.a("G", (Object)v8, (long)-9025479977012283483L, (long)var2_3);
                                            }
                                            v9 = new Object[2];
                                            v9[1] = 39;
                                            v9[0] = var6_5;
                                            var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v9, (long)-9010368592474532630L, (long)var2_3);
                                            v7 = this;
                                            break block29;
                                        }
                                        v0 = var14_9;
                                        v3 = 9;
                                    }
                                    try {
                                        v4 = this;
lbl88:
                                        // 2 sources

                                        if (var2_3 > 0L) {
                                            if (v4 == null) break block23;
                                            if (v0 != v3) break block24;
                                        }
                                        ** GOTO lbl116
                                    }
                                    catch (IllegalStateException v10) {
                                        throw (RuntimeException)ye.a("G", (Object)v10, (long)-9025479977012283483L, (long)var2_3);
                                    }
                                    v11 = new Object[2];
                                    v11[1] = 34;
                                    v11[0] = var6_5;
                                    var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v11, (long)-9010368592474532630L, (long)var2_3);
                                    v7 = this;
                                    break block29;
                                }
                                v0 = var14_9;
                                v3 = 11;
                            }
                            try {
                                v4 = this;
lbl116:
                                // 2 sources

                                if (var2_3 > 0L) {
                                    if (v4 == null) break block25;
                                    if (v0 != v3) break block26;
                                }
                                ** GOTO lbl135
                            }
                            catch (IllegalStateException v12) {
                                throw (RuntimeException)ye.a("G", (Object)v12, (long)-9025479977012283483L, (long)var2_3);
                            }
                            var14_10 = (String)ye.a("\u00c3", (Object)this, (long)-8982992031274600526L, (long)var2_3);
                            ye.a("F", (Object)this, null, (long)-8982992031274600526L, (long)var2_3);
                            v7 = this;
                            break block29;
                        }
                        v0 = var14_9;
                        v3 = 15;
                    }
                    try {
                        v4 = this;
lbl135:
                        // 2 sources

                        if (v4 == null) break block27;
                        if (v0 != v3) break block28;
                    }
                    catch (IllegalStateException v13) {
                        throw (RuntimeException)ye.a("G", (Object)v13, (long)-9025479977012283483L, (long)var2_3);
                    }
                    var14_10 = (String)ye.a("G", (long)ye.a("\u00c3", (Object)this, (long)-9041800456658831504L, (long)var2_3), (long)-9022390033939858470L, (long)var2_3);
                    v7 = this;
                    break block29;
                }
                v0 = var14_9;
                v3 = 16;
            }
            if (v0 != v3) {
                v14 = new Object[1];
                v14[0] = var8_6;
                v15 = new Object[1];
                v15[0] = var4_4;
                throw new IllegalStateException((String)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)new StringBuilder((String)vM.a("m", (int)1863, (long)(2763484696694868355L ^ var2_3))), (Object)((e)ye.a("j", (Object)this, (Object)v14, (long)-9213660719413974095L, (long)var2_3)), (long)-8976486318227511517L, (long)var2_3)), (Object)((String)ye.a("j", (Object)this, (Object)v15, (long)-9005676130660028578L, (long)var2_3)), (long)-9216081144147754834L, (long)var2_3)), (long)-8937691775829317823L, (long)var2_3));
            }
            var14_10 = new String((char[])ye.a("\u00c3", (Object)this, (long)-9155628028577877847L, (long)var2_3), (int)ye.a("\u00c3", (Object)this, (long)-9199685736011837729L, (long)var2_3), (int)ye.a("\u00c3", (Object)this, (long)-8941233905153114050L, (long)var2_3));
            v16 = this;
            ye.a("F", (Object)v16, (int)(ye.a("\u00c3", (Object)v16, (long)-9199685736011837729L, (long)var2_3) + ye.a("\u00c3", (Object)this, (long)-8941233905153114050L, (long)var2_3)), (long)-9199685736011837729L, (long)var2_3);
            v7 = this;
        }
        ye.a("F", (Object)v7, (int)0, (long)-8935674214077196343L, (long)var2_3);
        v17 = ye.a("\u00c3", (Object)this, (long)-9029216210967723621L, (long)var2_3);
        v18 = ye.a("\u00c3", (Object)this, (long)-9202737418612195901L, (long)var2_3) - true;
        v17[v18] = v17[v18] + true;
        return var14_10;
    }

    private /* synthetic */ void E(Object[] arrobject2) {
        vM vM2;
        long l2;
        block3: {
            block4: {
                int arrobject2 = (Integer)arrobject2[0];
                l2 = (Long)arrobject2[1];
                l2 = c ^ l2;
                Object object = ye.a("G", (long)-2642368732481669577L, (long)l2);
                try {
                    vM2 = this;
                    if (object == null) break block3;
                    if (ye.a("\u00c3", (Object)vM2, (long)-2769387370142637029L, (long)l2) == ((CallSite)ye.a("\u00c3", (Object)this, (long)-2719716872741703095L, (long)l2)).length) {
                    }
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-2637022470760731011L, (long)l2));
                }
                object = new int[ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2) << 1];
                int[] arrn = new int[ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2) << 1];
                String[] arrstring = new String[ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2) << 1];
                ye.a("G", (Object)ye.a("\u00c3", (Object)this, (long)-2719716872741703095L, (long)l2), (int)0, (Object)object, (int)0, (int)ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2), (long)-2663377127961416722L, (long)l2);
                ye.a("G", (Object)ye.a("\u00c3", (Object)this, (long)-2636399641434826685L, (long)l2), (int)0, (Object)arrn, (int)0, (int)ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2), (long)-2663377127961416722L, (long)l2);
                ye.a("G", (Object)((String[])ye.a("\u00c3", (Object)this, (long)-2800344674407300511L, (long)l2)), (int)0, (Object)arrstring, (int)0, (int)ye.a("\u00c3", (Object)this, (long)-2769387370142637029L, (long)l2), (long)-2663377127961416722L, (long)l2);
                ye.a("F", (Object)this, (int[])object, (long)-2719716872741703095L, (long)l2);
                ye.a("F", (Object)this, (int[])arrn, (long)-2636399641434826685L, (long)l2);
                ye.a("F", (Object)this, (String[])arrstring, (long)-2800344674407300511L, (long)l2);
            }
            vM2 = this;
        }
        CallSite callSite = ye.a("\u00c3", (Object)vM2, (long)-2719716872741703095L, (long)l2);
        vM vM3 = this;
        CallSite callSite2 = ye.a("\u00c3", (Object)vM3, (long)-2769387370142637029L, (long)l2);
        ye.a("F", (Object)vM3, (int)(callSite2 + true), (long)-2769387370142637029L, (long)l2);
        callSite[callSite2] = (CallSite)arrobject2;
    }

    public static /* synthetic */ int[] A() {
        return b;
    }

    public static /* synthetic */ void L(int[] this_) {
        b = this_;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ int W(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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
    private /* synthetic */ int Y(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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
    private /* synthetic */ boolean e(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 16[CATCHBLOCK]
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
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x4F54;
        if (f[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])g.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u00144x\nN,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(J.C("\u001aX!"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    g.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(9y\u001c\b4F"), exception);
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
            byte[] arrby2 = d[n2].getBytes(J.C("G2\u001d\u00102]\u0004g0C"));
            vM.f[n2] = vM.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return f[n2];
    }

    private /* synthetic */ void d(Object[] object) {
        block6: {
            vM vM2;
            long l2;
            long l3;
            block5: {
                l3 = (Long)object[0];
                l3 = c ^ l3;
                l2 = l3 ^ 0x310BDED7D302L;
                object = ye.a("G", (long)-8380005884840646953L, (long)l3);
                try {
                    vM2 = this;
                    if (object == null) break block5;
                    if (ye.a("\u00c3", (Object)vM2, (long)-8465632090979629696L, (long)l3) != false) break block6;
                    vM2 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    try {
                        throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-8392672688578871651L, (long)l3));
                    }
                    catch (IllegalStateException illegalStateException2) {
                        throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException2, (long)-8392672688578871651L, (long)l3));
                    }
                }
            }
            Object[] arrobject = new Object[2];
            arrobject[1] = (String)((Object)vM.a("m", (int)28927, (long)(0xD2725C998A6B726L ^ l3)));
            arrobject[0] = l2;
            throw (IOException)((Object)ye.a("\u00aa", (Object)vM2, (Object)arrobject, (long)-8390536270796211838L, (long)l3));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public /* synthetic */ String S(Object[] this) {
        block14: {
            block12: {
                block13: {
                    block10: {
                        block11: {
                            block8: {
                                block9: {
                                    var2_3 = (Long)this /* !! */ [0];
                                    var4_4 = var2_3 ^ 61136580741675L;
                                    var6_5 = var2_3 ^ 64142262688670L;
                                    var8_6 = var2_3 ^ 23156160549819L;
                                    var10_7 = var2_3 ^ 117877075705769L;
                                    var12_8 = var2_3 ^ 41196812423949L;
                                    this = ye.a("G", (long)356350727562684817L, (long)var2_3);
                                    v0 = var14_9 = ye.a("\u00c3", (Object)this, (long)396339652322464183L, (long)var2_3);
                                    try {
                                        if (this == null) break block8;
                                        if (v0 != false) break block9;
                                    }
                                    catch (IllegalStateException v1) {
                                        throw (RuntimeException)ye.a("G", (Object)v1, (long)342558013146706395L, (long)var2_3);
                                    }
                                    v2 = new Object[1];
                                    v2[0] = var10_7;
                                    var14_9 = ye.a("j", (Object)this, (Object)v2, (long)350819959678666734L, (long)var2_3);
                                }
                                v0 = var14_9;
                            }
                            try {
                                v3 = 14;
                                v4 = this;
                                if (var2_3 > 0L) {
                                    if (v4 == null) break block10;
                                    if (v0 != v3) break block11;
                                }
                                ** GOTO lbl60
                            }
                            catch (IllegalStateException v5) {
                                throw (RuntimeException)ye.a("G", (Object)v5, (long)342558013146706395L, (long)var2_3);
                            }
                            v6 = new Object[1];
                            v6[0] = var12_8;
                            var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v6, (long)475624621689623555L, (long)var2_3);
                            v7 = this;
                            break block14;
                        }
                        v0 = var14_9;
                        v3 = 12;
                    }
                    try {
                        v4 = this;
lbl60:
                        // 2 sources

                        if (v4 == null) break block12;
                        if (v0 != v3) break block13;
                    }
                    catch (IllegalStateException v8) {
                        throw (RuntimeException)ye.a("G", (Object)v8, (long)342558013146706395L, (long)var2_3);
                    }
                    v9 = new Object[2];
                    v9[1] = 39;
                    v9[0] = var6_5;
                    var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v9, (long)327270684321550996L, (long)var2_3);
                    v7 = this;
                    break block14;
                }
                v0 = var14_9;
                v3 = 13;
            }
            if (v0 != v3) {
                v10 = new Object[1];
                v10[0] = var8_6;
                v11 = new Object[1];
                v11[0] = var4_4;
                throw new IllegalStateException((String)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)((StringBuilder)ye.a("j", (Object)new StringBuilder((String)vM.a("m", (int)13469, (long)(351920764051422261L ^ var2_3))), (Object)((e)ye.a("j", (Object)this, (Object)v10, (long)458398566604778959L, (long)var2_3)), (long)365656017293255005L, (long)var2_3)), (Object)((String)ye.a("j", (Object)this, (Object)v11, (long)395021752688830752L, (long)var2_3)), (long)461593063819527888L, (long)var2_3)), (long)398849879186202943L, (long)var2_3));
            }
            v12 = new Object[2];
            v12[1] = 34;
            v12[0] = var6_5;
            var14_10 = (String)ye.a("\u00aa", (Object)this, (Object)v12, (long)327270684321550996L, (long)var2_3);
            v7 = this;
        }
        ye.a("F", (Object)v7, (int)0, (long)396339652322464183L, (long)var2_3);
        ((String[])ye.a("\u00c3", (Object)this, (long)469858570885406151L, (long)var2_3))[ye.a("\u00c3", (Object)this, (long)447897496525880253L, (long)var2_3) - true] = var14_10;
        return var14_10;
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    @Override
    public /* synthetic */ void close() {
        long l2 = c ^ 0x54D8EBB11324L;
        ye.a("F", (Object)this, (int)0, (long)-6937444218524693618L, (long)l2);
        ye.a("\u00c3", (Object)this, (long)-6926856465676929066L, (long)l2)[0] = (CallSite)8;
        ye.a("F", (Object)this, (int)1, (long)-7201700507317132924L, (long)l2);
        ye.a("j", (Object)((Reader)((Object)ye.a("\u00c3", (Object)this, (long)-6963827980878447983L, (long)l2))), (long)-6939821178907001591L, (long)l2);
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = vM.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ String y(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 8[SWITCH]
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
    private /* synthetic */ String I(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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

    public /* synthetic */ void m(Object[] object) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block6: {
            CallSite callSite2;
            block7: {
                l5 = (Long)object[0];
                l4 = l5 ^ 0x51361F6528AAL;
                l3 = l5 ^ 0x7C0C3495F3D0L;
                l2 = l5 ^ 0x73A311F1F13AL;
                long l6 = l5 ^ 0xD990271DD28L;
                object = ye.a("G", (long)-6452702012414113008L, (long)l5);
                callSite = callSite2 = ye.a("\u00c3", (Object)this, (long)-6412718516484590794L, (long)l5);
                try {
                    if (object == null) break block6;
                    if (callSite == false) {
                    }
                    break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-6467058981270842534L, (long)l5));
                }
                Object[] arrobject = new Object[1];
                arrobject[0] = l6;
                callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)-6458379253748914833L, (long)l5);
            }
            callSite = callSite2;
        }
        try {
            if (callSite == 3) {
                Object[] arrobject = new Object[2];
                arrobject[1] = l3;
                arrobject[0] = 1;
                ye.a("\u00aa", (Object)this, (Object)arrobject, (long)-6629285155274373926L, (long)l5);
                ye.a("\u00c3", (Object)this, (long)-6463036651047213724L, (long)l5)[ye.a("\u00c3", (Object)this, (long)-6578027556442826436L, (long)l5) - true] = (CallSite)false;
                ye.a("F", (Object)this, (int)0, (long)-6412718516484590794L, (long)l5);
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-6467058981270842534L, (long)l5));
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l4;
        throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)16711, (long)(0x733849DF01312B79L ^ l5)))), (Object)((Object)((e)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-6566835682750361778L, (long)l5)))), (long)-6371902319143484452L, (long)l5))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-6342756452887082079L, (long)l5))), (long)-6564402321622047663L, (long)l5))), (long)-6410423860607237186L, (long)l5)));
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ void i(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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

    private /* synthetic */ IOException B(Object[] object) {
        long l2 = (Long)object[0];
        object = (String)object[1];
        l2 = c ^ l2;
        long l3 = l2 ^ 0x4A9EC9905898L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        throw new XU((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder(), (Object)object, (long)-3110697106050739101L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-2898036448480707693L, (long)l2))), (long)-3110697106050739101L, (long)l2))), (long)-2937610439147375732L, (long)l2)));
    }

    public /* synthetic */ void N(Object[] object) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block6: {
            CallSite callSite2;
            block7: {
                l5 = (Long)object[0];
                l4 = l5 ^ 0x54F6A84DD7C6L;
                l3 = l5 ^ 0x79CC83BD0CBCL;
                l2 = l5 ^ 0x7663A6D90E56L;
                long l6 = l5 ^ 0x859B5592244L;
                object = ye.a("G", (long)6421957651759051900L, (long)l5);
                callSite = callSite2 = ye.a("\u00c3", (Object)this, (long)6371880699476397146L, (long)l5);
                try {
                    if (object == null) break block6;
                    if (callSite == false) {
                    }
                    break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)6425618376088022070L, (long)l5));
                }
                Object[] arrobject = new Object[1];
                arrobject[0] = l6;
                callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)6427550954398407171L, (long)l5);
            }
            callSite = callSite2;
        }
        try {
            if (callSite == true) {
                Object[] arrobject = new Object[2];
                arrobject[1] = l3;
                arrobject[0] = 3;
                ye.a("\u00aa", (Object)this, (Object)arrobject, (long)6587650829861338038L, (long)l5);
                ye.a("F", (Object)this, (int)0, (long)6371880699476397146L, (long)l5);
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)6425618376088022070L, (long)l5));
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l4;
        throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)31614, (long)(0x6C53C10677916E24L ^ l5)))), (Object)((Object)((e)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)6607322152098525218L, (long)l5)))), (long)6412687546704198832L, (long)l5))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)6383295415612191949L, (long)l5))), (long)6596237569361386301L, (long)l5))), (long)6369669556838448338L, (long)l5)));
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ boolean q(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[TRYBLOCK]
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
    public /* synthetic */ boolean W(Object[] this) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public /* synthetic */ vM(long l22, Reader reader) {
        block4: {
            long l22 = c ^ l22;
            vM vM2 = this;
            vM2.n = false;
            vM2.H = new char[1024];
            CallSite callSite = ye.a("G", (long)-2460521742216023879L, (long)l22);
            try {
                vM vM3 = this;
                vM vM4 = this;
                vM vM5 = this;
                this.L = 0;
                vM5.Y = 0;
                vM5.s = 0;
                vM4.i = 0;
                vM4.G = 0;
                vM3.S = new int[32];
                vM3.j = 0;
                int n2 = this.j;
                this.j = n2 + 1;
                this.S[n2] = 6;
                this.W = new String[32];
                this.h = new int[32];
                if (callSite == null) return;
                if (reader != null) break block4;
                throw new NullPointerException((String)((Object)vM.a("m", (int)19807, (long)(0x31E43D7A32C6DCD4L ^ l22))));
            }
            catch (IllegalStateException illegalStateException) {
                try {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-2456298904848209677L, (long)l22));
                }
                catch (IllegalStateException illegalStateException2) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException2, (long)-2456298904848209677L, (long)l22));
                }
            }
        }
        this.w = reader;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void J(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 9[CATCHBLOCK]
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
    private /* synthetic */ String q(Object[] this) {
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
     * Exception decompiling
     */
    private /* synthetic */ boolean d(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:381)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:61)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:475)
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

    public /* synthetic */ void l(Object[] object) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block6: {
            CallSite callSite2;
            block7: {
                l4 = (Long)object[0];
                l3 = l4 ^ 0x748B27C53B9DL;
                l2 = l4 ^ 0x561E2951E20DL;
                long l5 = l4 ^ 0x28243AD1CE1FL;
                object = ye.a("G", (long)-5385108850850670553L, (long)l4);
                callSite = callSite2 = ye.a("\u00c3", (Object)this, (long)-5461081011616112639L, (long)l4);
                try {
                    if (object == null) break block6;
                    if (callSite == false) {
                    }
                    break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-5370751858262802323L, (long)l4));
                }
                Object[] arrobject = new Object[1];
                arrobject[0] = l5;
                callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)-5375011020904647080L, (long)l4);
            }
            callSite = callSite2;
        }
        try {
            if (callSite == 7) {
                ye.a("F", (Object)this, (int)0, (long)-5461081011616112639L, (long)l4);
                CallSite callSite2 = ye.a("\u00c3", (Object)this, (long)-5370107330822130093L, (long)l4);
                reference v42 = ye.a("\u00c3", (Object)this, (long)-5223890282199741941L, (long)l4) - true;
                callSite2[v42] = callSite2[v42] + true;
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw (RuntimeException)((Object)ye.a("G", (Object)illegalStateException, (long)-5370751858262802323L, (long)l4));
        }
        Object[] arrobject = new Object[1];
        arrobject[0] = l2;
        Object[] arrobject2 = new Object[1];
        arrobject2[0] = l3;
        throw new IllegalStateException((String)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)new StringBuilder((String)((Object)vM.a("m", (int)26514, (long)(0x3F3E387FFF0B1E96L ^ l4)))), (Object)((Object)((e)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-5194114919579116423L, (long)l4)))), (long)-5429844558461071125L, (long)l4))), (Object)((String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-5418633950031947626L, (long)l4))), (long)-5201187650927069338L, (long)l4))), (long)-5458718117046693751L, (long)l4)));
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void Q(Object[] this) {
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
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        vM.c = wu.a(-2666585695847105556L, 4261987002740650688L, MethodHandles.lookup().lookupClass()).a(61448215052931L);
        var7 = vM.c ^ 96371397029650L;
        vM.g = new HashMap<K, V>(13);
        ye.a("G", (Object)new int[2], (long)7193315545761801429L, (long)var7);
        var0_1 = Cipher.getInstance(J.C("N bq\u0003m\\_@4V)'-t\u001el\u000e,J"));
        v0 = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
        v1 = new byte[8];
        v2 = v1;
        v1[0] = (byte)(var7 >>> 56);
        v3 = var1_2 = 1;
        while (v3 < 8) {
            v2 = v2;
            v4 = var1_2++;
            v2[v4] = (byte)(var7 << v4 * 8 >>> 56);
            v3 = var1_2;
        }
        var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
        var6_3 = new String[44];
        var4_4 = 0;
        var3_5 = J.C("\u00c0<\u0084\b\u001d6\u00c0\u0090P\u00fa\u00b8\u00a5W\u00c4\u00b5\u0002N\u00ca\u008aR\u00e5\u001d\u00bchp\u009a\u0085\u0099'z\u00d3D{\u00ab\u00b1\u00fa\u00f7\u00e1[k\u00ac\u00ed\u009ai\u00fb\u0088U\u0095\u00a5\u00a5)\u00d6\u00a7\u00c2\u00ad\u00c5 \u0011\u00fd8\u00fe\u00b6FH9\u00ce\u00f2\u0099\u00d3\"\"Fa\tI\u00cfz:\u00beoW\u0002\u0099\u0010$cn\u0095\u00d18n\u00de\u0000\u00fc+\u00d5\u008a\u00dc\u00a62\u00af`\u00ad\u00b6q\t\u00f4\u00b4\u0083\u00b0\u00f9+\u00b0X\u00e9(\u0083!3\r\u00b5P\u00a6\u00e7#L\u007f\u0092\u00c2\u000e\u00e3ny\u00b9\u009c\u0015e\u00f3\u0013\u00b6\u0015M\u001fN\u00c6\u00aee\u00f8\u00c4\u00f2\u00e0\u0092\u0093.\u0013\u00f5\u00f1\u00fe \u0015\u00ce\u0094\u0001\u0011M<`\u00a9+ZH\u0015NW\u00cb\u00f1\u0088\u0099\u00d8\u0083\u008d\u00f3\u00cb8\u00c1\u0015\u009e\u00ceA\u00dd\u0018D\u008cS\u00c6dA\u00a9|\u00a9\u00d80\u00c1n\u00ad\u0014\rk\u00b2.9\u00a0\u00b20\u0001\u00ba\u009d\u00de\u00dd\u00e4\u00ae\u00b3\u008c4\u00ee\u0017\u00e8\u00ef\u009f1U\u0083N\u00ff1\u0089w\u00f1\u00fe\u00e1`\u00bc\u00cc\u00f2\u00c7\u001c:\u00da%\u00dd\u00d3l\"\u0085\u0083y\u00eb\u00af\u00e0\r\u0005\u009f\u007f%2\u00cat\u0096Q\u00ean\u00d6\u00a4.\u0082\u0097<W\u008fs\u0007\u00c0Q)F\u00f9]*\u00a4\u001e\u00b2N\u0091\u0093*\u00ee\u00d3`\u00bb\u00b9\u0091\u00b9\u00be\u00bd\u00c0\u00dc\u00dd\u00b6d\u00cd\u008dC.\u0001S+\u0019\u000f\u00fbYQP\u00ad\u00b7\u009f\u00b4\u001b\u00fd\u00ee\u00ed9\u0001\u0010\u0090E\u00f7\u00c0F\u00c4\u00a7\u00a8\u00bdR\u001duJ\u000e,\u00bc'=\u007f6\u0081.\u0014\u00eer\u00bc\u00bd\u00e5\u00f5\r?)Ik\tJ\u001a\u00d9\u0082\u00df\u008e\bA[\f\u000b\u008c\u0013n/\u00d8Y\u0098&\u00ac\u00fb\u00db\u00f1j\u00f3\u00f3\u00cf\u0098\u0016\u00a7\u0083D\u00ce\u00fay\u00e5w\u00fe\u0082\u0018ci\u00d3\u00d6e\u00f1\u00ad\u000b\u00ff\u00ec\u00e5|\u00b06SB\u0085\u00a5\u0091\u00d4\u00c1\u00f8\u00c5\u00ba\u0098tB\u00fc\u0084\u00bf\u00af\u009d\u00b82\u00a5yK9\u00e0\u00e2\u0012t\u00f9\u00c1\u001c|%l\u0082\u00e5\u00dc\u009d\u00e0\u00a5\u0001\u00ab\u0000\u0083\u00a6#=\u00810\u009d^\u00a9\u0005\u00c3vp\b\u00e5Ys\u0019\u001d\u00fch\u0097\u00b0\u001aB\u008fi-\u00be5W;\u0011\u00e4\u00b7\u00df\u00c5\u008e`y\u00b9\u00b5\u00fe\u00e9\u00b95_\u00ef8m\u000b\u0005\u00ed0\u0019R\u00dc\u00b4\u00ab\u00f0'\u007f\u00d7\u008c\u009e\u00d8&4\u00b8\u00e7\u00eb\u00dc\u00cfV\u00e7H\u000bf\u0085^\u0096\u00e6,\u0011\u00fe]Ww+/\u00e4-\u00aeAi\u00a3p\u0007J\u00f3-\u00e8\u00df\u0089\u0003\u00d7Df\u0085\u0090\u0081=c\u00d1\u00f3\u00e4\u0015S\u001d\u0092\u0010y\u0097Z-l\u00ccg&\u00cd\u00b2\u0000\u0002\u0002\u009awZ\u00a4%vQH\u00e2G\u009a\u00e0\u00c7\u0019[\u0088YS^}}}0n:\u00ca\u008d\u00a5\u0007C\u0010\u00beN\u0014\u00bf\u00d1\u00fc!\u0087\u001c8\u00d9LGY\u00c9\u00f2j\u00b5\u00e1\u0090\u00b5\u00cf'\u00e0Z^\u00dbz\u00c6\u0019A\u00c4\u00f1&\u00ff\u00b2\u00cf\n\u0099#?i\u00b5^>\u0007p/\u00edu\u00f3[\u00cc\u00f5\u00eb\u0089\u009c%\u0085\u00f2\u0084\u00e8\u00b9\u00c1\u008d(\u00ab\u00cb\u000b\u001b^\u00fc\u0017|\u008f\u00ddllZ\u001b\u00a4\u0094\u001a\"\u001f\u008dcW>\u0087\u0082\u0010\u00801N\u00c0\u00d4\u009b\u009d\u00d5:S_p\u00ae\u00d6\r3J\u0000\u0082\u00c3\u0015\u00ad\r\u00d0{\u009a\u0092\u009cf\u0013N\u00fb'\u0081\u00a3\u00d2\u00b1)\u0000\u00bf\u009c\u00bf\u0007\u00eb\u0019\u001c\u00b2B9\u0097\u00c0\u00bd\u009c\u0094Y\u00ec\u00b7\u00b7)*\u00e5aC\u00b8^\u0086\u0082\u0095\u0014\u00fb\u00e9\u00c3\u008f\r\u009d2\u00bc3t\u00f1\u0005\u00ee\u00d5\u00bd\t\u0017\tn\u00c3\u001b\u0010\u00a9\u00cc\u0092\u00ffG\u007fB\u008c\u0010\u00bf\u0091\u00f8\\\u0007>\u00d5\u00e7^\u00b3\u00c5_\u0012~%s_{x\u00ca\u00ff?\u00f5x2x\u0087o5\u00dd\u0001\u00f8\u0006\u00eb\u008a3\u000b\u00d4S\r\u00b1\u00d4\u00b4\u00deH\u008f\u00f0h\u00d3\u00d6m62\u009ej\u0016E5 \u00da\u008f\u0098\u00dfd\u00fb\u008b\u009b\u00beX\u00dc1\"Fd\u00aa\u0094B(\u0080\u001d\u00f1.\u00b9\u0002w\u00ab|\u00e7J(^\u0002\u009e\f\u0098/\u00bbGsK\u00ec\u00d7\u00bac\u00da\u00a4\u00bcK\u009f\u00b4\rl\u00b6\u0093&4\u00a9\u0097y* \u0089\u00c9\f<\u000f\u00a6\u00c3B\u0086:\u00f7\u00d8\u00fb\u001b\u00fd0\u00c6hN5V4]\u00da\u0011v\u00d912\u00e36.R\u00e1\u008fFf!c\tZ\u008d\u00a8d\u00d3g*\u00da\u00a5%F\u00b9QG\u00dc.\u0097k\u00deB\u000f\u00b7\u00d4\u00e2\tB\u001d\u0094\u00e1\u00cf\u00c2caS\u00d0z|\u009f\u0095\u0013\u000fJ\u00ff.\u00f5\u0098a\u0085w\u00f7\u0019\u0083\u00e5\b\u00d4\u0081\u00d6S&3\u0083\u00c0\u001dk\u00e1[\u00f7\u0005Ud\u00cd\u00b5\u00da\"n%*y\u00ed\u00a9g\u00c1\u00f4<:N\u0089\u00da0\u00d88r\u009a\u00a1\u00ad\u0010\u0098\u00e1+\u0080\u000e\u0000Y\u00cc\u0002d\u008fzV'e\u00ddg\u00b3\u009b\u0094\u00c4\u00b9\u00b0\u000ep\\qit\u00f4\u00ee\u00ef\u0003\u0001\u000bOf\u00fa\u00f8\b\u00f7\u0085\u00bcv!P\u00ac\u00cc\f\u00abvg\u00f8\u00b49\t\u0083\u00abY\u007fB{\u009e\u00aa\u0085>\u00a1%\u00e8\u00c3\u001e\u00c7\u0011\u0019?\u00a9\bn\u0088\u00de\u00a9\u0006OY&1\u0093\u00a4\u00bd\u00d4\u00b5 S\u00042O\u00a6\u00b3\u00ec\u00fd\u0007\u00bc\u0002\u0011_q^\u00fdx\u00e1\u00da]\u00805d<\u00a9\u00eaGA\u00bai\u00d1\u00a5D\u00d3L\u00b2Y\u00b2\f\u00d8\u00a8\u00a6\u00a4\u00e3\u0016\u00ae\u00b0\u000f\u00ea\u00fb\u001b}Z\u0017\u0080\u00db\u00afg\u001b\u00ae.\u009aM\u00f5\u0082\u00f81\u0088\u00b2\u0084{\u00e3\u00f1\u0085\u00ca^\u00a5\u00f8\u0004;\u00fc\u0010,\u00e1(\u00cbs\\\u00ac\u00e0\u00a4\u001a\u00f5\u0015\u00b0\u00b1\u00d0\u009d\u0082\u0095\t\r\u00be]Oj\u00f4D\u00c7\u0004\u00ad\u00a7\u0084\u00f9\n/\u00e3]\u00b5\u00c4\u0000S\u00f1\u009d~2-\u0099{\r~\u00cf\u0003\u008b2mz\n\u00e2\t\u00d9\u00d3\u0094\u00dd\u00f7`\u00e5\u00ff\u001b\u0012\u00a4\u00b9\u009c^\u0014\u00a9\u00de>\b\u00d89R\u00deN\u00dc`\u00b5\u00ff\u00d7m@\u00d2U\u008ev+\u00fa\u00ad\u00c9\u00ecW\u00d8\u0012\u00a6\u001f`\n\u00dc\u00ce\u0003B\u00de\u0080U\u00ff#\u0088\u00f1\u00e6((\u0015&\u0000\u00e7\u00c1\u00d8^\u0006\u0082\u0010g\r\u00a3\u009a\u00c8B\u0085b5\u009d\u00f3c\u000e\u00fc\u0004\u00af\u0082\u00c2\u00ef\u00f8\u0092@\u00f0@\u00123u\u00f6\u00a1\u00b3%\u00b6\u00f8\u00d6\u008d_;.\u0097\u001e\u008c\u001f\u00898\u00ca\u00ad}\bt\u001e\u00ba\u00c4-\u00b8`\u00df\u0082\u0010\u008bx\u0094\u00b5+\u00dcO\u00ac$H]\u00edF(pD\u00a2\u00d8\u0006\u0095\u009b\u00b6\u0012n\u0095|6gM\u00ba1\u0019C,\u008cX\u00fd\u00e3.\u0090\u00a5\u0082\u00a4\u00c9t\u00842\u00af\n7\u00f6\u00abMJ~\u00c8\u00b4\u0019\u00a6:\u00d9\u0005G\u0007y\u00bf\u0019\u009e\u0006\u00e7$\u00e9\u0082\u00b9\u00c1\u00adzd_\u00f7C\u0087\u001c\u00a1\u0097\u00cc\u00b1\u001d\u00ae\u0018\u00b0\u00b7F\u00ef\u00c44zv\u008do\u00f1I\u00dc\u0015\u0088DB\u00b5\u0006\u00c5\u0016\u0094<\u00ad\u009b\u008c\u00d8\u00d2\u000f\u009d\u00b1\u00f9>\u00bb\u00ae\u00b2c\u00d3\\y\u0094\u00f2N\u00b4B\u0005\u001f\b\u009a\u00e1\u009d\u0081\u00f7H\u00ea\u0018z\u00f6\u009eB\u0018\u000bG\u00ac\u00a6N\u00a7\u00fd?\u008d\u00df\u00fd)\u00b0\u0087\u009f\u009d\u00b2\u00a3\u0091Z$\u0087\u0095\u0084\u009fxt\u00bf\u009cz\u001c\u009d\u009aB");
        var5_6 = var3_5.length();
        var2_7 = 16;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl79
            {
                var3_5 = N8.C("\u00e5\u0013\u00de\u000b\u00ce\u00d4$\u00e2m\u00a1U\u00c9\u009d\u001a\u00bf{\u00d0Xo\u000b\u0093\u009cgo\u00d8c\u00f6?\u009f\u00c9\u00dc\u0013\u001c=W\u0093$j\u0080/law\u00b5=L(\u00b9e\u00e3\u00e3|\u00e7\u001c\u0086\u00b1\u00c3\u009ak\u00a5\u0092\u0085\u00b1\u0083>\u008b\u008f\u001b/\u0016\u00ff^\u00cb\u00bf\u00d0\u0098\fu\u0094GX");
                var5_6 = var3_5.length();
                var2_7 = 40;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl79:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = vM.a(var0_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = vM.a(var0_1.doFinal(v6.getBytes(J.C("\\)]P-B=^o\u001c")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        vM.d = var6_3;
                        vM.f = new String[44];
                        vM.A = (char[])ye.a("j", (String)vM.a("m", (int)14538, (long)(8826618821083502169L ^ var7)), (long)7162922638138704306L, (long)var7);
                        ye.a("\u00ed", (Xb)new XA(), (long)7197931558006934900L, (long)var7);
                        return;
                    }
                    var2_7 = var3_5.charAt(var1_2);
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ int T(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[TRYBLOCK]
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

