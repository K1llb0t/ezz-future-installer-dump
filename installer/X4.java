/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NH;
import net.futureclient.installer.XU;
import net.futureclient.installer.pI;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class X4 {
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ String[] c;

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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x5A76;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(NH.C("hij\u0016wvw\u001bmviyC&ad\b\u0005W^"));
                    arrobject[1] = SecretKeyFactory.getInstance(XU.C("G}\u0005"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(NH.C("B\u0013\u0002\u001eWCB^YIOUPQZ@\u001bTSY^\u0017\u001ale\u001eCa\r"), exception);
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
            byte[] arrby2 = b[n2].getBytes(XU.C("b\u0016849WX:\u0015g"));
            X4.c[n2] = X4.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ Path Z(Object[] this) {
        var1_1 = (Long)this[0];
        var1_1 = X4.a ^ var1_1;
        var3_2 = var1_1 ^ 18672860208076L;
        var6_4 = (String)ye.a("G", (String)X4.a("p", (int)3992, (long)(1609127558975844771L ^ var1_1)), (Object)NH.C(","), (long)-6496258097248376314L, (long)var1_1);
        var5_5 = ye.a("G", (long)-6390539771564275149L, (long)var1_1);
        v0 = new Object[1];
        v0[0] = var3_2;
        switch (ye.a("Z", (long)-6399194041120402167L, (long)var1_1)[ye.a("j", (Object)((pI)ye.a("G", (Object)v0, (long)-6450547719971018358L, (long)var1_1)), (long)-6513583315694618577L, (long)var1_1)]) {
            case 1: 
            case 2: {
                v1 = new String[1];
                v1[0] = (String)X4.a("p", (int)4010, (long)(1497945842933592478L ^ var1_1));
                return (Path)ye.a("G", var6_4, (Object)v1, (long)-6456720650631232188L, (long)var1_1);
            }
            case 3: {
                v2 = var3_3 = (String)ye.a("G", (String)X4.a("p", (int)18841, (long)(3102167989521168300L ^ var1_1)), (long)-6464266592408574112L, (long)var1_1);
                try {
                    if (var5_5 == null) ** GOTO lbl58
                    if (v2 == null) {
                    }
                    ** GOTO lbl55
                }
                catch (RuntimeException v3) {
                    throw (RuntimeException)ye.a("G", (Object)v3, (long)-6512122998659207919L, (long)var1_1);
                }
            }
            v4 = new String[1];
            v4[0] = (String)X4.a("p", (int)32413, (long)(505204210037260450L ^ var1_1));
            return (Path)ye.a("G", var6_4, (Object)v4, (long)-6456720650631232188L, (long)var1_1);
lbl55:
            // 1 sources

            v2 = var3_3;
lbl58:
            // 2 sources

            v5 = new String[1];
            v5[0] = (String)X4.a("p", (int)32413, (long)(505204210037260450L ^ var1_1));
            return (Path)ye.a("G", v2, (Object)v5, (long)-6456720650631232188L, (long)var1_1);
            case 4: {
                v6 = new String[3];
                v6[0] = (String)X4.a("p", (int)1363, (long)(5770286871423384430L ^ var1_1));
                v6[1] = (String)X4.a("p", (int)9713, (long)(882667686272424905L ^ var1_1));
                v6[2] = (String)X4.a("p", (int)22106, (long)(1684487969646815337L ^ var1_1));
                return (Path)ye.a("G", var6_4, (Object)v6, (long)-6456720650631232188L, (long)var1_1);
            }
        }
        v7 = new String[1];
        v7[0] = (String)X4.a("p", (int)5303, (long)(5996696382345374345L ^ var1_1));
        return (Path)ye.a("G", var6_4, (Object)v7, (long)-6456720650631232188L, (long)var1_1);
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ pI u(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 17[CATCHBLOCK]
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = X4.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        X4.a = wu.a(-6087940124187547997L, -5265273644213554039L, MethodHandles.lookup().lookupClass()).a(43199903631367L);
        X4.d = new HashMap<K, V>(13);
        var0 = X4.a ^ 48912864859569L;
        var2_1 = Cipher.getInstance(XU.C("E*>,&Iy{e\u0010s\r\u0002\tQ:I*\tn"));
        v0 = SecretKeyFactory.getInstance(NH.C("h#5"));
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
        var7_3 = new String[16];
        var5_4 = 0;
        var4_5 = XU.C("\f\u00df\u00fc\u00b7g\u00d7\u00e2q\u00d8T\u0007\u00c0\u009c\u0013\u00cf5\u0004u\u00a7xw\u00b1\u00b1?\u00afd\u001d3\u00d5q\u00b2\u00c2~v\u00ca\u00d00\u00c6\u0088\u00e6\u0006\u0097\"R\u00fa\u00c1#\u0005\u00b3\u00f9;c2)\u00ab\u00e3\u00fet-xu\u00bccD_'\u00eb\u00aeqN\u0095;\u00d2\u00e4\u0013p\u00f0ZVO\u00e1zKJ\u00908\\vC\u00b1\\\u00cc\u0013\u00ddQu\t8\u00ca%\u009e\u001f\u001aO\u00e0\u00ce\u00c4\u000bx\u00cb\u0000\u00ea\u0080\u00fay'c\u00c9v>MB\u000bk\u0091\u00ef\u000f\u0088\u00e4\u00d2\u0000\u0000\b\u00f8)\u00c9X\u0081\u0098\u00a5Bv5\u0094\u00e6\u00fbt5\u009b\u0002\u008d\u0094\u0003\u0084\u008e\u00df%m\u008f\u001c\u00cav\u0085\u00cc\u0088n\u00c4\u0007\u00c6\u0014\u0003^\u00d7_\u00f7\u00c9\u0083\u008a\u00b6D\u00ef\u00bcD)\u00c5\u00c1\u009e\u0019G\u008bS\u00fb\u0081!\u00c4\u008bH\u00a7\u007fy\u00ba\u0016\u00aeq=\u00be\u0002%\u00b5\u00cc\u00ce\u00a9x\f\u00ac\u00eb\u0003\u0017\u0011\u007f\u00d5\u00f9\u008a\u000fTI\u008d\u00cb1{\fVUq\u00bc\u00ad\u0082\u00ae\u00f7\u0006\u0001u!\u001a\u009e\u0019\u00a7b\u008cI\u00c9\u0096\u00f4\u0095\u00c8\u0093\u00c6\u00bf\n$\u00cc\u00c6q?\u00dc\u00a8\t\u0018\u00db\u001b6T\u00d8W\u00d4\u00d7a\u0088p\u0082\u00a8I\u0007 )\u00edI\u00c0\u009f\u0099b\u00d9\u009d\u008f\\\u00ed\u00bf_\u00d1\u00b1c\u0018\u00c22iH\u001c\u001e>y^l\u00c05\u0006\u0014\u0012e\u0091$\u00c9\u009c\u00b8\u0006\f\u00ef\u00a7a\u0012\u0004M\u001e4");
        var6_6 = var4_5.length();
        var1_7 = 32;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = NH.C("\u00deOS\u001eEp\u00d4\u0092\u00bc|\u00cd34\u00bd\u00b4m|C\u00bcn\u0085\u0096\u00db\u00d9\u009a\u009b\u0015\u00c2\u00a5\u00ac})\u0010");
                var6_6 = var4_5.length();
                var1_7 = 16;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = X4.a(var2_1.doFinal(v6.getBytes(XU.C("y\rxt\bf\u0018zJ8")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = X4.a(var2_1.doFinal(v6.getBytes(XU.C("y\rxt\bf\u0018zJ8")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        X4.b = var7_3;
                        X4.c = new String[16];
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
}

