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
import net.futureclient.installer.Eh;
import net.futureclient.installer.TH;
import net.futureclient.installer.XQ;
import net.futureclient.installer.pQ;
import net.futureclient.installer.pV;
import net.futureclient.installer.pi;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public class N4 {
    public final /* synthetic */ pQ E;
    private static final /* synthetic */ String[] b;
    private static final /* synthetic */ long a;
    public final /* synthetic */ String L;
    private static final /* synthetic */ String[] c;
    public final /* synthetic */ XQ g;
    public /* synthetic */ String h;
    public final /* synthetic */ pV D;
    private static final /* synthetic */ Map d;
    public final /* synthetic */ String U;
    public final /* synthetic */ N4 e;
    public final /* synthetic */ String M;
    public final /* synthetic */ String T;

    public final /* synthetic */ pi R(Object[] arrobject) {
        long l2 = (Long)arrobject[0];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x199EA858E3FL;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = l3;
        arrobject2[0] = (String)((Object)N4.a("n", (int)28081, (long)(0x677781703BB8E95CL ^ l2)));
        return (pi)((Object)ye.a("j", (Object)((pQ)((Object)ye.a("\u00c3", (Object)this, (long)-6961264295701202022L, (long)l2))), (Object)arrobject2, (long)-7072377408170203712L, (long)l2));
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
    public final /* synthetic */ void A(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP], 16[DOLOOP]], but top level block is 23[SIMPLE_IF_TAKEN]
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
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x18E5;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(Eh.C(")\u0005+z6\u001a6w,\u001a(\u0015\u0002J6\u001eIi\u00162"));
                    arrobject[1] = SecretKeyFactory.getInstance(TH.C("K;&"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(Eh.C(".Rn_;\u0002.\u001f5\b#\u0014<\u00106\u0001w\u0015?\u00182Vv;\u001f_/6a"), exception);
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
            byte[] arrby2 = b[n2].getBytes(TH.C("fww\u001e\\W16SD"));
            N4.c[n2] = N4.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    private static /* synthetic */ RuntimeException a(RuntimeException this_) {
        return this_;
    }

    public /* synthetic */ String toString() {
        long l2 = a ^ 0x5274AAA83796L;
        return (String)((Object)ye.a("\u00c3", (Object)this, (long)571738344632897639L, (long)l2));
    }

    public /* synthetic */ N4(pV pV2, pQ pQ2, String string, N4 n4, String string2, String string3, String string4, String string5, XQ xQ) {
        N4 n42 = this;
        N4 n43 = this;
        N4 n44 = this;
        N4 n45 = this;
        this.D = pV2;
        n45.E = pQ2;
        n45.L = string;
        n44.e = n4;
        n44.M = string2;
        n43.U = string3;
        n43.T = string4;
        n42.h = string5;
        n42.g = xQ;
    }

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = N4.a(this222, l2);
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

    private static /* synthetic */ void g(StringBuilder this_, pi pi2) {
        long l2 = a ^ 0x7DF8DDF3C23BL;
        long l3 = l2 ^ 0x33A2EA6836D6L;
        Object[] arrobject = new Object[1];
        arrobject[0] = l3;
        StringBuilder cfr_ignored_0 = (StringBuilder)((Object)ye.a("j", (Object)((StringBuilder)((Object)ye.a("j", (Object)this_, (Object)Eh.C("s"), (long)-1072769678477184597L, (long)l2))), (Object)((String)((Object)ye.a("j", (Object)pi2, (Object)arrobject, (long)-1053333325981722338L, (long)l2))), (long)-1072769678477184597L, (long)l2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ {
        N4.a = wu.a(-1888605054780154259L, 4412715693890244709L, MethodHandles.lookup().lookupClass()).a(27619726543951L);
        N4.d = new HashMap<K, V>(13);
        var0 = N4.a ^ 59380974072296L;
        var2_1 = Cipher.getInstance(TH.C("}wm\u001ahbe\u0002vflw\rc\u0005\u000b`f\u0010\u0012"));
        v0 = SecretKeyFactory.getInstance(Eh.C("\u0004bY"));
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
        var7_3 = new String[6];
        var5_4 = 0;
        var4_5 = TH.C("tso?.\u00bb\u000e\u00e38$mm\u00f7\u0097f\u00f6\u00e7\n\u00b4=\u00d3\u00c6-\u00ef\u0006b\u00ef\u0001_\u001a\u00b3b%\fG\u0000\u00a2\u00b9\u00a5\u00ef\u00b7$J\u0016\u00c4\u001e\u00c94\u00a3^\u0090\u00de&\u008fJ\u00ec\u00aaUh\u00c77\u0097\u00b8B\u0004\u0092\u0018+i\u00b5\u0081y;\u00ca\u00f6\u00e2sT\u00dd\u00aa\u000eP@\u00fe\u009f\u00b2\u0092\u00bcIU\b\u0092\u00f9\u0088\u0091I\u0001\u0004\u009d)\u00ec\u00f7\u0003\u00a9\u00ce\u0083\u00b4\u00a6+\u0097\u00cbuB\u0080\u00aa\u000b\b\u0095\u00ad\u00d9k\u0005\u00fc");
        var6_6 = var4_5.length();
        var1_7 = 32;
        var3_2 = -1;
        block4: while (true) {
            v5 = ++var3_2;
            v6 = var4_5.substring(v5, v5 + var1_7);
            v7 = -1;
            ** GOTO lbl74
            {
                var4_5 = Eh.C("\u001f\u00d4\u00ef\u009a2*\u00af\u00b3%\u00ae\u00bd\u00ba\u00bc\u00e4\u00ee7u\u00dd{\u00b3P\u0090Ny\u00df\u00bev8\u00b6\r\u008c\u000e;\u00b0\u00ee\u00de\u00bc\u009er\u0096\u0010\u00bdv\u00e4\u00cc~l\u00a8\u00ae\u00d3\u00ff\u0006n\u00e9\u00e3\u00a8\u00b2");
                var6_6 = var4_5.length();
                var1_7 = 40;
                var3_2 = -1;
                while (true) {
                    v8 = ++var3_2;
                    v6 = var4_5.substring(v8, v8 + var1_7);
                    v7 = 0;
lbl74:
                    // 2 sources

                    switch (v7) {
                        default: {
                            var7_3[++var5_4] = N4.a(var2_1.doFinal(v6.getBytes(TH.C("fww\u001e\\W16SD")))).intern();
                            if ((var3_2 += var1_7) >= var6_6) continue block5;
                            var1_7 = var4_5.charAt(var3_2);
                            continue block4;
                        }
                        case 0: 
                    }
                    var7_3[++var5_4] = N4.a(var2_1.doFinal(v6.getBytes(TH.C("fww\u001e\\W16SD")))).intern();
                    if ((var3_2 += var1_7) >= var6_6) {
                        N4.b = var7_3;
                        N4.c = new String[6];
                        return;
                    }
                    var1_7 = var4_5.charAt(var3_2);
                }
            }
            break;
        }
    }
}

