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
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NH;
import net.futureclient.installer.v6;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

public final class XK {
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ Pattern P;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x7CDA;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(NH.C("hij\u0016wvw\u001bmviyC&adwzW^"));
                    arrobject[1] = SecretKeyFactory.getInstance(v6.C(")Z-"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(NH.C("B\u0013\u0002\u001eWCB^YIOUPQZ@\u001bTSY^\u0017\u001alea<ar"), exception);
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
            byte[] arrby2 = b[n2].getBytes(v6.C("x\u0003ijB#9T2O"));
            XK.c[n2] = XK.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        XK.a = wu.a(-7237064920541238661L, -7800915584423833030L, MethodHandles.lookup().lookupClass()).a(214682766238476L);
        var7 = XK.a ^ 75631907227131L;
        XK.d = new HashMap<K, V>(13);
        var0_1 = Cipher.getInstance(v6.C("c\u0003snv\u0016{vh\u0012r\u0003\u0013\u0017\u001b\u007fh\u0004q\u0019"));
        v0 = SecretKeyFactory.getInstance(NH.C("h#5"));
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
        var6_3 = new String[23];
        var4_4 = 0;
        var3_5 = v6.C("\u0093\u0085\u001dkx\u00e7\u00db,\u00bdy\u00c6\u00cb\"\"\u0089\u00b0\u00c9\u00f2\u00a2\u0014\u001e\u00a6S\u009b-\u00eb\u00e8\u00e45GQw-(\u0085c\u00d7\u0012\u001a\u00df\fNd_\u00eb\u0080\u00d8.\u0096a 1\u00d9\u00a5%E\u00bb\u0097P}\u00b4\u001a3;D\u009f\u00c9\u00b7\u009ca\u00998\u00d9%\u00ae\u00048\u00a8\b\u00b5(H\u001a\u00e8\u0019\u00bf\u009c\u00cd\u00dc\u00f1\n\u0018\u00ad\u00f8\u0085x\u0094\u00da#\u00ca&3\u00b4\b\u00a0\u00fbb\u00d40)`\u00f5a-\u00da+%=\u0081\u00e9V5\u009f*q\u00f0t\t\u000eo\u00d72qDiW\u00e0QZ\u00a6\u00891\u00d6\u001b6\u00d5/4\u008c\u00b7=\u00fc\u00b6\t\u00afz\u00ed\u009fz\u0005\u009d\u00c4\u001d:\u0002&k0 \u0088\u00b0\u00bc\u00d8\u00e5\u001a\u00e4\u00ec\u00db\u00bc\u00ce\u001de\u00f6\u00dd\u00f3i\u00ae\u00f7\u00f1\u00f1\u00fb;\u00e1\u00b9'ow*\u0016\u00e4\u00b6\u00b2q\u00cc\u00dc\u00ac\u00d9\u008b\u00b4Z\u0015)\u00b9nb\u00c5v\u00ce \u0005\u000e\u0099a\u00b6\u00b7\u0081\u00a0HHL\u001aF\u0093\u00ce\u0015o\u00d6\u0081\u0011\u00f6KE\u00e1\u00d1\u0094\u00c7\u0086\u00f7nY\u009eDC\u0014q\u00cc\u00a7\b)\u00cef\\13>\u0002\u00d5\u00d5\u00b6\u0097\u0095\fR\u00e8u\u00d2\u00f58}_\u00e7O\u00a9\u00e6C]>u\u00c1&g\u0019\u008e\u00b9\u00df\u00b3\u00e8}\u0005\u0099\u0017\u00f9\u00e4\"\"q\u00a2e\u0001d\u00b2a\u00d5h\u00d6\u008fP\u00f8\u00f4e\u00e1h{\u00a7\u00ec)D\u00f5\u00c4l\u0098\u00f2\u008d\u0085*\u00d3\u0003\u00ab\u0096\u00f5\u00e5\u00adO\u00bb.fl\"\u001aa\u0085'K]\u0004\u00bc\u0083>\u001dt\u00fd\u008c_[\u00far3(\u00c3\u0096\u00d6o@\t\u0016\u00bc\u00bcL\"z\u00be\u0080\u00c2\u009e\u00ad\u00b6\u00d3\u00cc\u0094\u001d\u00fe\u00d7\u00f8\u009e\u0015\u00d0*g\u00f8\u0086O\u00eai|\u00f6\u00ed\u009b\u0006\u00af\u00d5\u0095\u00ae\u0015|VS\u00dck[\u00d8\u00a1\u00c7nZ\u00d5%\u00e6L\u00e9t\u0097\u00f4\u00d6\u00c8)\u00ab@\u00d9\u00a2\u00a2|TeF\u001ax\u00e3\u00a5\u00a5\u00fc\u00f0\u0014\u0005\u0017}\u00fa@\u00d2\u001c\u00cc\u00daf\u0087\u000b\u00ad\u00f0\u00ac\u0091\u00e1 Ze\u0083\u00edSB<t\u00ca|\u0005\u0012\u00d8>\u008fi\u00ff\u0087\u001d8$\u0012\u00ec\u001e?@j\u0012\u001f\u00dbzx\u00d5\u00ee\u001a\u00d2\u0001\u00ca\u00c9C6]p\u00d8z\u0006\u00a3\u008c*\u00ef\u00fd\u0097_\u0002\"\u00e9\u00f4\u00ca\u00ef\u00db9\u00b2\u00ff\u001a\u00d4sl\u0007\u00b2\u00dd!m\u00ea\u00d9\u00bf\u00c6I\u00d8S<\u00e3\u00e5.\u00e6\u00db\u0081\u008e\u00a6=\u00ca\u00d4\u001c\u00c8'k\u00d6\u000fE\u0015D\u0092\\\u00eb\u001f}\u00f1\u0088*_\u00e3\u0094\u00e2?\u00aai\u0010\u00c5\u00ac\u0016\u008c\u00b4\u00f2P\u00f5C\u00d0{^\u00a6\u00ef|kUV\u00ed'\u00f9\u00a9\u00dc{\t\u00dc\u00fb:.\u00f6\u00b8\u0084\u00c3\u00d4\u0088\u00a8~\u00b9\u008c\b\u00a6\u00f6l\u00ab\u0011\tA\u00e7\u00171\u00b8\u008c\u0085\u00b4\u00e8\u00ff1\u00bak\u0011\u00ce\u00de\u008em\u0016\u00b6h\u00cf\u00e7\u0098\u00f0\u00f5\u008a\u00a2\u00b8\u00da;,\u009ex\u008f\u0002\u0018\u00e5\u00aav'\u00eb\u0091\u0093M,v<\u0011\u0004e,\u0001P`\u00b2Ul\u00e3o\u00eb\u0087\u0002\u00c0Q\u0014\u009b|\u00d1#Y0\u00a6\\\u0092\u00c0\u00c3\u001d\b\u00b6\u0083\u0017\u00f5\u001cb+\u0096x\u00b5c\u001dt\u00be\u00b6\u00db\u00de\u00f4\u00eb\u00bct");
        var5_6 = var3_5.length();
        var2_7 = 32;
        var1_2 = -1;
        block4: while (true) {
            v5 = ++var1_2;
            v6 = var3_5.substring(v5, v5 + var2_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var3_5 = NH.C("\u00f1\u0089\u001e\u0092y[\u00152\u00e8\u0007\u00a5\b\u00fd\u0016\u00fd}\u00b7\u0011H)!\u0019^\u00ee`\u00ee\r\u00c3/\u00c5\u00ee\u00fff\u00b2\u008c\u009d\u00b0Y\u00a2A'\u00e4w\u0002I\u0001E\u00a4B;K\u00f9\u00ea\u00fb\u00d7\u00c30>H\u00c3?#\u00cc\u0091\u00d9A\u00cc\u00deA\u00f0K\u0090{n\u00b1\u00aeHp\u009eq,k@\u00db;\u00164}\u00b7.\u00fb}o\u00ed5\u00c2x3\u008a\u00d0\u00d8\u00b8Tg\u00f5\u00cf:\u0081l\u00e1~V\u0002");
                var5_6 = var3_5.length();
                var2_7 = 32;
                var1_2 = -1;
                while (true) {
                    v8 = ++var1_2;
                    v6 = var3_5.substring(v8, v8 + var2_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var6_3[++var4_4] = XK.a(var0_1.doFinal(v6.getBytes(v6.C("x\u0003ijB#9T2O")))).intern();
                            if ((var1_2 += var2_7) >= var5_6) continue block5;
                            var2_7 = var3_5.charAt(var1_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var6_3[++var4_4] = XK.a(var0_1.doFinal(v6.getBytes(v6.C("x\u0003ijB#9T2O")))).intern();
                    if ((var1_2 += var2_7) >= var5_6) {
                        XK.b = var6_3;
                        XK.c = new String[23];
                        XK.P = (Pattern)ye.a("G", (String)XK.a("x", (int)635, (long)(6687800707618495379L ^ var7)), (long)2630638290111594535L, (long)var7);
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
    public static /* synthetic */ String d(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 125[CATCHBLOCK]
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
        String this222 = XK.a(this222, l2);
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

    private static /* synthetic */ Throwable a(Throwable this_) {
        return this_;
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
}

