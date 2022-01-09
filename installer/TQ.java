/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

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
import net.futureclient.installer.E7;
import net.futureclient.installer.EK;
import net.futureclient.installer.Eh;
import net.futureclient.installer.N8;
import net.futureclient.installer.NL;
import net.futureclient.installer.Ni;
import net.futureclient.installer.T;
import net.futureclient.installer.Te;
import net.futureclient.installer.Th;
import net.futureclient.installer.X7;
import net.futureclient.installer.XC;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class TQ {
    private static final /* synthetic */ String[] b;
    private final /* synthetic */ String[] Z;
    private static final /* synthetic */ Map e;
    private final /* synthetic */ int[] q;
    public final /* synthetic */ int[] Y;
    public final /* synthetic */ int M;
    public final /* synthetic */ byte[] c;
    public /* synthetic */ int o;
    private static final /* synthetic */ long a;
    private final /* synthetic */ E7[] K;
    private static final /* synthetic */ String[] d;

    /*
     * Exception decompiling
     */
    private static /* synthetic */ T z(Object[] this) {
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
    private /* synthetic */ Object P(Object[] this) {
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
    private /* synthetic */ int[] F(Object[] this) {
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
    public final /* synthetic */ int i(Object[] this) {
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

    private /* synthetic */ String q(Object[] arrobject2) {
        long l2;
        long l3;
        long l4;
        char[] arrc;
        block4: {
            String string;
            block3: {
                int arrobject2 = (Integer)arrobject2[0];
                arrc = (char[])arrobject2[1];
                l4 = (Long)arrobject2[2];
                l4 = a ^ l4;
                l3 = l4 ^ 0x579D9D4DC7A0L;
                l2 = l4 ^ 0x311739CB05A8L;
                CallSite callSite = ye.a("G", (long)9148306028468507542L, (long)l4);
                string = ((String[])ye.a("\u00c3", (Object)this, (long)9210982917446747344L, (long)l4))[arrobject2];
                try {
                    if (callSite == null) break block3;
                    if (string != null) {
                        return string;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)9221626846275434168L, (long)l4));
                }
            }
            return string;
        }
        CallSite callSite = ye.a("\u00c3", (Object)this, (long)9151506818106670428L, (long)l4)[arrobject2];
        TQ tQ = this;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = l2;
        arrobject3[0] = (int)callSite;
        Object[] arrobject4 = new Object[4];
        arrobject4[3] = arrc;
        arrobject4[2] = (int)ye.a("j", (Object)tQ, (Object)arrobject3, (long)8939911569421157579L, (long)l4);
        arrobject4[1] = l3;
        arrobject4[0] = (int)(callSite + 2);
        String string = (String)((Object)ye.a("j", (Object)tQ, (Object)arrobject4, (long)9185569976146315280L, (long)l4));
        ((String[])ye.a("\u00c3", (Object)this, (long)9210982917446747344L, (long)l4))[arrobject2] = string;
        return string;
    }

    private /* synthetic */ long J(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x5954F9CD942BL;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = arrobject2;
        arrobject3[0] = l3;
        long l4 = (long)ye.a("j", (Object)this, (Object)arrobject3, (long)3187480148720171440L, (long)l2);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = arrobject2 + 4;
        arrobject4[0] = l3;
        l2 = (long)ye.a("j", (Object)this, (Object)arrobject4, (long)3187480148720171440L, (long)l2) & 0xFFFFFFFFL;
        return l4 << 32 | l2;
    }

    public final /* synthetic */ String c(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        char[] arrc = (char[])arrobject2[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x4173F3239785L;
        long l4 = l2 ^ 0x17267438F954L;
        TQ tQ = this;
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = l4;
        arrobject3[0] = arrobject2;
        Object[] arrobject4 = new Object[3];
        arrobject4[2] = arrc;
        arrobject4[1] = l3;
        arrobject4[0] = (int)ye.a("\u00c3", (Object)tQ, (long)-8936117169894997600L, (long)l2)[ye.a("j", (Object)this, (Object)arrobject3, (long)-9156710821605984201L, (long)l2)];
        return (String)((Object)ye.a("j", (Object)tQ, (Object)arrobject4, (long)-9043893941192530891L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ TQ(long this, byte[] this) {
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

    public /* synthetic */ TQ(long l22, byte[] arrby, byte by) {
        long l22 = a ^ l22;
        this(arrby, l22 ^= 0x3B8C1DA056DCL, '\u0000');
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ int[] h(Object[] this2222) {
        int[] arrn;
        void var12_18;
        int[] this2222;
        CallSite callSite;
        long l2;
        long l3;
        block10: {
            void var12_16;
            int this2222 = (Integer)this2222[0];
            l3 = (Long)this2222[1];
            l3 = a ^ l3;
            long l4 = l3 ^ 0x48A5154A44B7L;
            long l5 = l3 ^ 0x18FB19B17ACCL;
            l2 = l3 ^ 0x4EAE9EAA141DL;
            long l6 = l3 ^ 0xD29E057D5C8L;
            char[] this2222 = new char[this2222];
            Object[] arrobject = new Object[1];
            arrobject[0] = l4;
            CallSite callSite2 = ye.a("j", (Object)this, (Object)arrobject, (long)7940055147164765119L, (long)l3);
            Object[] arrobject2 = new Object[2];
            arrobject2[1] = l2;
            arrobject2[0] = (int)(callSite2 - 2);
            CallSite callSite3 = ye.a("j", (Object)this, (Object)arrobject2, (long)7900876759323759998L, (long)l3);
            callSite = ye.a("G", (long)8016460548479582755L, (long)l3);
            while (var12_16 > 0) {
                block7: {
                    reference v42;
                    reference var5_12;
                    block8: {
                        CallSite callSite4;
                        block9: {
                            Object[] arrobject3 = new Object[3];
                            arrobject3[2] = this2222;
                            arrobject3[1] = l5;
                            arrobject3[0] = (int)var5_12;
                            String string = (String)((Object)ye.a("j", (Object)this, (Object)arrobject3, (long)8013306612502202748L, (long)l3));
                            Object[] arrobject4 = new Object[2];
                            arrobject4[1] = (int)(var5_12 + 2);
                            arrobject4[0] = l6;
                            callSite4 = ye.a("j", (Object)this, (Object)arrobject4, (long)7917152445062019155L, (long)l3);
                            try {
                                var5_12 += 6;
                                if (l3 < 0L) break block7;
                                v42 = ye.a("j", (String)((Object)TQ.a("g", (int)14185, (long)(0x653DBE4B2708F01BL ^ l3))), (Object)string, (long)7903493975890007981L, (long)l3);
                                if (callSite == null) break block8;
                                if (v42 == false) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)7947924785413154573L, (long)l3));
                            }
                            Object[] arrobject5 = new Object[2];
                            arrobject5[1] = l2;
                            arrobject5[0] = (int)var5_12;
                            this2222 = new int[ye.a("j", (Object)this, (Object)arrobject5, (long)7900876759323759998L, (long)l3)];
                            reference var5_13 = var5_12 + 2;
                            boolean bl = false;
                            break block10;
                        }
                        v42 = var5_12 + callSite4;
                    }
                    var5_12 = v42;
                    --var12_16;
                }
                if (callSite != null) continue;
            }
            throw new IllegalArgumentException();
        }
        block3: while (var12_18 < this2222.length) {
            Object object = this2222;
            boolean bl = true;
            do {
                block12: {
                    block11: {
                        void var5_14;
                        if (!bl || (bl = false)) break block11;
                        if (l3 < 0L) break block12;
                        if (callSite == null) return arrn;
                        object[var12_18] = var5_14;
                        void v92 = var5_14;
                        Object[] arrobject = new Object[2];
                        arrobject[1] = l2;
                        arrobject[0] = (int)(v92 + 2);
                        ++var12_18;
                        var5_14 = v92 + (4 + (ye.a("j", (Object)this, (Object)arrobject, (long)7900876759323759998L, (long)l3) << 1));
                    }
                    object = callSite;
                }
                if (object != null) continue block3;
            } while (l3 < 0L);
        }
        arrn = this2222;
        return arrn;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ int E(Object[] this) {
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
    private /* synthetic */ int v(Object[] this) {
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
    private /* synthetic */ void T(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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
    public final /* synthetic */ int G(Object[] this) {
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

    private /* synthetic */ TQ(byte[] arrby, long l22, char c2) {
        long l22 = a ^ l22;
        this(l22 ^= 0x7122C3E3822FL, arrby);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ String z(Object[] arrobject2) {
        Object object;
        CallSite callSite;
        long l2;
        char[] arrc;
        long l3;
        block5: {
            int arrobject2 = (Integer)arrobject2[0];
            l3 = (Long)arrobject2[1];
            arrc = (char[])arrobject2[2];
            l3 = a ^ l3;
            l2 = l3 ^ 0x6742BED06B79L;
            long l4 = l3 ^ 0x5E951DBE299EL;
            Object[] arrobject3 = new Object[2];
            arrobject3[1] = l4;
            arrobject3[0] = arrobject2;
            callSite = ye.a("j", (Object)this, (Object)arrobject3, (long)5775476980626876669L, (long)l3);
            CallSite callSite2 = ye.a("G", (long)5963645923276570528L, (long)l3);
            try {
                object = arrobject2;
                if (callSite2 == null) break block5;
                if (object == 0) return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)6039225120651139726L, (long)l3));
            }
            object = callSite;
        }
        try {
            if (object == 0) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)6039225120651139726L, (long)l3));
        }
        Object[] arrobject4 = new Object[3];
        arrobject4[2] = l2;
        arrobject4[1] = arrc;
        arrobject4[0] = (int)callSite;
        return (String)((Object)ye.a("j", (Object)this, (Object)arrobject4, (long)5985494862908385200L, (long)l3));
    }

    private static /* synthetic */ T Z(Object[] this_) {
        int n2 = (Integer)this_[0];
        long l2 = (Long)this_[1];
        T[] arrt = (T[])this_[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x5F0E330BC53BL;
        Object[] arrobject = new Object[3];
        arrobject[2] = arrt;
        arrobject[1] = l3;
        arrobject[0] = n2;
        T t2 = (T)((Object)ye.a("G", (Object)arrobject, (long)-5188018784398824439L, (long)l2));
        ye.a("F", (Object)t2, (short)((short)(ye.a("\u00c3", (Object)t2, (long)-4972189165131023370L, (long)l2) & 0xFFFFFFFE)), (long)-4972189165131023370L, (long)l2);
        return t2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x2B2F;
        if (d[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])e.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(N8.C("\u0013[\u0011$\fD\f)\u0016D\u0012K8\u0014\u0016Z\u0016R,l"));
                    arrobject[1] = SecretKeyFactory.getInstance(X7.C("\u001ey9"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    e.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(N8.C("ph0ee8p%k2}.b*h;)/a\"ll(\u001b[\u0000\u0014\u0016Z"), exception);
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
            byte[] arrby2 = b[n2].getBytes(X7.C("f*<\b1g9c\u0011["));
            TQ.d[n2] = TQ.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return d[n2];
    }

    public final /* synthetic */ int s(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        l2 = a ^ l2;
        CallSite callSite = ye.a("\u00c3", (Object)this, (long)-45924029085908672L, (long)l2);
        return (callSite[arrobject2] & 0xFF) << 24 | (callSite[arrobject2 + 1] & 0xFF) << 16 | (callSite[arrobject2 + 2] & 0xFF) << 8 | callSite[arrobject2 + 3] & 0xFF;
    }

    private static /* synthetic */ IllegalArgumentException a(IllegalArgumentException this_) {
        return this_;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ int H(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 12[SWITCH]
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
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void R(Object[] this222) {
        void var11_28;
        CallSite callSite;
        CallSite this222;
        long l2;
        long l3;
        long l4;
        int n2;
        Object object;
        long l5;
        block59: {
            TQ tQ;
            block60: {
                CallSite callSite2;
                long l6;
                block53: {
                    long l7;
                    long l8;
                    Object[] arrobject;
                    TQ tQ2;
                    void var28_40;
                    CallSite callSite3;
                    long l9;
                    block47: {
                        long l10;
                        long l11;
                        Object[] arrobject2;
                        TQ tQ3;
                        void var3_12;
                        CallSite callSite4;
                        String[] arrstring;
                        long l12;
                        block45: {
                            int n3;
                            TQ tQ4;
                            block46: {
                                void var11_24;
                                long l13;
                                long l14;
                                block43: {
                                    Object object2;
                                    block41: {
                                        TQ tQ5;
                                        block44: {
                                            block42: {
                                                void var11_22;
                                                l5 = (Long)this222[0];
                                                object = (Te)this222[1];
                                                XC this222 = (XC)this222[2];
                                                n2 = (Integer)this222[3];
                                                int n4 = (Integer)this222[4];
                                                l5 = a ^ l5;
                                                l14 = l5 ^ 0x77B76CAB7627L;
                                                l4 = l5 ^ 0x75DADD3B2C58L;
                                                long l15 = l5 ^ 0x25DFB7CA6B8FL;
                                                l13 = l5 ^ 0x3C69B4BDFC92L;
                                                long l16 = l5 ^ 0x7EDF1FD3ED8DL;
                                                l3 = l5 ^ 0x614314D46FA1L;
                                                l2 = l5 ^ 0x6A3C33A69243L;
                                                l12 = l5 ^ 0x56DE71A62242L;
                                                l9 = l5 ^ 0x73EC2DEF0FC2L;
                                                l6 = l5 ^ 0x6C87019CE5B4L;
                                                this222 = ye.a("\u00c3", (Object)this222, (long)-1479418239825146152L, (long)l5);
                                                Object[] arrobject3 = new Object[3];
                                                arrobject3[2] = this222;
                                                arrobject3[1] = n2;
                                                arrobject3[0] = l4;
                                                String string = (String)((Object)ye.a("j", (Object)this, (Object)arrobject3, (long)-1463736336986726522L, (long)l5));
                                                callSite = ye.a("G", (long)-1648857358303787907L, (long)l5);
                                                Object[] arrobject4 = new Object[2];
                                                arrobject4[1] = l2;
                                                arrobject4[0] = n2 + 2;
                                                CallSite callSite5 = ye.a("j", (Object)this, (Object)arrobject4, (long)-1442373301263576288L, (long)l5);
                                                Object[] arrobject5 = new Object[3];
                                                arrobject5[2] = this222;
                                                arrobject5[1] = l13;
                                                arrobject5[0] = n2 + 4;
                                                n2 += 6;
                                                arrstring = (String[])ye.a("j", (Object)this, (Object)arrobject5, (long)-1627242596781322462L, (long)l5);
                                                Object[] arrobject6 = new Object[4];
                                                arrobject6[3] = l15;
                                                arrobject6[2] = arrstring;
                                                arrobject6[1] = (int)callSite5;
                                                arrobject6[0] = string;
                                                if ((object = (Eh)((Object)ye.a("j", (Object)object, (Object)arrobject6, (long)-1681161064649156385L, (long)l5))) == null) {
                                                    return;
                                                }
                                                try {
                                                    object2 = n4;
                                                    if (callSite == null) break block41;
                                                    if (object2 == 0) break block42;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                }
                                                Object[] arrobject7 = new Object[2];
                                                arrobject7[1] = l2;
                                                arrobject7[0] = n4;
                                                CallSite callSite6 = ye.a("j", (Object)this, (Object)arrobject7, (long)-1442373301263576288L, (long)l5);
                                                int n5 = n4 + 2;
                                                block18: while (--var11_22 > 0) {
                                                    try {
                                                        void var3_9;
                                                        Object[] arrobject8 = new Object[3];
                                                        arrobject8[2] = this222;
                                                        arrobject8[1] = (int)var3_9;
                                                        arrobject8[0] = l4;
                                                        Object[] arrobject9 = new Object[2];
                                                        arrobject9[1] = l16;
                                                        arrobject9[0] = (String)((Object)ye.a("j", (Object)this, (Object)arrobject8, (long)-1463736336986726522L, (long)l5));
                                                        var3_9 += 2;
                                                        ye.a("j", (Object)object, (Object)arrobject9, (long)-1664281902971823508L, (long)l5);
                                                        do {
                                                            CallSite callSite7 = callSite;
                                                            if (l5 > 0L) {
                                                                if (callSite7 == null) break block43;
                                                                callSite7 = callSite;
                                                            }
                                                            if (callSite7 != null) continue block18;
                                                        } while (l5 <= 0L);
                                                        tQ5 = this;
                                                        break block44;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                    }
                                                }
                                            }
                                            tQ5 = this;
                                        }
                                        Object[] arrobject10 = new Object[2];
                                        arrobject10[1] = l2;
                                        arrobject10[0] = n2;
                                        object2 = ye.a("j", (Object)tQ5, (Object)arrobject10, (long)-1442373301263576288L, (long)l5);
                                    }
                                    int n6 = object2;
                                }
                                n2 += 2;
                                block20: while (--var11_24 > 0) {
                                    tQ4 = this;
                                    do {
                                        Object[] arrobject11 = new Object[3];
                                        arrobject11[2] = this222;
                                        arrobject11[1] = n2;
                                        arrobject11[0] = l4;
                                        String string = (String)((Object)ye.a("j", (Object)tQ4, (Object)arrobject11, (long)-1463736336986726522L, (long)l5));
                                        Object[] arrobject12 = new Object[2];
                                        arrobject12[1] = l2;
                                        arrobject12[0] = n2 + 2;
                                        callSite4 = ye.a("j", (Object)this, (Object)arrobject12, (long)-1442373301263576288L, (long)l5);
                                        if (l5 <= 0L) break block45;
                                        CallSite callSite8 = callSite4;
                                        tQ4 = this;
                                        n3 = n2 + 4;
                                        if (callSite != null) {
                                            Object[] arrobject13 = new Object[3];
                                            arrobject13[2] = this222;
                                            arrobject13[1] = l13;
                                            arrobject13[0] = n3;
                                            n2 += 6;
                                            String string2 = (String)((Object)ye.a("j", (Object)tQ4, (Object)arrobject13, (long)-1627242596781322462L, (long)l5));
                                            Object[] arrobject14 = new Object[4];
                                            arrobject14[3] = string2;
                                            arrobject14[2] = (int)callSite8;
                                            arrobject14[1] = l14;
                                            arrobject14[0] = string;
                                            ye.a("j", (Object)object, (Object)arrobject14, (long)-1711526013780021800L, (long)l5);
                                            if (callSite != null) continue block20;
                                        }
                                        break block46;
                                        tQ4 = this;
                                    } while (l5 <= 0L);
                                }
                                n3 = n2;
                            }
                            Object[] arrobject15 = new Object[2];
                            arrobject15[1] = l2;
                            arrobject15[0] = n3;
                            callSite4 = ye.a("j", (Object)tQ4, (Object)arrobject15, (long)-1442373301263576288L, (long)l5);
                        }
                        CallSite callSite9 = callSite4;
                        n2 += 2;
                        block22: while (--var3_12 > 0) {
                            tQ3 = this;
                            Object[] arrobject16 = new Object[3];
                            arrobject16[2] = this222;
                            arrobject16[1] = n2;
                            arrobject2 = arrobject16;
                            arrobject16[0] = l4;
                            long l10 = -1463736336986726522L;
                            l10 = l5;
                            do {
                                CallSite callSite10;
                                block50: {
                                    block51: {
                                        Object object3;
                                        CallSite callSite11;
                                        String string;
                                        block52: {
                                            block49: {
                                                void v29;
                                                CallSite callSite12;
                                                block48: {
                                                    string = (String)((Object)ye.a("j", (Object)tQ3, (Object)arrobject2, (long)l11, (long)l10));
                                                    Object[] arrobject17 = new Object[2];
                                                    arrobject17[1] = l2;
                                                    arrobject17[0] = n2 + 2;
                                                    callSite11 = ye.a("j", (Object)this, (Object)arrobject17, (long)-1442373301263576288L, (long)l5);
                                                    if (l5 > 0L) {
                                                        Object[] arrobject18 = new Object[2];
                                                        arrobject18[1] = l2;
                                                        arrobject18[0] = n2 + 4;
                                                        callSite3 = ye.a("j", (Object)this, (Object)arrobject18, (long)-1442373301263576288L, (long)l5);
                                                        if (callSite == null) break block47;
                                                        n2 += 6;
                                                        callSite12 = callSite3;
                                                    }
                                                    arrstring = null;
                                                    try {
                                                        v29 = callSite12;
                                                        if (callSite == null) break block48;
                                                        if (v29 == false) break block49;
                                                        v29 = callSite12;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                    }
                                                }
                                                arrstring = new String[v29];
                                                int n7 = 0;
                                                block24: while (n7 < callSite12) {
                                                    try {
                                                        Object[] arrobject19 = new Object[3];
                                                        arrobject19[2] = this222;
                                                        arrobject19[1] = n2;
                                                        arrobject19[0] = l4;
                                                        n2 += 2;
                                                        arrstring[n7] = (String)((Object)ye.a("j", (Object)this, (Object)arrobject19, (long)-1463736336986726522L, (long)l5));
                                                        ++n7;
                                                        do {
                                                            callSite10 = callSite;
                                                            if (l5 < 0L) break block50;
                                                            if (callSite10 == null) break block51;
                                                            if (callSite != null) continue block24;
                                                        } while (l5 <= 0L);
                                                        object3 = object;
                                                        break block52;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                    }
                                                }
                                            }
                                            object3 = object;
                                        }
                                        Object[] arrobject20 = new Object[4];
                                        arrobject20[3] = arrstring;
                                        arrobject20[2] = (int)callSite11;
                                        arrobject20[1] = string;
                                        arrobject20[0] = l12;
                                        ye.a("j", (Object)object3, (Object)arrobject20, (long)-1452552488263559414L, (long)l5);
                                    }
                                    callSite10 = callSite;
                                }
                                if (callSite10 != null) continue block22;
                                tQ3 = this;
                                Object[] arrobject21 = new Object[2];
                                arrobject21[1] = l2;
                                arrobject2 = arrobject21;
                                arrobject21[0] = n2;
                                l11 = -1442373301263576288L;
                            } while ((l10 = l5) < 0L);
                        }
                        callSite3 = ye.a("j", (Object)tQ3, (Object)arrobject2, (long)l11, (long)l10);
                    }
                    CallSite callSite13 = callSite3;
                    n2 += 2;
                    block26: while (--var28_40 > 0) {
                        tQ2 = this;
                        Object[] arrobject22 = new Object[3];
                        arrobject22[2] = this222;
                        arrobject22[1] = n2;
                        arrobject = arrobject22;
                        arrobject22[0] = l4;
                        long l7 = -1463736336986726522L;
                        l7 = l5;
                        do {
                            CallSite callSite14;
                            block56: {
                                block57: {
                                    Object object4;
                                    String[] arrstring;
                                    CallSite callSite15;
                                    String string;
                                    block58: {
                                        block55: {
                                            CallSite callSite16;
                                            CallSite callSite17;
                                            block54: {
                                                string = (String)((Object)ye.a("j", (Object)tQ2, (Object)arrobject, (long)l8, (long)l7));
                                                Object[] arrobject23 = new Object[2];
                                                arrobject23[1] = l2;
                                                arrobject23[0] = n2 + 2;
                                                callSite15 = ye.a("j", (Object)this, (Object)arrobject23, (long)-1442373301263576288L, (long)l5);
                                                Object[] arrobject24 = new Object[2];
                                                arrobject24[1] = l2;
                                                arrobject24[0] = n2 + 4;
                                                n2 += 6;
                                                callSite17 = ye.a("j", (Object)this, (Object)arrobject24, (long)-1442373301263576288L, (long)l5);
                                                arrstring = null;
                                                try {
                                                    try {
                                                        CallSite callSite18 = callSite17;
                                                        callSite18 = callSite;
                                                        if (l5 > 0L) {
                                                            if (callSite18 == null) break block53;
                                                            callSite18 = callSite;
                                                        }
                                                        if (callSite18 == null) break block54;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                    }
                                                    if (callSite2 == false) break block55;
                                                    callSite16 = callSite17;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                }
                                            }
                                            arrstring = new String[callSite16];
                                            int n8 = 0;
                                            block28: while (n8 < callSite17) {
                                                try {
                                                    Object[] arrobject25 = new Object[3];
                                                    arrobject25[2] = this222;
                                                    arrobject25[1] = n2;
                                                    arrobject25[0] = l4;
                                                    n2 += 2;
                                                    arrstring[n8] = (String)((Object)ye.a("j", (Object)this, (Object)arrobject25, (long)-1463736336986726522L, (long)l5));
                                                    ++n8;
                                                    do {
                                                        callSite14 = callSite;
                                                        if (l5 < 0L) break block56;
                                                        if (callSite14 == null) break block57;
                                                        if (callSite != null) continue block28;
                                                    } while (l5 <= 0L);
                                                    object4 = object;
                                                    break block58;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                                                }
                                            }
                                        }
                                        object4 = object;
                                    }
                                    Object[] arrobject26 = new Object[4];
                                    arrobject26[3] = arrstring;
                                    arrobject26[2] = (int)callSite15;
                                    arrobject26[1] = string;
                                    arrobject26[0] = l9;
                                    ye.a("j", (Object)object4, (Object)arrobject26, (long)-1715879039475901382L, (long)l5);
                                }
                                callSite14 = callSite;
                            }
                            if (callSite14 != null) continue block26;
                            tQ2 = this;
                            Object[] arrobject27 = new Object[2];
                            arrobject27[1] = l2;
                            arrobject = arrobject27;
                            arrobject27[0] = n2;
                            l8 = -1442373301263576288L;
                        } while ((l7 = l5) <= 0L);
                    }
                    callSite2 = ye.a("j", (Object)tQ2, (Object)arrobject, (long)l8, (long)l7);
                }
                CallSite callSite19 = callSite2;
                n2 += 2;
                block30: while (callSite19-- > 0) {
                    try {
                        Object[] arrobject = new Object[3];
                        arrobject[2] = this222;
                        arrobject[1] = n2;
                        arrobject[0] = l4;
                        Object[] arrobject28 = new Object[2];
                        arrobject28[1] = l6;
                        arrobject28[0] = (String)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-1463736336986726522L, (long)l5));
                        n2 += 2;
                        ye.a("j", (Object)object, (Object)arrobject28, (long)-1470380151407605104L, (long)l5);
                        do {
                            CallSite callSite20 = callSite;
                            if (l5 >= 0L) {
                                if (callSite20 == null) break block59;
                                callSite20 = callSite;
                            }
                            if (callSite20 != null) continue block30;
                        } while (l5 < 0L);
                        tQ = this;
                        break block60;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                    }
                }
                tQ = this;
            }
            Object[] arrobject = new Object[2];
            arrobject[1] = l2;
            arrobject[0] = n2;
            CallSite callSite21 = ye.a("j", (Object)tQ, (Object)arrobject, (long)-1442373301263576288L, (long)l5);
        }
        n2 += 2;
        while (--var11_28 > 0) {
            CallSite callSite22;
            block61: {
                block62: {
                    Object object5;
                    String[] arrstring;
                    String string;
                    block63: {
                        Object[] arrobject = new Object[3];
                        arrobject[2] = this222;
                        arrobject[1] = n2;
                        arrobject[0] = l4;
                        string = (String)((Object)ye.a("j", (Object)this, (Object)arrobject, (long)-1463736336986726522L, (long)l5));
                        Object[] arrobject29 = new Object[2];
                        arrobject29[1] = l2;
                        arrobject29[0] = n2 + 2;
                        n2 += 4;
                        CallSite callSite23 = ye.a("j", (Object)this, (Object)arrobject29, (long)-1442373301263576288L, (long)l5);
                        arrstring = new String[callSite23];
                        int n9 = 0;
                        block33: while (n9 < callSite23) {
                            try {
                                Object[] arrobject30 = new Object[3];
                                arrobject30[2] = this222;
                                arrobject30[1] = n2;
                                arrobject30[0] = l4;
                                n2 += 2;
                                arrstring[n9] = (String)((Object)ye.a("j", (Object)this, (Object)arrobject30, (long)-1463736336986726522L, (long)l5));
                                ++n9;
                                do {
                                    callSite22 = callSite;
                                    if (l5 < 0L) break block61;
                                    if (callSite22 == null) break block62;
                                    if (callSite != null) continue block33;
                                } while (l5 <= 0L);
                                object5 = object;
                                break block63;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw (IllegalArgumentException)((Object)ye.a("G", (Object)illegalArgumentException, (long)-1724148679589338797L, (long)l5));
                            }
                        }
                        object5 = object;
                    }
                    Object[] arrobject = new Object[3];
                    arrobject[2] = l3;
                    arrobject[1] = arrstring;
                    arrobject[0] = string;
                    ye.a("j", (Object)object5, (Object)arrobject, (long)-1636658098457301991L, (long)l5);
                }
                callSite22 = callSite;
            }
            if (callSite22 != null) continue;
        }
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = TQ.a(this222, l2);
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
    private /* synthetic */ void C(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 20[CATCHBLOCK]
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
    public final /* synthetic */ int P(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[WHILELOOP]], but top level block is 6[WHILELOOP]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ int K(Object[] this) {
        block83: {
            block81: {
                block82: {
                    block80: {
                        block79: {
                            block78: {
                                block77: {
                                    block75: {
                                        block76: {
                                            var2_3 = (Long)this[0];
                                            var4_4 = (Te)this[1];
                                            var5_5 = (XC)this[2];
                                            this = (Integer)this[3];
                                            var2_3 = TQ.a ^ var2_3;
                                            var6_6 = var2_3 ^ 49594454508597L;
                                            var8_7 = var2_3 ^ 133771774612478L;
                                            v0 = var2_3 ^ 68012999492444L;
                                            var10_8 = (int)(v0 >>> 32);
                                            var11_9 = v0 << 32 >>> 32;
                                            var13_10 = var2_3 ^ 135577567718116L;
                                            var15_11 = var2_3 ^ 62439735339825L;
                                            var17_12 = var2_3 ^ 62990286858934L;
                                            var19_13 = var2_3 ^ 121684169243860L;
                                            var21_14 = var2_3 ^ 4265718046339L;
                                            var23_15 = var2_3 ^ 72840042983305L;
                                            var25_16 = var2_3 ^ 112353292805642L;
                                            var28_17 = ye.a("\u00c3", (Object)var5_5, (long)1431895643522659967L, (long)var2_3);
                                            v1 = new Object[3];
                                            v1[2] = var28_17;
                                            v1[1] = var6_6;
                                            v1[0] = this;
                                            var29_18 = (String)ye.a("j", (Object)this, (Object)v1, (long)1282908004237375365L, (long)var2_3);
                                            v2 = new Object[3];
                                            v2[2] = var28_17;
                                            v2[1] = var6_6;
                                            v2[0] = this + 2;
                                            var30_19 = (String)ye.a("j", (Object)this, (Object)v2, (long)1282908004237375365L, (long)var2_3);
                                            var27_20 = ye.a("G", (long)1277058039574592730L, (long)var2_3);
                                            var31_21 = null;
                                            var32_22 = 0;
                                            var33_23 = 0;
                                            var34_24 = 0;
                                            var35_25 /* !! */  = 0;
                                            var36_26 = null;
                                            v3 = new Object[2];
                                            v3[1] = var13_10;
                                            v3[0] = this += 4;
                                            this += 2;
                                            var37_27 = ye.a("j", (Object)this, (Object)v3, (long)1395192764207508359L, (long)var2_3);
                                            while (var37_27-- > 0) {
                                                block68: {
                                                    block69: {
                                                        block74: {
                                                            block73: {
                                                                block72: {
                                                                    block71: {
                                                                        block70: {
                                                                            block67: {
                                                                                v4 = new Object[3];
                                                                                v4[2] = var28_17;
                                                                                v4[1] = var6_6;
                                                                                v4[0] = this;
                                                                                var38_28 = (String)ye.a("j", (Object)this, (Object)v4, (long)1282908004237375365L, (long)var2_3);
                                                                                v5 = new Object[2];
                                                                                v5[1] = this + 2;
                                                                                v5[0] = var15_11;
                                                                                var39_29 /* !! */  = (int)ye.a("j", (Object)this, (Object)v5, (long)1379884703563122346L, (long)var2_3);
                                                                                try {
                                                                                    this += 6;
                                                                                    v6 /* !! */  = ye.a("j", (String)TQ.a("g", (int)21366, (long)(716266721842457339L ^ var2_3)), (Object)var38_28, (long)1393842118181808468L, (long)var2_3);
                                                                                    v7 = var27_20;
                                                                                    if (var2_3 <= 0L) ** GOTO lbl173
                                                                                    if (v7 == null) break block67;
                                                                                    if (v6 /* !! */  != false) {
                                                                                    }
                                                                                    ** GOTO lbl165
                                                                                }
                                                                                catch (IllegalArgumentException v8) {
                                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v8, (long)1204016477858666996L, (long)var2_3);
                                                                                }
                                                                                v9 = new Object[3];
                                                                                v9[2] = var28_17;
                                                                                v9[1] = var6_6;
                                                                                v9[0] = this;
                                                                                var31_21 = (String)ye.a("j", (Object)this, (Object)v9, (long)1282908004237375365L, (long)var2_3);
                                                                                try {
                                                                                    v10 = var27_20;
                                                                                    if (var2_3 <= 0L) break block68;
                                                                                    if (v10 != null) break block69;
lbl165:
                                                                                    // 2 sources

                                                                                    v6 /* !! */  = ye.a("j", (String)TQ.a("g", (int)12450, (long)(5438587597365053742L ^ var2_3)), (Object)var38_28, (long)1393842118181808468L, (long)var2_3);
                                                                                    v7 = var27_20;
                                                                                    ** GOTO lbl173
                                                                                }
                                                                                catch (IllegalArgumentException v11) {
                                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v11, (long)1204016477858666996L, (long)var2_3);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v7 = var27_20;
lbl173:
                                                                                // 3 sources

                                                                                if (var2_3 <= 0L) ** GOTO lbl195
                                                                                if (v7 == null) break block70;
                                                                                if (v6 /* !! */  != false) {
                                                                                }
                                                                                ** GOTO lbl187
                                                                            }
                                                                            catch (IllegalArgumentException v12) {
                                                                                throw (IllegalArgumentException)ye.a("G", (Object)v12, (long)1204016477858666996L, (long)var2_3);
                                                                            }
                                                                            var32_22 = this;
                                                                            try {
                                                                                v10 = var27_20;
                                                                                if (var2_3 <= 0L) break block68;
                                                                                if (v10 != null) break block69;
lbl187:
                                                                                // 2 sources

                                                                                v6 /* !! */  = ye.a("j", (String)TQ.a("g", (int)8563, (long)(8964018801533458683L ^ var2_3)), (Object)var38_28, (long)1393842118181808468L, (long)var2_3);
                                                                                v7 = var27_20;
                                                                                ** GOTO lbl195
                                                                            }
                                                                            catch (IllegalArgumentException v13) {
                                                                                throw (IllegalArgumentException)ye.a("G", (Object)v13, (long)1204016477858666996L, (long)var2_3);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v7 = var27_20;
lbl195:
                                                                            // 3 sources

                                                                            if (var2_3 < 0L) ** GOTO lbl217
                                                                            if (v7 == null) break block71;
                                                                            if (v6 /* !! */  != false) {
                                                                            }
                                                                            ** GOTO lbl209
                                                                        }
                                                                        catch (IllegalArgumentException v14) {
                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v14, (long)1204016477858666996L, (long)var2_3);
                                                                        }
                                                                        var34_24 = this;
                                                                        try {
                                                                            v10 = var27_20;
                                                                            if (var2_3 < 0L) break block68;
                                                                            if (v10 != null) break block69;
lbl209:
                                                                            // 2 sources

                                                                            v6 /* !! */  = ye.a("j", (String)TQ.a("g", (int)10473, (long)(1174206330225430893L ^ var2_3)), (Object)var38_28, (long)1393842118181808468L, (long)var2_3);
                                                                            v7 = var27_20;
                                                                            ** GOTO lbl217
                                                                        }
                                                                        catch (IllegalArgumentException v15) {
                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v15, (long)1204016477858666996L, (long)var2_3);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v7 = var27_20;
lbl217:
                                                                        // 3 sources

                                                                        if (var2_3 < 0L) ** GOTO lbl239
                                                                        if (v7 == null) break block72;
                                                                        if (v6 /* !! */  != false) {
                                                                        }
                                                                        ** GOTO lbl231
                                                                    }
                                                                    catch (IllegalArgumentException v16) {
                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v16, (long)1204016477858666996L, (long)var2_3);
                                                                    }
                                                                    var33_23 = this;
                                                                    try {
                                                                        v10 = var27_20;
                                                                        if (var2_3 <= 0L) break block68;
                                                                        if (v10 != null) break block69;
lbl231:
                                                                        // 2 sources

                                                                        v6 /* !! */  = ye.a("j", (String)TQ.a("g", (int)6069, (long)(2494604940518108730L ^ var2_3)), (Object)var38_28, (long)1393842118181808468L, (long)var2_3);
                                                                        v7 = var27_20;
                                                                        ** GOTO lbl239
                                                                    }
                                                                    catch (IllegalArgumentException v17) {
                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v17, (long)1204016477858666996L, (long)var2_3);
                                                                    }
                                                                }
                                                                try {
                                                                    v7 = var27_20;
lbl239:
                                                                    // 3 sources

                                                                    if (v7 == null) break block73;
                                                                    if (v6 /* !! */  == false) break block74;
                                                                }
                                                                catch (IllegalArgumentException v18) {
                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v18, (long)1204016477858666996L, (long)var2_3);
                                                                }
                                                                v6 /* !! */  = (CallSite)this;
                                                            }
                                                            var35_25 /* !! */  = (int)v6 /* !! */ ;
                                                            v10 = var27_20;
                                                            if (var2_3 < 0L) break block68;
                                                            if (v10 != null) break block69;
                                                        }
                                                        v19 = new Object[5];
                                                        v19[4] = var39_29 /* !! */ ;
                                                        v19[3] = var17_12;
                                                        v19[2] = this;
                                                        v19[1] = var38_28;
                                                        v19[0] = (NL[])ye.a("\u00c3", (Object)var5_5, (long)1172173861685118131L, (long)var2_3);
                                                        var40_31 = (NL)ye.a("j", (Object)this, (Object)v19, (long)1222592792364001388L, (long)var2_3);
                                                        ye.a("F", (Object)var40_31, var36_26, (long)1169385937746726238L, (long)var2_3);
                                                        var36_26 = var40_31;
                                                    }
                                                    this += var39_29 /* !! */ ;
                                                    v10 = var27_20;
                                                }
                                                if (v10 != null) continue;
                                                break;
                                            }
                                            v20 = new Object[4];
                                            v20[3] = var21_14;
                                            v20[2] = var31_21;
                                            v20[1] = var30_19;
                                            v20[0] = var29_18;
                                            var38_28 = (Th)ye.a("j", (Object)var4_4, (Object)v20, (long)1379371359958855032L, (long)var2_3);
                                            try {
                                                if (var38_28 == null) {
                                                    return this;
                                                }
                                            }
                                            catch (IllegalArgumentException v21) {
                                                throw (IllegalArgumentException)ye.a("G", (Object)v21, (long)1204016477858666996L, (long)var2_3);
                                            }
                                            try {
                                                v22 /* !! */  = var32_22;
                                                v23 = var27_20;
                                                if (var2_3 > 0L) {
                                                    if (v23 == null) break block75;
                                                    if (v22 /* !! */  == 0) break block76;
                                                }
                                                ** GOTO lbl405
                                            }
                                            catch (IllegalArgumentException v24) {
                                                throw (IllegalArgumentException)ye.a("G", (Object)v24, (long)1204016477858666996L, (long)var2_3);
                                            }
                                            v25 = new Object[2];
                                            v25[1] = var13_10;
                                            v25[0] = var32_22;
                                            var39_29 /* !! */  = (int)ye.a("j", (Object)this, (Object)v25, (long)1395192764207508359L, (long)var2_3);
                                            var40_32 /* !! */  = var32_22 + 2;
                                            block40: while (var39_29 /* !! */ -- > 0) {
                                                v26 = new Object[3];
                                                v26[2] = var28_17;
                                                v26[1] = var6_6;
                                                v26[0] = var40_32 /* !! */ ;
                                                var4_4 = (String)ye.a("j", (Object)this, (Object)v26, (long)1282908004237375365L, (long)var2_3);
                                                v27 = new Object[3];
                                                v27[2] = var8_7;
                                                v27[1] = true;
                                                v27[0] = var4_4;
                                                v28 = new Object[5];
                                                v28[4] = var28_17;
                                                v28[3] = true;
                                                v28[2] = var40_32 /* !! */  += 2;
                                                v28[1] = var25_16;
                                                v28[0] = (X7)ye.a("j", (Object)var38_28, (Object)v27, (long)1211848610533911790L, (long)var2_3);
                                                var40_32 /* !! */  = (int)ye.a("j", (Object)this, (Object)v28, (long)1387168881093695349L, (long)var2_3);
                                                try {
                                                    do {
                                                        v29 = var27_20;
                                                        if (var2_3 >= 0L) {
                                                            if (v29 == null) break block77;
                                                            v29 = var27_20;
                                                        }
                                                        if (v29 != null) continue block40;
                                                    } while (var2_3 < 0L);
                                                    v22 /* !! */  = var33_23;
                                                    break block75;
                                                }
                                                catch (IllegalArgumentException v30) {
                                                    throw (IllegalArgumentException)ye.a("G", (Object)v30, (long)1204016477858666996L, (long)var2_3);
                                                }
                                            }
                                        }
                                        v22 /* !! */  = var33_23;
                                    }
                                    try {
                                        v23 = var27_20;
lbl405:
                                        // 2 sources

                                        if (var2_3 > 0L) {
                                            if (v23 == null) break block78;
                                            if (v22 /* !! */  == 0) break block77;
                                        }
                                        ** GOTO lbl501
                                    }
                                    catch (IllegalArgumentException v31) {
                                        throw (IllegalArgumentException)ye.a("G", (Object)v31, (long)1204016477858666996L, (long)var2_3);
                                    }
                                    v32 = new Object[2];
                                    v32[1] = var13_10;
                                    v32[0] = var33_23;
                                    var39_29 /* !! */  = (int)ye.a("j", (Object)this, (Object)v32, (long)1395192764207508359L, (long)var2_3);
                                    var40_33 /* !! */  = var33_23 + 2;
                                    block42: while (var39_29 /* !! */ -- > 0) {
                                        v33 = new Object[3];
                                        v33[2] = var28_17;
                                        v33[1] = var6_6;
                                        v33[0] = var40_33 /* !! */ ;
                                        var4_4 = (String)ye.a("j", (Object)this, (Object)v33, (long)1282908004237375365L, (long)var2_3);
                                        v34 = new Object[3];
                                        v34[2] = var8_7;
                                        v34[1] = false;
                                        v34[0] = var4_4;
                                        v35 = new Object[5];
                                        v35[4] = var28_17;
                                        v35[3] = true;
                                        v35[2] = var40_33 /* !! */  += 2;
                                        v35[1] = var25_16;
                                        v35[0] = (X7)ye.a("j", (Object)var38_28, (Object)v34, (long)1211848610533911790L, (long)var2_3);
                                        var40_33 /* !! */  = (int)ye.a("j", (Object)this, (Object)v35, (long)1387168881093695349L, (long)var2_3);
                                        try {
                                            do {
                                                v36 = var27_20;
                                                if (var2_3 > 0L) {
                                                    if (v36 == null) break block79;
                                                    v36 = var27_20;
                                                }
                                                if (v36 != null) continue block42;
                                            } while (var2_3 <= 0L);
                                            v22 /* !! */  = var34_24;
                                            break block78;
                                        }
                                        catch (IllegalArgumentException v37) {
                                            throw (IllegalArgumentException)ye.a("G", (Object)v37, (long)1204016477858666996L, (long)var2_3);
                                        }
                                    }
                                }
                                v22 /* !! */  = var34_24;
                            }
                            try {
                                v23 = var27_20;
lbl501:
                                // 2 sources

                                if (var2_3 > 0L) {
                                    if (v23 == null) break block80;
                                    if (v22 /* !! */  == 0) break block79;
                                }
                                ** GOTO lbl623
                            }
                            catch (IllegalArgumentException v38) {
                                throw (IllegalArgumentException)ye.a("G", (Object)v38, (long)1204016477858666996L, (long)var2_3);
                            }
                            v39 = new Object[2];
                            v39[1] = var13_10;
                            v39[0] = var34_24;
                            var39_29 /* !! */  = (int)ye.a("j", (Object)this, (Object)v39, (long)1395192764207508359L, (long)var2_3);
                            var40_34 /* !! */  = var34_24 + 2;
                            block44: while (var39_29 /* !! */ -- > 0) {
                                v40 = new Object[4];
                                v40[3] = var40_34 /* !! */ ;
                                v40[2] = var11_9;
                                v40[1] = var10_8;
                                v40[0] = var5_5;
                                var40_34 /* !! */  = (int)ye.a("j", (Object)this, (Object)v40, (long)1192634770190882149L, (long)var2_3);
                                v41 = new Object[3];
                                v41[2] = var28_17;
                                v41[1] = var6_6;
                                v41[0] = var40_34 /* !! */ ;
                                var4_4 = (String)ye.a("j", (Object)this, (Object)v41, (long)1282908004237375365L, (long)var2_3);
                                v42 = new Object[5];
                                v42[4] = true;
                                v42[3] = var4_4;
                                v42[2] = var23_15;
                                v42[1] = (EK)ye.a("\u00c3", (Object)var5_5, (long)1178489773502041019L, (long)var2_3);
                                v42[0] = (int)ye.a("\u00c3", (Object)var5_5, (long)1265242785137724772L, (long)var2_3);
                                v43 = new Object[5];
                                v43[4] = var28_17;
                                v43[3] = true;
                                v43[2] = var40_34 /* !! */  += 2;
                                v43[1] = var25_16;
                                v43[0] = (X7)ye.a("j", (Object)var38_28, (Object)v42, (long)1203677927543860713L, (long)var2_3);
                                var40_34 /* !! */  = (int)ye.a("j", (Object)this, (Object)v43, (long)1387168881093695349L, (long)var2_3);
                                try {
                                    do {
                                        v44 = var27_20;
                                        if (var2_3 >= 0L) {
                                            if (v44 == null) break block81;
                                            v44 = var27_20;
                                        }
                                        if (v44 != null) continue block44;
                                    } while (var2_3 <= 0L);
                                    v22 /* !! */  = var35_25 /* !! */ ;
                                    break block80;
                                }
                                catch (IllegalArgumentException v45) {
                                    throw (IllegalArgumentException)ye.a("G", (Object)v45, (long)1204016477858666996L, (long)var2_3);
                                }
                            }
                        }
                        v22 /* !! */  = var35_25 /* !! */ ;
                    }
                    try {
                        try {
                            v23 = var27_20;
lbl623:
                            // 2 sources

                            if (v23 == null) break block82;
                            if (v22 /* !! */  == 0) break block81;
                            v46 = this;
                        }
                        catch (IllegalArgumentException v47) {
                            throw (IllegalArgumentException)ye.a("G", (Object)v47, (long)1204016477858666996L, (long)var2_3);
                        }
                        v48 = new Object[2];
                        v48[1] = var13_10;
                        v48[0] = var35_25 /* !! */ ;
                        v22 /* !! */  = (int)ye.a("j", (Object)v46, (Object)v48, (long)1395192764207508359L, (long)var2_3);
                    }
                    catch (IllegalArgumentException v49) {
                        throw (IllegalArgumentException)ye.a("G", (Object)v49, (long)1204016477858666996L, (long)var2_3);
                    }
                }
                var39_29 /* !! */  = v22 /* !! */ ;
                var40_35 /* !! */  = var35_25 /* !! */  + 2;
                block46: while (var39_29 /* !! */ -- > 0) {
                    v50 = new Object[4];
                    v50[3] = var40_35 /* !! */ ;
                    v50[2] = var11_9;
                    v50[1] = var10_8;
                    v50[0] = var5_5;
                    var40_35 /* !! */  = (int)ye.a("j", (Object)this, (Object)v50, (long)1192634770190882149L, (long)var2_3);
                    v51 = new Object[3];
                    v51[2] = var28_17;
                    v51[1] = var6_6;
                    v51[0] = var40_35 /* !! */ ;
                    var4_4 = (String)ye.a("j", (Object)this, (Object)v51, (long)1282908004237375365L, (long)var2_3);
                    v52 = new Object[5];
                    v52[4] = false;
                    v52[3] = var4_4;
                    v52[2] = var23_15;
                    v52[1] = (EK)ye.a("\u00c3", (Object)var5_5, (long)1178489773502041019L, (long)var2_3);
                    v52[0] = (int)ye.a("\u00c3", (Object)var5_5, (long)1265242785137724772L, (long)var2_3);
                    v53 = new Object[5];
                    v53[4] = var28_17;
                    v53[3] = true;
                    v53[2] = var40_35 /* !! */  += 2;
                    v53[1] = var25_16;
                    v53[0] = (X7)ye.a("j", (Object)var38_28, (Object)v52, (long)1203677927543860713L, (long)var2_3);
                    v54 /* !! */  = (int)ye.a("j", (Object)this, (Object)v53, (long)1387168881093695349L, (long)var2_3);
                    if (var2_3 < 0L) return v54 /* !! */ ;
                    var40_35 /* !! */  = v54 /* !! */ ;
                    try {
                        while (var27_20 != null) {
                            if (var27_20 != null) continue block46;
                            if (var2_3 <= 0L) continue;
                            v55 = var36_26;
                            ** GOTO lbl745
                        }
                        break block83;
                    }
                    catch (IllegalArgumentException v56) {
                        throw (IllegalArgumentException)ye.a("G", (Object)v56, (long)1204016477858666996L, (long)var2_3);
                    }
                }
            }
            do {
                v57 = var36_26;
lbl745:
                // 2 sources

                if (var2_3 >= 0L) {
                    if (v55 == null) break;
                    v55 = (NL)ye.a("\u00c3", var36_26, (long)1169385937746726238L, (long)var2_3);
                }
                var39_30 = v55;
                ye.a("F", var36_26, null, (long)1169385937746726238L, (long)var2_3);
                v58 = new Object[2];
                v58[1] = var36_26;
                v58[0] = var19_13;
                ye.a("j", (Object)var38_28, (Object)v58, (long)1190926046243038582L, (long)var2_3);
                var36_26 = var39_30;
            } while (var27_20 != null);
        }
        v54 /* !! */  = this;
        return v54 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ int J(Object[] this) {
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

    private /* synthetic */ short o(Object[] arrobject2) {
        int arrobject2 = (Integer)arrobject2[0];
        long l2 = (Long)arrobject2[1];
        l2 = a ^ l2;
        CallSite callSite = ye.a("\u00c3", (Object)this, (long)-1595537115874191417L, (long)l2);
        return (short)((callSite[arrobject2] & 0xFF) << 8 | callSite[arrobject2 + 1] & 0xFF);
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ int l(Object[] this) {
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
    private static /* synthetic */ void z(Object[] this) {
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

    public final /* synthetic */ String H(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        int n2 = (Integer)arrobject[1];
        arrobject = (char[])arrobject[2];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x15C0A8D90C62L;
        Object[] arrobject2 = new Object[3];
        arrobject2[2] = arrobject;
        arrobject2[1] = n2;
        arrobject2[0] = l3;
        return (String)((Object)ye.a("j", (Object)this, (Object)arrobject2, (long)-3776932852387463236L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ NL D(Object[] this) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ int r(Object[] this) {
        block105: {
            block103: {
                block104: {
                    block102: {
                        block101: {
                            block100: {
                                block99: {
                                    block97: {
                                        block98: {
                                            var3_2 = (Te)this /* !! */ [0];
                                            this /* !! */  = (XC)this /* !! */ [1];
                                            var2_3 = (Integer)this /* !! */ [2];
                                            var4_4 = (Long)this /* !! */ [3];
                                            var4_4 = TQ.a ^ var4_4;
                                            var6_5 = var4_4 ^ 57883577489198L;
                                            var8_6 = var4_4 ^ 51481644139619L;
                                            var10_7 = var4_4 ^ 16408009625524L;
                                            v0 = var4_4 ^ 19831395666274L;
                                            var12_8 = (int)(v0 >>> 56);
                                            var13_9 = v0 << 8 >>> 8;
                                            v1 = var4_4 ^ 68247439819530L;
                                            var15_10 = (int)(v1 >>> 32);
                                            var16_11 = v1 << 32 >>> 32;
                                            var18_12 = var4_4 ^ 132521317100210L;
                                            var20_13 = var4_4 ^ 64873215699815L;
                                            var22_14 = var4_4 ^ 64336654019296L;
                                            var24_15 = var4_4 ^ 41438345224546L;
                                            var26_16 = var4_4 ^ 116969469989136L;
                                            var28_17 = var4_4 ^ 112042021217884L;
                                            var31_18 = ye.a("\u00c3", (Object)this /* !! */ , (long)-7815682376065059287L, (long)var4_4);
                                            v2 = new Object[2];
                                            v2[1] = var18_12;
                                            v2[0] = var2_3;
                                            var32_19 /* !! */  = ye.a("j", (Object)this, (Object)v2, (long)-7851256683743663151L, (long)var4_4);
                                            v3 = new Object[3];
                                            v3[2] = var31_18;
                                            v3[1] = var8_6;
                                            v3[0] = var2_3 + 2;
                                            var33_20 = (String)ye.a("j", (Object)this, (Object)v3, (long)-7954538083799107629L, (long)var4_4);
                                            v4 = new Object[3];
                                            v4[2] = var31_18;
                                            v4[1] = var8_6;
                                            v4[0] = var2_3 + 4;
                                            var34_21 = (String)ye.a("j", (Object)this, (Object)v4, (long)-7954538083799107629L, (long)var4_4);
                                            var35_22 = null;
                                            var36_23 = null;
                                            var37_24 = 0;
                                            var38_25 = 0;
                                            var39_26 = 0;
                                            var30_27 = ye.a("G", (long)-7931113491855639412L, (long)var4_4);
                                            var40_28 /* !! */  = 0;
                                            var41_29 = null;
                                            v5 = new Object[2];
                                            v5[1] = var18_12;
                                            v5[0] = var2_3 += 6;
                                            var2_3 += 2;
                                            var42_30 = ye.a("j", (Object)this, (Object)v5, (long)-7851256683743663151L, (long)var4_4);
                                            while (var42_30-- > 0) {
                                                block87: {
                                                    block88: {
                                                        block96: {
                                                            block95: {
                                                                block94: {
                                                                    block93: {
                                                                        block92: {
                                                                            block91: {
                                                                                block90: {
                                                                                    block89: {
                                                                                        block84: {
                                                                                            block86: {
                                                                                                block85: {
                                                                                                    v6 = new Object[3];
                                                                                                    v6[2] = var31_18;
                                                                                                    v6[1] = var8_6;
                                                                                                    v6[0] = var2_3;
                                                                                                    var43_31 = (String)ye.a("j", (Object)this, (Object)v6, (long)-7954538083799107629L, (long)var4_4);
                                                                                                    v7 = new Object[2];
                                                                                                    v7[1] = var2_3 + 2;
                                                                                                    v7[0] = var20_13;
                                                                                                    var44_32 = ye.a("j", (Object)this, (Object)v7, (long)-7822657882399930628L, (long)var4_4);
                                                                                                    try {
                                                                                                        var2_3 += 6;
                                                                                                        v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)15939, (long)(2678279293011847L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                                        v9 = var30_27;
                                                                                                        if (var4_4 <= 0L) ** GOTO lbl222
                                                                                                        if (v9 == null) break block84;
                                                                                                        if (v8 /* !! */  != false) {
                                                                                                        }
                                                                                                        ** GOTO lbl214
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v10) {
                                                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v10, (long)-8006409124885620318L, (long)var4_4);
                                                                                                    }
                                                                                                    v11 = new Object[2];
                                                                                                    v11[1] = var18_12;
                                                                                                    v11[0] = var2_3;
                                                                                                    var45_34 = ye.a("j", (Object)this, (Object)v11, (long)-7851256683743663151L, (long)var4_4);
                                                                                                    try {
                                                                                                        if (var45_34 != false) break block85;
                                                                                                        v12 = null;
                                                                                                        break block86;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v13) {
                                                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v13, (long)-8006409124885620318L, (long)var4_4);
                                                                                                    }
                                                                                                }
                                                                                                v14 = new Object[4];
                                                                                                v14[3] = var13_9;
                                                                                                v14[2] = var31_18;
                                                                                                v14[1] = (int)var45_34;
                                                                                                v14[0] = (int)((byte)var12_8);
                                                                                                v12 = ye.a("j", (Object)this, (Object)v14, (long)-8032503945856090381L, (long)var4_4);
                                                                                            }
                                                                                            var35_22 = v12;
                                                                                            try {
                                                                                                v15 = var30_27;
                                                                                                if (var4_4 <= 0L) break block87;
                                                                                                if (v15 != null) break block88;
lbl214:
                                                                                                // 2 sources

                                                                                                v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)10086, (long)(4864842252240133796L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                                v9 = var30_27;
                                                                                                ** GOTO lbl222
                                                                                            }
                                                                                            catch (IllegalArgumentException v16) {
                                                                                                throw (IllegalArgumentException)ye.a("G", (Object)v16, (long)-8006409124885620318L, (long)var4_4);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            v9 = var30_27;
lbl222:
                                                                                            // 3 sources

                                                                                            if (var4_4 <= 0L) ** GOTO lbl257
                                                                                            if (v9 == null) break block89;
                                                                                            if (v8 /* !! */  != false) {
                                                                                            }
                                                                                            ** GOTO lbl249
                                                                                        }
                                                                                        catch (IllegalArgumentException v17) {
                                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v17, (long)-8006409124885620318L, (long)var4_4);
                                                                                        }
                                                                                        v18 = new Object[3];
                                                                                        v18[2] = var31_18;
                                                                                        v18[1] = var8_6;
                                                                                        v18[0] = var2_3;
                                                                                        var36_23 = (String)ye.a("j", (Object)this, (Object)v18, (long)-7954538083799107629L, (long)var4_4);
                                                                                        try {
                                                                                            v15 = var30_27;
                                                                                            if (var4_4 <= 0L) break block87;
                                                                                            if (v15 != null) break block88;
lbl249:
                                                                                            // 2 sources

                                                                                            v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)19223, (long)(2437425760633483974L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                            v9 = var30_27;
                                                                                            ** GOTO lbl257
                                                                                        }
                                                                                        catch (IllegalArgumentException v19) {
                                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v19, (long)-8006409124885620318L, (long)var4_4);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v9 = var30_27;
lbl257:
                                                                                        // 3 sources

                                                                                        if (var4_4 < 0L) ** GOTO lbl279
                                                                                        if (v9 == null) break block90;
                                                                                        if (v8 /* !! */  != false) {
                                                                                        }
                                                                                        ** GOTO lbl271
                                                                                    }
                                                                                    catch (IllegalArgumentException v20) {
                                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v20, (long)-8006409124885620318L, (long)var4_4);
                                                                                    }
                                                                                    var32_19 /* !! */  = (CallSite)(var32_19 /* !! */  | 131072);
                                                                                    try {
                                                                                        v15 = var30_27;
                                                                                        if (var4_4 <= 0L) break block87;
                                                                                        if (v15 != null) break block88;
lbl271:
                                                                                        // 2 sources

                                                                                        v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)21837, (long)(5711247498340723852L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                        v9 = var30_27;
                                                                                        ** GOTO lbl279
                                                                                    }
                                                                                    catch (IllegalArgumentException v21) {
                                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v21, (long)-8006409124885620318L, (long)var4_4);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v9 = var30_27;
lbl279:
                                                                                    // 3 sources

                                                                                    if (var4_4 <= 0L) ** GOTO lbl301
                                                                                    if (v9 == null) break block91;
                                                                                    if (v8 /* !! */  != false) {
                                                                                    }
                                                                                    ** GOTO lbl293
                                                                                }
                                                                                catch (IllegalArgumentException v22) {
                                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v22, (long)-8006409124885620318L, (long)var4_4);
                                                                                }
                                                                                var32_19 /* !! */  = (CallSite)(var32_19 /* !! */  | 4096);
                                                                                try {
                                                                                    v15 = var30_27;
                                                                                    if (var4_4 < 0L) break block87;
                                                                                    if (v15 != null) break block88;
lbl293:
                                                                                    // 2 sources

                                                                                    v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)16080, (long)(648966853953947398L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                    v9 = var30_27;
                                                                                    ** GOTO lbl301
                                                                                }
                                                                                catch (IllegalArgumentException v23) {
                                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v23, (long)-8006409124885620318L, (long)var4_4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v9 = var30_27;
lbl301:
                                                                                // 3 sources

                                                                                if (var4_4 <= 0L) ** GOTO lbl323
                                                                                if (v9 == null) break block92;
                                                                                if (v8 /* !! */  != false) {
                                                                                }
                                                                                ** GOTO lbl315
                                                                            }
                                                                            catch (IllegalArgumentException v24) {
                                                                                throw (IllegalArgumentException)ye.a("G", (Object)v24, (long)-8006409124885620318L, (long)var4_4);
                                                                            }
                                                                            var37_24 = var2_3;
                                                                            try {
                                                                                v15 = var30_27;
                                                                                if (var4_4 < 0L) break block87;
                                                                                if (v15 != null) break block88;
lbl315:
                                                                                // 2 sources

                                                                                v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)28072, (long)(5280761431334737016L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                                v9 = var30_27;
                                                                                ** GOTO lbl323
                                                                            }
                                                                            catch (IllegalArgumentException v25) {
                                                                                throw (IllegalArgumentException)ye.a("G", (Object)v25, (long)-8006409124885620318L, (long)var4_4);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v9 = var30_27;
lbl323:
                                                                            // 3 sources

                                                                            if (var4_4 < 0L) ** GOTO lbl345
                                                                            if (v9 == null) break block93;
                                                                            if (v8 /* !! */  != false) {
                                                                            }
                                                                            ** GOTO lbl337
                                                                        }
                                                                        catch (IllegalArgumentException v26) {
                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v26, (long)-8006409124885620318L, (long)var4_4);
                                                                        }
                                                                        var39_26 = var2_3;
                                                                        try {
                                                                            v15 = var30_27;
                                                                            if (var4_4 < 0L) break block87;
                                                                            if (v15 != null) break block88;
lbl337:
                                                                            // 2 sources

                                                                            v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)25971, (long)(8247453726729985184L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                            v9 = var30_27;
                                                                            ** GOTO lbl345
                                                                        }
                                                                        catch (IllegalArgumentException v27) {
                                                                            throw (IllegalArgumentException)ye.a("G", (Object)v27, (long)-8006409124885620318L, (long)var4_4);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v9 = var30_27;
lbl345:
                                                                        // 3 sources

                                                                        if (var4_4 <= 0L) ** GOTO lbl367
                                                                        if (v9 == null) break block94;
                                                                        if (v8 /* !! */  != false) {
                                                                        }
                                                                        ** GOTO lbl359
                                                                    }
                                                                    catch (IllegalArgumentException v28) {
                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v28, (long)-8006409124885620318L, (long)var4_4);
                                                                    }
                                                                    var38_25 = var2_3;
                                                                    try {
                                                                        v15 = var30_27;
                                                                        if (var4_4 <= 0L) break block87;
                                                                        if (v15 != null) break block88;
lbl359:
                                                                        // 2 sources

                                                                        v8 /* !! */  = ye.a("j", (String)TQ.a("g", (int)6804, (long)(7987668495241290580L ^ var4_4)), (Object)var43_31, (long)-7853732615202739966L, (long)var4_4);
                                                                        v9 = var30_27;
                                                                        ** GOTO lbl367
                                                                    }
                                                                    catch (IllegalArgumentException v29) {
                                                                        throw (IllegalArgumentException)ye.a("G", (Object)v29, (long)-8006409124885620318L, (long)var4_4);
                                                                    }
                                                                }
                                                                try {
                                                                    v9 = var30_27;
lbl367:
                                                                    // 3 sources

                                                                    if (v9 == null) break block95;
                                                                    if (v8 /* !! */  == false) break block96;
                                                                }
                                                                catch (IllegalArgumentException v30) {
                                                                    throw (IllegalArgumentException)ye.a("G", (Object)v30, (long)-8006409124885620318L, (long)var4_4);
                                                                }
                                                                v8 /* !! */  = (CallSite)var2_3;
                                                            }
                                                            var40_28 /* !! */  = (int)v8 /* !! */ ;
                                                            v15 = var30_27;
                                                            if (var4_4 <= 0L) break block87;
                                                            if (v15 != null) break block88;
                                                        }
                                                        v31 = new Object[5];
                                                        v31[4] = (int)var44_32;
                                                        v31[3] = var22_14;
                                                        v31[2] = var2_3;
                                                        v31[1] = var43_31;
                                                        v31[0] = (NL[])ye.a("\u00c3", (Object)this /* !! */ , (long)-8065271681444625179L, (long)var4_4);
                                                        var45_35 = (NL)ye.a("j", (Object)this, (Object)v31, (long)-8024985299643029446L, (long)var4_4);
                                                        ye.a("F", (Object)var45_35, var41_29, (long)-8039913138503578360L, (long)var4_4);
                                                        var41_29 = var45_35;
                                                    }
                                                    var2_3 += var44_32;
                                                    v15 = var30_27;
                                                }
                                                if (v15 != null) continue;
                                                break;
                                            }
                                            v32 = new Object[6];
                                            v32[5] = var35_22;
                                            v32[4] = var36_23;
                                            v32[3] = var26_16;
                                            v32[2] = var34_21;
                                            v32[1] = var33_20;
                                            v32[0] = (int)var32_19 /* !! */ ;
                                            var43_31 = (Ni)ye.a("j", (Object)var3_2, (Object)v32, (long)-8040193711869758921L, (long)var4_4);
                                            try {
                                                if (var43_31 == null) {
                                                    return var2_3;
                                                }
                                            }
                                            catch (IllegalArgumentException v33) {
                                                throw (IllegalArgumentException)ye.a("G", (Object)v33, (long)-8006409124885620318L, (long)var4_4);
                                            }
                                            try {
                                                v34 /* !! */  = var37_24;
                                                v35 = var30_27;
                                                if (var4_4 > 0L) {
                                                    if (v35 == null) break block97;
                                                    if (v34 /* !! */  == 0) break block98;
                                                }
                                                ** GOTO lbl539
                                            }
                                            catch (IllegalArgumentException v36) {
                                                throw (IllegalArgumentException)ye.a("G", (Object)v36, (long)-8006409124885620318L, (long)var4_4);
                                            }
                                            v37 = new Object[2];
                                            v37[1] = var18_12;
                                            v37[0] = var37_24;
                                            var44_32 = ye.a("j", (Object)this, (Object)v37, (long)-7851256683743663151L, (long)var4_4);
                                            var45_36 /* !! */  = var37_24 + 2;
                                            block54: while (var44_32-- > 0) {
                                                v38 = new Object[3];
                                                v38[2] = var31_18;
                                                v38[1] = var8_6;
                                                v38[0] = var45_36 /* !! */ ;
                                                var3_2 = (String)ye.a("j", (Object)this, (Object)v38, (long)-7954538083799107629L, (long)var4_4);
                                                v39 = new Object[3];
                                                v39[2] = true;
                                                v39[1] = var3_2;
                                                v39[0] = var24_15;
                                                v40 = new Object[5];
                                                v40[4] = var31_18;
                                                v40[3] = true;
                                                v40[2] = var45_36 /* !! */  += 2;
                                                v40[1] = var28_17;
                                                v40[0] = (X7)ye.a("j", (Object)var43_31, (Object)v39, (long)-7850956737369763889L, (long)var4_4);
                                                var45_36 /* !! */  = (int)ye.a("j", (Object)this, (Object)v40, (long)-7848026515767535837L, (long)var4_4);
                                                try {
                                                    do {
                                                        v41 = var30_27;
                                                        if (var4_4 > 0L) {
                                                            if (v41 == null) break block99;
                                                            v41 = var30_27;
                                                        }
                                                        if (v41 != null) continue block54;
                                                    } while (var4_4 < 0L);
                                                    v34 /* !! */  = var38_25;
                                                    break block97;
                                                }
                                                catch (IllegalArgumentException v42) {
                                                    throw (IllegalArgumentException)ye.a("G", (Object)v42, (long)-8006409124885620318L, (long)var4_4);
                                                }
                                            }
                                        }
                                        v34 /* !! */  = var38_25;
                                    }
                                    try {
                                        v35 = var30_27;
lbl539:
                                        // 2 sources

                                        if (var4_4 >= 0L) {
                                            if (v35 == null) break block100;
                                            if (v34 /* !! */  == 0) break block99;
                                        }
                                        ** GOTO lbl635
                                    }
                                    catch (IllegalArgumentException v43) {
                                        throw (IllegalArgumentException)ye.a("G", (Object)v43, (long)-8006409124885620318L, (long)var4_4);
                                    }
                                    v44 = new Object[2];
                                    v44[1] = var18_12;
                                    v44[0] = var38_25;
                                    var44_32 = ye.a("j", (Object)this, (Object)v44, (long)-7851256683743663151L, (long)var4_4);
                                    var45_37 /* !! */  = var38_25 + 2;
                                    block56: while (var44_32-- > 0) {
                                        v45 = new Object[3];
                                        v45[2] = var31_18;
                                        v45[1] = var8_6;
                                        v45[0] = var45_37 /* !! */ ;
                                        var3_2 = (String)ye.a("j", (Object)this, (Object)v45, (long)-7954538083799107629L, (long)var4_4);
                                        v46 = new Object[3];
                                        v46[2] = false;
                                        v46[1] = var3_2;
                                        v46[0] = var24_15;
                                        v47 = new Object[5];
                                        v47[4] = var31_18;
                                        v47[3] = true;
                                        v47[2] = var45_37 /* !! */  += 2;
                                        v47[1] = var28_17;
                                        v47[0] = (X7)ye.a("j", (Object)var43_31, (Object)v46, (long)-7850956737369763889L, (long)var4_4);
                                        var45_37 /* !! */  = (int)ye.a("j", (Object)this, (Object)v47, (long)-7848026515767535837L, (long)var4_4);
                                        try {
                                            do {
                                                v48 = var30_27;
                                                if (var4_4 >= 0L) {
                                                    if (v48 == null) break block101;
                                                    v48 = var30_27;
                                                }
                                                if (v48 != null) continue block56;
                                            } while (var4_4 <= 0L);
                                            v34 /* !! */  = var39_26;
                                            break block100;
                                        }
                                        catch (IllegalArgumentException v49) {
                                            throw (IllegalArgumentException)ye.a("G", (Object)v49, (long)-8006409124885620318L, (long)var4_4);
                                        }
                                    }
                                }
                                v34 /* !! */  = var39_26;
                            }
                            try {
                                v35 = var30_27;
lbl635:
                                // 2 sources

                                if (var4_4 >= 0L) {
                                    if (v35 == null) break block102;
                                    if (v34 /* !! */  == 0) break block101;
                                }
                                ** GOTO lbl757
                            }
                            catch (IllegalArgumentException v50) {
                                throw (IllegalArgumentException)ye.a("G", (Object)v50, (long)-8006409124885620318L, (long)var4_4);
                            }
                            v51 = new Object[2];
                            v51[1] = var18_12;
                            v51[0] = var39_26;
                            var44_32 = ye.a("j", (Object)this, (Object)v51, (long)-7851256683743663151L, (long)var4_4);
                            var45_38 /* !! */  = var39_26 + 2;
                            block58: while (var44_32-- > 0) {
                                v52 = new Object[4];
                                v52[3] = var45_38 /* !! */ ;
                                v52[2] = var16_11;
                                v52[1] = var15_10;
                                v52[0] = this /* !! */ ;
                                var45_38 /* !! */  = (int)ye.a("j", (Object)this, (Object)v52, (long)-8008784660257221325L, (long)var4_4);
                                v53 = new Object[3];
                                v53[2] = var31_18;
                                v53[1] = var8_6;
                                v53[0] = var45_38 /* !! */ ;
                                var3_2 = (String)ye.a("j", (Object)this, (Object)v53, (long)-7954538083799107629L, (long)var4_4);
                                v54 = new Object[5];
                                v54[4] = var6_5;
                                v54[3] = true;
                                v54[2] = var3_2;
                                v54[1] = (EK)ye.a("\u00c3", (Object)this /* !! */ , (long)-8066837549458289683L, (long)var4_4);
                                v54[0] = (int)ye.a("\u00c3", (Object)this /* !! */ , (long)-7937303704682230478L, (long)var4_4);
                                v55 = new Object[5];
                                v55[4] = var31_18;
                                v55[3] = true;
                                v55[2] = var45_38 /* !! */  += 2;
                                v55[1] = var28_17;
                                v55[0] = (X7)ye.a("j", (Object)var43_31, (Object)v54, (long)-7927312592421740868L, (long)var4_4);
                                var45_38 /* !! */  = (int)ye.a("j", (Object)this, (Object)v55, (long)-7848026515767535837L, (long)var4_4);
                                try {
                                    do {
                                        v56 = var30_27;
                                        if (var4_4 >= 0L) {
                                            if (v56 == null) break block103;
                                            v56 = var30_27;
                                        }
                                        if (v56 != null) continue block58;
                                    } while (var4_4 < 0L);
                                    v34 /* !! */  = var40_28 /* !! */ ;
                                    break block102;
                                }
                                catch (IllegalArgumentException v57) {
                                    throw (IllegalArgumentException)ye.a("G", (Object)v57, (long)-8006409124885620318L, (long)var4_4);
                                }
                            }
                        }
                        v34 /* !! */  = var40_28 /* !! */ ;
                    }
                    try {
                        try {
                            v35 = var30_27;
lbl757:
                            // 2 sources

                            if (v35 == null) break block104;
                            if (v34 /* !! */  == 0) break block103;
                            v58 = this;
                        }
                        catch (IllegalArgumentException v59) {
                            throw (IllegalArgumentException)ye.a("G", (Object)v59, (long)-8006409124885620318L, (long)var4_4);
                        }
                        v60 = new Object[2];
                        v60[1] = var18_12;
                        v60[0] = var40_28 /* !! */ ;
                        v34 /* !! */  = (int)ye.a("j", (Object)v58, (Object)v60, (long)-7851256683743663151L, (long)var4_4);
                    }
                    catch (IllegalArgumentException v61) {
                        throw (IllegalArgumentException)ye.a("G", (Object)v61, (long)-8006409124885620318L, (long)var4_4);
                    }
                }
                var44_32 = (reference)v34 /* !! */ ;
                var45_39 /* !! */  = var40_28 /* !! */  + 2;
                block60: while (var44_32-- > 0) {
                    v62 = new Object[4];
                    v62[3] = var45_39 /* !! */ ;
                    v62[2] = var16_11;
                    v62[1] = var15_10;
                    v62[0] = this /* !! */ ;
                    var45_39 /* !! */  = (int)ye.a("j", (Object)this, (Object)v62, (long)-8008784660257221325L, (long)var4_4);
                    v63 = new Object[3];
                    v63[2] = var31_18;
                    v63[1] = var8_6;
                    v63[0] = var45_39 /* !! */ ;
                    var3_2 = (String)ye.a("j", (Object)this, (Object)v63, (long)-7954538083799107629L, (long)var4_4);
                    v64 = new Object[5];
                    v64[4] = var6_5;
                    v64[3] = false;
                    v64[2] = var3_2;
                    v64[1] = (EK)ye.a("\u00c3", (Object)this /* !! */ , (long)-8066837549458289683L, (long)var4_4);
                    v64[0] = (int)ye.a("\u00c3", (Object)this /* !! */ , (long)-7937303704682230478L, (long)var4_4);
                    v65 = new Object[5];
                    v65[4] = var31_18;
                    v65[3] = true;
                    v65[2] = var45_39 /* !! */  += 2;
                    v65[1] = var28_17;
                    v65[0] = (X7)ye.a("j", (Object)var43_31, (Object)v64, (long)-7927312592421740868L, (long)var4_4);
                    v66 /* !! */  = (int)ye.a("j", (Object)this, (Object)v65, (long)-7848026515767535837L, (long)var4_4);
                    if (var4_4 <= 0L) return v66 /* !! */ ;
                    var45_39 /* !! */  = v66 /* !! */ ;
                    try {
                        while (var30_27 != null) {
                            if (var30_27 != null) continue block60;
                            if (var4_4 < 0L) continue;
                            v67 = var41_29;
                            ** GOTO lbl879
                        }
                        break block105;
                    }
                    catch (IllegalArgumentException v68) {
                        throw (IllegalArgumentException)ye.a("G", (Object)v68, (long)-8006409124885620318L, (long)var4_4);
                    }
                }
            }
            do {
                v69 = var41_29;
lbl879:
                // 2 sources

                if (var4_4 >= 0L) {
                    if (v67 == null) break;
                    v67 = (NL)ye.a("\u00c3", var41_29, (long)-8039913138503578360L, (long)var4_4);
                }
                var44_33 = v67;
                ye.a("F", var41_29, null, (long)-8039913138503578360L, (long)var4_4);
                v70 = new Object[2];
                v70[1] = var10_7;
                v70[0] = var41_29;
                ye.a("j", (Object)var43_31, (Object)v70, (long)-8048715492193585407L, (long)var4_4);
                var41_29 = var44_33;
            } while (var30_27 != null);
        }
        v66 /* !! */  = var2_3;
        return v66 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ String N(Object[] this) {
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        TQ.a = wu.a(8753528531685229210L, -2300898185808263591L, MethodHandles.lookup().lookupClass()).a(222800271767505L);
        TQ.e = new HashMap<K, V>(13);
        var0 = TQ.a ^ 132168140204692L;
        var2_1 = Cipher.getInstance(X7.C("M\u001a_u\"u}Ga,w1\u00065U\u0006M\u0016\rR"));
        v0 = SecretKeyFactory.getInstance(N8.C("ZX\u0007"));
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
        var7_3 = new String[29];
        var5_4 = 0;
        var4_5 = X7.C("u\u00a44\u00bcZ\u00ec\u00f2\u00af|\u00d9\u0080v\u00df\u00dbk\u00ac\u00b5zJ\b\u00c6\u009d\u00fe\u00ab\u0019\u0088\u0089e\u00fa\u00d2KU\u00b6\u001a\u00e8i\u00e6_\u00f7\u00cb+\u00850\u0003\\\u0082\u00a9s\u007f\u00de\u001d\u00fbeL\u00c6\u00d30!\u0089\u00f1\u0003O\u00d9\u0097\u0018\u00b0\u0093\u00a2\u00ed+\u00e7\u0099 Pa\u00c9\u0085\u00fbE\"\u00d7^\u0017l\u00e3\u00f8\u00fd\u00cfc\u0088pt\u00da\u0090\u00ae%\u0099E\u00f3\u0003-\u0084X3V/\f\u008a\u00c0\u0001f\u00e7Vs\u00f6\u0003\u0094\u0017\u0011\u00ce\u00a0\u00db>\u00c5\u00d1q\u00b7%\u00e4\u00bf\u0011\u009dD\u00b2W\u00bf\u00ff\u000e\u00f9^\b\f\u0013\u00c1l\u00c1?X&\u00a4PP\n,\u00da\u0004\u00b1\u00eaGm\u00ecV*~\u00ba\u00a0&\u00df\u00f9\u00c7\u00a4C\u0010=\f\u00b4\u00cd\u00fba_\u0016`\u00f9X5\u00e7\u00cd\u0094WT$\u0005\u008bS\u00f0Y\u007f\u00c6\u00b8_\u0000\u008cJ\u00a2\u0004D\u008d\u0080\u00b5\u00bf\u00f8kKn\u00ab\u00d3M\u0016r\u00c7GXm\u00ca<_\u00aeh\u0099\u00fd\u00fc\u00f7c\u001c^V\u0003\u0003\u0019;\u00e5v\u00fe\u00bat\u00b5\u00f7\u00fc\u00a9\u00e7\u00dfUB\u00eedO\u0016\u00f8\u0019g\u00c9\u00c3\u00f3p\u0003\u00e6\u001b9\u00caL{\u00e3M\u00be\u0086\u00a1\u00df]\t\u0010\u00b8\u00dc\u00b5\u00cdvBe\u0006\u00bb\u00bb0$\u00e1-X[\u0089\u00daG\u00e9\u00c3uC1m\u00ca\u00f8t\u00de\n\u00b6\u00a2\u00fa\\\u00adu\u00a7\u00c1w\u00e2\u00b9=@Y\u00a6\u00fd\u00e9\u00980\u00e4/\u00d6f\u0099\b\u00c6\u00ca/\u0093\u00e5\u000f\u0087\u00edZ\u00a1\u00c7]x`\u00c1\u00e10]\u0093\u00fa\u00e3\u00cd\u008fM>\u008f;\u00b3\u0006\u00c4\u00966Y\u0092\u00d8\u00ac\u000e\u008b\u0097\r<\t\u00c6Ck\u00b4\u0087\u00f0\u00bd\u0013\u008e\u00fa\u00ee\u0082\u008c\u00a5\u00b8\u00cd\u0000\u00b37\u008b\u00f5C\u0096\u0018\u00fd\u0006\u009f6\u00abX\u00ad\u00a5\u00df\u00ea9\u00e4x\u00ca\u0017\u0094O\u0013\u00f0\u00a8\u0002\u00a9fx\u001f\u00fc4j\u0003\u00ea&\u008bA\u0003V\u0088\u00ef\u0001\u00dd\u0095##\u0014n\u008e)\u00f0Jcm\u00f1\u00cch]\u00ddXD\u0016\u0011Wbo\u008e#\u00c0X\u00c6R\u00de\u00a2p\u00e3^de\u00cc#\u0090\u00fb\u000b`\u00c2\u00b3\u00880\u009a\u000e\u00df\u00fc\u0004\u0015\u0098j\u0089\u0010\u00b2w0\tXV\u00e6\u00819\u00fat\u0006KN\u00adN\u00a35\u00a5\u009e\u0096\u0084\u00e9\u0089\u009f\u00e4\u0011\u0094$\u00bc\u00d6)\u0090Z\b\u00c1\u00ac\u009d\u0014\u00a4\u00a2\u0011Oux\u0013\u0097I\u00d4\u0015\u00ca\u0098\u00c8\u00a1\u00e0\r\u00197\u0088!\u00fb\u00be\t\u00d0\u0013\u00a0$\u00ec\u0014)\u00e4#!\u00e0+@\u007fD\ts\u00e0e+\f\u009b\u00c1\u00ac\\b\u00dc{C\u00ab\u0087\u008e\u00aa\u00f1H\u0085T]]\u00b8\u0005WM}\u0087L`\u00fc\u001f\u008dE%\u00d2|\u00ab\u00af\u00bcQ)9\u009edt\u00b8\u00a0I\u00e4\u008d\u0088\u00d5\u00b2\u0011n\u009eX\u00d5d\u00cc\u0011 v\u0003\u0084\u00b2H\u0005\u00d4\u00f9wJ`\u00e7\u00a5\u008a\u00b7\u000f\t\u00a1\u00e1\u00ab\u0012\u00c5\u0019\u0002K\u00f5\u00bc\u00fb\u00fc\u008d\u001c\u00bf\u00eep\u00b5\u00fe\u00c6\u0082\u00065\u00cb*\u00a1<\u0005\u00a3U E\u00e2P|\u009a\u00dd\u009a\u009fiH\u00b7iJK\u00e4\u00db\u00e0\u00fc\u00b3\u008b>\u00a9v\u00d6C\u00df\u009eq\u00d1\u00c7~\u0004\u00b7\u00fd\u0003\u000e\u00013\u00a0D27\u00a3\u008e1m}j\u00e8c\u00f0\u00dcj\u000e\u00e7=QJ\u0001\u009b#Vy\u00c9\u00a9P%Z\u00dd\u00c8\u00b2\u00d9\u00fc\u0018\u00d9\u00eb\u00e5\u0093\u00ddI\u009d\u008c\u00e4,\u00ca\u009a\u00aeR`\u00dd\u00828<\u00ec\u00ad\u008c\f.o\u00f2|\u00c0\u0088#F\u00ecn\u00e4\u00fb\u00d1\u00cb\u00ee\u00b9=d\u0096\u0083\u00f3\u00f88V-:\u00da\u00ce\u009fd\u0013\u0091\u00c6K#P\u00d6\u0096\u00caj\u00f8\u00eauBe\u00d0\u00cf\u001d\u00f8\u00b1q-\u00d0H\u00d34\u00b89&\u00ed\u00b6\u00a92\u00ef\u00fdj \u00ca\u00a9\u00cb\u0002\u00be`\u0099VW\u0003%\u00b1\u00bfAE\u00da\u00f1S0?N\u00001V\u00fa4\u00c5\u0096e\u00eaZ\u000f\u0015\u00d8O\u00fb\u00e8\u00ca\u0095\u00a4\f4\u0000\u00b4\u00bd\u00c4\u00859\u0089\u001b\u0094\u00e0L\u0007,TG\u00b0\u001a\u00f4\u00de}h\u0004fK\u00ee\u00c0\u0091y\u0006\u00ec:,\u00b1SF\u00f6?\u009b\u0080\u0092\u00b8\"\n>l\u00b0\u009acWr'M\u00c2=\u0014\u00ac\u0000\u00dc\u00dcf|A\u00c3\u00e8Z\u009a\u0088G\u00de\u00fa\u00dd\u009d\u008c\f\u0005\u0080\u000e\u0099\u008a\u00bd{\u0083\u00ef\u00db\u00a0\u0018\u001c\u007f\u00d4#\u00d1T\u0084S\u00e0\u00f1\u0016{\u00d7\u00bbH\u00d0=\u00e6#\u00be\u007fG\u00a0\u0019a\u0088\u001c\u00c9\u0015H\u00b46\u00a6\u001ea\u0093(n\u00d7\u008b-4\u00b8\u001d\u00e6G\u00ec\u00c1Q\"0\u00c5\u00d5\u00d0Y\u00ec\u0005\u0087\u00aa\u0094\u00bb\u009c\u00f1\u0091{\u00bcZ\u00c6\u00b0\u0082\u00eb\u00c7\u0085\u00ee\u00bfY\u0091\u001br[\u009c\u00d5\u0083l\u00a5\u00f1\u001a~\u0000R\u00e0\u009cWn\u0013N\u00d1\u0006\u00be\u00c3)v#\u0080qN\u00f2\u00f0S\u00a4_\u000bu:o\u00142\u00dd@\t\u00cc&\u000e\u0081\u00da}\u00f2R\u0010!\u0019\u00cbT\u00caV\u00c5Aq\u00fd\u000b\u00ad\u00b3s");
        var6_6 = var4_5.length();
        var1_7 = 24;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = N8.C("^\u0001o\u0019=f\u0084\u00a1\u00e8l\u00ab\u00c8}\u00cb\u00f7!1\fd\u0099\u00df\u00fexr\u0006\u00a2\u00b3\u00cd\u0082\u00fc\u00e6\u00e5\u00f6rLyYS\u00b5WuI\u008f\u0088\u00af_\u000b\f\u0017\u00b2\u00b0\u0096S\u00c6\u0085\u00e3\u00182\u00deD\u008e\u00a5\u009co\u009f\u008fH#\u00b4\u00b5\u0017+0");
                var6_6 = var4_5.length();
                var1_7 = 48;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = TQ.a(var2_1.doFinal(v6.getBytes(X7.C("}1|H\fZ\u001cFN\u0004")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = TQ.a(var2_1.doFinal(v6.getBytes(X7.C("}1|H\fZ\u001cFN\u0004")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        TQ.b = var7_3;
                        TQ.d = new String[29];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
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

    private /* synthetic */ int N(Object[] arrobject2) {
        long l2 = (Long)arrobject2[0];
        int arrobject2 = (Integer)arrobject2[1];
        l2 = a ^ l2;
        return ye.a("\u00c3", (Object)this, (long)-4529067771820818631L, (long)l2)[arrobject2] & 0xFF;
    }

    public final /* synthetic */ int M(Object[] arrobject2) {
        int arrobject2 = (Integer)arrobject2[0];
        long l2 = (Long)arrobject2[1];
        l2 = a ^ l2;
        CallSite callSite = ye.a("\u00c3", (Object)this, (long)4506304227354853525L, (long)l2);
        return (callSite[arrobject2] & 0xFF) << 8 | callSite[arrobject2 + 1] & 0xFF;
    }
}

