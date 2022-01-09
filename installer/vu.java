/*
 * Decompiled with CFR 0.150.
 */
package net.futureclient.installer;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.Socket;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.futureclient.installer.NB;
import net.futureclient.installer.No;
import net.futureclient.installer.TH;
import net.futureclient.installer.TW;
import net.futureclient.installer.v6;
import net.futureclient.installer.wu;
import net.futureclient.installer.ye;

/*
 * Exception performing whole class analysis ignored.
 */
public final class vu {
    private static final /* synthetic */ String[] c;
    private static final /* synthetic */ Map d;
    private static final /* synthetic */ long a;
    private static final /* synthetic */ String[] b;
    private /* synthetic */ NB S;
    private /* synthetic */ Socket h;
    private /* synthetic */ No n;

    /*
     * Exception decompiling
     */
    public final /* synthetic */ TH m(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 7[CATCHBLOCK]
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

    public final /* synthetic */ boolean q(Object[] arrobject) {
        boolean bl;
        long l2 = (Long)arrobject[0];
        l2 = a ^ l2;
        long l3 = l2 ^ 0x3931AE6B115FL;
        long l4 = l2 ^ 0x58E817743909L;
        try {
            ye.a("F", (Object)this, (Socket)new Socket((String)((Object)vu.a("d", (int)5608, (long)(0x72382D8AA72C16F4L ^ l2))), 5130), (long)-7180398012687102499L, (long)l2);
            vu vu2 = this;
            vu vu3 = this;
            ye.a("F", (Object)vu3, (No)new No((InputStream)((Object)ye.a("j", (Object)((Socket)((Object)ye.a("\u00c3", (Object)vu3, (long)-7180398012687102499L, (long)l2))), (long)-6950252770914342553L, (long)l2)), (String)((Object)vu.a("d", (int)31375, (long)(0x21324672FDF47991L ^ l2))), l3), (long)-7178605492701854282L, (long)l2);
            vu vu4 = this;
            vu vu5 = this;
            ye.a("F", (Object)vu5, (NB)new NB(l4, (OutputStream)((Object)ye.a("j", (Object)((Socket)((Object)ye.a("\u00c3", (Object)vu5, (long)-7180398012687102499L, (long)l2))), (long)-6951226353934576595L, (long)l2)), (String)((Object)vu.a("d", (int)21025, (long)(0x56D50FDC96B1513CL ^ l2)))), (long)-6955145025070263696L, (long)l2);
            bl = true;
        }
        catch (Exception exception) {
            return false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String a(int this_, long l2) {
        int n2 = this_ ^ (int)(l2 & 0x7FFFL) ^ 0x1EEC;
        if (c[n2] == null) {
            int n3;
            Object[] arrobject;
            Object object;
            try {
                object = Thread.currentThread().getId();
                arrobject = (Object[])d.get(object);
                if (arrobject == null) {
                    arrobject = new Object[3];
                    arrobject[0] = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOG\u001aN\u0017"));
                    arrobject[1] = SecretKeyFactory.getInstance(v6.C("\u0007d\u0013"));
                    arrobject[2] = new IvParameterSpec(new byte[8]);
                    d.put(object, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(TW.C("\u0005D\u0005TMI\u0018N\u0019C\u0015M\u0018Q\nMFP\u0007C\u0014F\u001b\u0017NQ\\V\u0005"), exception);
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
            byte[] arrby2 = b[n2].getBytes(v6.C("x\u0003ijB#\u0017z\fq"));
            vu.c[n2] = vu.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return c[n2];
    }

    /*
     * Exception decompiling
     */
    public final /* synthetic */ boolean Y(Object[] this) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 7[CATCHBLOCK]
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

    private static /* synthetic */ Exception a(Exception this_) {
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

    private static /* synthetic */ Object a(MethodHandles.Lookup this_, MutableCallSite mutableCallSite, String this222, Object[] this32) {
        int this222 = (Integer)this32[0];
        long l2 = (Long)this32[1];
        String this222 = vu.a(this222, l2);
        Object this32 = MethodHandles.constant(String.class, this222);
        Class[] arrclass = new Class[2];
        arrclass[0] = Integer.TYPE;
        arrclass[1] = Long.TYPE;
        mutableCallSite.setTarget(MethodHandles.dropArguments((MethodHandle)this32, 0, arrclass));
        return this222;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* synthetic */ {
        int n2;
        a = wu.a(-7468115728061757504L, 5245251961114581129L, MethodHandles.lookup().lookupClass()).a(217797196033732L);
        d = new HashMap(13);
        long l2 = a ^ 0x7598579BAE7EL;
        Cipher cipher = Cipher.getInstance(TW.C("b3r^w&zFi\"s3\u0012'\u001aOG\u001aN\u0017"));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(v6.C("\u0007d\u0013"));
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l2 >>> 56);
        int n3 = n2 = 1;
        while (n3 < 8) {
            arrby2 = arrby2;
            int n4 = n2++;
            arrby2[n4] = (byte)(l2 << n4 * 8 >>> 56);
            n3 = n2;
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        String[] arrstring = new String[3];
        int n5 = 0;
        String string = TW.C("\u0080&\u00cb\u00a0\u00fc\u00eawL\n\u00832I\u00c6\u0099I\u00e3\u00a6\u001ec\u00f5Z\u0096Z\u0081C\u00d0\u00d7\u0083?\u0097\u00af\u0080\u00dc\u00fb\u00bb\u0081\u00d4\u00c2\u0089\u0080\f\u00a7\u0087\u00a9\u00dcz\u00b2\u008e\u0098\u0099~u]\u009a\u00f9\b\u001a\u00bfRJ\u00a4\u00a0\u00d6\u00f8\u00a6\u0003*\u00a2\u0012\u0084\u00dd;\u00ee?k\u00b6\u0086(\u00dd\u0088\u00bc/9Gu\u00d0V_\u00adS\u00f5TY\u00e0\u00a6\u001e\u00e9\u00f3\u00ac]s\u00cf2\u00b9\u0018|\u00a2\u00d1\u00e1\u0092\u00b6\u00fe\u00e0o\u00df\u00123\u009f-h\u0080\u00faKH\u008b\u0015\\\u00ae\u0083\u001d.y\u00b2\u00d4D\u00c5\u00e8\u00c2");
        int n6 = string.length();
        int n7 = 40;
        n2 = -1;
        while (true) {
            int n8 = ++n2;
            arrstring[++n5] = vu.a(cipher.doFinal(string.substring(n8, n8 + n7).getBytes(v6.C("x\u0003ijB#\u0017z\fq")))).intern();
            if ((n2 += n7) >= n6) {
                b = arrstring;
                c = new String[3];
                return;
            }
            n7 = string.charAt(n2);
        }
    }
}

