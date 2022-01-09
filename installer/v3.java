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
import net.futureclient.installer.NN;
import net.futureclient.installer.TW;
import net.futureclient.installer.vA;
import net.futureclient.installer.wu;

public final class v3
extends vA {
    private static final /* synthetic */ String[] a;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map c;

    /*
     * Exception decompiling
     */
    private static /* synthetic */ CallSite a(MethodHandles.Lookup this, String this, MethodType this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Expecting a ConstantPoolEntryLiteral or ConstantPoolEntryDynamicInfo
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackType(OperationFactoryLDC.java:37)
         * org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackDelta(OperationFactoryLDC.java:18)
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
        v3.c = new HashMap<K, V>(13);
        var0 = wu.a(-4974458743786155825L, 785710791361225095L, MethodHandles.lookup().lookupClass()).a(193575305086229L) ^ 139379949563322L;
        var2_1 = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOG\u001a\bQ"));
        v0 = SecretKeyFactory.getInstance(NN.C("Mk\u0010"));
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
        var7_3 = new String[12];
        var5_4 = 0;
        var4_5 = TW.C("\u00c9#\u00cc\u00ee:\u00b9 \u00d0\u00af\u00afns\u0089\u00a6^6a\u00fau\u00fe\u00d4\u00f0\u0083\u0019\u00d5\u001c\u0014\u00d5tY\b~3)\u00d2j\u00e1{\u00d7t\u0096H!'k\u00b0\u00a6\u008f>\u0081Vl?\u007f\u008f\u00b8\u0018\u00bc\u00ea\u00ed\u00187\u00de\u00a7\u00d5,l\u00e5\u00fcO\u009f\u00b8\u00c8\u00d4M\u008a\u00dd\u0093eY\u0081}\u00e4{\u0088\u0012P#@\u0095\u00f8\u00e1\u001e/\u00f2\u0092\u00910/\u00ae`\u00d2\u00c6\u00de\u00db\u00f5R\u00a0D\u00f7\u00f8\u0001\u0081\u00bc]Q\u00b4[\u00d2\u00c6\u00f1MuP1\u00c2\u00b7\u00a8r\u00f5C7&$\u00fb\u0084\u00c43FU[\u00bctp\u00cd\u00f4\u00b4?\u00b2\u00ab|\u00f0\u00a6\u00af\u00f6\u00e1\u0083,\u0082\u00a4\u0011MtW}\u00d3C\u0013\u008a\u00d7\u00c4\n\u00df\u0093\u00fd\u00fb\u00c9\u0000\u00ca\u0082\u00d0\u00aai\u0014\\\bA\u00a7\u0091\u00ff\u0094\u0082\u0097\u00d8\u000b\u00e6\n\u00e0\u00aeWa\u00e5D\u00f6nl\u00fd\u00d0#?2\n\u0010j\u00ad_0");
        var6_6 = var4_5.length();
        var1_7 = 16;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl73
            {
                var4_5 = NN.C("\u0013\u00893h\u0013\u00f5\u00a0V\u0015\u009bH\u00025z\u009b\"\u0000\u00f8\u00d5\u00ea_W\u0086\u00a4\u00f4\u00a2\rp>r\u00ed\u00abL0\u0087+q\u00d3\u0084\u00c4\u0090");
                var6_6 = var4_5.length();
                var1_7 = 16;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl73:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = v3.a(var2_1.doFinal(v6.getBytes(TW.C("y3hZC\u0013\u0016JK\u0007")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = v3.a(var2_1.doFinal(v6.getBytes(TW.C("y3hZC\u0013\u0016JK\u0007")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        v3.a = var7_3;
                        v3.b = new String[12];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = v3.a(this222, l2);
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
    @Override
    public final /* synthetic */ void Z(Object[] this) {
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
    @Override
    public final /* synthetic */ Object i(Object[] this) {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x6856;
        if (b[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])c.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(NN.C(" L\"3?S?>%S!\\\u000b\u0003\u0007oG'\u001f{"));
                    arrobject[1] = SecretKeyFactory.getInstance(TW.C("7#e"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    c.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(NN.C("g['Vr\u000bg\u0016|\u0001j\u001du\u0019\u007f\b>\u001cv\u0011{_?\nnQa\u0007/"), exception);
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
            byte[] arrby2 = a[n2].getBytes(TW.C("y3hZC\u0013\u0016JK\u0007"));
            v3.b[n2] = v3.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return b[n2];
    }
}

