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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NC;
import net.futureclient.installer.X7;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class Nq {
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ TimeZone J;
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ long a;

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
        Nq.a = wu.a(9104136857245790084L, 8061535981174475925L, MethodHandles.lookup().lookupClass()).a(247054018972490L);
        var7 = Nq.a ^ 35238946547431L;
        Nq.d = new HashMap<K, V>(13);
        var0_1 = Cipher.getInstance(NC.C("p\u000fXZ\u0005zZHF#P>!:r\tj\u0019*]"));
        v0 = SecretKeyFactory.getInstance(X7.C(";&f"));
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
        var6_3 = new String[13];
        var4_4 = 0;
        var3_5 = NC.C("\u00b0|\u000e\u0017\u0098\u00e4\u0084\u00ac\u009f\u00bc\u00c1t,\u0006\u00bc/q\u001a\u00fdY\u00d6\u00eb\u0012k\u00e5\u0002\t\u0015\u00b0'D\u008e*N\u00c9W\u00b2I\u00d2w$llO~f\u00ccF\u001f\u0001\u0000v\u000eh\u00b5t\u00be\u0092\u0082\u0016g\u00d5\u0016\u009a7\u00df\u00f8\u007fWzc\u00ec\u0003\u00b7+\u00c5\u00cc\t\u00b9&8\u0086`\u0090\u00a3w\u00a3\u0084\u00c6\u00c8A)b\u00965\u00ad\u00f7\u00c4E@\u0094\u0081\u00c99`AfA\u00ff?(\u00fe\u00ab\u00b9\u00b7\u0010E\u00a7\\D\nM\u00fc\u000b+yC\u0002\u00888\u0007\u0088\u0081\u0089\u0080~\u0010HA\u0080\u00db\u008an\u00dc\u00f1\u00cbf\u00bcR\u00f2\b}\u008b\u00ce\u0003\u0083\u00b9x:lwM\u0005\u00d1g\u00dfq\u0087\u0089\u0092`:[g\u00948v\u00fc\u00ee?\u00fc\u00cb\u00027\u0002\u0003X~\u0003\u00ae\u00baJ\u00cc\u00b1\u0083\u00fc\u00f1GZ\u00d4\u0092\u0013x|XX\u00ae\u008a!3\u00a5FJs\u0010@\u00ff\t\u00b22\u00f3\u00ca\u00cfT4\u0004\u0082\u00a22\u0098\u00e0>\u00ae\u0010\u0080$Ec\u00a2\u00e6\u00bbT\u00baZ\u00a7\u00dd4\u00ae\u00fe\u000e\u00822\u0013\u0000\u00a9\u00a2f\u008d!|\u0083\u00b5\u0081W\f\u0085\u00af\u00da\u0085$t2\u009c\u0099\u009b\u00f1\u00c0Q\u009cf\u00db\u00f9\u00e0$\u0092\u001b(I\u00f4\u00b8M|m\u00b0)\u00ebs\u00acY\r\u00dd\u009d\u00b4\u00f8^\u00f7\u001b\u0018^\u0088\u00d7`g\u00f4\u008b\u00ef\u00a5\u0084\u00f7V\u00c0\u009fa\u00104\u00c7\u00ba\u0003\u0018L\u00c5d\u00e4\u0097\u009e\u00a0\u00d4\u00c6\u00b9k\u00c6z\u001e2\u00d4\u0002\u0085Z\u009dO\u00feY\u00bb\u0095\u0090\u00af\u0004\u00d1\u0013+\u00da\u00ea\u008f\u00a1)\u00ec\u0090eW\u00c2\u00e7\u00bb\u00fe\u00ac\u00b7\u0095\u0000\u00b0\u00a6\u008b/q\u0091\u00e4\u0092\u00ea");
        var5_6 = var3_5.length();
        var2_7 = 64;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var3_5 = X7.C("\u00b8\u0005\u00ca\u00c6\u0093\u0081\u00c6\u0097\u008e/\u00f3\u00ec\u00c4e\u00ecYj\u0004\u00aa\u00b0\u00ab\u00ef\u00acZ\u00fe\u0085XI~S\u00adz}");
                var5_6 = var3_5.length();
                var2_7 = 16;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = Nq.a(var0_1.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = Nq.a(var0_1.doFinal(v6.getBytes(NC.C("Z>[G+U;Ii\u000b")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        Nq.b = var6_3;
                        Nq.c = new String[13];
                        Nq.J = (TimeZone)ye.a("G", (String)Nq.a("l", (int)29731, (long)(3609318760949855384L ^ var7)), (long)-6931263136873466426L, (long)var7);
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
    private static /* synthetic */ int J(Object[] this) {
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

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x5C33;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(X7.C("m:oEr%rHh%l*Fur!H\u0013R\r"));
                    arrobject[1] = SecretKeyFactory.getInstance(NC.C("1^6"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(X7.C("\u0011\u0016Q\u001b\u0004F\u0011[\nL\u001cP\u0003T\tEHQ\u0000\\\r\u0012I\u007f ^Ur\u001b"), exception);
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
            byte[] arrby2 = b[n2].getBytes(NC.C("A%\u001b\u0007\fr>L6T"));
            Nq.c[n2] = Nq.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ int R(Object[] this) {
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = Nq.a(this222, l2);
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

    /*
     * Exception decompiling
     */
    public static /* synthetic */ Date O(Object[] this) {
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
    private static /* synthetic */ boolean K(Object[] this) {
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

